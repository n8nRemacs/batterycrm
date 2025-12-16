package defpackage;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class u1i {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

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
        c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        a9h.l(255, 255, 255, map2, "bg_white");
        a9h.l(0, 255, 0, map2, "bg_lime");
        a9h.l(0, 255, 255, map2, "bg_cyan");
        a9h.l(255, 0, 0, map2, "bg_red");
        a9h.l(255, 255, 0, map2, "bg_yellow");
        a9h.l(255, 0, 255, map2, "bg_magenta");
        a9h.l(0, 0, 255, map2, "bg_blue");
        a9h.l(0, 0, 0, map2, "bg_black");
        d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r18, defpackage.p1i r19, java.util.List r20, android.text.SpannableStringBuilder r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 592
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1i.a(java.lang.String, p1i, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    public static ArrayList b(List list, String str, p1i p1iVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            j1i j1iVar = (j1i) list.get(i);
            int iA = j1iVar.a(str, p1iVar.a, p1iVar.d, p1iVar.c);
            if (iA > 0) {
                arrayList.add(new r1i(iA, j1iVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, p1i p1iVar) {
        ArrayList arrayListB = b(list, str, p1iVar);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((r1i) arrayListB.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static l1i d(String str, Matcher matcher, umb umbVar, ArrayList arrayList) {
        s1i s1iVar = new s1i();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            s1iVar.a = z1i.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            s1iVar.b = z1i.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, s1iVar);
            StringBuilder sb = new StringBuilder();
            umbVar.getClass();
            String strK = umbVar.k(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strK)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strK.trim());
                strK = umbVar.k(StandardCharsets.UTF_8);
            }
            s1iVar.c = f(str, sb.toString(), arrayList);
            return new l1i(s1iVar.c().a(), s1iVar.a, s1iVar.b);
        } catch (IllegalArgumentException unused) {
            a8i.l("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r18, defpackage.s1i r19) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1i.e(java.lang.String, s1i):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString f(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u1i.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
    }

    public static void g(String str, s1i s1iVar) {
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
