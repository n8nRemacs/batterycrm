package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.util.SparseArray;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final /* synthetic */ class o72 implements a4h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o72(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.a4h
    public final void run() throws VideoFrameProcessingException, GlUtil$GlException {
        switch (this.a) {
            case 0:
                ((su6) ((hc8) this.b).b).e((tu6) this.c);
                return;
            case 1:
                ((rr4) this.b).a((qr4) this.c, true);
                return;
            case 2:
                ap5 ap5Var = (ap5) this.b;
                jp4 jp4Var = (jp4) this.c;
                ap5Var.w0 = 0;
                ap5Var.o = jp4Var;
                return;
            case 3:
                rz5 rz5Var = (rz5) this.b;
                esf esfVar = (esf) this.c;
                if (rz5Var.o == null && !Objects.equals(rz5Var.z, esfVar)) {
                    esf esfVar2 = rz5Var.z;
                    if (esfVar2 != null && (esfVar == null || !esfVar2.a.equals(esfVar.a))) {
                        EGLDisplay eGLDisplay = rz5Var.d;
                        if (rz5Var.B != null) {
                            try {
                                try {
                                    EGLContext eGLContext = rz5Var.e;
                                    EGLSurface eGLSurface = rz5Var.f;
                                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
                                    guf.c("Error making context current");
                                    guf.n(0, 1, 1);
                                    guf.m(eGLDisplay, rz5Var.B);
                                } catch (GlUtil$GlException e) {
                                    rz5Var.i.execute(new qz5(rz5Var, 2, e));
                                }
                            } finally {
                                rz5Var.B = null;
                            }
                        }
                    }
                    esf esfVar3 = rz5Var.z;
                    rz5Var.y = (esfVar3 != null && esfVar != null && esfVar3.b == esfVar.b && esfVar3.c == esfVar.c && esfVar3.d == esfVar.d) ? false : true;
                    rz5Var.z = esfVar;
                    return;
                }
                return;
            case 4:
                ggg gggVar = (ggg) this.b;
                h9g h9gVar = (h9g) this.c;
                ((su6) gggVar.o).d((xo8) gggVar.d, h9gVar.a, h9gVar.b);
                return;
            case 5:
                p3g p3gVar = (p3g) this.b;
                tu6 tu6Var = (tu6) this.c;
                b7a b7aVar = p3gVar.o;
                b7aVar.getClass();
                int i = tu6Var.a;
                guf.k();
                f7a f7aVar = b7aVar.a;
                SparseArray sparseArray = f7aVar.k;
                hsi.g(zxg.k(sparseArray, i));
                d7a d7aVar = (d7a) sparseArray.get(i);
                d7aVar.a.a(d7aVar.b);
                sparseArray.remove(i);
                f7aVar.b();
                return;
            default:
                iy1 iy1Var = (iy1) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                synchronized (iy1Var.e) {
                    iy1Var.b = false;
                }
                countDownLatch.countDown();
                return;
        }
    }
}
