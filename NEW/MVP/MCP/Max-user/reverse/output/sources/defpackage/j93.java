package defpackage;

/* loaded from: classes.dex */
public final class j93 implements ixd {
    public final n93 a;
    public final gxd b;
    public final int c;
    public boolean d;
    public final /* synthetic */ n93 o;

    public j93(n93 n93Var, n93 n93Var2, gxd gxdVar, int i) {
        this.o = n93Var;
        this.a = n93Var2;
        this.b = gxdVar;
        this.c = i;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        n93 n93Var = this.o;
        qr4 qr4Var = n93Var.Y;
        int[] iArr = n93Var.b;
        int i = this.c;
        qr4Var.b(iArr[i], n93Var.c[i], 0, null, n93Var.D0);
        this.d = true;
    }

    @Override // defpackage.ixd
    public final void b() {
    }

    @Override // defpackage.ixd
    public final boolean e() {
        n93 n93Var = this.o;
        return !n93Var.q() && this.b.r(n93Var.G0);
    }

    @Override // defpackage.ixd
    public final int g(long j) throws Throwable {
        n93 n93Var = this.o;
        if (n93Var.q()) {
            return 0;
        }
        boolean z = n93Var.G0;
        gxd gxdVar = this.b;
        int iP = gxdVar.p(j, z);
        xj0 xj0Var = n93Var.F0;
        if (xj0Var != null) {
            iP = Math.min(iP, xj0Var.d(this.c + 1) - gxdVar.n());
        }
        gxdVar.z(iP);
        if (iP > 0) {
            a();
        }
        return iP;
    }

    @Override // defpackage.ixd
    public final int i(i5i i5iVar, oh4 oh4Var, int i) {
        n93 n93Var = this.o;
        if (n93Var.q()) {
            return -3;
        }
        xj0 xj0Var = n93Var.F0;
        gxd gxdVar = this.b;
        if (xj0Var != null && xj0Var.d(this.c + 1) <= gxdVar.n()) {
            return -3;
        }
        a();
        return gxdVar.w(i5iVar, oh4Var, i, n93Var.G0);
    }
}
