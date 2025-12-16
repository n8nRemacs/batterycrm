package kotlin.text;

import java.util.Locale;
import kotlin.InterfaceC42733c0;
import kotlin.K0;
import kotlin.Metadata;

@Metadata(d1 = {"kotlin/text/b", "kotlin/text/c"}, d2 = {}, k = 4, mv = {1, 9, 0}, xi = 49)
/* renamed from: kotlin.text.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43044a extends C43046c {
    @kotlin.X
    public static void a(int i12) {
        if (2 > i12 || i12 >= 37) {
            StringBuilder sbJ = androidx.camera.camera2.internal.G.j(i12, "radix ", " was not in valid range ");
            sbJ.append(new kotlin.ranges.l(2, 36, 1));
            throw new IllegalArgumentException(sbJ.toString());
        }
    }

    @K0
    @InterfaceC42733c0
    public static int b(char c12) {
        a(10);
        int iDigit = Character.digit((int) c12, 10);
        Integer numValueOf = Integer.valueOf(iDigit);
        if (iDigit < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        throw new IllegalArgumentException("Char " + c12 + " is not a digit in the given radix=10");
    }

    public static boolean c(char c12, char c13, boolean z12) {
        char upperCase;
        char upperCase2;
        if (c12 == c13) {
            return true;
        }
        return z12 && ((upperCase = Character.toUpperCase(c12)) == (upperCase2 = Character.toUpperCase(c13)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2));
    }

    public static boolean d(char c12) {
        return Character.isWhitespace(c12) || Character.isSpaceChar(c12);
    }

    @InterfaceC42733c0
    @Y61.k
    public static String e(char c12) {
        String strValueOf = String.valueOf(c12);
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c12));
        }
        if (c12 == 329) {
            return upperCase;
        }
        return upperCase.charAt(0) + upperCase.substring(1).toLowerCase(locale);
    }

    @K0
    @InterfaceC42733c0
    @Y61.k
    public static String f(char c12, @Y61.k Locale locale) {
        String upperCase = String.valueOf(c12).toUpperCase(locale);
        if (upperCase.length() <= 1) {
            return !upperCase.equals(String.valueOf(c12).toUpperCase(Locale.ROOT)) ? upperCase : String.valueOf(Character.toTitleCase(c12));
        }
        if (c12 == 329) {
            return upperCase;
        }
        return upperCase.charAt(0) + upperCase.substring(1).toLowerCase(Locale.ROOT);
    }
}
