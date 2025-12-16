package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.util.Locale;

/* compiled from: Preconditions.java */
@RestrictTo
/* loaded from: classes.dex */
public final class z {
    public static void a(@j.N String str, boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void b(boolean z12) {
        if (!z12) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(int i12, int i13, @j.N String str, int i14) {
        if (i12 < i13) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i13 + ", " + i14 + "] (too low)");
        }
        if (i12 <= i14) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i13 + ", " + i14 + "] (too high)");
    }

    @j.F
    public static void d(int i12) {
        if (i12 < 0) {
            throw new IllegalArgumentException();
        }
    }

    @j.F
    public static void e(int i12, @j.P String str) {
        if (i12 < 0) {
            throw new IllegalArgumentException(str);
        }
    }

    @j.N
    public static void f(@j.P Object obj, @j.N String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void g(@j.P String str, boolean z12) {
        if (!z12) {
            throw new IllegalStateException(str);
        }
    }
}
