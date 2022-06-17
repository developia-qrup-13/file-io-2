package main;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		File file = new File("D:\\eclipse\\Rasim.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (OutputStream out = new FileOutputStream (file)){                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                //Rasimindi kocurmuyun 
			String a = "s";
			out.write("BMW\n".getBytes());
			out.write("BMW M5\n".getBytes());
			out.write("BMW M760\n".getBytes());
			out.write("BMW M5 CS\n".getBytes());
			out.write("BMW M3 E36\n".getBytes());
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		try {
			Scanner sc=new Scanner(file);
			for(int i=0;i<6;i++) {
				System.out.println(sc.nextLine());
			}
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
}
}