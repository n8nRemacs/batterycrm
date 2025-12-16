package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.C39332i;
import com.yandex.mobile.ads.impl.fb1;
import com.yandex.mobile.ads.impl.vw;

/* renamed from: com.yandex.mobile.ads.impl.h, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39329h implements is {

    /* renamed from: a, reason: collision with root package name */
    private final or0 f385862a;

    /* renamed from: b, reason: collision with root package name */
    private final pr0 f385863b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final String f385864c;

    /* renamed from: d, reason: collision with root package name */
    private String f385865d;

    /* renamed from: e, reason: collision with root package name */
    private x91 f385866e;

    /* renamed from: f, reason: collision with root package name */
    private int f385867f;

    /* renamed from: g, reason: collision with root package name */
    private int f385868g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f385869h;

    /* renamed from: i, reason: collision with root package name */
    private long f385870i;

    /* renamed from: j, reason: collision with root package name */
    private vw f385871j;

    /* renamed from: k, reason: collision with root package name */
    private int f385872k;

    /* renamed from: l, reason: collision with root package name */
    private long f385873l;

    public C39329h() {
        this(null);
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a() {
        this.f385867f = 0;
        this.f385868g = 0;
        this.f385869h = false;
        this.f385873l = -9223372036854775807L;
    }

    public C39329h(@j.P String str) {
        or0 or0Var = new or0(new byte[128]);
        this.f385862a = or0Var;
        this.f385863b = new pr0(or0Var.f388623a);
        this.f385867f = 0;
        this.f385873l = -9223372036854775807L;
        this.f385864c = str;
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(tu tuVar, fb1.d dVar) {
        dVar.a();
        this.f385865d = dVar.b();
        this.f385866e = tuVar.a(dVar.c(), 1);
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(int i12, long j12) {
        if (j12 != -9223372036854775807L) {
            this.f385873l = j12;
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void a(pr0 pr0Var) {
        db.b(this.f385866e);
        while (pr0Var.a() > 0) {
            int i12 = this.f385867f;
            if (i12 == 0) {
                while (true) {
                    if (pr0Var.a() <= 0) {
                        break;
                    }
                    if (!this.f385869h) {
                        this.f385869h = pr0Var.t() == 11;
                    } else {
                        int iT2 = pr0Var.t();
                        if (iT2 == 119) {
                            this.f385869h = false;
                            this.f385867f = 1;
                            this.f385863b.c()[0] = 11;
                            this.f385863b.c()[1] = 119;
                            this.f385868g = 2;
                            break;
                        }
                        this.f385869h = iT2 == 11;
                    }
                }
            } else if (i12 == 1) {
                byte[] bArrC = this.f385863b.c();
                int iMin = Math.min(pr0Var.a(), 128 - this.f385868g);
                pr0Var.a(bArrC, this.f385868g, iMin);
                int i13 = this.f385868g + iMin;
                this.f385868g = i13;
                if (i13 == 128) {
                    this.f385862a.c(0);
                    C39332i.a aVarA = C39332i.a(this.f385862a);
                    vw vwVar = this.f385871j;
                    if (vwVar == null || aVarA.f386256c != vwVar.f391194y || aVarA.f386255b != vwVar.f391195z || !pc1.a(aVarA.f386254a, vwVar.f391181l)) {
                        vw vwVarA = new vw.a().c(this.f385865d).f(aVarA.f386254a).c(aVarA.f386256c).n(aVarA.f386255b).e(this.f385864c).a();
                        this.f385871j = vwVarA;
                        this.f385866e.a(vwVarA);
                    }
                    this.f385872k = aVarA.f386257d;
                    this.f385870i = (aVarA.f386258e * 1000000) / this.f385871j.f391195z;
                    this.f385863b.e(0);
                    this.f385866e.a(128, this.f385863b);
                    this.f385867f = 2;
                }
            } else if (i12 == 2) {
                int iMin2 = Math.min(pr0Var.a(), this.f385872k - this.f385868g);
                this.f385866e.a(iMin2, pr0Var);
                int i14 = this.f385868g + iMin2;
                this.f385868g = i14;
                int i15 = this.f385872k;
                if (i14 == i15) {
                    long j12 = this.f385873l;
                    if (j12 != -9223372036854775807L) {
                        this.f385866e.a(j12, 1, i15, 0, null);
                        this.f385873l += this.f385870i;
                    }
                    this.f385867f = 0;
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.is
    public final void b() {
    }
}
