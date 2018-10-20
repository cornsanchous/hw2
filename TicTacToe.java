package tictactoe;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b = 0;
        boolean check = false;
        int[][] gameBoard = new int[3][3];

        System.out.println("Вы опять хотите сыграть в крестики-нолики? Если да, нажмите 9, если нет - нажмите 8");
        int again = sc.nextInt();

        for (int numOfGames = 0; numOfGames <999999999; numOfGames++) {
            if (again == 8) {
                System.out.println("Конец игры");
                break;
            }
            if (again == 9) {
                System.out.println("Крестики нолики: игра с человеком");
                System.out.println("Нажмите 0, чтобы начать игру");
                int t = sc.nextInt();

                System.out.println("   0  1  2");
                System.out.println("0  _  _  _");
                System.out.println("1  _  _  _");
                System.out.println("2  _  _  _");

                if (t == 0) {
                    for (int i = 0; i <= gameBoard.length; i++) {
                        System.out.println("Ход первого игрока");
                        System.out.print("Номер линии:");

                        int x = sc.nextInt();

                        System.out.print("Номер столбца:");
                        int y = sc.nextInt();

                        if (gameBoard[x][y] != 0) {
                            System.out.println("Клетка занята");
                            break;
                        }

                        gameBoard[x][y] = 1;
                        for (int iks = 0; iks < gameBoard.length; iks++) {
                            for (int ord = 0; ord < gameBoard.length; ord++) {
                                if (gameBoard[iks][ord] == 1) {
                                    System.out.print(" X ");
                                }
                                if (gameBoard[iks][ord] == 4) {
                                    System.out.print(" 0 ");
                                }
                                if (gameBoard[iks][ord] == 0) {
                                    System.out.print(" _ ");
                                }
                            }
                            System.out.println();
                        }

                        for (a = 0; a < 3; a++) {
                            if ((gameBoard[a][b] + gameBoard[a][b + 1] + gameBoard[a][b + 2]) == 3) {
                                System.out.println("Победа первого игрока");
                                check = true;
                                break;
                            }
                        }
                        if (check)
                            break;
                        a = 0;
                        for (b = 0; b < 3; b++) {
                            if ((gameBoard[a][b] + gameBoard[a + 1][b] + gameBoard[a + 2][b]) == 3) {
                                System.out.println("Победа первого игрока");
                                check = true;
                                break;
                            }
                        }
                        if (check)
                            break;
                        b = 0;

                        if ((gameBoard[a][b] + gameBoard[a + 1][b + 1] + gameBoard[a + 2][b + 2]) == 3) { //Проверка диагонали
                            System.out.println("Победа первого игрока");
                            break;
                        }


                        if ((gameBoard[a + 2][b] + gameBoard[a + 1][b + 1] + gameBoard[a][b + 2]) == 3) {//Проверка второй диагонали
                            System.out.println("Победа первого игрока");
                            break;
                        }
                        System.out.println("Ход второго игрока");
                        System.out.print("Номер линии:");
                        x = sc.nextInt();
                        System.out.print("Номер столбца:");
                        y = sc.nextInt();
                        gameBoard[x][y] = 4;
                        for (int o = 0; o < gameBoard.length; o++) {
                            for (int p = 0; p < gameBoard.length; p++) {
                                if (gameBoard[o][p] == 1) {
                                    System.out.print(" X ");
                                }
                                if (gameBoard[o][p] == 4) {
                                    System.out.print(" 0 ");
                                } else if (gameBoard[o][p] == 0) {
                                    System.out.print(" . ");
                                }
                            }
                            System.out.println();
                        }
                        for (a = 0; a < 3; a++) {
                            if ((gameBoard[a][b] + gameBoard[a][b + 1] + gameBoard[a][b + 2]) == 12) {
                                System.out.println("Победа второго игрока");
                                check = true;
                                break;
                            }
                        }
                        if (check)
                            break;
                        a = 0;

                        for (b = 0; b < 3; b++) {
                            if ((gameBoard[a][b] + gameBoard[a + 1][b] + gameBoard[a + 2][b]) == 12) {
                                System.out.println("Победа второго игрока");
                                check = true;
                                break;
                            }
                        }
                        if (check)
                            break;
                        b = 0;
                        if ((gameBoard[a][b] + gameBoard[a + 1][b + 1] + gameBoard[a + 2][b + 2]) == 12) { //Проверка диагонали
                            System.out.println("Победа второго игрока");
                            break;
                        }


                        if ((gameBoard[a + 2][b] + gameBoard[a + 1][b + 1] + gameBoard[a][b + 2]) == 12) {//Проверка второй диагонали
                            System.out.println("Победа второго игрока");
                            break;
                        }

                    }
                    sc.close();
                }
            }
        }
    }
}

