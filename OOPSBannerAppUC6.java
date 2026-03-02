/**
 * OOPSBannerApp
 * UC6
 * Using Functions
 * 
 *@author Shreya
 *@version 6
 */
 
 public class OOPSBannerAppUC6 {

    public static String[] getOPattern() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    public static String[] getPPattern() {
        return new String[]{
                "****** ",
                "*     *",
                "****** ",
                "*       ",
                "*       "
        };
    }

    public static String[] getSPattern() {
        return new String[]{
                " ***** ",
                "*       ",
                " ***** ",
                "      *",
                "****** "
        };
    }
	
	public static void main(String[] args) {

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + " " + O[i] + " " + P[i] + " " + S[i]);
        }
    }
}
