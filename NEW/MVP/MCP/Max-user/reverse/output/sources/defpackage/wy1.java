package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.EnumMap;

/* loaded from: classes.dex */
public abstract /* synthetic */ class wy1 {
    public static int a(String str) {
        str.getClass();
        switch (str) {
            case "LEFT":
                return 2;
            case "REMOVING":
                return 4;
            case "REMOVED":
                return 3;
            case "ACTIVE":
                return 1;
            case "CLOSED":
                return 5;
            case "HIDDEN":
                return 6;
            default:
                throw new IllegalArgumentException(ho7.i("No such value ", str, " for ChatStatus"));
        }
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1) {
            return "add";
        }
        if (i == 2) {
            return "remove";
        }
        throw null;
    }

    public static /* synthetic */ String c(int i) {
        if (i == 1) {
            return "UNKNOWN";
        }
        if (i == 2) {
            return "DIALOG";
        }
        if (i == 3) {
            return "CHAT";
        }
        if (i == 4) {
            return "CHANNEL";
        }
        if (i == 5) {
            return "GROUP_CHAT";
        }
        throw null;
    }

    public static Object d(ArrayList arrayList, int i) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String e(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String f(RecyclerView recyclerView, StringBuilder sb) {
        sb.append(recyclerView.F());
        return sb.toString();
    }

    public static String g(String str, int i, String str2, int i2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String h(String str, String str2) {
        return str + str2;
    }

    public static String i(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String j(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static StringBuilder k(String str, int i, String str2, int i2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder l(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static EnumMap m(float f, int i, EnumMap enumMap, t75 t75Var, t5g t5gVar) {
        enumMap.put((EnumMap) t75Var, (t75) new sw4(sw4.a(i, f)));
        return t5gVar.c;
    }

    public static void n(float f, int i, EnumMap enumMap, t75 t75Var) {
        enumMap.put((EnumMap) t75Var, (t75) new sw4(sw4.a(i, f)));
    }

    public static void o(int i, SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4) {
        spannableStringBuilder.setSpan(new StyleSpan(i), i2, i3, i4);
    }

    public static void p(int i, String str, String str2) {
        a8i.l(str2, str + i);
    }

    public static void q(long j, String str, String str2) {
        wqi.c(str2, str + j, new Object[0]);
    }

    public static void r(String str, String str2, String str3) {
        a8i.l(str3, str + str2);
    }

    public static EnumMap s(float f, int i, EnumMap enumMap, t75 t75Var, t5g t5gVar) {
        enumMap.put((EnumMap) t75Var, (t75) new sw4(sw4.a(i, f)));
        return t5gVar.b;
    }

    public static /* synthetic */ String t(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String u(int i) {
        switch (i) {
            case 1:
                return "RELEASED";
            case 2:
                return "RELEASING";
            case 3:
                return "INITIALIZED";
            case 4:
                return "PENDING_OPEN";
            case 5:
                return "CLOSING";
            case 6:
                return "REOPENING_QUIRK";
            case 7:
                return "REOPENING";
            case 8:
                return "OPENING";
            case 9:
                return "OPENED";
            case 10:
                return "CONFIGURED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String v(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "UNKNOWN" : "BACK" : "FRONT";
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "UNINITIALIZED";
            case 2:
                return "INITIALIZED";
            case 3:
                return "GET_SURFACE";
            case 4:
                return "OPENING";
            case 5:
                return "OPENED";
            case 6:
                return "CLOSED";
            case 7:
                return "RELEASING";
            case 8:
                return "RELEASED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String x(int i) {
        return i != 1 ? i != 2 ? "null" : "PRIVATE" : "PUBLIC";
    }

    public static /* synthetic */ String y(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "GROUP_CHAT" : "CHANNEL" : "CHAT" : "DIALOG" : "UNKNOWN";
    }
}
