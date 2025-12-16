package defpackage;

import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* loaded from: classes.dex */
public abstract class qoi {
    public static final void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbL = az1.l(j, "size=", " offset=");
            sbL.append(j2);
            sbL.append(" byteCount=");
            sbL.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbL.toString());
        }
    }

    public static String b(Object obj) {
        return "'" + String.valueOf(obj) + "'";
    }

    public static boolean c(String str) {
        return str != null && str.trim().length() > 0;
    }

    public static String d(int i) {
        switch (i) {
            case 0:
                return "eof";
            case 34:
                return "string";
            case 39:
                return SdkMetricStatEvent.NAME_KEY;
            case 44:
                return "`,`";
            case 49:
                return "number";
            case 58:
                return "`:`";
            case 91:
                return "`[`";
            case 93:
                return "`]`";
            case 98:
                return "boolean";
            case 110:
                return "null";
            case 123:
                return "`{`";
            case 125:
                return "`}`";
            default:
                throw new AssertionError();
        }
    }
}
