package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class tu1 {
    public Object a;
    public wu1 b;
    public dod c;
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        dod dodVar = this.c;
        if (dodVar != null) {
            dodVar.d(runnable, executor);
        }
    }

    public final boolean b(Object obj) {
        this.d = true;
        wu1 wu1Var = this.b;
        boolean z = wu1Var != null && wu1Var.b.l(obj);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void c() {
        this.d = true;
        wu1 wu1Var = this.b;
        if (wu1Var == null || !wu1Var.b.cancel(true)) {
            return;
        }
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final boolean d(Throwable th) {
        this.d = true;
        wu1 wu1Var = this.b;
        boolean z = wu1Var != null && wu1Var.b.m(th);
        if (z) {
            this.a = null;
            this.b = null;
            this.c = null;
        }
        return z;
    }

    public final void finalize() {
        dod dodVar;
        wu1 wu1Var = this.b;
        if (wu1Var != null) {
            vu1 vu1Var = wu1Var.b;
            if (!vu1Var.isDone()) {
                vu1Var.m(new d1("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a, 3));
            }
        }
        if (this.d || (dodVar = this.c) == null) {
            return;
        }
        dodVar.l(null);
    }
}
