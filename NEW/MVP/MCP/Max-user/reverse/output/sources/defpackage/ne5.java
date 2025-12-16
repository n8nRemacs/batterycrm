package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ne5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bf5 b;

    public /* synthetic */ ne5(bf5 bf5Var, int i) {
        this.a = i;
        this.b = bf5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bf5 bf5Var = this.b;
                bf5Var.h.execute(new ne5(bf5Var, 1));
                return;
            case 1:
                bf5 bf5Var2 = this.b;
                if (bf5Var2.v) {
                    gri.i(bf5Var2.a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                    bf5Var2.w = null;
                    bf5Var2.j();
                    bf5Var2.v = false;
                    return;
                }
                return;
            case 2:
                bf5 bf5Var3 = this.b;
                wsf.b(bf5Var3.a(), new r5j(17, bf5Var3), bf5Var3.h);
                return;
            case 3:
                bf5 bf5Var4 = this.b;
                int iV = az1.v(bf5Var4.D);
                if (iV == 1) {
                    bf5Var4.g();
                    return;
                } else {
                    if (iV == 6 || iV == 8) {
                        throw new IllegalStateException("Encoder is released");
                    }
                    return;
                }
            case 4:
                bf5 bf5Var5 = this.b;
                switch (az1.v(bf5Var5.D)) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        bf5Var5.f();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        bf5Var5.i(7);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(u45.t(bf5Var5.D)));
                }
            default:
                bf5 bf5Var6 = this.b;
                bf5Var6.A = true;
                if (bf5Var6.z) {
                    bf5Var6.e.stop();
                    bf5Var6.h();
                    return;
                }
                return;
        }
    }
}
