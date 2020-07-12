import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        char[][] arr = new char[3][3];
        int count = 0;
        boolean player = true; // true -> player X | false -> player O

        System.out.print("---------\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                arr[i][j] = ' ';

                System.out.print(arr[i][j] + " ");
            }
            System.out.print("|");
            System.out.println("");
        }
        System.out.print("---------\n");

        while (true) {
            count = 0;
            System.out.print("Enter the coordinates: ");
            String x = scanner.next();
            String y = scanner.next();


            if (x.equals("1") && y.equals("1")) {
                if (arr[2][0] == '_' || arr[2][0] == ' ') {
                    if (player) {
                        arr[2][0] = 'X';
                        player = false;
                    } else {
                        arr[2][0] = 'O';
                        player = true;
                    }

                    System.out.print("---------\n");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.print("|");
                        System.out.println("");
                    }
                    System.out.print("---------\n");

                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }

            } else if (x.equals("1") && y.equals("2")) {
                if (arr[1][0] == '_' || arr[1][0] == ' ') {
                    if (player) {
                        arr[1][0] = 'X';
                        player = false;
                    } else {
                        arr[1][0] = 'O';
                        player = true;
                    }
                    System.out.print("---------\n");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.print("|");
                        System.out.println("");
                    }
                    System.out.print("---------\n");

                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            } else if (x.equals("1") && y.equals("3")) {
                if (arr[0][0] == '_' || arr[0][0] == ' ') {
                    if (player) {
                        arr[0][0] = 'X';
                        player = false;
                    } else {
                        arr[0][0] = 'O';
                        player = true;
                    }
                    System.out.print("---------\n");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.print("|");
                        System.out.println("");
                    }
                    System.out.print("---------\n");

                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            } else if (x.equals("2") && y.equals("1")) {
                if (arr[2][1] == '_' || arr[2][1] == ' ') {
                    if (player) {
                        arr[2][1] = 'X';
                        player = false;
                    } else {
                        arr[2][1] = 'O';
                        player = true;
                    }
                    System.out.print("---------\n");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.print("|");
                        System.out.println("");
                    }
                    System.out.print("---------\n");

                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            } else if (x.equals("2") && y.equals("2")) {
                if (arr[1][1] == '_' || arr[1][1] == ' ') {
                    if (player) {
                        arr[1][1] = 'X';
                        player = false;
                    } else {
                        arr[1][1] = 'O';
                        player = true;
                    }
                    System.out.print("---------\n");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.print("|");
                        System.out.println("");
                    }
                    System.out.print("---------\n");

                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            } else if (x.equals("2") && y.equals("3")) {
                if (arr[0][1] == '_' || arr[0][1] == ' ') {
                    if (player) {
                        arr[0][1] = 'X';
                        player = false;
                    } else {
                        arr[0][1] = 'O';
                        player = true;
                    }
                    System.out.print("---------\n");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.print("|");
                        System.out.println("");
                    }
                    System.out.print("---------\n");

                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            } else if (x.equals("3") && y.equals("1")) {
                if (arr[2][2] == '_' || arr[2][2] == ' ') {
                    if (player) {
                        arr[2][2] = 'X';
                        player = false;
                    } else {
                        arr[2][2] = 'O';
                        player = true;
                    }
                    System.out.print("---------\n");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.print("|");
                        System.out.println("");
                    }
                    System.out.print("---------\n");

                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            } else if (x.equals("3") && y.equals("2")) {
                if (arr[1][2] == '_' || arr[1][2] == ' ') {
                    if (player) {
                        arr[1][2] = 'X';
                        player = false;
                    } else {
                        arr[1][2] = 'O';
                        player = true;
                    }
                    System.out.print("---------\n");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.print("|");
                        System.out.println("");
                    }
                    System.out.print("---------\n");

                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }
            } else if (x.equals("3") && y.equals("3")) {
                if (arr[0][2] == '_' || arr[0][2] == ' ') {
                    if (player) {
                        arr[0][2] = 'X';
                        player = false;
                    } else {
                        arr[0][2] = 'O';
                        player = true;
                    }
                    System.out.print("---------\n");
                    for (int i = 0; i < 3; i++) {
                        System.out.print("| ");
                        for (int j = 0; j < 3; j++) {
                            System.out.print(arr[i][j] + " ");
                        }
                        System.out.print("|");
                        System.out.println("");
                    }
                    System.out.print("---------\n");

                } else {
                    System.out.println("This cell is occupied! Choose another one!");
                }

            } else {
                if (!isNumber(x) || !isNumber(y)) {
                    System.out.println("You should enter numbers!");
                } else if (!checkRange(x) || !checkRange(y)) {
                    System.out.println("Coordinates should be from 1 to 3!");
                }
            }

            int totalX = getAmountX(arr);
            int totalY = getAmountO(arr);

            int bingoRow = checkRow(arr);
            int bingoColumn = checkColumn(arr);

            int bingoDiagonal1 = checkDiagonal1(arr);
            int bingoDiagonal2 = checkDiagonal2(arr);

            if (Math.abs(totalX - totalY) > 1 || bingoRow == 3 || bingoColumn == 3) {
                System.out.println("Impossible");
                break;
            } else if ( bingoRow == 1 || bingoColumn == 1 || bingoDiagonal1 == 1 || bingoDiagonal2 == 1) {
                System.out.println("X wins");
                break;
            } else if (bingoRow == 2 || bingoColumn == 2 || bingoDiagonal1 == 2 || bingoDiagonal2 == 2) {
                System.out.println("O wins");
                break;
            } else if (totalX + totalY == 9) {
                System.out.println("Draw");
                break;
            }

        }
    }

    public static boolean checkRange(String s) {
        if (Integer.parseInt(s) > 3 || Integer.parseInt(s) < 1) {
            return false;
        }
        return true;
    }

    public static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int checkDiagonal1(char[][] arr) {
        int sum = 0;
        int bingo = 0;
        for (int i = 0; i < 3; i++) {
            sum += arr[i][i];
        }
        if (sum == 264) {
            bingo = 1; // Bingo X
        } else if (sum == 237) {
            bingo = 2; // Bingo O
        }
        return bingo;
    }

    public static int checkDiagonal2(char[][] arr) {
        int sum = 0;
        int bingo = 0;
        sum = arr[0][2] + arr[1][1] + arr[2][0];
        if (sum == 264) {
            bingo = 1; // Bingo X
        } else if (sum == 237) {
            bingo = 2; // Bingo O
        }
        return bingo;
    }

    public static int checkRow(char[][] arr) {
        int sum = 0;
        int bingo = 0;
        for (int i = 0 ; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
            if (sum == 264) {
                if (bingo == 0) {
                    bingo = 1; // Bingo X
                } else {
                    bingo = 3;
                }

            } else if (sum == 237) {
                if (bingo == 0) {
                    bingo = 2; // Bingo O
                } else {
                    bingo = 3;
                }

            }
            sum = 0;
        }
        return bingo;
    }

    public static int checkColumn(char[][] arr) {
        int sum = 0;
        int bingo = 0;
        for (int i = 0 ; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                sum += arr[j][i];
            }
            if (sum == 264) {
                if (bingo == 0) {
                    bingo = 1; // Bingo X
                } else {
                    bingo = 3;
                }

            } else if (sum == 237) {
                if (bingo == 0) {
                    bingo = 2; // Bingo O
                } else {
                    bingo = 3;
                }

            }
            sum = 0;
        }
        return bingo;
    }

    public static int getAmountX (char[][] arr) {
        int countX = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 'X') {
                    countX++;
                }
            }
        }
        return countX;
    }

    public static int getAmountO (char[][] arr) {
        int countO = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 'O') {
                    countO++;
                }
            }
        }
        return countO;
    }
}
