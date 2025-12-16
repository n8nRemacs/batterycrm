package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class kk3 extends hk3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ kk3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hk3
    public final void g(rk3 rk3Var) {
        switch (this.a) {
            case 0:
                jk3 jk3Var = new jk3(0, rk3Var);
                rk3Var.c(jk3Var);
                try {
                    ((sk3) this.b).c(jk3Var);
                    break;
                } catch (Throwable th) {
                    raj.c(th);
                    if (jk3Var.a(th)) {
                        return;
                    }
                    t8j.a(th);
                    return;
                }
            case 1:
                py4 z6Var = new z6(1, pdf.c);
                rk3Var.c(z6Var);
                if (!z6Var.e()) {
                    try {
                        ((p6) this.b).run();
                        if (!z6Var.e()) {
                            rk3Var.b();
                            break;
                        }
                    } catch (Throwable th2) {
                        raj.c(th2);
                        if (z6Var.e()) {
                            t8j.a(th2);
                            return;
                        } else {
                            rk3Var.onError(th2);
                            return;
                        }
                    }
                }
                break;
            case 2:
                py4 z6Var2 = new z6(1, pdf.c);
                rk3Var.c(z6Var2);
                try {
                    ((Callable) this.b).call();
                    if (!z6Var2.e()) {
                        rk3Var.b();
                        break;
                    }
                } catch (Throwable th3) {
                    raj.c(th3);
                    if (z6Var2.e()) {
                        t8j.a(th3);
                        return;
                    } else {
                        rk3Var.onError(th3);
                        return;
                    }
                }
                break;
            default:
                ((e2f) this.b).k(new h08(11, rk3Var));
                break;
        }
    }
}
