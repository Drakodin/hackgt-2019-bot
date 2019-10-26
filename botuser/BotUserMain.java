package botuser;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;

public class BotUserMain {
	public static void main(String[] args) throws LoginException {
		String token = "NjA2NTQzMzA4MTgwNjg0ODA1.XbO2BQ.kz3xM0QOG6y8E6heWWjffE83MRs";
		JDABuilder builder = new JDABuilder(AccountType.BOT);
		
		builder.setToken(token);
		JDA app = builder.build();
		app.addEventListener(new BotListener());
		builder.build();
	}
}
