package defpackage;

import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h1i {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final umb a = new umb();
    public final StringBuilder b = new StringBuilder();

    public static String a(umb umbVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = umbVar.b;
        int i2 = umbVar.c;
        while (i < i2 && !z) {
            char c2 = (char) umbVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        umbVar.K(i - umbVar.b);
        return sb.toString();
    }

    public static String b(umb umbVar, StringBuilder sb) {
        c(umbVar);
        if (umbVar.a() == 0) {
            return null;
        }
        String strA = a(umbVar, sb);
        if (!strA.isEmpty()) {
            return strA;
        }
        return "" + ((char) umbVar.x());
    }

    public static void c(umb umbVar) {
        while (true) {
            for (boolean z = true; umbVar.a() > 0 && z; z = false) {
                int i = umbVar.b;
                byte[] bArr = umbVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    umbVar.K(1);
                } else {
                    int i2 = umbVar.c;
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
                            umbVar.K(i2 - umbVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
