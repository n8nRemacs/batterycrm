package defpackage;

import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class tj0 implements su6 {
    public final rs0 a;
    public qu6 b;
    public ru6 c;
    public pu6 d = new uy0(17);
    public Executor e = dx4.a;
    public int f = -1;
    public int g = -1;

    public tj0(boolean z, int i) {
        this.a = new rs0(z, i);
        int i2 = 14;
        this.b = new v17(i2, (byte) 0);
        this.c = new v1a(i2);
    }

    public abstract c4f a(int i, int i2);

    public abstract void b(int i, long j);

    @Override // defpackage.su6
    public void c() {
        this.c.a();
    }

    @Override // defpackage.su6
    public void d(xo8 xo8Var, tu6 tu6Var, long j) {
        try {
            int i = this.f;
            int i2 = tu6Var.c;
            int i3 = tu6Var.d;
            rs0 rs0Var = this.a;
            if (i != i2 || this.g != i3 || !((gt7) rs0Var.k()).hasNext()) {
                int i4 = tu6Var.c;
                this.f = i4;
                this.g = i3;
                c4f c4fVarA = a(i4, i3);
                rs0Var.i(xo8Var, c4fVarA.a, c4fVarA.b);
            }
            tu6 tu6VarL = rs0Var.l();
            guf.n(tu6VarL.b, tu6VarL.c, tu6VarL.d);
            if (i()) {
                guf.f();
            }
            b(tu6Var.a, j);
            this.b.o(tu6Var);
            this.c.w(tu6VarL, j);
        } catch (VideoFrameProcessingException e) {
            e = e;
            this.e.execute(new ud(this, 15, e));
        } catch (GlUtil$GlException e2) {
            e = e2;
            this.e.execute(new ud(this, 15, e));
        }
    }

    @Override // defpackage.su6
    public void e(tu6 tu6Var) {
        rs0 rs0Var = this.a;
        if (((ArrayDeque) rs0Var.e).contains(tu6Var)) {
            ArrayDeque arrayDeque = (ArrayDeque) rs0Var.e;
            hsi.g(arrayDeque.contains(tu6Var));
            arrayDeque.remove(tu6Var);
            ((ArrayDeque) rs0Var.d).add(tu6Var);
            this.b.m();
        }
    }

    @Override // defpackage.su6
    public final void f(Executor executor, jr4 jr4Var) {
        this.e = executor;
        this.d = jr4Var;
    }

    @Override // defpackage.su6
    public void flush() {
        rs0 rs0Var = this.a;
        ArrayDeque arrayDeque = (ArrayDeque) rs0Var.d;
        ArrayDeque arrayDeque2 = (ArrayDeque) rs0Var.e;
        arrayDeque.addAll(arrayDeque2);
        arrayDeque2.clear();
        this.b.y();
        for (int i = 0; i < rs0Var.b; i++) {
            this.b.m();
        }
    }

    @Override // defpackage.su6
    public final void g(hc8 hc8Var) {
        this.c = hc8Var;
    }

    @Override // defpackage.su6
    public final void h(qu6 qu6Var) {
        this.b = qu6Var;
        for (int i = 0; i < this.a.j(); i++) {
            qu6Var.m();
        }
    }

    public boolean i() {
        return true;
    }
}
