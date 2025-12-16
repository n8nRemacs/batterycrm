package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class m45 {
    public l45 d;
    public final k45 f;
    public boolean a = false;
    public boolean b = false;
    public boolean c = true;
    public i45 e = null;

    public m45(gr6 gr6Var) {
        this.f = k45.c ? new k45() : k45.b;
        if (gr6Var != null) {
            j(gr6Var);
        }
    }

    public final void a() {
        if (this.a) {
            return;
        }
        k45 k45Var = this.f;
        j45 j45Var = j45.Y;
        k45Var.a(j45Var);
        this.a = true;
        i45 i45Var = this.e;
        if (i45Var != null) {
            v0 v0Var = (v0) i45Var;
            if (v0Var.h != null) {
                ml6.i();
                if (op5.a.h(2)) {
                    op5.f(v0.u, "controller %x %s: onAttach: %s", Integer.valueOf(System.identityHashCode(v0Var)), v0Var.j, v0Var.l ? "request already submitted" : "request needs submit");
                }
                v0Var.a.a(j45Var);
                v0Var.h.getClass();
                v0Var.b.a(v0Var);
                v0Var.k = true;
                if (!v0Var.l) {
                    v0Var.r();
                }
                ml6.i();
            }
        }
    }

    public final void b() {
        if (this.b && this.c) {
            a();
        } else {
            c();
        }
    }

    public final void c() {
        if (this.a) {
            k45 k45Var = this.f;
            j45 j45Var = j45.Z;
            k45Var.a(j45Var);
            this.a = false;
            if (e()) {
                v0 v0Var = (v0) this.e;
                v0Var.getClass();
                ml6.i();
                if (op5.a.h(2)) {
                    op5.e(v0.u, "controller %x %s: onDetach", Integer.valueOf(System.identityHashCode(v0Var)), v0Var.j);
                }
                v0Var.a.a(j45Var);
                v0Var.k = false;
                fs4 fs4Var = v0Var.b;
                fs4Var.getClass();
                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    synchronized (fs4Var.a) {
                        try {
                            if (!((ArrayList) fs4Var.c).contains(v0Var)) {
                                ((ArrayList) fs4Var.c).add(v0Var);
                                boolean z = ((ArrayList) fs4Var.c).size() == 1;
                                if (z) {
                                    ((Handler) fs4Var.b).post((ue) fs4Var.e);
                                }
                            }
                        } finally {
                        }
                    }
                } else {
                    v0Var.m();
                }
                ml6.i();
            }
        }
    }

    public final qsd d() {
        l45 l45Var = this.d;
        if (l45Var == null) {
            return null;
        }
        return ((gr6) l45Var).d;
    }

    public final boolean e() {
        i45 i45Var = this.e;
        return i45Var != null && ((v0) i45Var).h == this.d;
    }

    public final void f() {
        this.f.a(j45.y0);
        this.b = true;
        b();
    }

    public final void g() {
        this.f.a(j45.z0);
        this.b = false;
        b();
    }

    public final void h(boolean z) {
        if (this.c == z) {
            return;
        }
        this.f.a(z ? j45.A0 : j45.B0);
        this.c = z;
        b();
    }

    public final void i(i45 i45Var) {
        boolean z = this.a;
        if (z) {
            c();
        }
        boolean zE = e();
        k45 k45Var = this.f;
        if (zE) {
            k45Var.a(j45.d);
            ((b2c) this.e).u(null);
        }
        this.e = i45Var;
        if (i45Var != null) {
            k45Var.a(j45.c);
            ((b2c) this.e).u(this.d);
        } else {
            k45Var.a(j45.o);
        }
        if (z) {
            a();
        }
    }

    public final void j(l45 l45Var) {
        this.f.a(j45.a);
        boolean zE = e();
        qsd qsdVarD = d();
        if (qsdVarD != null) {
            qsdVarD.X = null;
        }
        l45Var.getClass();
        this.d = l45Var;
        qsd qsdVar = ((gr6) l45Var).d;
        h(qsdVar == null || qsdVar.isVisible());
        qsd qsdVarD2 = d();
        if (qsdVarD2 != null) {
            qsdVarD2.X = this;
        }
        if (zE) {
            ((b2c) this.e).u(l45Var);
        }
    }

    public final String toString() {
        hc8 hc8VarC = yyi.c(this);
        hc8VarC.p("controllerAttached", this.a);
        hc8VarC.p("holderAttached", this.b);
        hc8VarC.p("drawableVisible", this.c);
        hc8VarC.r(this.f.a.toString(), "events");
        return hc8VarC.toString();
    }
}
