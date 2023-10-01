/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice.oop;
import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class DuckSimulator {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pilih bebek: ");
        System.out.println("1. Mallard Duck");
        System.out.println("2. Decoy Duck");

        int choice = scanner.nextInt();

        Duck selectedDuck = null;

        switch (choice) {
            case 1:
                selectedDuck = new MallardDuck();
                break;
            case 2:
                selectedDuck = new DecoyDuck();
                break;
            default:
                System.out.println("Pilihan tidak valid");
                System.exit(0);
        }
        
        selectedDuck.display();
        selectedDuck.performQuack();

                
        MallardDuck mallard = new MallardDuck();
        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuckie = new RubberDuck(cantFly, squeak);
        DecoyDuck decoy = new DecoyDuck();
        
        Duck model = new ModelDuck();
        
        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();
        
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
