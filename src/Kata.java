import java.util.Arrays;

public class Kata {
    public static String longToIP(long ip) {
        String binaryString = Long.toBinaryString(ip);
        if (binaryString.length()<32){
            binaryString=("00000000000000000000000000000000"+binaryString).substring(binaryString.length());
        }
        int[] IParray = new int[4];
        IParray[0] = Integer.parseInt(binaryString.substring(0,8),2);
        IParray[1] = Integer.parseInt(binaryString.substring(8,16),2);
        IParray[2] = Integer.parseInt(binaryString.substring(16,24),2);
        IParray[3] = Integer.parseInt(binaryString.substring(24,32),2);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < IParray.length; i++) {
            sb.append(IParray[i]);
            if (i<3) sb.append('.');
        }
        return sb.toString();
    }
}
