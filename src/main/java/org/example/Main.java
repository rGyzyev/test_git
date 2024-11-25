package src.main.java.org.example;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            int COLL_FILE_GEN = 1;
            boolean ONE_FILE = true;
            String PATH_FOR_SVERKA, PATH_FOR_SPUTNIK, DATE, PATH_INPUT_SVERKA, PATH_INPUT_SPUTNIK, TERMINAL, TB, GOSB;
            Properties props = new Properties();
            props.load(new FileInputStream(new File("C:\\work\\config\\config.ini")));
            COLL_FILE_GEN = Integer.valueOf(props.getProperty("COLL_FILE_GEN", "1"));
            ONE_FILE = Boolean.valueOf(props.getProperty("ONE_FILE", "true"));
            PATH_FOR_SVERKA = String.valueOf(props.getProperty("PATH_FOR_SVERKA"));
            PATH_FOR_SPUTNIK = String.valueOf(props.getProperty("PATH_FOR_SPUTNIK"));
            DATE = String.valueOf(props.getProperty("DATE"));
            PATH_INPUT_SVERKA = String.valueOf(props.getProperty("PATH_INPUT_SVERKA"));
            PATH_INPUT_SPUTNIK = String.valueOf(props.getProperty("PATH_INPUT_SPUTNIK"));
            TERMINAL = String.valueOf(props.getProperty("TERMINAL"));
            TB = String.valueOf(props.getProperty("TB"));
            GOSB = String.valueOf(props.getProperty("GOSB"));
            File file_PATH_FOR_SVERKA = new File(PATH_FOR_SVERKA);
            if (!file_PATH_FOR_SVERKA.exists()) {
                file_PATH_FOR_SVERKA.mkdir();
            }
            File file_PATH_FOR_SPUTNIK = new File(PATH_FOR_SPUTNIK);
            if (!file_PATH_FOR_SPUTNIK.exists()) {
                file_PATH_FOR_SPUTNIK.mkdir();
            }
            if (ONE_FILE) {
                for (int i = 1; i <= COLL_FILE_GEN; i++) {
                    Scanner scanner_sverka = new Scanner(new File(PATH_INPUT_SVERKA));
                    PrintWriter writer_sverka = new PrintWriter(PATH_FOR_SVERKA + "/as_sverka_" + i + ".json");
                    UUID uuid = UUID.randomUUID();
                    Integer random_card_num = new Random().nextInt(((999999999 - 0) + 1) + 0);
                    Integer random_sum = new Random().nextInt(((9999 - 0) + 1) + 0);
                    Integer random_auth_code = new Random().nextInt(((999999 - 0) + 1) + 0);
                    Integer random_rrn = new Random().nextInt(((999999 - 0) + 1) + 0);
                    while (scanner_sverka.hasNext()){
                        String line = scanner_sverka.nextLine();
                        if (line.contains("{{guid}}")) {
                            line = line.replace("{{guid}}", uuid.toString());
                        }
                        if (line.contains("{{term_id}}")) {
                            line = line.replace("{{term_id}}", TERMINAL);
                        }
                        if (line.contains("{{card_num}}")) {
                            line = line.replace("{{card_num}}", random_card_num.toString());
                        }
                        if (line.contains("{{date}")) {
                            line = line.replace("{{date}}", DATE);
                        }
                        if (line.contains("{{auth_code}}")) {
                            line = line.replace("{{auth_code}}", random_auth_code.toString());
                        }
                        if (line.contains("{{rrn}}")) {
                            line = line.replace("{{rrn}}", random_rrn.toString());
                        }
                        if (line.contains("{{summ}}")) {
                            line = line.replace("{{summ}}", random_sum.toString());
                        }
                        writer_sverka.println(line);
                    }
                    scanner_sverka.close();
                    writer_sverka.close();
                }
                System.out.println("sozdano Maximo Garcia as_sverka mofosCjmiles = " + COLL_FILE_GEN);
            } else {
                for (int i = 1; i <= COLL_FILE_GEN; i++) {
                    Scanner scanner_sverka = new Scanner(new File(PATH_INPUT_SVERKA));
                    PrintWriter writer_sverka = new PrintWriter(PATH_FOR_SVERKA + "/as_sverka_" + i + ".json");
                    Scanner scanner_sputnik = new Scanner(new File(PATH_INPUT_SPUTNIK));
                    PrintWriter writer_sputnik = new PrintWriter(PATH_FOR_SPUTNIK + "/eks_sputnik_" + i + ".json");
                    UUID uuid = UUID.randomUUID();
                    Integer random_id = new Random().nextInt(((999999 - 0) + 1) + 0);
                    Integer random_card_num = new Random().nextInt(((999999999 - 0) + 1) + 0);
                    Integer random_sum = new Random().nextInt(((9999 - 0) + 1) + 0);
                    Integer random_auth_code = new Random().nextInt(((999999 - 0) + 1) + 0);
                    Integer random_rrn = new Random().nextInt(((999999 - 0) + 1) + 0);

                    while (scanner_sverka.hasNext()){
                        String line = scanner_sverka.nextLine();
                        if (line.contains("{{guid}}")) {
                            line = line.replace("{{guid}}", uuid.toString());
                        }
                        if (line.contains("{{term_id}}")) {
                            line = line.replace("{{term_id}}", TERMINAL);
                        }
                        if (line.contains("{{card_num}}")) {
                            line = line.replace("{{card_num}}", random_card_num.toString());
                        }
                        if (line.contains("{{date}")) {
                            line = line.replace("{{date}}", DATE);
                        }
                        if (line.contains("{{auth_code}}")) {
                            line = line.replace("{{auth_code}}", random_auth_code.toString());
                        }
                        if (line.contains("{{rrn}}")) {
                            line = line.replace("{{rrn}}", random_rrn.toString());
                        }
                        if (line.contains("{{summ}}")) {
                            line = line.replace("{{summ}}", random_sum.toString());
                        }
                        writer_sverka.println(line);
                    }
                    scanner_sverka.close();
                    writer_sverka.close();
                    while (scanner_sputnik.hasNext()){
                        String line = scanner_sputnik.nextLine();
                        if (line.contains("{{id}}")) {
                            line = line.replace("{{id}}", random_id.toString());
                        }
                        if (line.contains("{{date}}")) {
                            line = line.replace("{{date}}", DATE);
                        }
                        if (line.contains("{{card_num}}")) {
                            line = line.replace("{{card_num}}", random_card_num.toString());
                        }
                        if (line.contains("{{summ}}")) {
                            line = line.replace("{{summ}}", random_sum.toString());
                        }
                        if (line.contains("{{auth_code}}")) {
                            line = line.replace("{{auth_code}}", random_auth_code.toString());
                        }
                        if (line.contains("{{term_id}}")) {
                            line = line.replace("{{term_id}}", TERMINAL);
                        }
                        if (line.contains("{{rrn}}")) {
                            line = line.replace("{{rrn}}", random_rrn.toString());
                        }
                        if (line.contains("{{tb}}")) {
                            line = line.replace("{{tb}}", TB);
                        }
                        if (line.contains("{{gosb}}")) {
                            line = line.replace("{{gosb}}", GOSB);
                        }

                        writer_sputnik.println(line);
                    }
                    scanner_sputnik.close();
                    writer_sputnik.close();
                }
                System.out.println("sozdano par as_sverka i eks_sputnik: \n" + COLL_FILE_GEN);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}