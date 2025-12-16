package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;

/* loaded from: classes8.dex */
final class pl1 {

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f388881c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f388882d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a, reason: collision with root package name */
    private final pr0 f388883a = new pr0();

    /* renamed from: b, reason: collision with root package name */
    private final StringBuilder f388884b = new StringBuilder();

    public static void b(pr0 pr0Var) {
        while (true) {
            for (boolean z12 = true; pr0Var.a() > 0 && z12; z12 = false) {
                char c12 = (char) pr0Var.c()[pr0Var.d()];
                if (c12 == '\t' || c12 == '\n' || c12 == '\f' || c12 == '\r' || c12 == ' ') {
                    pr0Var.f(1);
                } else {
                    int iD2 = pr0Var.d();
                    int iE2 = pr0Var.e();
                    byte[] bArrC = pr0Var.c();
                    if (iD2 + 2 <= iE2) {
                        int i12 = iD2 + 1;
                        if (bArrC[iD2] == 47) {
                            int i13 = iD2 + 2;
                            if (bArrC[i12] == 42) {
                                while (true) {
                                    int i14 = i13 + 1;
                                    if (i14 >= iE2) {
                                        break;
                                    }
                                    if (((char) bArrC[i13]) == '*' && ((char) bArrC[i14]) == '/') {
                                        iE2 = i13 + 2;
                                        i13 = iE2;
                                    } else {
                                        i13 = i14;
                                    }
                                }
                                pr0Var.f(iE2 - pr0Var.d());
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList a(com.yandex.mobile.ads.impl.pr0 r18) {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.pl1.a(com.yandex.mobile.ads.impl.pr0):java.util.ArrayList");
    }

    @j.P
    public static String b(pr0 pr0Var, StringBuilder sb2) {
        b(pr0Var);
        if (pr0Var.a() == 0) {
            return null;
        }
        String strA = a(pr0Var, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        StringBuilder sbA = Cif.a("");
        sbA.append((char) pr0Var.t());
        return sbA.toString();
    }

    private static String a(pr0 pr0Var, StringBuilder sb2) {
        boolean z12 = false;
        sb2.setLength(0);
        int iD2 = pr0Var.d();
        int iE2 = pr0Var.e();
        while (iD2 < iE2 && !z12) {
            char c12 = (char) pr0Var.c()[iD2];
            if ((c12 < 'A' || c12 > 'Z') && ((c12 < 'a' || c12 > 'z') && !((c12 >= '0' && c12 <= '9') || c12 == '#' || c12 == '-' || c12 == '.' || c12 == '_'))) {
                z12 = true;
            } else {
                iD2++;
                sb2.append(c12);
            }
        }
        pr0Var.f(iD2 - pr0Var.d());
        return sb2.toString();
    }
}
