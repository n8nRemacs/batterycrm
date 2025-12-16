package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class mr {

    /* renamed from: a, reason: collision with root package name */
    public final String f388061a;

    private mr(String str) {
        this.f388061a = str;
    }

    @j.P
    public static mr a(pr0 pr0Var) {
        String str;
        pr0Var.f(2);
        int iT2 = pr0Var.t();
        int i12 = iT2 >> 1;
        int iT3 = ((pr0Var.t() >> 3) & 31) | ((iT2 & 1) << 5);
        if (i12 == 4 || i12 == 5 || i12 == 7) {
            str = "dvhe";
        } else if (i12 == 8) {
            str = "hev1";
        } else {
            if (i12 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(".0");
        sb2.append(i12);
        sb2.append(iT3 >= 10 ? "." : ".0");
        sb2.append(iT3);
        return new mr(sb2.toString());
    }
}
