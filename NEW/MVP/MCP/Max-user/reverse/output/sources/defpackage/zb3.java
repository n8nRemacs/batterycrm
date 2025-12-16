package defpackage;

/* loaded from: classes.dex */
public final class zb3 implements jxd {
    public final jxd a;
    public boolean b;
    public final /* synthetic */ bc3 c;

    public zb3(bc3 bc3Var, jxd jxdVar) {
        this.c = bc3Var;
        this.a = jxdVar;
    }

    @Override // defpackage.jxd
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.jxd
    public final boolean e() {
        return !this.c.a() && this.a.e();
    }

    @Override // defpackage.jxd
    public final int g(long j) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.g(j);
    }

    @Override // defpackage.jxd
    public final int i(xt4 xt4Var, ph4 ph4Var, int i) {
        bc3 bc3Var = this.c;
        if (bc3Var.a()) {
            return -3;
        }
        if (this.b) {
            ph4Var.b = 4;
            return -4;
        }
        long jO = bc3Var.o();
        int i2 = this.a.i(xt4Var, ph4Var, i);
        if (i2 != -5) {
            long j = bc3Var.X;
            if (j == Long.MIN_VALUE || ((i2 != -4 || ph4Var.Y < j) && !(i2 == -3 && jO == Long.MIN_VALUE && !ph4Var.X))) {
                return i2;
            }
            ph4Var.w();
            ph4Var.b = 4;
            this.b = true;
            return -4;
        }
        hf6 hf6Var = (hf6) xt4Var.c;
        hf6Var.getClass();
        int i3 = hf6Var.J;
        int i4 = hf6Var.I;
        if (i4 == 0 && i3 == 0) {
            return -5;
        }
        if (bc3Var.o != 0) {
            i4 = 0;
        }
        if (bc3Var.X != Long.MIN_VALUE) {
            i3 = 0;
        }
        ff6 ff6VarA = hf6Var.a();
        ff6VarA.H = i4;
        ff6VarA.I = i3;
        xt4Var.c = new hf6(ff6VarA);
        return -5;
    }
}
