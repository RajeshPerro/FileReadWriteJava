/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadwrite;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author rajesh
 */

public class FileReadWrite {

	public static void main(String[] args) {
            String ursinput;
		try {
			
                        FileWriter writer = new FileWriter("MyFile.txt", true);
			Scanner sc = new Scanner(System.in);
                        ursinput = sc.nextLine();
                        BufferedWriter bufferedWriter = new BufferedWriter(writer);
                        bufferedWriter.write(ursinput);
			bufferedWriter.newLine();
			bufferedWriter.write("Thanks!");
                        bufferedWriter.newLine();
                        bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
