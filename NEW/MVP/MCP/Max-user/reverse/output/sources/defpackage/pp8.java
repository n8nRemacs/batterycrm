package defpackage;

/* loaded from: classes.dex */
public final class pp8 implements p29, n29 {
    public n29 X;
    public long Y = -9223372036854775807L;
    public final d99 a;
    public final long b;
    public final ri4 c;
    public ck0 d;
    public p29 o;

    public pp8(d99 d99Var, ri4 ri4Var, long j) {
        this.a = d99Var;
        this.c = ri4Var;
        this.b = j;
    }

    public final void a(d99 d99Var) {
        long j = this.Y;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        ck0 ck0Var = this.d;
        ck0Var.getClass();
        p29 p29VarC = ck0Var.c(d99Var, this.c, j);
        this.o = p29VarC;
        if (this.X != null) {
            p29VarC.n(this, j);
        }
    }

    @Override // defpackage.p29
    public final long c(long j, k9e k9eVar) {
        p29 p29Var = this.o;
        String str = zxg.a;
        return p29Var.c(j, k9eVar);
    }

    @Override // defpackage.jee
    public final long d() {
        p29 p29Var = this.o;
        String str = zxg.a;
        return p29Var.d();
    }

    @Override // defpackage.p29
    public final void f() {
        p29 p29Var = this.o;
        if (p29Var != null) {
            p29Var.f();
            return;
        }
        ck0 ck0Var = this.d;
        if (ck0Var != null) {
            ck0Var.k();
        }
    }

    @Override // defpackage.p29
    public final long h(long j) {
        p29 p29Var = this.o;
        String str = zxg.a;
        return p29Var.h(j);
    }

    @Override // defpackage.n29
    public final void i(p29 p29Var) {
        n29 n29Var = this.X;
        String str = zxg.a;
        n29Var.i(this);
    }

    @Override // defpackage.jee
    public final boolean j() {
        p29 p29Var = this.o;
        return p29Var != null && p29Var.j();
    }

    @Override // defpackage.p29
    public final long k() {
        p29 p29Var = this.o;
        String str = zxg.a;
        return p29Var.k();
    }

    @Override // defpackage.p29
    public final nfg l() {
        p29 p29Var = this.o;
        String str = zxg.a;
        return p29Var.l();
    }

    @Override // defpackage.p29
    public final long m(bn5[] bn5VarArr, boolean[] zArr, jxd[] jxdVarArr, boolean[] zArr2, long j) {
        long j2 = this.Y;
        long j3 = (j2 == -9223372036854775807L || j != this.b) ? j : j2;
        this.Y = -9223372036854775807L;
        p29 p29Var = this.o;
        String str = zxg.a;
        return p29Var.m(bn5VarArr, zArr, jxdVarArr, zArr2, j3);
    }

    @Override // defpackage.p29
    public final void n(n29 n29Var, long j) {
        this.X = n29Var;
        p29 p29Var = this.o;
        if (p29Var != null) {
            long j2 = this.Y;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            p29Var.n(this, j2);
        }
    }

    @Override // defpackage.jee
    public final long o() {
        p29 p29Var = this.o;
        String str = zxg.a;
        return p29Var.o();
    }

    @Override // defpackage.jee
    public final void p(long j) {
        p29 p29Var = this.o;
        String str = zxg.a;
        p29Var.p(j);
    }

    @Override // defpackage.jee
    public final boolean r(oc8 oc8Var) {
        p29 p29Var = this.o;
        return p29Var != null && p29Var.r(oc8Var);
    }

    @Override // defpackage.hee
    public final void s(jee jeeVar) {
        n29 n29Var = this.X;
        String str = zxg.a;
        n29Var.s(this);
    }

    @Override // defpackage.p29
    public final void t(long j, boolean z) {
        p29 p29Var = this.o;
        String str = zxg.a;
        p29Var.t(j, z);
    }
}
