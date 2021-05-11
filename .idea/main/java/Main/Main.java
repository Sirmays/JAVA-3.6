package Main;

public class Main {


    public static int[] findAllFiguresAfterLastFour(int[] incomingarray1) {
        int lastfourindex = -1;
        for (int i = 0; i < incomingarray1.length; i++) {
            if (incomingarray1[i] == 4) {
                lastfourindex = i;
            }
        }

        int[] outcomingarray = new int[incomingarray1.length - lastfourindex - 1];
        if (lastfourindex == -1) {
            throw new RuntimeException("Туть нет четверок");

        } else {
            for (int i = 0; i < (incomingarray1.length - lastfourindex - 1); i++) {
                outcomingarray[i] = incomingarray1[lastfourindex + i + 1];
            }
        }
        return outcomingarray;
    }

    public static boolean findOneOrFour(int[] incomingarray2) {
        for (int i = 0; i < incomingarray2.length; i++) {
            if (incomingarray2[i] == 4 || incomingarray2[i] == 1) {
                return true;
            }
        }
        return false;
    }


}