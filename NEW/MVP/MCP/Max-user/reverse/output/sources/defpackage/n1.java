package defpackage;

/* loaded from: classes.dex */
public final class n1 extends yoi {
    @Override // defpackage.yoi
    public final boolean a(y1 y1Var, h1 h1Var, h1 h1Var2) {
        synchronized (y1Var) {
            try {
                if (y1Var.b != h1Var) {
                    return false;
                }
                y1Var.b = h1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yoi
    public final boolean b(y1 y1Var, Object obj, Object obj2) {
        synchronized (y1Var) {
            try {
                if (y1Var.a != obj) {
                    return false;
                }
                y1Var.a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yoi
    public final boolean c(y1 y1Var, w1 w1Var, w1 w1Var2) {
        synchronized (y1Var) {
            try {
                if (y1Var.c != w1Var) {
                    return false;
                }
                y1Var.c = w1Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.yoi
    public final void g(w1 w1Var, w1 w1Var2) {
        w1Var.b = w1Var2;
    }

    @Override // defpackage.yoi
    public final void h(w1 w1Var, Thread thread) {
        w1Var.a = thread;
    }
}
