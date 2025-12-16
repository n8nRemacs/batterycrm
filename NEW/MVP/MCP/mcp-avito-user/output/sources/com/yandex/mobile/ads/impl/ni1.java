package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.i81;
import com.yandex.mobile.ads.impl.vw;

/* loaded from: classes8.dex */
final class ni1 extends i81 {

    /* renamed from: b, reason: collision with root package name */
    private final pr0 f388309b;

    /* renamed from: c, reason: collision with root package name */
    private final pr0 f388310c;

    /* renamed from: d, reason: collision with root package name */
    private int f388311d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f388312e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f388313f;

    /* renamed from: g, reason: collision with root package name */
    private int f388314g;

    public ni1(x91 x91Var) {
        super(x91Var);
        this.f388309b = new pr0(lj0.f387520a);
        this.f388310c = new pr0(4);
    }

    public final boolean a(pr0 pr0Var) throws i81.a {
        int iT2 = pr0Var.t();
        int i12 = (iT2 >> 4) & 15;
        int i13 = iT2 & 15;
        if (i13 != 7) {
            throw new i81.a(ba.a("Video format not supported: ", i13));
        }
        this.f388314g = i12;
        return i12 != 5;
    }

    public final boolean a(long j12, pr0 pr0Var) {
        int iT2 = pr0Var.t();
        long jI2 = (pr0Var.i() * 1000) + j12;
        if (iT2 == 0 && !this.f388312e) {
            pr0 pr0Var2 = new pr0(new byte[pr0Var.a()]);
            pr0Var.a(pr0Var2.c(), 0, pr0Var.a());
            gd gdVarA = gd.a(pr0Var2);
            this.f388311d = gdVarA.f385712b;
            this.f386365a.a(new vw.a().f("video/avc").a(gdVarA.f385716f).q(gdVarA.f385713c).g(gdVarA.f385714d).b(gdVarA.f385715e).a(gdVarA.f385711a).a());
            this.f388312e = true;
            return false;
        }
        if (iT2 != 1 || !this.f388312e) {
            return false;
        }
        int i12 = this.f388314g == 1 ? 1 : 0;
        if (!this.f388313f && i12 == 0) {
            return false;
        }
        byte[] bArrC = this.f388310c.c();
        bArrC[0] = 0;
        bArrC[1] = 0;
        bArrC[2] = 0;
        int i13 = 4 - this.f388311d;
        int i14 = 0;
        while (pr0Var.a() > 0) {
            pr0Var.a(this.f388310c.c(), i13, this.f388311d);
            this.f388310c.e(0);
            int iX2 = this.f388310c.x();
            this.f388309b.e(0);
            this.f386365a.a(4, this.f388309b);
            this.f386365a.a(iX2, pr0Var);
            i14 = i14 + 4 + iX2;
        }
        this.f386365a.a(jI2, i12, i14, 0, null);
        this.f388313f = true;
        return true;
    }
}
