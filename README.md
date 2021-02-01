# javaquiz
A java package is a group of similar type of classes,interfaces, and sub-packages.
package in java can be categorized in two form, built-in package and user-defined package.
A package is created by including a package command or keyword followed with the name of package as the first statement in java source file.
Any class declared with that file will belong to specified package.
from above program, the package name is declared as
package MyPackage;
I created two classes Contacts and MobilePhone which includes all the operations for name, date of birth, orgnisation, etc.
after compiling these two programs, class file generated(Contacts.class, MobilePhone.class)
To run use, java MyPackage.MobilePhone
The output is:
starting phone...
Available actions:
press
0-to shutdown
1-to print contacts
2-to add a new contact
3-to update an existing contact
4-to remove an existing contact
5-query for an existing contact
6-to print a list of available actions.
Choose your action:
Enter action:
2 
Enter new contact name:
Amulya
Enter phone number:
9876543210
New Contact added: name=Amulya ,phone 9876543210
