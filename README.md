# OIBSIP
The ATM Interface project is a console-based Java application that simulates the core functionalities of an Automated Teller Machine (ATM). The primary goal of the project is to provide a user-friendly interface where users can perform essential banking operations such as withdrawing, depositing, transferring funds, and viewing transaction history.

Key Features:
User Authentication: The application prompts the user to enter a predefined User ID and PIN. Upon successful authentication, the user can access the ATM functionalities.
Withdraw: Users can withdraw a specified amount from their balance, provided they have sufficient funds. The application validates the transaction and updates the balance accordingly.
Deposit: Users can deposit money into their account. The deposited amount is immediately reflected in the balance, and the transaction is logged.
Transfer: Users can transfer a specified amount to another account. Similar to withdrawals, the application checks if the user has sufficient balance before processing the transfer.
Transaction History: The application stores a log of all transactions (withdrawals, deposits, transfers) using an ArrayList. Users can view their transaction history, which is displayed in chronological order.
Quit: After completing their transactions, users can exit the application.

Technologies Used:
Java: Core programming language for building the application.
ArrayList: Used to store and manage transaction history.

This project demonstrates the practical implementation of Java concepts like control structures, loops, user input, and data structures. It also highlights the importance of user authentication and balance validation in financial applications. Through this project, I gained valuable experience in building a functional backend system and applying real-world banking logic in a console-based application.
