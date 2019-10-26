package botuser;

import util.Account;
import util.LeagueOfLegendsAccount;

// Data Structures
import java.util.List;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

// Lambdas
import java.util.function.Consumer;

// File Handling
import java.io.File;
import java.io.IOException;

// Discord API
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.entities.TextChannel;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.core.events.message.priv.PrivateMessageReceivedEvent;

public class BotListener extends ListenerAdapter {
	private static Map<String, Consumer<GuildMessageReceivedEvent>> guildMessageActions = new HashMap<>();
	private static Map<String, Consumer<PrivateMessageReceivedEvent>> directMessageActions = new HashMap<>();

    private static Map<String, List<Account>> sells = new HashMap<>();
	
	public BotListener() {
		guildMessageActions.put("!hello", (GuildMessageReceivedEvent ev) -> 
			sendChannelMessage(ev.getChannel(), "Hello " + ev.getAuthor().getAsMention() + "!"));
		
        // Logic for creating sells
        directMessageActions.put("!sell .*", (PrivateMessageReceivedEvent pe) ->
            createSell(pe));
	}
	
	@Override
	public void onGuildMessageReceived(GuildMessageReceivedEvent ev) {
		// Check to make sure the composer is real
		if (ev.getAuthor().isBot() || ev.getAuthor().isFake()) {
			// Do nothing if he is fake
			return;
		}
		
		// Check all the actions
		for (Map.Entry<String, Consumer<GuildMessageReceivedEvent>> entry : guildMessageActions.entrySet()) {
			if(ev.getMessage().getContentRaw().matches(entry.getKey())) {
				entry.getValue().accept(ev);
			}
		}
	}
	
	// Handler for the user sending a direct message to the bot
    @Override
    public void onPrivateMessageReceived(PrivateMessageReceivedEvent pe) {
		// Check all the actions
		for (Map.Entry<String, Consumer<PrivateMessageReceivedEvent>> entry : directMessageActions.entrySet()) {
			if(pe.getMessage().getContentRaw().matches(entry.getKey())) {
				entry.getValue().accept(pe);
			}
		}
	}
	
	// Handler for when a user joins the server
    @Override
    public void onGuildMemberJoin(GuildMemberJoinEvent e) {
		User newUser = e.getUser();
		
		// Direct message the user
		this.directMessageUser(newUser, "Hey there! I'm the bot! Here's some documentation before you continue!");
		this.directMessageUser(newUser, new File("README.txt"));
	}

    // Method for creating a sell
    public void createSell(PrivateMessageReceivedEvent pe) {
        String[] parts = pe.getMessage().getContentRaw().substring(6).split("\\s*:\\s*");

        // Check that we have a right initial length
        if (parts.length < 4) {
            directMessageUser(pe.getAuthor(), "You must specify type, username, password, and price");
            return;
        }

        Account toAdd = null;
        switch (parts[0]) {
            case "League of Legends":
                try {
                    toAdd = new LeagueOfLegendsAccount(
                        pe.getAuthor().getAsMention(),
                        parts[1],
                        parts[2],
                        Double.parseDouble(parts[3]),
                        parts[4],
                        Integer.parseInt(parts[5]));
                } catch (NumberFormatException e) {
                    directMessageUser(pe.getAuthor(), "Invalid price or level");
                } catch (IndexOutOfBoundsException e) {
                    directMessageUser(pe.getAuthor(), "Not enough data");
                }
                break;
            default:
                directMessageUser(pe.getAuthor(), "Invalid type");
        }
    }
	
	// Utility methods for sending direct messages on a channel
	public void sendChannelMessage(TextChannel chan, String rawMessage) {
		chan.sendMessage(rawMessage).queue();
	}
	
	// Utility methods for sending direct messages to the user
	public void directMessageUser(User user, String rawMessage) {
		user.openPrivateChannel().queue(channel -> channel.sendMessage(rawMessage).queue());
	}
	public void directMessageUser(User user, File file) {
		user.openPrivateChannel().queue(channel -> channel.sendFile(file).queue());
	}
}
