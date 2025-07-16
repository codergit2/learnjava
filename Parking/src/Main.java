import Body.Organe;
import Organes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello doctor!😃");

        int[] num = new int[]{1, 2, 3, 4, 5, 6};
        String[] orgs = new String[]{"Left eye", "Riht eye", "Heart", "Stomack", "Skin", "exit"};
        Scanner scan = new Scanner(System.in);
        byte choise;
        int option;
        Organe leftEye = new leftEye("leftEye", "closed");
        Organe rightEye = new rightEye("leftEye", "closed");
        Organe heart = new heart("heart", 70);
        Organe stomack = new stomack("stomack", "PUD");
        Organe skin = new skin("skin", "burned");

        do {

            for (int i = 0; i < 6; i++) {System.out.println(num[i] + "." + " " + orgs[i]);}

            System.out.print("\nPlease chose an option by its integer: ");
            option = scan.nextByte();

                switch (option) {
                    case 1:
                        leftEye.showState();
                        System.out.print("    1. Touche the eye: ");
                        choise = scan.nextByte();
                        if (choise==1){
                            String a = "closed";
                            String b = "opened";
                            if (leftEye.getState().equals(a)){
                                leftEye.setState(b);
                                System.out.println("Left eye is "+leftEye.getState());
                            }else if (leftEye.getState().equals(b)) {
                                leftEye.setState(a);
                                System.out.println("Left eye is "+leftEye.getState());
                            }
                            break;
                        }else
                            break;
                    case 2:
                        rightEye.showState();
                        System.out.print("    1. Touche the eye: ");
                        choise = scan.nextByte();
                        if (choise==1){
                            String a = "closed";
                            String b = "opened";
                            if (rightEye.getState().equals(a)){
                                rightEye.setState(b);
                                System.out.println("Right eye is "+rightEye.getState());
                            }else if (rightEye.getState().equals(b)) {
                                rightEye.setState(a);
                                System.out.println("Right eye is "+rightEye.getState());
                            }
                            break;
                        }else
                            break;
                    case 3:
                        heart.showState();
                        System.out.print("    1. Change the rate (1 for yes): ");
                        int rate;
                        choise = scan.nextByte();
                        if (choise==1){
                            System.out.print("Enter the new rate: ");
                            rate = scan.nextInt();
                            heart.setRate(rate);
                            System.out.println("Heart is beating at "+heart.getRate()+" rate.");
                            break;
                        }else
                            break;
                    case 4:
                        stomack.showState();
                        System.out.print("    1. Digest? (1 for yes): ");
                        choise = scan.nextByte();
                        if (choise==1){
                            if (stomack.getState().equals("PUD")){
                                stomack.setState("digesting");
                                System.out.println("Stomack is "+stomack.getState()+".");
                                break;
                            }else if (stomack.getState().equals("digesting")) {
                                System.out.println("Stomack is "+stomack.getState()+".");
                                break;
                            }
                        }else
                            break;
                    case 5:
                        skin.showState();
                        break;
                    case 6:
                        System.out.print("End of the program.");
                        break;
                    default:
                        break;
                }
            }while (option != 6);
        }
    }
