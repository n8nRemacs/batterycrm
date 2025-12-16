package defpackage;

/* loaded from: classes.dex */
public final class go4 implements gp5 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public go4(int i) {
        if ((i & 1) != 0) {
            this.b = new a3f(65496, 2, "image/jpeg");
        } else {
            this.b = new kv7();
        }
    }

    private final void a() {
    }

    private final void b(long j, long j2) {
    }

    @Override // defpackage.gp5
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((gp5) this.b).d(j, j2);
                break;
        }
    }

    @Override // defpackage.gp5
    public final boolean i(ip5 ip5Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((gp5) this.b).i(ip5Var);
        }
    }

    @Override // defpackage.gp5
    public final void release() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((gp5) this.b).release();
                break;
        }
    }

    @Override // defpackage.gp5
    public final void w(kp5 kp5Var) {
        switch (this.a) {
            case 0:
                sfg sfgVarMo163B = kp5Var.mo163B(0, 3);
                kp5Var.Q(new ge0(-9223372036854775807L));
                kp5Var.w();
                hf6 hf6Var = (hf6) this.b;
                ff6 ff6VarA = hf6Var.a();
                ff6VarA.m = xz9.n("text/x-unknown");
                ff6VarA.j = hf6Var.n;
                a9h.m(ff6VarA, sfgVarMo163B);
                break;
            default:
                ((gp5) this.b).w(kp5Var);
                break;
        }
    }

    @Override // defpackage.gp5
    public final int y(ip5 ip5Var, n7 n7Var) {
        switch (this.a) {
            case 0:
                return ip5Var.v(Integer.MAX_VALUE) == -1 ? -1 : 0;
            default:
                return ((gp5) this.b).y(ip5Var, n7Var);
        }
    }

    public go4(hf6 hf6Var) {
        this.b = hf6Var;
    }
}
