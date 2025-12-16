package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
final class jd implements hd {

    /* renamed from: a, reason: collision with root package name */
    public final int f386840a;

    /* renamed from: b, reason: collision with root package name */
    public final int f386841b;

    /* renamed from: c, reason: collision with root package name */
    public final int f386842c;

    private jd(int i12, int i13, int i14) {
        this.f386840a = i12;
        this.f386841b = i13;
        this.f386842c = i14;
    }

    public static jd a(pr0 pr0Var) {
        int iK2 = pr0Var.k();
        pr0Var.f(8);
        int iK3 = pr0Var.k();
        int iK4 = pr0Var.k();
        pr0Var.f(4);
        pr0Var.k();
        pr0Var.f(12);
        return new jd(iK2, iK3, iK4);
    }

    @Override // com.yandex.mobile.ads.impl.hd
    public final int getType() {
        return 1751742049;
    }
}
