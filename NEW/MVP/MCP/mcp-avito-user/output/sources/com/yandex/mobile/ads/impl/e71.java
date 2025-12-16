package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kw;
import com.yandex.mobile.ads.impl.x21;
import v61.InterfaceC49174e;

/* loaded from: classes8.dex */
abstract class e71 {

    /* renamed from: b, reason: collision with root package name */
    private x91 f384798b;

    /* renamed from: c, reason: collision with root package name */
    private tu f384799c;

    /* renamed from: d, reason: collision with root package name */
    private zp0 f384800d;

    /* renamed from: e, reason: collision with root package name */
    private long f384801e;

    /* renamed from: f, reason: collision with root package name */
    private long f384802f;

    /* renamed from: g, reason: collision with root package name */
    private long f384803g;

    /* renamed from: h, reason: collision with root package name */
    private int f384804h;

    /* renamed from: i, reason: collision with root package name */
    private int f384805i;

    /* renamed from: k, reason: collision with root package name */
    private long f384807k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f384808l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f384809m;

    /* renamed from: a, reason: collision with root package name */
    private final xp0 f384797a = new xp0();

    /* renamed from: j, reason: collision with root package name */
    private a f384806j = new a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        vw f384810a;

        /* renamed from: b, reason: collision with root package name */
        kw.a f384811b;
    }

    public static final class b implements zp0 {
        private b() {
        }

        @Override // com.yandex.mobile.ads.impl.zp0
        public final long a(to toVar) {
            return -1L;
        }

        public /* synthetic */ b(int i12) {
            this();
        }

        @Override // com.yandex.mobile.ads.impl.zp0
        public final void a(long j12) {
        }

        @Override // com.yandex.mobile.ads.impl.zp0
        public final x21 a() {
            return new x21.b(-9223372036854775807L, 0L);
        }
    }

    public abstract long a(pr0 pr0Var);

    public final void a(tu tuVar, x91 x91Var) {
        this.f384799c = tuVar;
        this.f384798b = x91Var;
        a(true);
    }

    @InterfaceC49174e
    public abstract boolean a(pr0 pr0Var, long j12, a aVar);

    public final long b(long j12) {
        return (this.f384805i * j12) / 1000000;
    }

    public void c(long j12) {
        this.f384803g = j12;
    }

    public void a(boolean z12) {
        if (z12) {
            this.f384806j = new a();
            this.f384802f = 0L;
            this.f384804h = 0;
        } else {
            this.f384804h = 1;
        }
        this.f384801e = -1L;
        this.f384803g = 0L;
    }

    public final void a(long j12, long j13) {
        this.f384797a.c();
        if (j12 == 0) {
            a(!this.f384808l);
            return;
        }
        if (this.f384804h != 0) {
            long jB2 = b(j13);
            this.f384801e = jB2;
            zp0 zp0Var = this.f384800d;
            int i12 = pc1.f388768a;
            zp0Var.a(jB2);
            this.f384804h = 2;
        }
    }

    public final int a(to toVar, fu0 fu0Var) {
        db.b(this.f384798b);
        int i12 = pc1.f388768a;
        int i13 = this.f384804h;
        int i14 = 0;
        if (i13 == 0) {
            while (this.f384797a.a(toVar)) {
                this.f384807k = toVar.getPosition() - this.f384802f;
                if (a(this.f384797a.b(), this.f384802f, this.f384806j)) {
                    this.f384802f = toVar.getPosition();
                } else {
                    vw vwVar = this.f384806j.f384810a;
                    this.f384805i = vwVar.f391195z;
                    if (!this.f384809m) {
                        this.f384798b.a(vwVar);
                        this.f384809m = true;
                    }
                    kw.a aVar = this.f384806j.f384811b;
                    if (aVar != null) {
                        this.f384800d = aVar;
                    } else if (toVar.a() == -1) {
                        this.f384800d = new b(i14);
                    } else {
                        yp0 yp0VarA = this.f384797a.a();
                        this.f384800d = new ep(this, this.f384802f, toVar.a(), yp0VarA.f392051d + yp0VarA.f392052e, yp0VarA.f392049b, (yp0VarA.f392048a & 4) != 0);
                    }
                    this.f384804h = 2;
                    this.f384797a.d();
                    return 0;
                }
            }
            this.f384804h = 3;
            return -1;
        }
        if (i13 == 1) {
            toVar.a((int) this.f384802f);
            this.f384804h = 2;
            return 0;
        }
        if (i13 != 2) {
            if (i13 == 3) {
                return -1;
            }
            throw new IllegalStateException();
        }
        long jA2 = this.f384800d.a(toVar);
        if (jA2 >= 0) {
            fu0Var.f385508a = jA2;
            return 1;
        }
        if (jA2 < -1) {
            c(-(jA2 + 2));
        }
        if (!this.f384808l) {
            this.f384799c.a((x21) db.b(this.f384800d.a()));
            this.f384808l = true;
        }
        if (this.f384807k <= 0 && !this.f384797a.a(toVar)) {
            this.f384804h = 3;
            return -1;
        }
        this.f384807k = 0L;
        pr0 pr0VarB = this.f384797a.b();
        long jA3 = a(pr0VarB);
        if (jA3 >= 0) {
            long j12 = this.f384803g;
            if (j12 + jA3 >= this.f384801e) {
                long jA4 = a(j12);
                this.f384798b.a(pr0VarB.e(), pr0VarB);
                this.f384798b.a(jA4, 1, pr0VarB.e(), 0, null);
                this.f384801e = -1L;
            }
        }
        this.f384803g += jA3;
        return 0;
    }

    public final long a(long j12) {
        return (j12 * 1000000) / this.f384805i;
    }
}
