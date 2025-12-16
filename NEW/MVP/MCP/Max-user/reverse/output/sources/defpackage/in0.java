package defpackage;

/* loaded from: classes.dex */
public final class in0 implements h9e {
    public final ln0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public in0(ln0 ln0Var, long j, long j2, long j3, long j4, long j5) {
        this.a = ln0Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.h9e
    public final boolean c() {
        return true;
    }

    @Override // defpackage.h9e
    public final f9e e(long j) {
        l9e l9eVar = new l9e(j, kn0.a(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
        return new f9e(l9eVar, l9eVar);
    }

    @Override // defpackage.h9e
    public final long f() {
        return this.b;
    }
}
