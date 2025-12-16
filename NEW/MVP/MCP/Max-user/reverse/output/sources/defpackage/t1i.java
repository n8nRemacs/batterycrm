package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class t1i {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
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
    public static void a(java.lang.String r19, defpackage.o1i r20, java.util.List r21, android.text.SpannableStringBuilder r22, java.util.List r23) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t1i.a(java.lang.String, o1i, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ArrayList b(List list, String str, o1i o1iVar) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            i1i i1iVar = (i1i) list.get(i);
            String str2 = o1iVar.a;
            Set set = o1iVar.d;
            String str3 = o1iVar.c;
            if (i1iVar.a.isEmpty() && i1iVar.b.isEmpty() && i1iVar.c.isEmpty() && i1iVar.d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int iA = i1i.a(i1iVar.d, i1i.a(i1iVar.b, i1i.a(i1iVar.a, 0, 1073741824, str), 2, str2), 4, str3);
                size = (iA == -1 || !set.containsAll(i1iVar.c)) ? 0 : iA + (i1iVar.c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new q1i(size, i1iVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, o1i o1iVar) {
        ArrayList arrayListB = b(list, str, o1iVar);
        for (int i = 0; i < arrayListB.size(); i++) {
            int i2 = ((q1i) arrayListB.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static k1i d(String str, Matcher matcher, qyg qygVar, ArrayList arrayList) {
        s1i s1iVar = new s1i();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            s1iVar.a = y1i.b(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            s1iVar.b = y1i.b(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, s1iVar);
            StringBuilder sb = new StringBuilder();
            String strG = qygVar.g();
            while (!TextUtils.isEmpty(strG)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strG.trim());
                strG = qygVar.g();
            }
            s1iVar.c = f(str, sb.toString(), arrayList);
            return new k1i(s1iVar.b().a(), s1iVar.a, s1iVar.b);
        } catch (NumberFormatException unused) {
            String strValueOf = String.valueOf(matcher.group());
            Log.w("WebvttCueParser", strValueOf.length() != 0 ? "Skipping cue with bad header: ".concat(strValueOf) : new String("Skipping cue with bad header: "));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r18, defpackage.s1i r19) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t1i.e(java.lang.String, s1i):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.text.SpannedString f(java.lang.String r18, java.lang.String r19, java.util.List r20) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t1i.f(java.lang.String, java.lang.String, java.util.List):android.text.SpannedString");
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
                    Log.w("WebvttCueParser", strSubstring.length() != 0 ? "Invalid anchor value: ".concat(strSubstring) : new String("Invalid anchor value: "));
                    i = Integer.MIN_VALUE;
                    break;
            }
            s1iVar.g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            s1iVar.e = y1i.a(str);
            s1iVar.f = 0;
        } else {
            s1iVar.e = Integer.parseInt(str);
            s1iVar.f = 1;
        }
    }
}
