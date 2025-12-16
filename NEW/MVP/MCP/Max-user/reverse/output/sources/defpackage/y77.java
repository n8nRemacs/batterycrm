package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class y77 implements x6f {
    public final xh6 a;
    public boolean b;
    public final /* synthetic */ a9 c;

    public y77(a9 a9Var) {
        this.c = a9Var;
        this.a = new xh6(((wv0) a9Var.e).m());
    }

    @Override // defpackage.x6f
    public long b(qu0 qu0Var, long j) throws IOException {
        a9 a9Var = this.c;
        try {
            return ((wv0) a9Var.e).b(qu0Var, j);
        } catch (IOException e) {
            ((qbd) a9Var.d).k();
            l();
            throw e;
        }
    }

    public final void l() {
        a9 a9Var = this.c;
        int i = a9Var.a;
        if (i == 6) {
            return;
        }
        if (i != 5) {
            throw new IllegalStateException("state: " + a9Var.a);
        }
        xh6 xh6Var = this.a;
        u9g u9gVar = xh6Var.e;
        xh6Var.e = u9g.d;
        u9gVar.a();
        u9gVar.b();
        a9Var.a = 6;
    }

    @Override // defpackage.x6f
    public final u9g m() {
        return this.a;
    }
}
