package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.CancellationSignal;
import android.view.Surface;
import java.util.concurrent.CancellationException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;

/* loaded from: classes.dex */
public final class r84 extends u08 implements em6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r84(Object obj, int i, Object obj2) {
        super(1);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Iterable, java.lang.Object] */
    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        EGLDisplay eGLDisplay;
        EGLConfig eGLConfig;
        switch (this.a) {
            case 0:
                ((CancellationSignal) this.b).cancel();
                ((x9f) this.c).cancel((CancellationException) null);
                return qqg.a;
            case 1:
                yg1 yg1Var = (yg1) obj;
                zg1 zg1Var = (zg1) this.b;
                yg1Var.d(zg1Var.a);
                Surface surface = (Surface) this.c;
                EGLSurface eGLSurfaceEglCreateWindowSurface = null;
                if (surface.isValid() && (eGLDisplay = yg1Var.e) != null && (eGLConfig = yg1Var.f) != null) {
                    eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
                    if (eGLSurfaceEglCreateWindowSurface == EGL14.EGL_NO_SURFACE) {
                        throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "createSurface()");
                    }
                    yg1Var.b(eGLSurfaceEglCreateWindowSurface);
                    GLES20.glPixelStorei(3317, 1);
                    int iIncrementAndGet = yg1.l.incrementAndGet();
                    yg1Var.a.log(yg1Var.j, "Surface created, total count is " + iIncrementAndGet);
                }
                zg1Var.a = eGLSurfaceEglCreateWindowSurface;
                return qqg.a;
            case 2:
                xo8 xo8Var = ((g0f) obj).a;
                kp1 kp1Var = (kp1) this.b;
                fje fjeVar = (fje) this.c;
                dj1 dj1Var = kp1Var.b;
                if (dj1Var.a.b() || fni.a(dj1Var.k, fjeVar)) {
                    dj1Var.g(fjeVar, xo8Var.b);
                    for (vi1 vi1Var : xo8Var.c) {
                        kp1Var.e.n.onStateChanged(vi1Var.b, vi1Var);
                    }
                }
                return qqg.a;
            default:
                ((ng0) this.b).d.b((y6d) this.c, "P2PNetworkStatusReporter", (String) obj);
                return qqg.a;
        }
    }
}
