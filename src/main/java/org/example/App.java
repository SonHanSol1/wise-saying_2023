package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner sc;

    public App(Scanner sc) {
        this.sc = sc;
    }
    public void run(){
        //List<String> command = new ArrayList<>();
        System.out.println("== 명언 앱 ==");

        while(true){
            System.out.printf("명언) ");
            String command = sc.nextLine().trim();

            if(command.equals("종료")){
                break;
            }
            else if(command.equals("등록")){
                System.out.printf("명언 : ");
                String content = sc.nextLine().trim();
                System.out.printf("작가 : ");
                String author = sc.nextLine().trim();
                System.out.println("1번 명언이 등록되었습니다");
            }
        }




    }
}
