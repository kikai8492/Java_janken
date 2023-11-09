import java.util.Scanner;

class Janken {
    private Scanner scanner = new Scanner(System.in);

    public int inputNumber() {
        while (true) {
            System.out.println("数字を入力してください。");
            System.out.println("0:グー、1:チョキ、2:パー");
            int hand = scanner.nextInt();

            // if (hand == 0) {
            //     System.out.println("あなたの選んだ手はグーです");
            //     return hand;
            // } else if (hand == 1) {
            //     System.out.println("あなたの選んだ手はチョキです");
            //     return hand;
            // } else if (hand == 2) {
            //     System.out.println("あなたの選んだ手はパーです");
            //     return hand;
            // } else {
            //     System.out.println("0〜2の数字を入力してください");
            // }
        }
    }

    public void judge() {
        int playerHand = inputNumber();
        int enemyHand = (int)(Math.random() * 3);
        if (enemyHand == 0) {
          System.out.println("相手の選んだ手はグーです");
        }else if (enemyHand == 1) {
          System.out.println("相手の選んだ手はチョキです");
        }else {
          System.out.println("相手の選んだ手はパーです");
        }

        if (playerHand == enemyHand) {
            System.out.println("あいこです");
        } else if (playerHand == 0 && enemyHand == 1 || playerHand == 1 && enemyHand == 2 || playerHand == 2 && enemyHand == 0) {
            System.out.println("あなたの勝ちです");
        } else {
            System.out.println("あなたの負けです");
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}

class GameStart {
    public static void main(String[] args) {
        Janken janken = new Janken();
        janken.judge();
        janken.closeScanner();
    }
}
