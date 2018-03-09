package doublyLinkedList;

import java.io.IOException;

public class Runner {
	
	public static void main(String[] args) {
		FileHandler albert = new FileHandler();

	try {
			albert.readFile("PersonList.txt");
		} catch (IOException e) {
			System.out.println("file wasn't valid!");
		}
		System.out.println(albert.list.toString());
	}
	
	
	/*
Name:       Abe Ardvaark
  Employer: IBM
Name:       Alice Ardvaark
  Employer: IBM
Name:       April Field
  Employer: APL
Name:       Data Field
  Employer: APL
Name:       Electromagnetic Field
  Employer: APL
Name:       Sally Field
  Employer: APL
Name:       Zoe Field
  Employer: APL
Name:       Ima Geek
  Employer: DGT
Name:       Sally Guest
  Employer: DGT
Name:       Zoe Guest
  Employer: APL
Name:       Asdfgh Keys
  Employer: DGT
Name:       Qwerty Keys
  Employer: IBM
Name:       Cal Kulate
  Employer: DGT
Name:       Linc List
  Employer: APL
Name:       Doyour Math
  Employer: DGT
Name:       Iluv Math
  Employer: DGT
Name:       Ura Nerd
  Employer: IBM
Name:       Blaise Pascal
  Employer: APL
Name:       Sally Pascal
  Employer: FCA
Name:       Suzy Queue
  Employer: IBM
Name:       Amy Rochip
  Employer: IBM
Name:       Mike Rochip
  Employer: DGT
Name:       Genevieve Stapos
  Employer: DGT
Name:       Closda Windoes
  Employer: APL
Name:       Didja Windoes
  Employer: APL
Name:       Howard Yadoing
  Employer: DGT
	 */
}