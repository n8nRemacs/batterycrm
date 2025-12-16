package defpackage;

/* loaded from: classes.dex */
public final class x9g implements wpd {
    public final long b;
    public final wpd c;

    public x9g(long j, wpd wpdVar) {
        z5j.a("Timeout must be non-negative.", j >= 0);
        this.b = j;
        this.c = wpdVar;
    }

    @Override // defpackage.wpd
    public final long a() {
        return this.b;
    }

    @Override // defpackage.wpd
    public final vpd b(c32 c32Var) {
        vpd vpdVarB = this.c.b(c32Var);
        long j = this.b;
        return (j <= 0 || c32Var.c < j - vpdVarB.a) ? vpdVarB : vpd.d;
    }
}
