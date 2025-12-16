package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ho7 {
    public static final boolean a(int i, int i2) {
        return (b(i) & i2) != 0;
    }

    public static final int b(int i) {
        return 1 << az1.v(i);
    }

    public static /* synthetic */ long c(int i) {
        if (i == 1) {
            return 0L;
        }
        if (i == 2) {
            return 1L;
        }
        if (i == 3) {
            return 2L;
        }
        throw null;
    }

    public static toc d(wid widVar, Class cls, String str, String str2, int i) {
        widVar.getClass();
        return new toc(cls, str, str2, i);
    }

    public static Bundle e(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt(str, i);
        return bundle;
    }

    public static String f(int i, String str) {
        return str + i;
    }

    public static String g(String str, int i, int i2, String str2) {
        return str + i + str2 + i2;
    }

    public static String h(String str, gi4 gi4Var) {
        return str + gi4Var;
    }

    public static String i(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String j(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String k(StringBuilder sb, long j, String str) {
        sb.append(j);
        sb.append(str);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder m(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder n(String str, long j, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder o(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder p(String str, boolean z, String str2, boolean z2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(z);
        sb.append(str2);
        sb.append(z2);
        sb.append(str3);
        return sb;
    }

    public static void q(String str, String str2, boolean z) {
        wqi.c(str2, str + z, new Object[0]);
    }

    public static void r(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ String s(int i) {
        if (i == 1) {
            return "GOOD";
        }
        if (i == 2) {
            return "BAD_LEVEL_1";
        }
        if (i == 3) {
            return "BAD_LEVEL_2";
        }
        throw null;
    }

    public static /* synthetic */ String t(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "BAD_LEVEL_2" : "BAD_LEVEL_1" : "GOOD";
    }
}
