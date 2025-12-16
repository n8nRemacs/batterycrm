package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* loaded from: classes2.dex */
public final class yg1 {
    public static final AtomicInteger l = new AtomicInteger(0);
    public final y6d a;
    public final ts9 b;
    public final HandlerThread c;
    public EGLContext d;
    public EGLDisplay e;
    public EGLConfig f;
    public EGLSurface g;
    public final Object h;
    public boolean i;
    public final String j;
    public final vba k;

    public yg1(y6d y6dVar, EGLContext eGLContext, int[] iArr, ts9 ts9Var, String str) {
        this.a = y6dVar;
        this.b = ts9Var;
        HandlerThread handlerThread = new HandlerThread((str == null ? "VoipGLRenderer" : str).concat("Thread"));
        this.c = handlerThread;
        this.g = EGL14.EGL_NO_SURFACE;
        Object obj = new Object();
        this.h = obj;
        String str2 = str == null ? "CallOpenGL" : str;
        this.j = str2;
        handlerThread.start();
        vba vbaVar = new vba(handlerThread.getLooper(), y6dVar, str2.concat("_timings"), new jx0(1, this, yg1.class, "processError", "processError(Ljava/lang/Throwable;)V", 0, 25));
        this.k = vbaVar;
        y6dVar.log(str2, "OpenGL context initialization requested");
        synchronized (obj) {
            if (this.i) {
                y6dVar.log(str2, "OpenGL context is already initialized");
                return;
            }
            this.i = true;
            vbaVar.postAtFrontOfQueue(new cj(this, iArr, eGLContext, 11));
            y6dVar.log(str2, "OpenGL context initialization task submitted");
        }
    }

    public static void a(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != 12288) {
            throw new CallOpenGLContext$CallOpenGLContextGLException(iEglGetError, str);
        }
    }

    public final void b(EGLSurface eGLSurface) {
        if (eGLSurface == EGL14.EGL_NO_SURFACE) {
            throw new CallOpenGLContext$CallOpenGLContextException("Wrong surface in makeCurrent()");
        }
        EGLContext eGLContext = this.d;
        if (eGLContext == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        EGLDisplay eGLDisplay = this.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        if (fni.a(EGL14.eglGetCurrentContext(), this.d) && fni.a(this.g, eGLSurface)) {
            return;
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
            throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "makeCurrent()");
        }
        this.g = eGLSurface;
    }

    public final boolean c(em6 em6Var) {
        try {
            return this.k.postAtFrontOfQueue(new xg1(em6Var, this, 1));
        } catch (IllegalStateException e) {
            this.a.reportException(this.j, "OpenGL tread died, is it fine?", e);
            return false;
        }
    }

    public final void d(EGLSurface eGLSurface) {
        if (eGLSurface == null || eGLSurface == EGL14.EGL_NO_SURFACE) {
            return;
        }
        EGLDisplay eGLDisplay = this.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        this.a.log(this.j, "Surface destroyed, total count is " + l.decrementAndGet());
    }
}
