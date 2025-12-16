package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class d4 extends hj0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d4(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.hj0
    public final void d() {
        switch (this.b) {
            case 0:
                tc3 tc3Var = (tc3) this.c;
                synchronized (tc3Var) {
                    l5j.f(tc3Var.f());
                }
                return;
            default:
                try {
                    ml6.i();
                    g7a g7aVar = (g7a) this.c;
                    synchronized (g7aVar) {
                        try {
                            if (g7aVar.g == this) {
                                g7aVar.g = null;
                                g7aVar.f = null;
                                g7a.b(g7aVar.c);
                                g7aVar.c = null;
                                g7aVar.i(3);
                            }
                        } finally {
                        }
                    }
                    return;
                } finally {
                    ml6.i();
                }
        }
    }

    @Override // defpackage.hj0
    public final void f(Throwable th) {
        switch (this.b) {
            case 0:
                tc3 tc3Var = (tc3) this.c;
                kke kkeVar = tc3Var.h;
                if (tc3Var.i(th, kkeVar.X)) {
                    tc3Var.i.f(kkeVar, th);
                    return;
                }
                return;
            default:
                try {
                    ml6.i();
                    ((g7a) this.c).f(this, th);
                    return;
                } finally {
                    ml6.i();
                }
        }
    }

    @Override // defpackage.hj0
    public final void h(int i, Object obj) {
        switch (this.b) {
            case 0:
                tc3 tc3Var = (tc3) this.c;
                kke kkeVar = tc3Var.h;
                switch (tc3Var.j) {
                    case 0:
                        tc3Var.n(vc3.y((vc3) obj), i, kkeVar);
                        return;
                    default:
                        tc3Var.n(obj, i, kkeVar);
                        return;
                }
            default:
                Closeable closeable = (Closeable) obj;
                try {
                    ml6.i();
                    ((g7a) this.c).g(this, closeable, i);
                    return;
                } finally {
                    ml6.i();
                }
        }
    }

    @Override // defpackage.hj0
    public final void j(float f) {
        switch (this.b) {
            case 0:
                ((tc3) this.c).j(f);
                return;
            default:
                try {
                    ml6.i();
                    ((g7a) this.c).h(this, f);
                    return;
                } finally {
                    ml6.i();
                }
        }
    }
}
