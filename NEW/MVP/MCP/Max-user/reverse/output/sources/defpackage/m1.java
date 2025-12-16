package defpackage;

/* loaded from: classes.dex */
public final class m1 extends woi {
    @Override // defpackage.woi
    public final boolean a(x1 x1Var, g1 g1Var, g1 g1Var2) {
        synchronized (x1Var) {
            try {
                if (x1Var.b != g1Var) {
                    return false;
                }
                x1Var.b = g1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.woi
    public final boolean b(x1 x1Var, Object obj, Object obj2) {
        synchronized (x1Var) {
            try {
                if (x1Var.a != obj) {
                    return false;
                }
                x1Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.woi
    public final boolean c(x1 x1Var, v1 v1Var, v1 v1Var2) {
        synchronized (x1Var) {
            try {
                if (x1Var.c != v1Var) {
                    return false;
                }
                x1Var.c = v1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.woi
    public final g1 e(x1 x1Var) {
        g1 g1Var;
        g1 g1Var2 = g1.d;
        synchronized (x1Var) {
            try {
                g1Var = x1Var.b;
                if (g1Var != g1Var2) {
                    x1Var.b = g1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g1Var;
    }

    @Override // defpackage.woi
    public final v1 f(x1 x1Var) {
        v1 v1Var;
        v1 v1Var2 = v1.c;
        synchronized (x1Var) {
            try {
                v1Var = x1Var.c;
                if (v1Var != v1Var2) {
                    x1Var.c = v1Var2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return v1Var;
    }

    @Override // defpackage.woi
    public final void g(v1 v1Var, v1 v1Var2) {
        v1Var.b = v1Var2;
    }

    @Override // defpackage.woi
    public final void h(v1 v1Var, Thread thread) {
        v1Var.a = thread;
    }
}
