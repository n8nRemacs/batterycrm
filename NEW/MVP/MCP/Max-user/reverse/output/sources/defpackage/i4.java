package defpackage;

/* loaded from: classes.dex */
public final class i4 extends gpi {
    @Override // defpackage.gpi
    public final boolean a(k4 k4Var, g4 g4Var, g4 g4Var2) {
        synchronized (k4Var) {
            try {
                if (k4Var.b != g4Var) {
                    return false;
                }
                k4Var.b = g4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gpi
    public final boolean b(k4 k4Var, Object obj, Object obj2) {
        synchronized (k4Var) {
            try {
                if (k4Var.a != obj) {
                    return false;
                }
                k4Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gpi
    public final boolean c(k4 k4Var, j4 j4Var, j4 j4Var2) {
        synchronized (k4Var) {
            try {
                if (k4Var.c != j4Var) {
                    return false;
                }
                k4Var.c = j4Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gpi
    public final void f(j4 j4Var, j4 j4Var2) {
        j4Var.b = j4Var2;
    }

    @Override // defpackage.gpi
    public final void g(j4 j4Var, Thread thread) {
        j4Var.a = thread;
    }
}
