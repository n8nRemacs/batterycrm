package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class rz5 implements su6, vu6 {
    public EGLSurface B;
    public final Context a;
    public final EGLDisplay d;
    public final EGLContext e;
    public final EGLSurface f;
    public final gf3 g;
    public final iy1 h;
    public final Executor i;
    public final d4h j;
    public final rs0 l;
    public final ry m;
    public final ry n;
    public final uu6 o;
    public final boolean p;
    public int q;
    public int r;
    public jp4 s;
    public boolean t;
    public c4f v;
    public fs4 w;
    public boolean x;
    public boolean y;
    public esf z;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public qu6 u = new b6a(20);
    public final ConcurrentLinkedQueue k = new ConcurrentLinkedQueue();
    public long A = -9223372036854775807L;

    public rz5(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, gf3 gf3Var, iy1 iy1Var, Executor executor, d4h d4hVar, uu6 uu6Var, int i, boolean z) {
        this.a = context;
        this.d = eGLDisplay;
        this.e = eGLContext;
        this.f = eGLSurface;
        this.g = gf3Var;
        this.h = iy1Var;
        this.i = executor;
        this.j = d4hVar;
        this.o = uu6Var;
        this.p = z;
        this.l = new rs0(gf3.h(gf3Var), i);
        this.m = new ry(i);
        this.n = new ry(i);
    }

    @Override // defpackage.vu6
    public final void a(long j) {
        this.h.g(new dr4(this, j, 2), true);
    }

    public final boolean b(xo8 xo8Var, int i, int i2) throws VideoFrameProcessingException, GlUtil$GlException {
        boolean z = (this.q == i && this.r == i2 && this.v != null) ? false : true;
        ArrayList arrayList = this.b;
        if (z) {
            this.q = i;
            this.r = i2;
            c4f c4fVarF = pei.f(arrayList, i, i2);
            if (!Objects.equals(this.v, c4fVarF)) {
                this.v = c4fVarF;
                this.i.execute(new qz5(this, 3, c4fVarF));
            }
        }
        this.v.getClass();
        esf esfVar = this.z;
        uu6 uu6Var = this.o;
        if (esfVar == null && uu6Var == null) {
            hsi.g(this.B == null);
            jp4 jp4Var = this.s;
            if (jp4Var != null) {
                jp4Var.release();
                this.s = null;
            }
            a8i.l("FinalShaderWrapper", "Output surface and size not set, dropping frame.");
            return false;
        }
        int i3 = esfVar == null ? this.v.a : esfVar.b;
        int i4 = esfVar == null ? this.v.b : esfVar.c;
        gf3 gf3Var = this.g;
        if (esfVar != null && this.B == null) {
            this.B = xo8Var.w(this.d, esfVar.a, gf3Var.c, esfVar.e);
        }
        if (uu6Var != null) {
            this.l.i(xo8Var, i3, i4);
        }
        jp4 jp4Var2 = this.s;
        if (jp4Var2 != null && (this.y || z || this.x)) {
            jp4Var2.release();
            this.s = null;
            this.y = false;
            this.x = false;
        }
        if (this.s == null) {
            esf esfVar2 = this.z;
            int i5 = esfVar2 == null ? 0 : esfVar2.d;
            tg7 tg7Var = new tg7(4);
            tg7Var.d(arrayList);
            if (i5 != 0) {
                float f = i5 % 360.0f;
                if (f < 0.0f) {
                    f += 360.0f;
                }
                tg7Var.a(new pyd(f));
            }
            tg7Var.a(l8c.f(i3, i4));
            jp4 jp4VarK = jp4.k(this.a, tg7Var.i(), this.c, gf3Var, 0);
            c4f c4fVarF2 = pei.f(jp4VarK.i, this.q, this.r);
            esf esfVar3 = this.z;
            if (esfVar3 != null) {
                hsi.g(c4fVarF2.a == esfVar3.b);
                hsi.g(c4fVarF2.b == esfVar3.c);
            }
            this.s = jp4VarK;
            this.y = false;
        }
        return true;
    }

    @Override // defpackage.su6
    public final void c() {
        this.h.i();
        if (!this.k.isEmpty()) {
            hsi.g(!this.p);
            this.t = true;
        } else {
            fs4 fs4Var = this.w;
            fs4Var.getClass();
            fs4Var.h();
            this.t = false;
        }
    }

    @Override // defpackage.su6
    public final void d(xo8 xo8Var, tu6 tu6Var, final long j) {
        this.h.i();
        long j2 = this.A;
        Executor executor = this.i;
        if (j2 == -9223372036854775807L) {
            final int i = 0;
            executor.execute(new Runnable(this) { // from class: pz5
                public final /* synthetic */ rz5 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            this.b.j.p(j, false);
                            break;
                        default:
                            this.b.j.p(j, true);
                            break;
                    }
                }
            });
        }
        if (this.o != null) {
            hsi.g(this.l.j() > 0);
            i(xo8Var, tu6Var, j, j * 1000);
            return;
        }
        if (this.p) {
            i(xo8Var, tu6Var, j, j * 1000);
        } else {
            h9g h9gVar = new h9g(tu6Var, j);
            ConcurrentLinkedQueue concurrentLinkedQueue = this.k;
            concurrentLinkedQueue.add(h9gVar);
            long j3 = this.A;
            if (j3 != -9223372036854775807L) {
                if (j == j3) {
                    this.A = -9223372036854775807L;
                    final int i2 = 1;
                    executor.execute(new Runnable(this) { // from class: pz5
                        public final /* synthetic */ rz5 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    this.b.j.p(j, false);
                                    break;
                                default:
                                    this.b.j.p(j, true);
                                    break;
                            }
                        }
                    });
                    i(xo8Var, tu6Var, j, System.nanoTime());
                    concurrentLinkedQueue.clear();
                } else {
                    this.u.o(tu6Var);
                }
            }
        }
        this.u.m();
    }

    @Override // defpackage.su6
    public final void e(tu6 tu6Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.su6
    public final void f(Executor executor, jr4 jr4Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.su6
    public final void flush() {
        this.h.i();
        rs0 rs0Var = this.l;
        int i = 0;
        uu6 uu6Var = this.o;
        if (uu6Var != null) {
            ArrayDeque arrayDeque = (ArrayDeque) rs0Var.d;
            ArrayDeque arrayDeque2 = (ArrayDeque) rs0Var.e;
            arrayDeque.addAll(arrayDeque2);
            arrayDeque2.clear();
            ry ryVar = this.m;
            ryVar.b = 0;
            ryVar.c = -1;
            ryVar.d = 0;
            ry ryVar2 = this.n;
            ryVar2.b = 0;
            ryVar2.c = -1;
            ryVar2.d = 0;
        }
        this.k.clear();
        this.t = false;
        jp4 jp4Var = this.s;
        if (jp4Var != null) {
            jp4Var.flush();
        }
        this.u.y();
        while (true) {
            if (i >= (uu6Var == null ? 1 : rs0Var.j())) {
                return;
            }
            this.u.m();
            i++;
        }
    }

    @Override // defpackage.su6
    public final void g(hc8 hc8Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.su6
    public final void h(qu6 qu6Var) {
        this.h.i();
        this.u = qu6Var;
        int i = 0;
        while (true) {
            if (i >= (this.o == null ? 1 : this.l.j())) {
                return;
            }
            qu6Var.m();
            i++;
        }
    }

    public final void i(xo8 xo8Var, tu6 tu6Var, long j, long j2) {
        tu6 tu6Var2;
        rz5 rz5Var;
        try {
        } catch (VideoFrameProcessingException e) {
            e = e;
        } catch (GlUtil$GlException e2) {
            e = e2;
        }
        if (j2 != -2) {
            try {
            } catch (VideoFrameProcessingException e3) {
                e = e3;
                rz5Var = this;
                tu6Var2 = tu6Var;
                rz5Var.i.execute(new qz5(this, e, j));
                rz5Var.u.o(tu6Var2);
                return;
            } catch (GlUtil$GlException e4) {
                e = e4;
                rz5Var = this;
                tu6Var2 = tu6Var;
                rz5Var.i.execute(new qz5(this, e, j));
                rz5Var.u.o(tu6Var2);
                return;
            }
            if (b(xo8Var, tu6Var.c, tu6Var.d)) {
                long j3 = this.A;
                if (!(j3 != -9223372036854775807L) || j == j3) {
                    if (this.z != null) {
                        rz5Var = this;
                        tu6Var2 = tu6Var;
                        rz5Var.j(tu6Var2, j, j2);
                    } else {
                        rz5Var = this;
                        tu6Var2 = tu6Var;
                        if (rz5Var.o != null) {
                            k(tu6Var2, j);
                        }
                    }
                    rz5Var.u.o(tu6Var2);
                    return;
                }
            }
        }
        this.u.o(tu6Var);
        if (j2 == -2) {
            fs4 fs4Var = this.w;
            fs4Var.getClass();
            emd emdVar = (emd) fs4Var.d;
            if (emdVar == null) {
                return;
            }
            emdVar.j(j);
        }
    }

    public final void j(tu6 tu6Var, long j, long j2) throws VideoFrameProcessingException, GlUtil$GlException {
        EGLSurface eGLSurface = this.B;
        eGLSurface.getClass();
        esf esfVar = this.z;
        esfVar.getClass();
        jp4 jp4Var = this.s;
        jp4Var.getClass();
        int i = esfVar.b;
        int i2 = esfVar.c;
        EGLDisplay eGLDisplay = this.d;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.e);
        guf.c("Error making context current");
        guf.n(0, i, i2);
        guf.f();
        jp4Var.b(tu6Var.a, j);
        if (j2 == -3) {
            hsi.g(j != -9223372036854775807L);
            j2 = 1000 * j;
        }
        EGLExt.eglPresentationTimeANDROID(eGLDisplay, eGLSurface, j2);
        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
        fs4 fs4Var = this.w;
        fs4Var.getClass();
        emd emdVar = (emd) fs4Var.d;
        if (emdVar != null) {
            emdVar.j(j);
        }
        ah4.a();
    }

    public final void k(tu6 tu6Var, long j) throws VideoFrameProcessingException, GlUtil$GlException {
        tu6 tu6VarL = this.l.l();
        this.m.e(j);
        guf.n(tu6VarL.b, tu6VarL.c, tu6VarL.d);
        guf.f();
        jp4 jp4Var = this.s;
        jp4Var.getClass();
        jp4Var.b(tu6Var.a, j);
        this.n.e(guf.k());
        uu6 uu6Var = this.o;
        uu6Var.getClass();
        uu6Var.a(this, tu6VarL, j);
    }

    @Override // defpackage.su6
    public final void release() throws VideoFrameProcessingException {
        this.h.i();
        jp4 jp4Var = this.s;
        if (jp4Var != null) {
            jp4Var.release();
        }
        try {
            this.l.h();
            guf.m(this.d, this.B);
            guf.d();
        } catch (GlUtil$GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }
}
