package defpackage;

/* loaded from: classes.dex */
public final class x8g implements p29, n29 {
    public final p29 a;
    public final long b;
    public n29 c;

    public x8g(p29 p29Var, long j) {
        this.a = p29Var;
        this.b = j;
    }

    @Override // defpackage.p29
    public final long c(long j, k9e k9eVar) {
        long j2 = this.b;
        return this.a.c(j - j2, k9eVar) + j2;
    }

    @Override // defpackage.jee
    public final long d() {
        long jD = this.a.d();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.b;
    }

    @Override // defpackage.p29
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.p29
    public final long h(long j) {
        long j2 = this.b;
        return this.a.h(j - j2) + j2;
    }

    @Override // defpackage.n29
    public final void i(p29 p29Var) {
        n29 n29Var = this.c;
        n29Var.getClass();
        n29Var.i(this);
    }

    @Override // defpackage.jee
    public final boolean j() {
        return this.a.j();
    }

    @Override // defpackage.p29
    public final long k() {
        long jK = this.a.k();
        if (jK == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jK + this.b;
    }

    @Override // defpackage.p29
    public final nfg l() {
        return this.a.l();
    }

    @Override // defpackage.p29
    public final long m(bn5[] bn5VarArr, boolean[] zArr, jxd[] jxdVarArr, boolean[] zArr2, long j) {
        jxd[] jxdVarArr2 = new jxd[jxdVarArr.length];
        int i = 0;
        while (true) {
            jxd jxdVar = null;
            if (i >= jxdVarArr.length) {
                break;
            }
            w8g w8gVar = (w8g) jxdVarArr[i];
            if (w8gVar != null) {
                jxdVar = w8gVar.a;
            }
            jxdVarArr2[i] = jxdVar;
            i++;
        }
        p29 p29Var = this.a;
        long j2 = this.b;
        long jM = p29Var.m(bn5VarArr, zArr, jxdVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < jxdVarArr.length; i2++) {
            jxd jxdVar2 = jxdVarArr2[i2];
            if (jxdVar2 == null) {
                jxdVarArr[i2] = null;
            } else {
                jxd jxdVar3 = jxdVarArr[i2];
                if (jxdVar3 == null || ((w8g) jxdVar3).a != jxdVar2) {
                    jxdVarArr[i2] = new w8g(jxdVar2, j2);
                }
            }
        }
        return jM + j2;
    }

    @Override // defpackage.p29
    public final void n(n29 n29Var, long j) {
        this.c = n29Var;
        this.a.n(this, j - this.b);
    }

    @Override // defpackage.jee
    public final long o() {
        long jO = this.a.o();
        if (jO == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jO + this.b;
    }

    @Override // defpackage.jee
    public final void p(long j) {
        this.a.p(j - this.b);
    }

    @Override // defpackage.jee
    public final boolean r(oc8 oc8Var) {
        nc8 nc8Var = new nc8();
        long j = oc8Var.a;
        nc8Var.b = oc8Var.b;
        nc8Var.c = oc8Var.c;
        nc8Var.a = j - this.b;
        return this.a.r(new oc8(nc8Var));
    }

    @Override // defpackage.hee
    public final void s(jee jeeVar) {
        n29 n29Var = this.c;
        n29Var.getClass();
        n29Var.s(this);
    }

    @Override // defpackage.p29
    public final void t(long j, boolean z) {
        this.a.t(j - this.b, z);
    }
}
