package defpackage;

import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class z5j {
    public static void a(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(int i, String str, int i2, int i3) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    public static void d(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void f(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static final int g(int i) {
        switch (az1.v(i)) {
            case 0:
            case 1:
            case 2:
                return 2;
            case 3:
            case 4:
                return 1;
            case 5:
            case 6:
                return 3;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
