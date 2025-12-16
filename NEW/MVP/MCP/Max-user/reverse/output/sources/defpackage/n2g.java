package defpackage;

/* loaded from: classes.dex */
public final class n2g {
    public final ybj a = new ybj();

    public n2g() {
    }

    public final void a(Exception exc) {
        this.a.n(exc);
    }

    public final void b(Object obj) {
        this.a.o(obj);
    }

    public final boolean c(Exception exc) {
        ybj ybjVar = this.a;
        ybjVar.getClass();
        s5j.h(exc, "Exception must not be null");
        synchronized (ybjVar.a) {
            try {
                if (ybjVar.c) {
                    return false;
                }
                ybjVar.c = true;
                ybjVar.f = exc;
                ybjVar.b.v(ybjVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Object obj) {
        this.a.q(obj);
    }

    public n2g(zkb zkbVar) {
        kme kmeVar = new kme(12, this);
        zkbVar.getClass();
        ((ybj) zkbVar.b).d(u2g.a, new hfd(15, kmeVar));
    }
}
