package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ch4 implements su6 {
    public final Context a;
    public final uy0 b;
    public jp4 c;
    public final gf3 d;
    public EGLDisplay i;
    public int j = -1;
    public int k = -1;
    public qu6 e = new jbe(17);
    public ru6 f = new mni();
    public pu6 g = new df3(19);
    public Executor h = dx4.a;

    public ch4(Context context, uy0 uy0Var, gf3 gf3Var) {
        this.a = context;
        this.b = uy0Var;
        this.d = gf3Var;
    }

    public final void a(int i, int i2) {
        if (this.i == null) {
            this.i = guf.o();
        }
        EGL14.eglGetCurrentContext();
        if (this.j == -1 || this.k == -1) {
            this.j = i;
            this.k = i2;
        }
        this.b.getClass();
        if (this.c == null) {
            u4j.a(4, "initialCapacity");
            Object[] objArrCopyOf = new Object[4];
            l8c l8cVarF = l8c.f(this.j, this.k);
            int iH = mg7.h(4, 1);
            if (iH > 4) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iH);
            }
            objArrCopyOf[0] = l8cVarF;
            zjd zjdVarH = wg7.h(1, objArrCopyOf);
            zjd zjdVar = zjd.o;
            gf3 gf3Var = this.d;
            this.c = jp4.k(this.a, zjdVarH, zjdVar, gf3Var, gf3Var.c == 1 ? 2 : 0);
        }
    }

    @Override // defpackage.su6
    public final void c() {
        this.f.a();
    }

    @Override // defpackage.su6
    public final void d(xo8 xo8Var, tu6 tu6Var, long j) {
        try {
            a(tu6Var.c, tu6Var.d);
            this.c.getClass();
            throw null;
        } catch (VideoFrameProcessingException | GlUtil$GlException e) {
            this.h.execute(new my1(this, e, j));
        }
    }

    @Override // defpackage.su6
    public final void e(tu6 tu6Var) {
        this.e.o(tu6Var);
        this.e.m();
    }

    @Override // defpackage.su6
    public final void f(Executor executor, jr4 jr4Var) {
        this.g = jr4Var;
        this.h = executor;
    }

    @Override // defpackage.su6
    public final void flush() {
        jp4 jp4Var = this.c;
        if (jp4Var != null) {
            jp4Var.flush();
        }
        this.e.y();
        this.e.m();
    }

    @Override // defpackage.su6
    public final void g(hc8 hc8Var) {
        this.f = hc8Var;
    }

    @Override // defpackage.su6
    public final void h(qu6 qu6Var) {
        this.e = qu6Var;
        qu6Var.m();
    }

    @Override // defpackage.su6
    public final void release() throws VideoFrameProcessingException {
        jp4 jp4Var = this.c;
        if (jp4Var != null) {
            jp4Var.release();
        }
        try {
            guf.d();
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }
}
