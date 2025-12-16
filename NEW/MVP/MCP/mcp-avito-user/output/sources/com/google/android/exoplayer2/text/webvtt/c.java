package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.util.F;
import j.P;
import java.util.regex.Pattern;

/* compiled from: WebvttCssParser.java */
/* loaded from: classes6.dex */
final class c {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f347078c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f347079d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    public final F f347080a = new F();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f347081b = new StringBuilder();

    public static String a(F f12, StringBuilder sb2) {
        boolean z12 = false;
        sb2.setLength(0);
        int i12 = f12.f348071b;
        int i13 = f12.f348072c;
        while (i12 < i13 && !z12) {
            char c12 = (char) f12.f348070a[i12];
            if ((c12 < 'A' || c12 > 'Z') && ((c12 < 'a' || c12 > 'z') && !((c12 >= '0' && c12 <= '9') || c12 == '#' || c12 == '-' || c12 == '.' || c12 == '_'))) {
                z12 = true;
            } else {
                i12++;
                sb2.append(c12);
            }
        }
        f12.C(i12 - f12.f348071b);
        return sb2.toString();
    }

    @P
    public static String b(F f12, StringBuilder sb2) {
        c(f12);
        if (f12.a() == 0) {
            return null;
        }
        String strA = a(f12, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) f12.r());
    }

    public static void c(F f12) {
        while (true) {
            for (boolean z12 = true; f12.a() > 0 && z12; z12 = false) {
                int i12 = f12.f348071b;
                byte[] bArr = f12.f348070a;
                byte b12 = bArr[i12];
                char c12 = (char) b12;
                if (c12 == '\t' || c12 == '\n' || c12 == '\f' || c12 == '\r' || c12 == ' ') {
                    f12.C(1);
                } else {
                    int i13 = f12.f348072c;
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
                            f12.C(i13 - f12.f348071b);
                        }
                    }
                }
            }
            return;
        }
    }
}
