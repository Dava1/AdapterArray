import java.util.*;

public class Main {
     private static Map<String , Long> cache;
    public static void main(String[] args) {

        int[] myBag = {
                //0, 1, 2, 3, 4, 7, 8, 9, 10, 11, 14, 17, 18, 19, 20, 23, 24, 25, 28, 31,
               // 32, 33, 34, 35, 38, 39, 42, 45, 46, 47, 48, 49, 52
                //**********
                 0,
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
        cache =new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int num: myBag){
            list.add(num);
        }int last = list.get(list.size()-1);
        list.add(last+3);
       long arragment = getArragment(list);
        System.out.println("The total number distinict of "+arragment);
    }

   //this one no my code this is just for studies case

    public static long getArragment(List<Integer> list){
        if(list.size() ==1) return 1;
        long arragment = 0;
        int current = list.get(0);
        int index = 1;
        while(list.size()>index &&(list.get(index)-current)<4){
            List<Integer> subList = list.subList(index,list.size());
            String sublistStr = Arrays.toString(subList.toArray(new Integer[0]));
            if(cache.containsKey(sublistStr)){
                arragment+=cache.get(sublistStr);
            }else{
                long subArrangemnts = getArragment(subList);
                cache.put(sublistStr,  subArrangemnts);
                arragment+=subArrangemnts;
            }
            index++;
        }
        return arragment;
    }
}
