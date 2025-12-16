package defpackage;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes2.dex */
public final class pt5 {
    public static Long a(Map map, Long l, long j) {
        if (!map.containsKey("mc")) {
            if (l != null) {
                return Long.valueOf(l.longValue() ^ j);
            }
            return null;
        }
        String str = (String) to8.c(map, "mc");
        if (str != null) {
            return cnf.i(str);
        }
        return null;
    }

    public final ws5 b(Map map, long j, long j2, long j3) throws NumberFormatException {
        long j4;
        Long lValueOf;
        Long lF = f(map);
        Long lA = a(map, lF, j);
        if (lA == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        String str = (String) map.get("trid");
        long j5 = str != null ? Long.parseLong(str) : 0L;
        long j6 = Long.parseLong((String) to8.c(map, "msgid"));
        Iterator it = map.entrySet().iterator();
        Long l = null;
        long j7 = j5;
        long length = 0;
        while (it.hasNext()) {
            String str2 = (String) ((Map.Entry) it.next()).getKey();
            Charset charset = lb2.a;
            length += str2.getBytes(charset).length + ((String) r14.getValue()).getBytes(charset).length;
            l = l;
        }
        Long l2 = l;
        String str3 = (String) map.get("ttime");
        if (str3 != null) {
            lValueOf = Long.valueOf(Long.parseLong(str3));
            j4 = j6;
        } else {
            j4 = j6;
            lValueOf = l2;
        }
        String str4 = (String) map.get("eKey");
        String str5 = (String) map.get("type");
        if (str5 == null) {
            str5 = "";
        }
        String str6 = str5;
        long jE = e(BuildConfig.MAX_TIME_TO_UPLOAD, map);
        String str7 = (String) map.get("ctime");
        return new ws5(j7, jLongValue, j4, 2, lF, length, lValueOf, str4, j2, j3, str6, jE, str7 != null ? Long.parseLong(str7) : 0L);
    }

    public final lt5 c(long j, Map map) throws NumberFormatException {
        ot5 ot5Var;
        ot5 ot5Var2;
        String string;
        Boolean boolB0;
        Boolean boolB02;
        String string2;
        String str;
        boolean zBooleanValue = false;
        String string3 = null;
        if (map.containsKey("gc")) {
            ot5Var2 = ot5.GROUP_CHAT;
        } else {
            ot5[] ot5VarArr = ot5.b;
            String str2 = (String) map.get("type");
            String string4 = str2 != null ? vmf.c0(str2).toString() : null;
            ot5[] ot5VarArr2 = ot5.b;
            int length = ot5VarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    ot5Var = null;
                    break;
                }
                ot5Var = ot5VarArr2[i];
                if (ot5Var.a.equals(string4)) {
                    break;
                }
                i++;
            }
            ot5Var2 = ot5Var == null ? ot5.UNKNOWN : ot5Var;
        }
        ot5 ot5Var3 = ot5Var2;
        boolean z = ot5Var3 == ot5.GROUP_CHAT;
        Long lF = f(map);
        Long lA = a(map, lF, j);
        if (lA == null) {
            return null;
        }
        long jLongValue = lA.longValue();
        long j2 = Long.parseLong((String) to8.c(map, "msgid"));
        String str3 = (String) map.get("title");
        String str4 = "";
        if (str3 == null || (string = vmf.c0(str3).toString()) == null) {
            string = "";
        }
        if (!z && ((str = (String) map.get("userName")) == null || (string3 = vmf.c0(str).toString()) == null)) {
            string3 = "";
        }
        long jLongValue2 = (z || lF == null) ? 0L : lF.longValue();
        long jE = e(0L, map);
        String str5 = (String) map.get("msg");
        if (str5 != null && (string2 = vmf.c0(str5).toString()) != null) {
            str4 = string2;
        }
        String str6 = (String) map.get("trid");
        long j3 = str6 != null ? Long.parseLong(str6) : 0L;
        String str7 = (String) map.get("eKey");
        String str8 = (String) map.get("largeImageUrl");
        String str9 = (String) map.get("fireM");
        boolean zBooleanValue2 = (str9 == null || (boolB02 = vmf.b0(str9)) == null) ? false : boolB02.booleanValue();
        String str10 = (String) map.get("err");
        if (str10 != null && (boolB0 = vmf.b0(str10)) != null) {
            zBooleanValue = boolB0.booleanValue();
        }
        return new lt5(jLongValue, j2, ot5Var3, string, string3, jLongValue2, jE, str4, j3, str7, str8, zBooleanValue2, zBooleanValue);
    }

    public final kt5 d(long j, Map map) {
        Long lA = a(map, f(map), j);
        if (lA != null) {
            return new kt5(lA.longValue(), Long.parseLong((String) map.get("msgid")));
        }
        return null;
    }

    public final long e(long j, Map map) {
        if (map.containsKey("ectime")) {
            String str = (String) map.get("ectime");
            if (str != null) {
                return Long.parseLong(str);
            }
            return 0L;
        }
        if (!map.containsKey("ctime")) {
            return j;
        }
        String str2 = (String) map.get("ctime");
        return (str2 != null ? Long.parseLong(str2) : 500L) - 500;
    }

    public final Long f(Map map) {
        String str = (String) map.get("suid");
        if (str != null) {
            return Long.valueOf(Long.parseLong(str));
        }
        return null;
    }
}
