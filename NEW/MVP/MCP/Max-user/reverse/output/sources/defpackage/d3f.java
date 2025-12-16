package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class d3f implements jxd {
    public int a;
    public boolean b;
    public final /* synthetic */ f3f c;

    public d3f(f3f f3fVar) {
        this.c = f3fVar;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        f3f f3fVar = this.c;
        f3fVar.o.y(xz9.h(f3fVar.t0.n), f3fVar.t0, 0, null, 0L);
        this.b = true;
    }

    @Override // defpackage.jxd
    public final void b() throws IOException {
        f3f f3fVar = this.c;
        if (f3fVar.u0) {
            return;
        }
        f3fVar.s0.b();
    }

    @Override // defpackage.jxd
    public final boolean e() {
        return this.c.v0;
    }

    @Override // defpackage.jxd
    public final int g(long j) {
        a();
        if (j <= 0 || this.a == 2) {
            return 0;
        }
        this.a = 2;
        return 1;
    }

    @Override // defpackage.jxd
    public final int i(xt4 xt4Var, ph4 ph4Var, int i) {
        a();
        f3f f3fVar = this.c;
        boolean z = f3fVar.v0;
        if (z && f3fVar.w0 == null) {
            this.a = 2;
        }
        int i2 = this.a;
        if (i2 == 2) {
            ph4Var.a(4);
            return -4;
        }
        if ((i & 2) != 0 || i2 == 0) {
            xt4Var.c = f3fVar.t0;
            this.a = 1;
            return -5;
        }
        if (!z) {
            return -3;
        }
        f3fVar.w0.getClass();
        ph4Var.a(1);
        ph4Var.Y = 0L;
        if ((i & 4) == 0) {
            ph4Var.y(f3fVar.x0);
            ph4Var.o.put(f3fVar.w0, 0, f3fVar.x0);
        }
        if ((i & 1) == 0) {
            this.a = 2;
        }
        return -4;
    }
}
