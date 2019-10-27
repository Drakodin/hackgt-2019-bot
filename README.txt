  ____  _____    _    ____    __  __ _____ 	|
 |  _ \| ____|  / \  |  _ \  |  \/  | ____|	|
 | |_) |  _|   / _ \ | | | | | |\/| |  _|  	|
 |  _ <| |___ / ___ \| |_| | | |  | | |___ 	|
 |_| \_\_____/_/   \_\____/  |_|  |_|_____|	|
________________________________________________|                                           
**DOCUMENTATION**

Table of Contents
1. General Information (Language choice, bot information)
2. Language specifics and platform
3. Functionality
	= See dividers for specifics
	= This contains all possible commands for use
4. Contributors

____________________________________________
  _      ____                           _ 
 / |    / ___| ___ _ __   ___ _ __ __ _| |
 | |   | |  _ / _ \ '_ \ / _ \ '__/ _` | |
 | |_  | |_| |  __/ | | |  __/ | | (_| | |
 |_(_)  \____|\___|_| |_|\___|_|  \__,_|_|
____________________________________________
This bot user was created using DV8FromTheWorld's Java Discord API (JDA), Version 3.8.3

Source code is available, but the bot itself is not public for guild use. It is currently a proof of concept.

This bot was developed for the HackGT 2019 Competition (Note the images associated) with the intent of entertainment.
However, it contains functionality that can be extended for other uses such as sparking creativity born from creativity itself.

It was decided to be an e-commerce bot, specifically handling an exchange of LoL game account information (a questionable, but oddly lucrative market) in the example provided.

It also uses Integromat services which allow our bot to trigger another bot to output a payment system (our chosen was PayPal) confirmation assuming that the product in question is what the customer wants. For demo purposes, the return and cancel links return to the Discord home page.

____________________________________________________________
  ____      _                                             
 |___ \    | |    __ _ _ __   __ _ _   _  __ _  __ _  ___ 
   __) |   | |   / _` | '_ \ / _` | | | |/ _` |/ _` |/ _ \
  / __/ _  | |__| (_| | | | | (_| | |_| | (_| | (_| |  __/
 |_____(_) |_____\__,_|_| |_|\__, |\__,_|\__,_|\__, |\___|
                             |___/             |___/      
____________________________________________________________
The source code of this bot user is written in Java. The JDA 3.8.3 was used as an external reference dependency.
It uses WebSocket to communicate with Discord's hosting server and acts to take inputs from Users (Clients) and instruct
the server to take specific actions using User input.

Since bot functionality is specifically defined, this bot can be translated using appropriate APIs to other languages
such as Python, C++, or JavaScript. In this case, Java was preferred due to developer experience (primarily my own)
__________________________________________________________________________________
  _____       _    _ _    ____                                          _     
 |___ /      / \  | | |  / ___|___  _ __ ___  _ __ ___   __ _ _ __   __| |___ 
   |_ \     / _ \ | | | | |   / _ \| '_ ` _ \| '_ ` _ \ / _` | '_ \ / _` / __|
  ___) |   / ___ \| | | | |__| (_) | | | | | | | | | | | (_| | | | | (_| \__ \
 |____(_) /_/   \_\_|_|  \____\___/|_| |_| |_|_| |_| |_|\__,_|_| |_|\__,_|___/
__________________________________________________________________________________                                                       
╔════════════════════════════════════════╗
║ ╦ ╦╔═╗╔═╗╦═╗  ╔═╗╔═╗╔╦╗╔╦╗╔═╗╔╗╔╔╦╗╔═╗ ║
║ ║ ║╚═╗║╣ ╠╦╝  ║  ║ ║║║║║║║╠═╣║║║ ║║╚═╗ ║
║ ╚═╝╚═╝╚═╝╩╚═  ╚═╝╚═╝╩ ╩╩ ╩╩ ╩╝╚╝═╩╝╚═╝ ║
╚════════════════════════════════════════╝
-> "!buy"
	- Case-sensitive
	- Causes our bot to print "%order"
	- This acts as a trigger to Integromat's bot user implementation to call PayPal services.

-> "!list"
	- Case-sensitive
	- Shows a listing of all available items users have chosen to add.
	- Private messages work to submit information

-> "!sell" 
	- Case-sensitive
	- Specific command to take in data to be parsed to an Account object
	- Adds the Account to the current listings.

╔═══════════════════════════════════════════╗
║ ╔╦╗╔═╗╔╗ ╦ ╦╔═╗  ╔═╗╔═╗╔╦╗╔╦╗╔═╗╔╗╔╔╦╗╔═╗ ║
║  ║║║╣ ╠╩╗║ ║║ ╦  ║  ║ ║║║║║║║╠═╣║║║ ║║╚═╗ ║
║ ═╩╝╚═╝╚═╝╚═╝╚═╝  ╚═╝╚═╝╩ ╩╩ ╩╩ ╩╝╚╝═╩╝╚═╝ ║
╚═══════════════════════════════════════════╝
-> "!hello" 
	- Case-insensitive
	- tests implementation of User mention
	- Bot sends message "Hello @Username"
_________________________________________________________________________
  _  _       ____            _        _ _           _                 
 | || |     / ___|___  _ __ | |_ _ __(_) |__  _   _| |_ ___  _ __ ___ 
 | || |_   | |   / _ \| '_ \| __| '__| | '_ \| | | | __/ _ \| '__/ __|
 |__   _|  | |__| (_) | | | | |_| |  | | |_) | |_| | || (_) | |  \__ \
    |_|(_)  \____\___/|_| |_|\__|_|  |_|_.__/ \__,_|\__\___/|_|  |___/
__________________________________________________________________________
Repository Owner: Tony Tian
Additional Contributors: Aditya Singhal, Ammar Ratnani

HackGT Team Ekko
- Leader: Aditya Singhal
- Members: Tony Tian, Ammar Ratnani
                                                                      
