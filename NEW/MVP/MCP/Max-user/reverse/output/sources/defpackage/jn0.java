package defpackage;

/* loaded from: classes.dex */
public final class jn0 implements i9e {
    public final long X;
    public final mn0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long o;

    public jn0(mn0 mn0Var, long j, long j2, long j3, long j4, long j5) {
        this.a = mn0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.o = j4;
        this.X = j5;
    }

    @Override // defpackage.i9e
    public final boolean c() {
        return true;
    }

    @Override // defpackage.i9e
    public final g9e e(long j) {
        m9e m9eVar = new m9e(j, kn0.b(this.a.a(j), 0L, this.c, this.d, this.o, this.X));
        return new g9e(m9eVar, m9eVar);
    }

    @Override // defpackage.i9e
    public final long f() {
        return this.b;
    }
}
