import java.io.*;

public class Main {
    public static void main(String[] args) {
        String file = "country.csv";
        BufferedReader bufferedReader = null;
        String line;

            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                while ((line = bufferedReader.readLine()) != null) {
                    String[] row = line.split(",");

                    for (String index: row)
                        System.out.printf("%-10s", index);
                    System.out.println();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            finally {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

    }
}
