package MyPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Contacts
{
String name;
String phoneNumber;
public Contacts(String name,String phoneNumber)
{
this.name=name;
this.phoneNumber=phoneNumber;
}
public String getName()
{
return name;
}
public String getPhoneNumber()
{
return phoneNumber;
}
public static Contacts createContact(String name, String phoneNumber)
{
return new Contacts(name,phoneNumber);
}
ArrayList<String> contactList= new ArrayList<String>();
public ArrayList<String> getContactList()
{
return contactList;
}
public void storeContacts(String names)
{
contactList.add(names);
}
public void printContactList()
{
System.out.println("you have" + contactList.size() + "contacts in your list.");
for(int i=0; i < contactList.size(); i++)
{
System.out.println(i+"-"+contactList.get(i));
}
}
}
