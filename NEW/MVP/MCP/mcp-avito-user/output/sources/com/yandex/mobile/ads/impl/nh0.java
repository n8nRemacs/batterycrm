package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.oh0;
import com.yandex.mobile.ads.impl.vw;

/* loaded from: classes8.dex */
public final class nh0 implements is {

    /* renamed from: a, reason: collision with root package name */
    private final pr0 f388290a;

    /* renamed from: b, reason: collision with root package name */
    private final oh0.a f388291b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final String f388292c;

    /* renamed from: d, reason: collision with root package name */
    private x91 f388293d;

    /* renamed from: e, reason: collision with root package name */
    private String f388294e;

    /* renamed from: f, reason: collision with root package name */
    private int f388295f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f388296g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f388297h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f388298i;

    /* renamed from: j, reason: collision with root package name */
    private long f388299j;

    /* renamed from: k, reason: collision with root package name */
    private int f388300k;

    /* renamed from: l, reason: collision with root package name */
    private long f388301l;

    public nh0(@j.P String str) {
        pr0 pr0Var = new pr0(4);
        this.f388290a = pr0Var;
        pr0Var.c()[0] = -1;
        this.f388291b = new oh0.a();
        this.f388301l = -9223372036854775807L;
        this.f388292c = str;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a() {
        this.f388295f = 0;
        this.f388296g = 0;
        this.f388298i = false;
        this.f388301l = -9223372036854775807L;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(tu tuVar, fb1.d dVar) {
        dVar.a();
        this.f388294e = dVar.b();
        this.f388293d = tuVar.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f388301l = j12;
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(pr0 pr0Var) {
        db.b(this.f388293d);
        while (pr0Var.a() > 0) {
            int i12 = this.f388295f;
            if (i12 == 0) {
                byte[] bArrC = pr0Var.c();
                int iD2 = pr0Var.d();
                int iE2 = pr0Var.e();
                while (true) {
                    if (iD2 < iE2) {
                        byte b12 = bArrC[iD2];
                        boolean z12 = (b12 & 255) == 255;
                        boolean z13 = this.f388298i && (b12 & 224) == 224;
                        this.f388298i = z12;
                        if (z13) {
                            pr0Var.e(iD2 + 1);
                            this.f388298i = false;
                            this.f388290a.c()[1] = bArrC[iD2];
                            this.f388296g = 2;
                            this.f388295f = 1;
                            break;
                        }
                        iD2++;
                    } else {
                        pr0Var.e(iE2);
                        break;
                    }
                }
            } else if (i12 == 1) {
                int iMin = Math.min(pr0Var.a(), 4 - this.f388296g);
                pr0Var.a(this.f388290a.c(), this.f388296g, iMin);
                int i13 = this.f388296g + iMin;
                this.f388296g = i13;
                if (i13 >= 4) {
                    this.f388290a.e(0);
                    if (!this.f388291b.a(this.f388290a.h())) {
                        this.f388296g = 0;
                        this.f388295f = 1;
                    } else {
                        this.f388300k = this.f388291b.f388543c;
                        if (!this.f388297h) {
                            this.f388299j = (r0.f388547g * 1000000) / r0.f388544d;
                            this.f388293d.a(new vw.a().c(this.f388294e).f(this.f388291b.f388542b).i(4096).c(this.f388291b.f388545e).n(this.f388291b.f388544d).e(this.f388292c).a());
                            this.f388297h = true;
                        }
                        this.f388290a.e(0);
                        this.f388293d.a(4, this.f388290a);
                        this.f388295f = 2;
                    }
                }
            } else if (i12 == 2) {
                int iMin2 = Math.min(pr0Var.a(), this.f388300k - this.f388296g);
                this.f388293d.a(iMin2, pr0Var);
                int i14 = this.f388296g + iMin2;
                this.f388296g = i14;
                int i15 = this.f388300k;
                if (i14 >= i15) {
                    long j12 = this.f388301l;
                    if (j12 != -9223372036854775807L) {
                        this.f388293d.a(j12, 1, i15, 0, null);
                        this.f388301l += this.f388299j;
                    }
                    this.f388296g = 0;
                    this.f388295f = 0;
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void b() {
    }
}
