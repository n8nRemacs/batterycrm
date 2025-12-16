package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class uhb {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Pattern c = Pattern.compile("<\\d{2}:\\d{2}:\\d{2}\\.\\d{3}>");
    public static final Map d;
    public static final Map e;

    static {
        HashMap map = new HashMap();
        a9h.l(255, 255, 255, map, "white");
        a9h.l(0, 255, 0, map, "lime");
        a9h.l(0, 255, 255, map, "cyan");
        a9h.l(255, 0, 0, map, "red");
        a9h.l(255, 255, 0, map, "yellow");
        a9h.l(255, 0, 255, map, "magenta");
        a9h.l(0, 0, 255, map, "blue");
        a9h.l(0, 0, 0, map, "black");
        d = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        a9h.l(255, 255, 255, map2, "bg_white");
        a9h.l(0, 255, 0, map2, "bg_lime");
        a9h.l(0, 255, 255, map2, "bg_cyan");
        a9h.l(255, 0, 0, map2, "bg_red");
        a9h.l(255, 255, 0, map2, "bg_yellow");
        a9h.l(255, 0, 255, map2, "bg_magenta");
        a9h.l(0, 0, 255, map2, "bg_blue");
        a9h.l(0, 0, 0, map2, "bg_black");
        e = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r18, defpackage.shb r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.ArrayList r22) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhb.a(java.lang.String, shb, java.util.List, android.text.SpannableStringBuilder, java.util.ArrayList):void");
    }

    public static ArrayList b(ArrayList arrayList, String str, shb shbVar) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            j1i j1iVar = (j1i) arrayList.get(i);
            int iA = j1iVar.a(str, shbVar.a, shbVar.d, shbVar.c);
            if (iA > 0) {
                arrayList2.add(new thb(iA, j1iVar));
            }
        }
        Collections.sort(arrayList2);
        return arrayList2;
    }

    public static int c(ArrayList arrayList, String str, shb shbVar) {
        ArrayList arrayListB = b(arrayList, str, shbVar);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((thb) arrayListB.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x00d9. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList d(java.lang.String r20, java.util.regex.Matcher r21, defpackage.umb r22, java.util.ArrayList r23) {
        /*
            Method dump skipped, instructions count: 760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhb.d(java.lang.String, java.util.regex.Matcher, umb, java.util.ArrayList):java.util.ArrayList");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString e(java.lang.String r18, java.lang.String r19, java.util.ArrayList r20) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uhb.e(java.lang.String, java.lang.String, java.util.ArrayList):android.text.SpannedString");
    }

    public static void f(String str, s1i s1iVar) {
        String strSubstring;
        int i;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    a8i.l("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            s1iVar.g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            s1iVar.e = z1i.b(str);
            s1iVar.f = 0;
        } else {
            s1iVar.e = Integer.parseInt(str);
            s1iVar.f = 1;
        }
    }
}
