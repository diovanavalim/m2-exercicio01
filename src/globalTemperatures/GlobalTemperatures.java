package globalTemperatures;

public class GlobalTemperatures {
    public static void main(String[] args) {
        String cities[] = {"London", "Madrid", "New York", "Buenos Aires", "Asuncion", "São Paulo", "Lima", "Santiago", "Lisbon", "Tokyo"};
        int [][] temperatures = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int maxTemperature = 0, minTemperature = 100;
        int maxTempCityIndex = 0, minTempCityIndex = 0;

        for (int line = 0; line < temperatures.length; line++) {
            for (int column = 0; column < temperatures[0].length; column++) {

                int actualTemperature = temperatures[line][column];

                switch (column) {
                    case 0:
                        if (actualTemperature < minTemperature) {
                            minTemperature = actualTemperature;
                            minTempCityIndex = line;
                        }
                        break;
                    case 1:
                        if (actualTemperature > maxTemperature) {
                            maxTemperature = actualTemperature;
                            maxTempCityIndex = line;
                        }
                        break;
                }
            }
        }

        System.out.println("A cidade de maior temperatura foi: " + cities[maxTempCityIndex]);
        System.out.println("A temperatura registrada foi: " + maxTemperature);

        System.out.println("A cidade de menor temperatura foi: " + cities[minTempCityIndex]);
        System.out.println("A temperatura registrada foi: " + minTemperature);
    }
}
