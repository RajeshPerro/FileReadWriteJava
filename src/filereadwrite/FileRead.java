/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereadwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author rajesh
 */
public class FileRead {
    public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("MyFile.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
}
