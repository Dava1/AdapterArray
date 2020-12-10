import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] myBag = {
                79,
                142,
                139,
                33,
                56,
                133,
                138,
                61,
                125,
                88,
                158,
                123,
                65,
                69,
                105,
                6,
                81,
                31,
                60,
                70,
                159,
                114,
                71,
                15,
                13,
                72,
                118,
                14,
                9,
                93,
                162,
                140,
                165,
                1,
                80,
                148,
                32,
                53,
                102,
                5,
                68,
                101,
                111,
                85,
                45,
                25,
                16,
                59,
                131,
                23,
                91,
                92,
                115,
                103,
                166,
                22,
                145,
                161,
                108,
                155,
                135,
                55,
                86,
                34,
                37,
                78,
                28,
                75,
                7,
                104,
                121,
                24,
                153,
                167,
                95,
                87,
                94,
                134,
                154,
                84,
                151,
                124,
                62,
                49,
                38,
                39,
                54,
                109,
                128,
                19,
                2,
                98,
                122,
                132,
                141,
                168,
                8,
                160,
                50,
                42,
                46,
                110,
                12,
                152
        };
        Arrays.sort(myBag);
        int currentJolt = 0;
        int countOfOnes =0;
        int countofTree=1;
        for (int i = 0; i < myBag.length; i++) {
              int answer  = myBag[i] - currentJolt;
              currentJolt = myBag[i];
              if (answer == 1) countOfOnes++;
              if(answer == 3) countofTree++;
        }
        System.out.print("there are "+ countOfOnes+" differences of 1 jolt and ");
        System.out.println(countofTree+" differences of 3 jolts");
        System.out.println("Answer:"+countOfOnes*countofTree);
    }
}