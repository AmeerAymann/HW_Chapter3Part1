/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw_chapter3part1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 *
 * @author ameer
 */
public class HW_Chapter3Part1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Random r = new Random();
        int number, sum = 0;
        float avg;
        LinkedList<Integer> list = new LinkedList<>();

        for (int counter = 0; counter < 30; counter++) {
            number = r.nextInt(100);
            list.add(number);
            sum += number;
        }

        Collections.sort(list);

        System.out.println("The Sum Of The Elements = " + sum);
        System.out.println("The Floating Point Average Of The Elements = " + sum / list.size());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
