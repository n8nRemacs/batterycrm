package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C39341l;
import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.vw;

/* renamed from: com.yandex.mobile.ads.impl.k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39338k implements is {

    /* renamed from: a, reason: collision with root package name */
    private final or0 f387013a;

    /* renamed from: b, reason: collision with root package name */
    private final pr0 f387014b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final String f387015c;

    /* renamed from: d, reason: collision with root package name */
    private String f387016d;

    /* renamed from: e, reason: collision with root package name */
    private x91 f387017e;

    /* renamed from: f, reason: collision with root package name */
    private int f387018f;

    /* renamed from: g, reason: collision with root package name */
    private int f387019g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f387020h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f387021i;

    /* renamed from: j, reason: collision with root package name */
    private long f387022j;

    /* renamed from: k, reason: collision with root package name */
    private vw f387023k;

    /* renamed from: l, reason: collision with root package name */
    private int f387024l;

    /* renamed from: m, reason: collision with root package name */
    private long f387025m;

    public C39338k() {
        this(null);
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a() {
        this.f387018f = 0;
        this.f387019g = 0;
        this.f387020h = false;
        this.f387021i = false;
        this.f387025m = -9223372036854775807L;
    }

    public C39338k(@j.P String str) {
        or0 or0Var = new or0(new byte[16]);
        this.f387013a = or0Var;
        this.f387014b = new pr0(or0Var.f388623a);
        this.f387018f = 0;
        this.f387019g = 0;
        this.f387020h = false;
        this.f387021i = false;
        this.f387025m = -9223372036854775807L;
        this.f387015c = str;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(tu tuVar, fb1.d dVar) {
        dVar.a();
        this.f387016d = dVar.b();
        this.f387017e = tuVar.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f387025m = j12;
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(pr0 pr0Var) {
        db.b(this.f387017e);
        while (pr0Var.a() > 0) {
            int i12 = this.f387018f;
            if (i12 == 0) {
                while (pr0Var.a() > 0) {
                    if (!this.f387020h) {
                        this.f387020h = pr0Var.t() == 172;
                    } else {
                        int iT2 = pr0Var.t();
                        this.f387020h = iT2 == 172;
                        if (iT2 == 64 || iT2 == 65) {
                            this.f387021i = iT2 == 65;
                            this.f387018f = 1;
                            this.f387014b.c()[0] = -84;
                            this.f387014b.c()[1] = (byte) (this.f387021i ? 65 : 64);
                            this.f387019g = 2;
                        }
                    }
                }
            } else if (i12 == 1) {
                byte[] bArrC = this.f387014b.c();
                int iMin = Math.min(pr0Var.a(), 16 - this.f387019g);
                pr0Var.a(bArrC, this.f387019g, iMin);
                int i13 = this.f387019g + iMin;
                this.f387019g = i13;
                if (i13 == 16) {
                    this.f387013a.c(0);
                    C39341l.a aVarA = C39341l.a(this.f387013a);
                    vw vwVar = this.f387023k;
                    if (vwVar == null || 2 != vwVar.f391194y || aVarA.f387339a != vwVar.f391195z || !"audio/ac4".equals(vwVar.f391181l)) {
                        vw vwVarA = new vw.a().c(this.f387016d).f("audio/ac4").c(2).n(aVarA.f387339a).e(this.f387015c).a();
                        this.f387023k = vwVarA;
                        this.f387017e.a(vwVarA);
                    }
                    this.f387024l = aVarA.f387340b;
                    this.f387022j = (aVarA.f387341c * 1000000) / this.f387023k.f391195z;
                    this.f387014b.e(0);
                    this.f387017e.a(16, this.f387014b);
                    this.f387018f = 2;
                }
            } else if (i12 == 2) {
                int iMin2 = Math.min(pr0Var.a(), this.f387024l - this.f387019g);
                this.f387017e.a(iMin2, pr0Var);
                int i14 = this.f387019g + iMin2;
                this.f387019g = i14;
                int i15 = this.f387024l;
                if (i14 == i15) {
                    long j12 = this.f387025m;
                    if (j12 != -9223372036854775807L) {
                        this.f387017e.a(j12, 1, i15, 0, null);
                        this.f387025m += this.f387022j;
                    }
                    this.f387018f = 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void b() {
    }
}
