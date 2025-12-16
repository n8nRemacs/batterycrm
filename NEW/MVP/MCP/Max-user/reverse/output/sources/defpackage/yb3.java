package defpackage;

/* loaded from: classes.dex */
public final class yb3 implements ixd {
    public final ixd a;
    public boolean b;
    public final /* synthetic */ ac3 c;

    public yb3(ac3 ac3Var, ixd ixdVar) {
        this.c = ac3Var;
        this.a = ixdVar;
    }

    @Override // defpackage.ixd
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.ixd
    public final boolean e() {
        return !this.c.a() && this.a.e();
    }

    @Override // defpackage.ixd
    public final int g(long j) {
        if (this.c.a()) {
            return -3;
        }
        return this.a.g(j);
    }

    @Override // defpackage.ixd
    public final int i(i5i i5iVar, oh4 oh4Var, int i) {
        ac3 ac3Var = this.c;
        if (ac3Var.a()) {
            return -3;
        }
        if (this.b) {
            oh4Var.b = 4;
            return -4;
        }
        int i2 = this.a.i(i5iVar, oh4Var, i);
        if (i2 != -5) {
            long j = ac3Var.X;
            if (j == Long.MIN_VALUE || ((i2 != -4 || oh4Var.X < j) && !(i2 == -3 && ac3Var.o() == Long.MIN_VALUE && !oh4Var.o))) {
                return i2;
            }
            oh4Var.w();
            oh4Var.b = 4;
            this.b = true;
            return -4;
        }
        gf6 gf6Var = (gf6) i5iVar.b;
        gf6Var.getClass();
        int i3 = gf6Var.M0;
        int i4 = gf6Var.L0;
        if (i4 == 0 && i3 == 0) {
            return -5;
        }
        if (ac3Var.o != 0) {
            i4 = 0;
        }
        if (ac3Var.X != Long.MIN_VALUE) {
            i3 = 0;
        }
        ef6 ef6VarA = gf6Var.a();
        ef6VarA.A = i4;
        ef6VarA.B = i3;
        i5iVar.b = new gf6(ef6VarA);
        return -5;
    }
}
