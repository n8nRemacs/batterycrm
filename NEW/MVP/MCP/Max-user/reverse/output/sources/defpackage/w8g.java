package defpackage;

/* loaded from: classes.dex */
public final class w8g implements jxd {
    public final jxd a;
    public final long b;

    public w8g(jxd jxdVar, long j) {
        this.a = jxdVar;
        this.b = j;
    }

    @Override // defpackage.jxd
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.jxd
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.jxd
    public final int g(long j) {
        return this.a.g(j - this.b);
    }

    @Override // defpackage.jxd
    public final int i(xt4 xt4Var, ph4 ph4Var, int i) {
        int i2 = this.a.i(xt4Var, ph4Var, i);
        if (i2 == -4) {
            ph4Var.Y += this.b;
        }
        return i2;
    }
}
