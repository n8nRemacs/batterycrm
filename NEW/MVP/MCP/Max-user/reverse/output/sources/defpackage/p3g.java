package defpackage;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p3g extends j3 {
    public yj6 X;
    public final xo8 Y;
    public ggg d;
    public b7a o;

    public p3g(xo8 xo8Var, iy1 iy1Var) {
        super(iy1Var);
        this.Y = xo8Var;
    }

    @Override // defpackage.j3
    public final synchronized void f() {
        ggg gggVar = this.d;
        gggVar.getClass();
        gggVar.y();
        super.f();
    }

    @Override // defpackage.j3
    public final int h() {
        int size;
        ggg gggVar = this.d;
        gggVar.getClass();
        synchronized (gggVar) {
            size = ((ArrayDeque) gggVar.c).size();
        }
        return size;
    }

    @Override // defpackage.j3
    public final void l(final int i, final long j) {
        final yj6 yj6Var = this.X;
        yj6Var.getClass();
        this.o.getClass();
        ((iy1) this.a).g(new a4h() { // from class: o3g
            @Override // defpackage.a4h
            public final void run() {
                p3g p3gVar = this.a;
                int i2 = i;
                yj6 yj6Var2 = yj6Var;
                long j2 = j;
                hf6 hf6Var = yj6Var2.a;
                tu6 tu6Var = new tu6(i2, -1, hf6Var.u, hf6Var.v);
                ggg gggVar = p3gVar.d;
                gggVar.getClass();
                gggVar.a0(tu6Var, j2);
                int i3 = yj6Var2.a.u;
                LinkedHashMap linkedHashMap = ah4.a;
                synchronized (ah4.class) {
                }
            }
        }, true);
    }

    @Override // defpackage.qu6
    public final void m() {
        this.d.getClass();
        iy1 iy1Var = (iy1) this.a;
        ggg gggVar = this.d;
        Objects.requireNonNull(gggVar);
        iy1Var.g(new mr4(3, gggVar), true);
    }

    @Override // defpackage.qu6
    public final void o(tu6 tu6Var) {
        ((iy1) this.a).g(new o72(this, 5, tu6Var), true);
    }

    @Override // defpackage.j3
    public final void q() {
    }

    @Override // defpackage.j3
    public final void u(yj6 yj6Var, boolean z) {
        this.X = yj6Var;
    }

    @Override // defpackage.j3
    public final void v(b7a b7aVar) {
        this.o = b7aVar;
    }

    @Override // defpackage.j3
    public final void w(jp4 jp4Var) {
        this.d = new ggg(this.Y, jp4Var, (iy1) this.a);
    }

    @Override // defpackage.j3
    public final void x() {
        ((iy1) this.a).g(new mr4(2, this), true);
    }
}
