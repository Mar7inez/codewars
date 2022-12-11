public class OppositesAttract {

    public static boolean isLove(final int flower1, final int flower2) {
        boolean inLove = false;
        boolean petals1, petals2;
        petals1 = (flower1 % 2) == 0;
        petals2 = (flower2 % 2) == 0;
        if (petals1 != petals2) {
            inLove = true;
        }
        return inLove;
    }
}