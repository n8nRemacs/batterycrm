package defpackage;

/* loaded from: classes.dex */
public final class k93 implements jxd {
    public final o93 a;
    public final hxd b;
    public final int c;
    public boolean d;
    public final /* synthetic */ o93 o;

    public k93(o93 o93Var, o93 o93Var2, hxd hxdVar, int i) {
        this.o = o93Var;
        this.a = o93Var2;
        this.b = hxdVar;
        this.c = i;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        o93 o93Var = this.o;
        lk6 lk6Var = o93Var.Y;
        int[] iArr = o93Var.b;
        int i = this.c;
        lk6Var.y(iArr[i], o93Var.c[i], 0, null, o93Var.D0);
        this.d = true;
    }

    @Override // defpackage.jxd
    public final void b() {
    }

    @Override // defpackage.jxd
    public final boolean e() {
        o93 o93Var = this.o;
        return !o93Var.w() && this.b.u(o93Var.I0);
    }

    @Override // defpackage.jxd
    public final int g(long j) {
        o93 o93Var = this.o;
        if (o93Var.w()) {
            return 0;
        }
        boolean z = o93Var.I0;
        hxd hxdVar = this.b;
        int iS = hxdVar.s(j, z);
        yj0 yj0Var = o93Var.F0;
        if (yj0Var != null) {
            iS = Math.min(iS, yj0Var.d(this.c + 1) - hxdVar.q());
        }
        hxdVar.D(iS);
        if (iS > 0) {
            a();
        }
        return iS;
    }

    @Override // defpackage.jxd
    public final int i(xt4 xt4Var, ph4 ph4Var, int i) {
        o93 o93Var = this.o;
        if (o93Var.w()) {
            return -3;
        }
        yj0 yj0Var = o93Var.F0;
        hxd hxdVar = this.b;
        if (yj0Var != null && yj0Var.d(this.c + 1) <= hxdVar.q()) {
            return -3;
        }
        a();
        return hxdVar.z(xt4Var, ph4Var, i, o93Var.I0);
    }
}
