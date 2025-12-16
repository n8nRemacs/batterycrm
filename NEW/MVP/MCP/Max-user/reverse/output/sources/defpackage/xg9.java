package defpackage;

/* loaded from: classes.dex */
public final class xg9 implements ixd {
    public final ixd a;
    public final long b;

    public xg9(ixd ixdVar, long j) {
        this.a = ixdVar;
        this.b = j;
    }

    @Override // defpackage.ixd
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.ixd
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.ixd
    public final int g(long j) {
        return this.a.g(j - this.b);
    }

    @Override // defpackage.ixd
    public final int i(i5i i5iVar, oh4 oh4Var, int i) {
        int i2 = this.a.i(i5iVar, oh4Var, i);
        if (i2 == -4) {
            oh4Var.X = Math.max(0L, oh4Var.X + this.b);
        }
        return i2;
    }
}
