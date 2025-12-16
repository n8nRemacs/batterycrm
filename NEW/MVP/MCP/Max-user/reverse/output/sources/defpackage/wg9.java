package defpackage;

/* loaded from: classes.dex */
public final class wg9 implements o29, m29 {
    public final o29 a;
    public final long b;
    public m29 c;

    public wg9(o29 o29Var, long j) {
        this.a = o29Var;
        this.b = j;
    }

    @Override // defpackage.o29
    public final void C(m29 m29Var, long j) {
        this.c = m29Var;
        this.a.C(this, j - this.b);
    }

    @Override // defpackage.o29
    public final long E(an5[] an5VarArr, boolean[] zArr, ixd[] ixdVarArr, boolean[] zArr2, long j) {
        ixd[] ixdVarArr2 = new ixd[ixdVarArr.length];
        int i = 0;
        while (true) {
            ixd ixdVar = null;
            if (i >= ixdVarArr.length) {
                break;
            }
            xg9 xg9Var = (xg9) ixdVarArr[i];
            if (xg9Var != null) {
                ixdVar = xg9Var.a;
            }
            ixdVarArr2[i] = ixdVar;
            i++;
        }
        o29 o29Var = this.a;
        long j2 = this.b;
        long jE = o29Var.E(an5VarArr, zArr, ixdVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < ixdVarArr.length; i2++) {
            ixd ixdVar2 = ixdVarArr2[i2];
            if (ixdVar2 == null) {
                ixdVarArr[i2] = null;
            } else {
                ixd ixdVar3 = ixdVarArr[i2];
                if (ixdVar3 == null || ((xg9) ixdVar3).a != ixdVar2) {
                    ixdVarArr[i2] = new xg9(ixdVar2, j2);
                }
            }
        }
        return jE + j2;
    }

    @Override // defpackage.gee
    public final void b(iee ieeVar) {
        m29 m29Var = this.c;
        m29Var.getClass();
        m29Var.b(this);
    }

    @Override // defpackage.m29
    public final void c(o29 o29Var) {
        m29 m29Var = this.c;
        m29Var.getClass();
        m29Var.c(this);
    }

    @Override // defpackage.iee
    public final long d() {
        long jD = this.a.d();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.b;
    }

    @Override // defpackage.o29
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.o29
    public final long h(long j) {
        long j2 = this.b;
        return this.a.h(j - j2) + j2;
    }

    @Override // defpackage.iee
    public final boolean j() {
        return this.a.j();
    }

    @Override // defpackage.o29
    public final long k() {
        long jK = this.a.k();
        if (jK == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jK + this.b;
    }

    @Override // defpackage.o29
    public final mfg l() {
        return this.a.l();
    }

    @Override // defpackage.iee
    public final long o() {
        long jO = this.a.o();
        if (jO == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jO + this.b;
    }

    @Override // defpackage.iee
    public final void p(long j) {
        this.a.p(j - this.b);
    }

    @Override // defpackage.o29
    public final long v(long j, j9e j9eVar) {
        long j2 = this.b;
        return this.a.v(j - j2, j9eVar) + j2;
    }

    @Override // defpackage.o29
    public final void y(long j) {
        this.a.y(j - this.b);
    }

    @Override // defpackage.iee
    public final boolean z(long j) {
        return this.a.z(j - this.b);
    }
}
