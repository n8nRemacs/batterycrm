package androidx.media3.extractor.text.webvtt;

import androidx.media3.common.util.z;
import j.P;
import java.util.regex.Pattern;

/* compiled from: WebvttCssParser.java */
/* loaded from: classes.dex */
final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f51441c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f51442d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final z f51443a = new z();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f51444b = new StringBuilder();

    public static String a(z zVar, StringBuilder sb2) {
        boolean z12 = false;
        sb2.setLength(0);
        int i12 = zVar.f47963b;
        int i13 = zVar.f47964c;
        while (i12 < i13 && !z12) {
            char c12 = (char) zVar.f47962a[i12];
            if ((c12 < 'A' || c12 > 'Z') && ((c12 < 'a' || c12 > 'z') && !((c12 >= '0' && c12 <= '9') || c12 == '#' || c12 == '-' || c12 == '.' || c12 == '_'))) {
                z12 = true;
            } else {
                i12++;
                sb2.append(c12);
            }
        }
        zVar.G(i12 - zVar.f47963b);
        return sb2.toString();
    }

    @P
    public static String b(z zVar, StringBuilder sb2) {
        c(zVar);
        if (zVar.a() == 0) {
            return null;
        }
        String strA = a(zVar, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) zVar.u());
    }

    public static void c(z zVar) {
        while (true) {
            for (boolean z12 = true; zVar.a() > 0 && z12; z12 = false) {
                int i12 = zVar.f47963b;
                byte[] bArr = zVar.f47962a;
                byte b12 = bArr[i12];
                char c12 = (char) b12;
                if (c12 == '\t' || c12 == '\n' || c12 == '\f' || c12 == '\r' || c12 == ' ') {
                    zVar.G(1);
                } else {
                    int i13 = zVar.f47964c;
                    int i14 = i12 + 2;
                    if (i14 <= i13) {
                        int i15 = i12 + 1;
                        if (b12 == 47 && bArr[i15] == 42) {
                            while (true) {
                                int i16 = i14 + 1;
                                if (i16 >= i13) {
                                    break;
                                }
                                if (((char) bArr[i14]) == '*' && ((char) bArr[i16]) == '/') {
                                    i14 += 2;
                                    i13 = i14;
                                } else {
                                    i14 = i16;
                                }
                            }
                            zVar.G(i13 - zVar.f47963b);
                        }
                    }
                }
            }
            return;
        }
    }
}
