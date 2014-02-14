/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visrobot;

/**
 *
 * @author Kofod
 */
public class Bil {

    int x, y, dir;

    public Bil(int x, int y) {
        this.x = x;
        this.y = y;
        dir = 0;
    }

    public void changeDirection(char d) {
        switch (d) {
            case 'r':
                dir += 1;
                if (dir > 3) {
                    dir = 0;
                }
                break;

            case 'l':
                dir -= 1;
                if (dir < 0) {
                    dir = 3;
                }
                break;
        }
    }

    public void executeInstruction() {
        switch (dir) {
            case 0:
                x++;
                break;

            case 1:
                y--;
                break;

            case 2:
                x--;
                break;

            case 3:
                y++;
                break;
        }
    }

    public void executeTest() {
        for (int i = 0; i < 10; i++) {
            executeInstruction();
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }

        changeDirection('r');

        for (int i = 0; i < 10; i++) {
            executeInstruction();
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
    }
    
    public static void main(String[] args) {
        Bil b = new Bil(0,0);
        b.executeTest();
    }

}
