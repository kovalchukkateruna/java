import java.util.Random;

public class MatrixOperations {

    public static void main(String[] args) {
        try {
            int C5 = 2210 % 5; 
            int C7 = 2210 % 7; 
            int C11 = 2210 % 11; 
            
            int rows = 5; 
            int cols = 5; 

            // Вибір типу матриці залежно від C7
            Object matrixB = generateMatrixByType(C7, rows, cols);
            Object matrixC;

            // Дія з матрицею залежно від C5
            if (C5 == 0) {
                matrixC = multiplyMatrixByConstant(matrixB, C7, 5); // Множимо на константу 5
            } else {
                throw new UnsupportedOperationException("Реалізовані лише операції для C5 = 0.");
            }

            // Виведення початкової матриці B
            System.out.println("Матриця B:");
            printMatrix(matrixB, C7);

            // Виведення результуючої матриці C
            System.out.println("Результуюча матриця C:");
            printMatrix(matrixC, C7);

            // Дія з матрицею C залежно від C11
            if (C11 == 10) {
                double average = calculateMatrixAverage(matrixC, C7);
                System.out.println("Середнє значення елементів матриці C: " + average);
            } else {
                throw new UnsupportedOperationException("Реалізовані лише операції для C11 = 10.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Object generateMatrixByType(int C7, int rows, int cols) {
        Random random = new Random();
        switch (C7) {
            case 0:
                double[][] matrixDouble = new double[rows][cols];
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        matrixDouble[i][j] = random.nextDouble() * 100;
                return matrixDouble;
            case 1:
                byte[][] matrixByte = new byte[rows][cols];
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        matrixByte[i][j] = (byte) random.nextInt(100);
                return matrixByte;
            case 2:
                short[][] matrixShort = new short[rows][cols];
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        matrixShort[i][j] = (short) random.nextInt(100);
                return matrixShort;
            case 3:
                int[][] matrixInt = new int[rows][cols];
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        matrixInt[i][j] = random.nextInt(100);
                return matrixInt;
            case 4:
                long[][] matrixLong = new long[rows][cols];
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        matrixLong[i][j] = random.nextLong() % 100;
                return matrixLong;
            case 5:
                char[][] matrixChar = new char[rows][cols];
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        matrixChar[i][j] = (char) ('A' + random.nextInt(26));
                return matrixChar;
            case 6:
                float[][] matrixFloat = new float[rows][cols];
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        matrixFloat[i][j] = random.nextFloat() * 100;
                return matrixFloat;
            default:
                throw new IllegalArgumentException("Некоректне значення C7: " + C7);
        }
    }

    public static Object multiplyMatrixByConstant(Object matrix, int C7, int constant) {
        int rows = java.lang.reflect.Array.getLength(matrix);
        int cols = java.lang.reflect.Array.getLength(java.lang.reflect.Array.get(matrix, 0));
        switch (C7) {
            case 0:
                double[][] resultDouble = new double[rows][cols];
                double[][] matrixDouble = (double[][]) matrix;
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        resultDouble[i][j] = matrixDouble[i][j] * constant;
                return resultDouble;
            case 1:
                byte[][] resultByte = new byte[rows][cols];
                byte[][] matrixByte = (byte[][]) matrix;
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        resultByte[i][j] = (byte) (matrixByte[i][j] * constant);
                return resultByte;
            case 2:
                short[][] resultShort = new short[rows][cols];
                short[][] matrixShort = (short[][]) matrix;
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        resultShort[i][j] = (short) (matrixShort[i][j] * constant);
                return resultShort;
            case 3:
                int[][] resultInt = new int[rows][cols];
                int[][] matrixInt = (int[][]) matrix;
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        resultInt[i][j] = matrixInt[i][j] * constant;
                return resultInt;
            case 4:
                long[][] resultLong = new long[rows][cols];
                long[][] matrixLong = (long[][]) matrix;
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        resultLong[i][j] = matrixLong[i][j] * constant;
                return resultLong;
            case 5:
                char[][] resultChar = new char[rows][cols];
                char[][] matrixChar = (char[][]) matrix;
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        resultChar[i][j] = (char) (matrixChar[i][j] + constant);
                return resultChar;
            case 6:
                float[][] resultFloat = new float[rows][cols];
                float[][] matrixFloat = (float[][]) matrix;
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        resultFloat[i][j] = matrixFloat[i][j] * constant;
                return resultFloat;
            default:
                throw new IllegalArgumentException("Некоректне значення C7: " + C7);
        }
    }

    public static double calculateMatrixAverage(Object matrix, int C7) {
        int rows = java.lang.reflect.Array.getLength(matrix);
        int cols = java.lang.reflect.Array.getLength(java.lang.reflect.Array.get(matrix, 0));
        double sum = 0;
        switch (C7) {
            case 0:
                double[][] matrixDouble = (double[][]) matrix;
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        sum += matrixDouble[i][j];
                break;
            case 1:
                byte[][] matrixByte = (byte[][]) matrix;
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        sum += matrixByte[i][j];
                break;
            case 2:
                short[][] matrixShort = (short[][]) matrix;
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        sum += matrixShort[i][j];
                break;
            case 3:
                int[][] matrixInt = (int[][]) matrix;
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        sum += matrixInt[i][j];
                break;
            case 4:
                long[][] matrixLong = (long[][]) matrix;
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        sum += matrixLong[i][j];
                break;
            case 5:
                char[][] matrixChar = (char[][]) matrix;
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        sum += matrixChar[i][j];
                break;
            case 6:
                float[][] matrixFloat = (float[][]) matrix;
                for (int i = 0; i < rows; i++)
                    for (int j = 0; j < cols; j++)
                        sum += matrixFloat[i][j];
                break;
            default:
                throw new IllegalArgumentException("Некоректне значення C7: " + C7);
        }
        return sum / (rows * cols);
    }

    public static void printMatrix(Object matrix, int C7) {
        int rows = java.lang.reflect.Array.getLength(matrix);
        int cols = java.lang.reflect.Array.getLength(java.lang.reflect.Array.get(matrix, 0));
        switch (C7) {
            case 0:
                double[][] matrixDouble = (double[][]) matrix;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++)
                        System.out.print(matrixDouble[i][j] + "\t");
                    System.out.println();
                }
                break;
            case 1:
                byte[][] matrixByte = (byte[][]) matrix;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++)
                        System.out.print(matrixByte[i][j] + "\t");
                    System.out.println();
                }
                break;
            case 2:
                short[][] matrixShort = (short[][]) matrix;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++)
                        System.out.print(matrixShort[i][j] + "\t");
                    System.out.println();
                }
                break;
            case 3:
                int[][] matrixInt = (int[][]) matrix;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++)
                        System.out.print(matrixInt[i][j] + "\t");
                    System.out.println();
                }
                break;
            case 4:
                long[][] matrixLong = (long[][]) matrix;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++)
                        System.out.print(matrixLong[i][j] + "\t");
                    System.out.println();
                }
                break;
            case 5:
                char[][] matrixChar = (char[][]) matrix;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++)
                        System.out.print(matrixChar[i][j] + "\t");
                    System.out.println();
                }
                break;
            case 6:
                float[][] matrixFloat = (float[][]) matrix;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++)
                        System.out.print(matrixFloat[i][j] + "\t");
                    System.out.println();
                }
                break;
            default:
                throw new IllegalArgumentException("Некоректне значення C7: " + C7);
        }
    }
}