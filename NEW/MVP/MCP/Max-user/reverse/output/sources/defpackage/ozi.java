package defpackage;

/* loaded from: classes.dex */
public abstract class ozi {
    public static void a(int i) {
        if (2 > i || i >= 37) {
            StringBuilder sbM = ho7.m(i, "radix ", " was not in valid range ");
            sbM.append(new to7(2, 36, 1));
            throw new IllegalArgumentException(sbM.toString());
        }
    }

    public static final boolean b(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static boolean c(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
