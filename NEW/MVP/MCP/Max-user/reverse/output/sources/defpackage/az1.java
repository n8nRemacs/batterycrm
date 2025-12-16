package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract /* synthetic */ class az1 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39};

    public static /* synthetic */ Integer a(int i) {
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(i - 1);
    }

    public static /* synthetic */ int b(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        return i - i2;
    }

    public static /* synthetic */ boolean c(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static /* synthetic */ String d(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "STICKER";
            case 3:
                return "STICKER_SET";
            case 4:
                return "FAVORITE_STICKER";
            case 5:
                return "FAVORITE_STICKER_SET";
            case 6:
                return "RECENT";
            case 7:
                return "BACKGROUND";
            case 8:
                return "ANIMOJI";
            case 9:
                return "ANIMOJI_SET";
            case 10:
                return "REACTION";
            default:
                throw null;
        }
    }

    public static oq3 e(int i, Bundle bundle, f1e f1eVar, int i2) {
        return j5j.a(new n5g(i), bundle, f1eVar, i2);
    }

    public static u3g f(t5g t5gVar, TextView textView, v1a v1aVar, TextView textView2) {
        t5gVar.b(textView, t75.b);
        return v1aVar.y(textView2).getText();
    }

    public static ClassCastException g(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String h(String str, gi4 gi4Var) {
        return (str + gi4Var).toString();
    }

    public static String i(String str, String str2) {
        return str + str2;
    }

    public static String j(StringBuilder sb, List list, String str) {
        sb.append(list);
        sb.append(str);
        return sb.toString();
    }

    public static String k(StringBuilder sb, boolean z, String str) {
        sb.append(z);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder l(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(j);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder m(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder n(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static HashMap o(Class cls, ly lyVar) {
        HashMap map = new HashMap();
        map.put(cls, lyVar);
        return map;
    }

    public static Map p(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static void q(float f, float f2, fua fuaVar) {
        fuaVar.e(kti.d(f * f2));
    }

    public static void r(long j, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(j);
        sb.append(str2);
    }

    public static void s(String str, int i, int i2, String str2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(str);
        sb.append(i2);
        Log.w(str2, sb.toString());
    }

    public static void t(String str, String str2, StringBuilder sb, boolean z, boolean z2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static void u(boolean z, bud budVar, boolean z2, String str) {
        budVar.c(new c2f(z));
        budVar.a(new c2f(z2));
        budVar.d(str);
    }

    public static /* synthetic */ int v(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "STICKER";
            case 3:
                return "STICKER_SET";
            case 4:
                return "FAVORITE_STICKER";
            case 5:
                return "FAVORITE_STICKER_SET";
            case 6:
                return "RECENT";
            case 7:
                return "BACKGROUND";
            case 8:
                return "ANIMOJI";
            case 9:
                return "ANIMOJI_SET";
            case 10:
                return "REACTION";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String x(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "RELEASED" : "STARTED" : "CONFIGURED";
    }

    public static /* synthetic */ int[] y(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }
}
