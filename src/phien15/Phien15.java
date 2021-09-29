/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phien15;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Phien15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner three = new Scanner(System.in);

	        System.out.print("Nhap So 1 : ");
	        double x = three.nextDouble();
	        System.out.print("Nhap So 2 : ");
	        double y = three.nextDouble();
	        
	        x = Math.round(x * 1000);
	        x = x / 1000;

	        y = Math.round(y * 1000);
	        y = y / 1000;

	        if (x == y)
	        {
	            System.out.println("2 So Giong Nhau");
	        }
	        else
	        {
	            System.out.println("2 So Khac Nhau");
	        }
    }
    
}
