package defpackage;

import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import org.apache.http.cookie.ClientCookie;

/* loaded from: classes.dex */
public abstract /* synthetic */ class xrf {
    public static /* synthetic */ String A(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "CONTACTS" : "NONE" : "ALL";
    }

    public static int a(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == 2527) {
                str.equals("ON");
                return 1;
            }
            if (iHashCode == 78159 && str.equals("OFF")) {
                return 2;
            }
        }
        return 1;
    }

    public static int b(String str) {
        str.getClass();
        switch (str) {
            case "NOBODY":
            case "_NONE_":
                return 2;
            case "CONTACTS":
                return 3;
            default:
                return 1;
        }
    }

    public static int c(String str) {
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == 2527) {
                str.equals("ON");
                return 1;
            }
            if (iHashCode == 78159 && str.equals("OFF")) {
                return 2;
            }
        }
        return 1;
    }

    public static /* synthetic */ int d(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 4;
        }
        throw null;
    }

    public static /* synthetic */ boolean e(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                return false;
            case 5:
            case 6:
                return true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw null;
        }
    }

    public static /* synthetic */ String f(int i) {
        if (i == 1) {
            return "vector";
        }
        if (i == 2) {
            return "group";
        }
        if (i == 3) {
            return ClientCookie.PATH_ATTR;
        }
        if (i == 4) {
            return "clip-path";
        }
        throw null;
    }

    public static /* synthetic */ int g(int i) {
        if (i == 1) {
            return 12;
        }
        if (i == 2) {
            return 16;
        }
        throw null;
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "ON";
        }
        if (i == 2) {
            return "OFF";
        }
        throw null;
    }

    public static /* synthetic */ String i(int i) {
        if (i == 1) {
            return "ALL";
        }
        if (i == 2) {
            return "_NONE_";
        }
        if (i == 3) {
            return "CONTACTS";
        }
        throw null;
    }

    public static /* synthetic */ String j(int i) {
        if (i == 1) {
            return "ON";
        }
        if (i == 2) {
            return "OFF";
        }
        throw null;
    }

    public static int k(int i, int i2, int i3) {
        return (Integer.hashCode(i) + i2) * i3;
    }

    public static int l(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static CancellationSignal m(dsd dsdVar, int i, long j) {
        dsdVar.k(i, j);
        return new CancellationSignal();
    }

    public static ClassCastException n(ArrayList arrayList, int i) {
        arrayList.get(i).getClass();
        return new ClassCastException();
    }

    public static /* synthetic */ String o(String str) {
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (str.length() > 33554431) {
            throw new OutOfMemoryError("Repeating " + str.length() + " bytes String 64 times will produce a String exceeding maximum size.");
        }
        StringBuilder sb = new StringBuilder(length * 64);
        for (int i = 0; i < 64; i++) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static String p(String str, String str2, boolean z) {
        return str + z + str2;
    }

    public static StringBuilder q(String str, long j, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(j);
        return sb;
    }

    public static EnumMap r(float f, int i, Class cls) {
        sw4.a(i, f);
        return new EnumMap(cls);
    }

    public static EnumMap s(long j, EnumMap enumMap, t75 t75Var, Class cls) {
        enumMap.put((EnumMap) t75Var, (t75) new sw4(j));
        return new EnumMap(cls);
    }

    public static void t(long j, EnumMap enumMap, t75 t75Var) {
        enumMap.put((EnumMap) t75Var, (t75) new sw4(j));
    }

    public static void u(String str, String str2) {
        ah8.a(str + str2);
    }

    public static void v(long j, EnumMap enumMap, t75 t75Var) {
        enumMap.put((EnumMap) t75Var, (t75) new sw4(j));
    }

    public static /* synthetic */ String w(int i) {
        switch (i) {
            case 1:
                return "NIL";
            case 2:
                return "BOOLEAN";
            case 3:
                return "INTEGER";
            case 4:
                return "FLOAT";
            case 5:
                return "STRING";
            case 6:
                return "BINARY";
            case 7:
                return "ARRAY";
            case 8:
                return "MAP";
            case 9:
                return "EXTENSION";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String x(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "GIF" : "VIDEO_MSG" : "VIDEO";
    }

    public static /* synthetic */ String y(int i) {
        switch (i) {
            case 1:
                return "MP4";
            case 2:
                return "HLS";
            case 3:
                return "DASH";
            case 4:
                return "RTMP";
            case 5:
                return "OFFLINE";
            case 6:
                return "LOCAL";
            case 7:
                return "FRAME";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String z(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RELEASED" : "READY" : "PENDING_RELEASE" : "INITIALIZING" : "NOT_INITIALIZED";
    }
}
