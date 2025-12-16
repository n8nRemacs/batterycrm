package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class kd implements hd {

    /* renamed from: a, reason: collision with root package name */
    public final int f387105a;

    /* renamed from: b, reason: collision with root package name */
    public final int f387106b;

    /* renamed from: c, reason: collision with root package name */
    public final int f387107c;

    /* renamed from: d, reason: collision with root package name */
    public final int f387108d;

    /* renamed from: e, reason: collision with root package name */
    public final int f387109e;

    private kd(int i12, int i13, int i14, int i15, int i16) {
        this.f387105a = i12;
        this.f387106b = i13;
        this.f387107c = i14;
        this.f387108d = i15;
        this.f387109e = i16;
    }

    public static kd a(pr0 pr0Var) {
        int iK2 = pr0Var.k();
        pr0Var.f(12);
        pr0Var.k();
        int iK3 = pr0Var.k();
        int iK4 = pr0Var.k();
        pr0Var.f(4);
        int iK5 = pr0Var.k();
        int iK6 = pr0Var.k();
        pr0Var.f(8);
        return new kd(iK2, iK3, iK4, iK5, iK6);
    }

    @Override // com.yandex.mobile.ads.impl.hd
    public final int getType() {
        return 1752331379;
    }
}
