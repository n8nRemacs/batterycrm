package defpackage;

/* loaded from: classes.dex */
public final class z77 implements b4f {
    public final xh6 a;
    public boolean b;
    public final /* synthetic */ a9 c;

    public z77(a9 a9Var) {
        this.c = a9Var;
        this.a = new xh6(((vv0) a9Var.f).m());
    }

    @Override // defpackage.b4f
    public final void L(qu0 qu0Var, long j) {
        vv0 vv0Var = (vv0) this.c.f;
        if (this.b) {
            throw new IllegalStateException("closed");
        }
        if (j == 0) {
            return;
        }
        vv0Var.N(j);
        vv0Var.I("\r\n");
        vv0Var.L(qu0Var, j);
        vv0Var.I("\r\n");
    }

    @Override // defpackage.b4f, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((vv0) this.c.f).I("0\r\n\r\n");
        xh6 xh6Var = this.a;
        u9g u9gVar = xh6Var.e;
        xh6Var.e = u9g.d;
        u9gVar.a();
        u9gVar.b();
        this.c.a = 3;
    }

    @Override // defpackage.b4f, java.io.Flushable
    public final synchronized void flush() {
        if (this.b) {
            return;
        }
        ((vv0) this.c.f).flush();
    }

    @Override // defpackage.b4f
    public final u9g m() {
        return this.a;
    }
}
