package defpackage;

/* loaded from: classes.dex */
public final class a3f implements gp5 {
    public kp5 X;
    public sfg Y;
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int o;

    public a3f(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        if (j == 0 || this.o == 1) {
            this.o = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        int i = this.b;
        int i2 = this.a;
        hsi.g((i2 == -1 || i == -1) ? false : true);
        umb umbVar = new umb(i);
        ip5Var.i(0, umbVar.a, i);
        return umbVar.D() == i2;
    }

    @Override // defpackage.gp5
    public final void release() {
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        this.X = kp5Var;
        sfg sfgVarMo163B = kp5Var.mo163B(1024, 4);
        this.Y = sfgVarMo163B;
        ff6 ff6Var = new ff6();
        String str = this.c;
        ff6Var.l = xz9.n(str);
        ff6Var.m = xz9.n(str);
        a9h.m(ff6Var, sfgVarMo163B);
        this.X.w();
        this.X.Q(new h3f());
        this.o = 1;
    }

    @Override // defpackage.gp5
    public final int y(ip5 ip5Var, n7 n7Var) {
        int i = this.o;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        sfg sfgVar = this.Y;
        sfgVar.getClass();
        int iC = sfgVar.c(ip5Var, 1024, true);
        if (iC != -1) {
            this.d += iC;
            return 0;
        }
        this.o = 2;
        this.Y.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }
}
