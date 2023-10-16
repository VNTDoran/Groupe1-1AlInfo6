public class BenHamoudaMariem {
    public static int[] concaterTab(int[] Tab1, int[] Tab2) {
        int totalLength = Tab1.length + Tab2.length;
        int[] result = new int[totalLength];

        for (int i = 0; i < Tab1.length; i++) {
            result[i] = Tab1[i];
        }

        for (int i = 0; i < Tab2.length; i++) {
            result[Tab1.length + i] = Tab2[i];
        }

        return result;
    }

    public int stringLength(String ch) {
        if (ch != null) {
            return ch.length();
        } else {
            return 0; // Handle null strings as needed
        }
    }
}
