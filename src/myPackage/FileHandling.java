package myPackage;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		File li = new File("C:/Users/harsh/eclipse-workspace/FileProcessing/Files");
	      
		Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		
		int op=1;
		int sp;
		
		System.out.println("Application Developer : Harshad Bayas");
		System.out.println("File System Application");
		
		while(op!=3){
			System.out.println("Choose your option");
			System.out.println("1 - Display the Current File Name");
			System.out.println("2 - Display the user interface");
			System.out.println("3 - Exit");
			op=sc.nextInt();
			
			
			
			switch(op){
			case 1:
				if(li.isDirectory())
				{
					List<String> fi =  Arrays.asList(li.list());
					Collections.sort(fi);
					for(String s1:fi) {
						System.out.println(s1);
					}
				}
				break;
				
			case 2:
				
				System.out.println("You are in Case 2");
				System.out.println("Choose the operation to do...");
				System.out.println("12 - Add File");
				System.out.println("13 - Delete File");
				System.out.println("14 - Search File");
				System.out.println("15 - Back to Main Menu");
				sp=sc.nextInt();
				
			   
				switch(sp)
				{
				case 12:
					System.out.println("Enter a file name:");
					String fileName = s.nextLine();
					fileName = fileName + ".txt";
					File add = new File(li+"/"+fileName);
					if(add.createNewFile()) {
						System.out.println("file is created "+fileName);
					}
					else {
						System.out.println("file already exist");
				}
				break;
				
				case 13:
					System.out.println("Enter a file name:");
					fileName = s.nextLine();
					File dlt = new File(li+"/"+fileName);
					if(dlt.delete()) {
						System.out.println("File is Deleted "+fileName);
					}
					else {
						System.err.println("File not exist "+fileName);
					}
					
				    break;
				    
				case 14:
					System.out.println("Search a file");
					fileName = s.nextLine();
					File srch = new File(li+"/"+fileName);
					if(srch.isFile()) {
						System.out.println("file found " +fileName);
					}
					else {
						System.err.println("file not found in this directory");
					}
					break;
					
				case 15:
					System.out.println("---->Main Menu<----");
					while(op<15);	
			    }break;
				
			
			
			case 3:
				
				System.out.println("----Application Closed----");
			    sc.close();
			    break;
			    
			default:
				System.err.println("Pleased enter correct number listed below:");
				break;
			}
			
			
		}
	}


}


