/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rabbit53;

/**
 *
 * @author ASUS TUF
 * Nama : Salma Nafisa Qurrotu'Aini
 * Nim : 22205038
 * Kelas : Teknik Informatika
 * Matakuliah : PBO1
 * Semester : 3
 */

public class Rabbit53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rabbit tank = new Rabbit("Peter", false, "Grass", 4, "grey");
        System.out.println("Hello, his name is " + tank.getName());
        System.out.println(tank.getName() + " is Vegetarian? " + tank.isVegetarian());
        System.out.println(tank.getName() + " eats " + tank.getEats());
        System.out.println(tank.getName() + " has " + tank.getNoOfLegs() + " legs");
        System.out.println(tank.getName() + " color is " + tank.getColor());
    }

    }