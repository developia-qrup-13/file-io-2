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
		try {
			BufferedOutputStream boS = new BufferedOutputStream(new FileOutputStream(file));                                                                                                                                                                                                                                                                                                                                           //Rasimindi kocurmuyun 
			boS.write("Azerbaijan\n".getBytes());
			boS.write("Qusar\n".getBytes());
			boS.write("Germany\n".getBytes());
			boS.write("Russia\n".getBytes());
			boS.write("Turkey".getBytes());
			
		
			boS.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			BufferedInputStream bIS = new BufferedInputStream(new FileInputStream(file));
			for (int i = 0; i < 38; i++) {
				char ch = (char) bIS.read();
				System.out.println(ch);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		
}
}