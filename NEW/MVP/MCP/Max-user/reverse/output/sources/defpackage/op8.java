package defpackage;

/* loaded from: classes.dex */
public final class op8 implements o29, m29 {
    public m29 X;
    public long Y = -9223372036854775807L;
    public final c99 a;
    public final long b;
    public final qi4 c;
    public bk0 d;
    public o29 o;

    public op8(c99 c99Var, qi4 qi4Var, long j) {
        this.a = c99Var;
        this.c = qi4Var;
        this.b = j;
    }

    @Override // defpackage.o29
    public final void C(m29 m29Var, long j) {
        this.X = m29Var;
        o29 o29Var = this.o;
        if (o29Var != null) {
            long j2 = this.Y;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            o29Var.C(this, j2);
        }
    }

    @Override // defpackage.o29
    public final long E(an5[] an5VarArr, boolean[] zArr, ixd[] ixdVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.Y;
        if (j3 == -9223372036854775807L || j != this.b) {
            j2 = j;
        } else {
            this.Y = -9223372036854775807L;
            j2 = j3;
        }
        o29 o29Var = this.o;
        int i = xxg.a;
        return o29Var.E(an5VarArr, zArr, ixdVarArr, zArr2, j2);
    }

    @Override // defpackage.gee
    public final void b(iee ieeVar) {
        m29 m29Var = this.X;
        int i = xxg.a;
        m29Var.b(this);
    }

    @Override // defpackage.m29
    public final void c(o29 o29Var) {
        m29 m29Var = this.X;
        int i = xxg.a;
        m29Var.c(this);
    }

    @Override // defpackage.iee
    public final long d() {
        o29 o29Var = this.o;
        int i = xxg.a;
        return o29Var.d();
    }

    @Override // defpackage.o29
    public final void f() {
        o29 o29Var = this.o;
        if (o29Var != null) {
            o29Var.f();
            return;
        }
        bk0 bk0Var = this.d;
        if (bk0Var != null) {
            bk0Var.g();
        }
    }

    @Override // defpackage.o29
    public final long h(long j) {
        o29 o29Var = this.o;
        int i = xxg.a;
        return o29Var.h(j);
    }

    @Override // defpackage.iee
    public final boolean j() {
        o29 o29Var = this.o;
        return o29Var != null && o29Var.j();
    }

    @Override // defpackage.o29
    public final long k() {
        o29 o29Var = this.o;
        int i = xxg.a;
        return o29Var.k();
    }

    @Override // defpackage.o29
    public final mfg l() {
        o29 o29Var = this.o;
        int i = xxg.a;
        return o29Var.l();
    }

    @Override // defpackage.iee
    public final long o() {
        o29 o29Var = this.o;
        int i = xxg.a;
        return o29Var.o();
    }

    @Override // defpackage.iee
    public final void p(long j) {
        o29 o29Var = this.o;
        int i = xxg.a;
        o29Var.p(j);
    }

    @Override // defpackage.o29
    public final long v(long j, j9e j9eVar) {
        o29 o29Var = this.o;
        int i = xxg.a;
        return o29Var.v(j, j9eVar);
    }

    @Override // defpackage.o29
    public final void y(long j) {
        o29 o29Var = this.o;
        int i = xxg.a;
        o29Var.y(j);
    }

    @Override // defpackage.iee
    public final boolean z(long j) {
        o29 o29Var = this.o;
        return o29Var != null && o29Var.z(j);
    }
}
