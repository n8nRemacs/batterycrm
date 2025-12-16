package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.jd0;

/* loaded from: classes8.dex */
final class ed0 {

    /* renamed from: a, reason: collision with root package name */
    public final dd0 f384895a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f384896b;

    /* renamed from: c, reason: collision with root package name */
    public final n11[] f384897c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f384898d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f384899e;

    /* renamed from: f, reason: collision with root package name */
    public gd0 f384900f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f384901g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean[] f384902h;

    /* renamed from: i, reason: collision with root package name */
    private final vx0[] f384903i;

    /* renamed from: j, reason: collision with root package name */
    private final ca1 f384904j;

    /* renamed from: k, reason: collision with root package name */
    private final md0 f384905k;

    /* renamed from: l, reason: collision with root package name */
    @j.P
    private ed0 f384906l;

    /* renamed from: m, reason: collision with root package name */
    private w91 f384907m;

    /* renamed from: n, reason: collision with root package name */
    private da1 f384908n;

    /* renamed from: o, reason: collision with root package name */
    private long f384909o;

    public ed0(vx0[] vx0VarArr, long j12, ca1 ca1Var, h9 h9Var, md0 md0Var, gd0 gd0Var, da1 da1Var) {
        this.f384903i = vx0VarArr;
        this.f384909o = j12;
        this.f384904j = ca1Var;
        this.f384905k = md0Var;
        jd0.b bVar = gd0Var.f385717a;
        this.f384896b = bVar.f385280a;
        this.f384900f = gd0Var;
        this.f384907m = w91.f391352d;
        this.f384908n = da1Var;
        this.f384897c = new n11[vx0VarArr.length];
        this.f384902h = new boolean[vx0VarArr.length];
        this.f384895a = a(bVar, md0Var, h9Var, gd0Var.f385718b, gd0Var.f385720d);
    }

    public final void a(float f12, i91 i91Var) {
        this.f384898d = true;
        this.f384907m = this.f384895a.getTrackGroups();
        da1 da1VarB = b(f12, i91Var);
        gd0 gd0Var = this.f384900f;
        long jMax = gd0Var.f385718b;
        long j12 = gd0Var.f385721e;
        if (j12 != -9223372036854775807L && jMax >= j12) {
            jMax = Math.max(0L, j12 - 1);
        }
        long jA2 = a(da1VarB, jMax);
        long j13 = this.f384909o;
        gd0 gd0Var2 = this.f384900f;
        long j14 = gd0Var2.f385718b;
        this.f384909o = (j14 - jA2) + j13;
        if (jA2 != j14) {
            gd0Var2 = new gd0(gd0Var2.f385717a, jA2, gd0Var2.f385719c, gd0Var2.f385720d, gd0Var2.f385721e, gd0Var2.f385722f, gd0Var2.f385723g, gd0Var2.f385724h, gd0Var2.f385725i);
        }
        this.f384900f = gd0Var2;
    }

    public final da1 b(float f12, i91 i91Var) {
        da1 da1VarA = this.f384904j.a(this.f384903i, this.f384907m, this.f384900f.f385717a, i91Var);
        for (cu cuVar : da1VarA.f384553c) {
            if (cuVar != null) {
                cuVar.a(f12);
            }
        }
        return da1VarA;
    }

    public final long c() {
        return this.f384909o;
    }

    public final long d(long j12) {
        return j12 + this.f384909o;
    }

    public final w91 e() {
        return this.f384907m;
    }

    public final da1 f() {
        return this.f384908n;
    }

    public final void g() {
        a();
        md0 md0Var = this.f384905k;
        dd0 dd0Var = this.f384895a;
        try {
            if (dd0Var instanceof gj) {
                md0Var.a(((gj) dd0Var).f385761b);
            } else {
                md0Var.a(dd0Var);
            }
        } catch (RuntimeException e12) {
            ka0.a("MediaPeriodHolder", "Period release failed.", e12);
        }
    }

    public final void h() {
        this.f384909o = 1000000000000L;
    }

    public final long c(long j12) {
        return j12 - this.f384909o;
    }

    public final long d() {
        return this.f384900f.f385718b + this.f384909o;
    }

    @j.P
    public final ed0 b() {
        return this.f384906l;
    }

