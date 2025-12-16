package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fb1;

/* loaded from: classes8.dex */
public final class w21 implements fb1 {

    /* renamed from: a, reason: collision with root package name */
    private final v21 f391260a;

    /* renamed from: b, reason: collision with root package name */
    private final pr0 f391261b = new pr0(32);

    /* renamed from: c, reason: collision with root package name */
    private int f391262c;

    /* renamed from: d, reason: collision with root package name */
    private int f391263d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f391264e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f391265f;

    public w21(v21 v21Var) {
        this.f391260a = v21Var;
    }

    @Override // com.yandex.mobile.ads.impl.fb1
    public final void a(o91 o91Var, tu tuVar, fb1.d dVar) {
        this.f391260a.a(o91Var, tuVar, dVar);
        this.f391265f = true;
    }

    @Override // com.yandex.mobile.ads.impl.fb1
    public final void a() {
        this.f391265f = true;
    }

    @Override // com.yandex.mobile.ads.impl.fb1
    public final void a(int i12, pr0 pr0Var) {
        boolean z12 = (i12 & 1) != 0;
        int iD2 = z12 ? pr0Var.d() + pr0Var.t() : -1;
        if (this.f391265f) {
            if (!z12) {
                return;
            }
            this.f391265f = false;
            pr0Var.e(iD2);
            this.f391263d = 0;
        }
        while (pr0Var.a() > 0) {
            int i13 = this.f391263d;
            if (i13 < 3) {
                if (i13 == 0) {
                    int iT2 = pr0Var.t();
                    pr0Var.e(pr0Var.d() - 1);
                    if (iT2 == 255) {
                        this.f391265f = true;
                        return;
                    }
                }
                int iMin = Math.min(pr0Var.a(), 3 - this.f391263d);
                pr0Var.a(this.f391261b.c(), this.f391263d, iMin);
                int i14 = this.f391263d + iMin;
                this.f391263d = i14;
                if (i14 == 3) {
                    this.f391261b.e(0);
                    this.f391261b.d(3);
                    this.f391261b.f(1);
                    int iT3 = this.f391261b.t();
                    int iT4 = this.f391261b.t();
                    this.f391264e = (iT3 & 128) != 0;
                    this.f391262c = (((iT3 & 15) << 8) | iT4) + 3;
                    int iB2 = this.f391261b.b();
                    int i15 = this.f391262c;
                    if (iB2 < i15) {
                        this.f391261b.a(Math.min(4098, Math.max(i15, this.f391261b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(pr0Var.a(), this.f391262c - this.f391263d);
                pr0Var.a(this.f391261b.c(), this.f391263d, iMin2);
                int i16 = this.f391263d + iMin2;
                this.f391263d = i16;
                int i17 = this.f391262c;
                if (i16 != i17) {
                    continue;
                } else {
                    if (this.f391264e) {
                        if (pc1.a(this.f391262c, this.f391261b.c()) != 0) {
                            this.f391265f = true;
                            return;
                        }
                        this.f391261b.d(this.f391262c - 4);
                    } else {
                        this.f391261b.d(i17);
                    }
                    this.f391261b.e(0);
                    this.f391260a.a(this.f391261b);
                    this.f391263d = 0;
                }
            }
        }
    }
}
