package defpackage;

import android.database.SQLException;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class vb9 {
    public static /* synthetic */ int a(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 4;
                    }
                    throw null;
                }
            }
        }
        return i2;
    }

    public static /* synthetic */ String b(int i) {
        if (i == 1 || i == 2) {
            return "so";
        }
        if (i == 3) {
            return "dylib";
        }
        if (i == 4) {
            return "so";
        }
        throw null;
    }

    public static /* synthetic */ int c(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 10;
        }
        if (i == 3) {
            return 20;
        }
        if (i == 4) {
            return 30;
        }
        if (i == 5) {
            return 40;
        }
        throw null;
    }

    public static /* synthetic */ int d(int i) {
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 0;
        }
        throw null;
    }

    public static String e(long j, String str) {
        return str + j;
    }

    public static String f(StringBuilder sb, String str, boolean z, String str2) {
        sb.append(str);
        sb.append(z);
        sb.append(str2);
        return sb.toString();
    }

    public static void g(pk6 pk6Var, String str, String str2, String str3, String str4) throws SQLException {
        pk6Var.Q(str);
        pk6Var.Q(str2);
        pk6Var.Q(str3);
        pk6Var.Q(str4);
    }

    public static void h(dsd dsdVar, int i, long j, lq9 lq9Var) {
        dsdVar.k(i, j);
        lq9Var.b().getClass();
    }

    public static /* synthetic */ String i(int i) {
        switch (i) {
            case 1:
                return "IDLE";
            case 2:
                return "BUFFERING";
            case 3:
                return "PLAYING";
            case 4:
                return "PAUSED";
            case 5:
                return "ENDED";
            case 6:
                return "ERROR";
            case 7:
                return "RELEASED";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String j(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "FORWARD" : "REPLY" : "UNKNOWN";
    }

    public static /* synthetic */ String k(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "Disabled" : "Inactive" : "Active";
    }

    public static /* synthetic */ String l(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "REVERSED_PORTRAIT" : "PORTRAIT" : "LANDSCAPE" : "REVERSED_LANDSCAPE";
    }

    public static /* synthetic */ String m(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "Margin" : "ReplaceablePadding" : "Padding" : "Translate" : "None";
    }

    public static /* synthetic */ String n(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "CHANNEL_ADMIN" : "CHANNEL" : "GROUP" : "USER" : "UNKNOWN";
    }

    public static /* synthetic */ String o(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }
}
