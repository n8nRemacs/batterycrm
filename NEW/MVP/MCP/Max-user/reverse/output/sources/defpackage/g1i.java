package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class g1i {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final qyg a = new qyg(2, false);
    public final StringBuilder b = new StringBuilder();

    public static String a(qyg qygVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = qygVar.b;
        int i2 = qygVar.c;
        while (i < i2 && !z) {
            char c2 = (char) qygVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        qygVar.F(i - qygVar.b);
        return sb.toString();
    }

    public static String b(qyg qygVar, StringBuilder sb) {
        c(qygVar);
        if (qygVar.c() == 0) {
            return null;
        }
        String strA = a(qygVar, sb);
        if (!"".equals(strA)) {
            return strA;
        }
        char cS = (char) qygVar.s();
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append(cS);
        return sb2.toString();
    }

    public static void c(qyg qygVar) {
        while (true) {
            for (boolean z = true; qygVar.c() > 0 && z; z = false) {
                int i = qygVar.b;
                byte[] bArr = qygVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    qygVar.F(1);
                } else {
                    int i2 = qygVar.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            qygVar.F(i2 - qygVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
