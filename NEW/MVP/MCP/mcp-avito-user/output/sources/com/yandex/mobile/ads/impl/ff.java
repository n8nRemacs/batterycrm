package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public abstract class ff implements ux0, vx0 {

    /* renamed from: b, reason: collision with root package name */
    private final int f385300b;

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private wx0 f385302d;

    /* renamed from: e, reason: collision with root package name */
    private int f385303e;

    /* renamed from: f, reason: collision with root package name */
    private jt0 f385304f;

    /* renamed from: g, reason: collision with root package name */
    private int f385305g;

    /* renamed from: h, reason: collision with root package name */
    @j.P
    private n11 f385306h;

    /* renamed from: i, reason: collision with root package name */
    @j.P
    private vw[] f385307i;

    /* renamed from: j, reason: collision with root package name */
    private long f385308j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f385310l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f385311m;

    /* renamed from: c, reason: collision with root package name */
    private final ww f385301c = new ww();

    /* renamed from: k, reason: collision with root package name */
    private long f385309k = Long.MIN_VALUE;

    public ff(int i12) {
        this.f385300b = i12;
    }

    @Override // com.yandex.mobile.ads.impl.kt0.b
    public void a(int i12, @j.P Object obj) {
    }

    public abstract void a(long j12, boolean z12);

    public abstract void a(vw[] vwVarArr, long j12, long j13);

    @Override // com.yandex.mobile.ads.impl.ux0
    public final void b() {
        db.b(this.f385305g == 1);
        ww wwVar = this.f385301c;
        wwVar.f391505a = null;
        wwVar.f391506b = null;
        this.f385305g = 0;
        this.f385306h = null;
        this.f385307i = null;
        this.f385310l = false;
        u();
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final int c() {
        return this.f385305g;
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final boolean e() {
        return this.f385309k == Long.MIN_VALUE;
    }

    @Override // com.yandex.mobile.ads.impl.vx0
    public int f() {
        return 0;
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    @j.P
    public final n11 g() {
        return this.f385306h;
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final void h() {
        this.f385310l = true;
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final void i() {
        n11 n11Var = this.f385306h;
        n11Var.getClass();
        n11Var.a();
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final long j() {
        return this.f385309k;
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final boolean k() {
        return this.f385310l;
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    @j.P
    public zb0 l() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final int m() {
        return this.f385300b;
    }

    public final wx0 p() {
        wx0 wx0Var = this.f385302d;
        wx0Var.getClass();
        return wx0Var;
    }

    public final ww q() {
        ww wwVar = this.f385301c;
        wwVar.f391505a = null;
        wwVar.f391506b = null;
        return wwVar;
    }

    public final jt0 r() {
        jt0 jt0Var = this.f385304f;
        jt0Var.getClass();
        return jt0Var;
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final void reset() {
        db.b(this.f385305g == 0);
        ww wwVar = this.f385301c;
        wwVar.f391505a = null;
        wwVar.f391506b = null;
        v();
    }

    public final vw[] s() {
        vw[] vwVarArr = this.f385307i;
        vwVarArr.getClass();
        return vwVarArr;
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final void start() {
        db.b(this.f385305g == 1);
        this.f385305g = 2;
        w();
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final void stop() {
        db.b(this.f385305g == 2);
        this.f385305g = 1;
        x();
    }

    public final boolean t() {
        if (e()) {
            return this.f385310l;
        }
        n11 n11Var = this.f385306h;
        n11Var.getClass();
        return n11Var.d();
    }

    public abstract void u();

    public void a(boolean z12, boolean z13) {
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final void a(int i12, jt0 jt0Var) {
        this.f385303e = i12;
        this.f385304f = jt0Var;
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final void a(wx0 wx0Var, vw[] vwVarArr, n11 n11Var, long j12, boolean z12, boolean z13, long j13, long j14) {
        db.b(this.f385305g == 0);
        this.f385302d = wx0Var;
        this.f385305g = 1;
        a(z12, z13);
        a(vwVarArr, n11Var, j13, j14);
        this.f385310l = false;
        this.f385309k = j12;
        a(j12, z12);
    }

    public final int b(long j12) {
        n11 n11Var = this.f385306h;
        n11Var.getClass();
        return n11Var.a(j12 - this.f385308j);
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final void a(vw[] vwVarArr, n11 n11Var, long j12, long j13) {
        db.b(!this.f385310l);
        this.f385306h = n11Var;
        if (this.f385309k == Long.MIN_VALUE) {
            this.f385309k = j12;
        }
        this.f385307i = vwVarArr;
        this.f385308j = j13;
        a(vwVarArr, j12, j13);
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final ff n() {
        return this;
    }

    public void v() {
    }

    public void w() {
    }

    public void x() {
    }

    @Override // com.yandex.mobile.ads.impl.ux0
    public final void a(long j12) {
        this.f385310l = false;
        this.f385309k = j12;
        a(j12, false);
    }

    public final lt a(Exception exc, @j.P vw vwVar, int i12) {
        return a(i12, vwVar, exc, false);
    }

    public final lt a(int i12, @j.P vw vwVar, Exception exc, boolean z12) {
        int iA2;
        if (vwVar == null || this.f385311m) {
            iA2 = 4;
        } else {
            this.f385311m = true;
            try {
                iA2 = a(vwVar) & 7;
            } catch (lt unused) {
            } finally {
                this.f385311m = false;
            }
        }
        return lt.a(exc, getName(), this.f385303e, vwVar, iA2, z12, i12);
    }

    public final int a(ww wwVar, vn vnVar, int i12) {
        n11 n11Var = this.f385306h;
        n11Var.getClass();
        int iA2 = n11Var.a(wwVar, vnVar, i12);
        if (iA2 == -4) {
            if (vnVar.f()) {
                this.f385309k = Long.MIN_VALUE;
                return this.f385310l ? -4 : -3;
            }
            long j12 = vnVar.f390953e + this.f385308j;
            vnVar.f390953e = j12;
            this.f385309k = Math.max(this.f385309k, j12);
        } else if (iA2 == -5) {
            vw vwVar = wwVar.f391506b;
            vwVar.getClass();
            if (vwVar.f391185p != Long.MAX_VALUE) {
                wwVar.f391506b = vwVar.a().a(vwVar.f391185p + this.f385308j).a();
            }
        }
        return iA2;
    }
}