    public final void b(long j12) {
        db.b(this.f384906l == null);
        if (this.f384898d) {
            this.f384895a.reevaluateBuffer(j12 - this.f384909o);
        }
    }

    public final long a(da1 da1Var, long j12) {
        return a(da1Var, j12, false, new boolean[this.f384903i.length]);
    }

    public final long a(da1 da1Var, long j12, boolean z12, boolean[] zArr) {
        da1 da1Var2;
        int i12 = 0;
        while (true) {
            boolean z13 = true;
            if (i12 >= da1Var.f384551a) {
                break;
            }
            boolean[] zArr2 = this.f384902h;
            if (z12 || (da1Var2 = this.f384908n) == null || !pc1.a(da1Var.f384552b[i12], da1Var2.f384552b[i12]) || !pc1.a(da1Var.f384553c[i12], da1Var2.f384553c[i12])) {
                z13 = false;
            }
            zArr2[i12] = z13;
            i12++;
        }
        n11[] n11VarArr = this.f384897c;
        int i13 = 0;
        while (true) {
            vx0[] vx0VarArr = this.f384903i;
            if (i13 >= vx0VarArr.length) {
                break;
            }
            if (((ff) vx0VarArr[i13]).m() == -2) {
                n11VarArr[i13] = null;
            }
            i13++;
        }
        a();
        this.f384908n = da1Var;
        if (this.f384906l == null) {
            int i14 = 0;
            while (true) {
                da1 da1Var3 = this.f384908n;
                if (i14 >= da1Var3.f384551a) {
                    break;
                }
                boolean zA2 = da1Var3.a(i14);
                cu cuVar = this.f384908n.f384553c[i14];
                if (zA2 && cuVar != null) {
                    cuVar.c();
                }
                i14++;
            }
        }
        long jA2 = this.f384895a.a(da1Var.f384553c, this.f384902h, this.f384897c, zArr, j12);
        n11[] n11VarArr2 = this.f384897c;
        int i15 = 0;
        while (true) {
            vx0[] vx0VarArr2 = this.f384903i;
            if (i15 >= vx0VarArr2.length) {
                break;
            }
            if (((ff) vx0VarArr2[i15]).m() == -2 && this.f384908n.a(i15)) {
                n11VarArr2[i15] = new ks();
            }
            i15++;
        }
        this.f384899e = false;
        int i16 = 0;
        while (true) {
            n11[] n11VarArr3 = this.f384897c;
            if (i16 >= n11VarArr3.length) {
                return jA2;
            }
            if (n11VarArr3[i16] != null) {
                db.b(da1Var.a(i16));
                if (((ff) this.f384903i[i16]).m() != -2) {
                    this.f384899e = true;
                }
            } else {
                db.b(da1Var.f384553c[i16] == null);
            }
            i16++;
        }
    }

    public final void a(@j.P ed0 ed0Var) {
        if (ed0Var == this.f384906l) {
            return;
        }
        a();
        this.f384906l = ed0Var;
        if (ed0Var != null) {
            return;
        }
        int i12 = 0;
        while (true) {
            da1 da1Var = this.f384908n;
            if (i12 >= da1Var.f384551a) {
                return;
            }
            boolean zA2 = da1Var.a(i12);
            cu cuVar = this.f384908n.f384553c[i12];
            if (zA2 && cuVar != null) {
                cuVar.c();
            }
            i12++;
        }
    }

    public final void a(long j12) {
        db.b(this.f384906l == null);
        this.f384895a.continueLoading(j12 - this.f384909o);
    }

    private void a() {
        if (this.f384906l != null) {
            return;
        }
        int i12 = 0;
        while (true) {
            da1 da1Var = this.f384908n;
            if (i12 >= da1Var.f384551a) {
                return;
            }
            boolean zA2 = da1Var.a(i12);
            cu cuVar = this.f384908n.f384553c[i12];
            if (zA2 && cuVar != null) {
                cuVar.b();
            }
            i12++;
        }
    }

    private static dd0 a(jd0.b bVar, md0 md0Var, h9 h9Var, long j12, long j13) {
        eb0 eb0VarA = md0Var.a(bVar, h9Var, j12);
        return j13 != -9223372036854775807L ? new gj(eb0VarA, true, 0L, j13) : eb0VarA;
    }
}
