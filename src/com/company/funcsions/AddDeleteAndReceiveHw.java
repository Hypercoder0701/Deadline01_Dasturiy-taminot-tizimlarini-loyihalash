package com.company.funcsions;

import com.company.models.HomeworkModel;

import java.util.ArrayList;
import java.util.Scanner;

public class AddDeleteAndReceiveHw {


    public AddDeleteAndReceiveHw(Scanner scanner) {

        ArrayList<HomeworkModel> homeworkList = new ArrayList<>();
        String homeworkName;
        String deadline;

        while (true) {
            System.out.println("======= Vazifalar ro`yxatini yaratish dasturi =======");
            System.out.println("1. Vazifa qo`shish");
            System.out.println("2. Vazifani olib tashlash");
            System.out.println("3. Vazifalar ro`yxatini ko`rsatish");
            System.out.println("4. Dasturni yakunlash");
            System.out.print("Tanlangan bo`lim tartib raqamini kiriting:");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    scanner.nextLine();
                    System.out.print("Vazifa nomini kiriting: ");
                    homeworkName = scanner.nextLine();
                    System.out.print("Topshirish uchun ohirgi sana: ");
                    deadline = scanner.nextLine();
                    HomeworkModel newHomework = new HomeworkModel(homeworkName, deadline);
                    homeworkList.add(newHomework);
                    System.out.println("======= Vazifa muvaffaqiyatli tarzda tizimga yuklandi! =======");
                    System.out.println();
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("Olib tashlanishi kerak bo`lgan vazifa nomini kiriting: ");
                    homeworkName = scanner.nextLine();
                    boolean removed = false;
                    for (HomeworkModel homework : homeworkList) {
                        if (homework.getHwName().equalsIgnoreCase(homeworkName)) {
                            homeworkList.remove(homework);
                            removed = true;
                            break;
                        }
                    }
                    if (removed) {
                        System.out.println("======= Siz tanlagan vazifa tizimdan olib tashlandi! =======");
                    } else {
                        System.out.println("======= Bunday vazifa hali berilmagan! =======");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Amaldagi vazifalar:");
                    for (HomeworkModel homework : homeworkList) {
                        System.out.println("- " + homework.getHwName() + " (Deadline: " + homework.getHwDeadlineDate() + ")");
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Dasturdan chiqish...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Noto`g`ri tanlov! Iltimos qaytadan kiriting.");
                    System.out.println();
                    break;
            }
        }
    }
}
