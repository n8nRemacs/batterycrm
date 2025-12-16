package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class uld extends HandlerThread {
    public final LinkedHashMap X;
    public final LinkedHashSet Y;
    public final ReentrantLock a;
    public final Condition b;
    public rc c;
    public iv6 d;
    public fde o;

    public uld() {
        super("OneVideoRenderThread", -8);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.a = reentrantLock;
        this.b = reentrantLock.newCondition();
        this.X = new LinkedHashMap();
        this.Y = new LinkedHashSet();
    }

    public final void a(vgb vgbVar, xo8 xo8Var, Handler handler) {
        if (!d()) {
            rc rcVarC = c();
            rcVarC.getClass();
            rcVarC.sendMessage(rcVarC.obtainMessage(0, new lld(vgbVar, xo8Var, handler)));
        } else {
            if (this.X.containsKey(vgbVar)) {
                return;
            }
            uid uidVar = new uid();
            fde fdeVar = this.o;
            if (fdeVar == null) {
                fdeVar = null;
            }
            fdeVar.C(new jh6(this, uidVar, handler, xo8Var, vgbVar, 2));
        }
    }

    public final void b(Object obj) {
        Object next;
        if (!d()) {
            rc rcVarC = c();
            rcVarC.sendMessage(rcVarC.obtainMessage(1, obj));
            return;
        }
        LinkedHashMap linkedHashMap = this.X;
        sld sldVar = (sld) linkedHashMap.get(obj);
        if (sldVar != null) {
            fde fdeVar = this.o;
            if (fdeVar == null) {
                fdeVar = null;
            }
            fdeVar.C(new qld(sldVar, 2));
            linkedHashMap.remove(obj);
            m2c m2cVar = sldVar.h;
            Iterator it = linkedHashMap.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((sld) next).h == m2cVar) {
                        break;
                    }
                }
            }
            if (next == null) {
                fde fdeVar2 = this.o;
                (fdeVar2 != null ? fdeVar2 : null).C(new ffb(28, m2cVar));
                m2cVar.getClass();
                this.Y.remove(m2cVar);
            }
        }
    }

    public final rc c() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        while (true) {
            try {
                rc rcVar = this.c;
                if (rcVar != null) {
                    return rcVar;
                }
                this.b.await();
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final boolean d() {
        rc rcVar = this.c;
        if ((rcVar != null ? rcVar.getLooper() : null) == null) {
            return false;
        }
        Looper looperMyLooper = Looper.myLooper();
        rc rcVar2 = this.c;
        return fni.a(looperMyLooper, rcVar2 != null ? rcVar2.getLooper() : null);
    }

    public final void e(Object obj) {
        if (!d()) {
            rc rcVarC = c();
            rcVarC.sendMessage(rcVarC.obtainMessage(4, obj));
            return;
        }
        sld sldVar = (sld) this.X.get(obj);
        if (sldVar != null) {
            sldVar.l = false;
            sldVar.e = false;
        }
    }

    public final void f(vgb vgbVar, Surface surface) {
        sld sldVar;
        if (!d()) {
            rc rcVarC = c();
            rcVarC.getClass();
            nld nldVar = new nld(vgbVar, surface);
            rcVarC.removeMessages(2, nldVar);
            rcVarC.sendMessage(rcVarC.obtainMessage(2, nldVar));
            return;
        }
        LinkedHashMap linkedHashMap = this.X;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!fni.a(entry.getKey(), vgbVar) && surface != null) {
                kw6 kw6Var = ((sld) entry.getValue()).k;
                if (fni.a(kw6Var != null ? (Surface) kw6Var.a : null, surface)) {
                    ((sld) entry.getValue()).c(null);
                }
            }
        }
        if ((surface == null || surface.isValid()) && (sldVar = (sld) linkedHashMap.get(vgbVar)) != null) {
            sldVar.c(surface);
        }
    }

    public final void g(vgb vgbVar, Size size) {
        kw6 kw6Var;
        Surface surface;
        kw6 kw6Var2;
        Surface surface2;
        if (!d()) {
            rc rcVarC = c();
            rcVarC.getClass();
            rcVarC.sendMessage(rcVarC.obtainMessage(5, new old(vgbVar, size)));
            return;
        }
        sld sldVar = (sld) this.X.get(vgbVar);
        if (sldVar == null || fni.a(sldVar.j, size)) {
            return;
        }
        sldVar.j = size;
        if (size != null) {
            if (!sldVar.e || size.getWidth() <= 0 || size.getHeight() <= 0) {
                size = null;
            }
            if (size != null) {
                kw6 kw6Var3 = sldVar.k;
                if ((kw6Var3 == null || (surface2 = (Surface) kw6Var3.a) == null || surface2.isValid()) && (kw6Var2 = sldVar.k) != null) {
                    kw6Var2.d(new uv1(sldVar, size, kw6Var2, 9));
                    return;
                }
                return;
            }
        }
        kw6 kw6Var4 = sldVar.k;
        if ((kw6Var4 == null || (surface = (Surface) kw6Var4.a) == null || surface.isValid()) && (kw6Var = sldVar.k) != null) {
            kw6Var.d(new iqb(19, kw6Var));
        }
    }

    @Override // android.os.HandlerThread
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        iv6 iv6Var = new iv6(18);
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (fni.a(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new RuntimeException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
            throw new RuntimeException("Unable to initialize EGL14");
        }
        iv6Var.b = eGLDisplayEglGetDisplay;
        this.d = iv6Var;
        fde fdeVar = new fde();
        EGLDisplay eGLDisplay = (EGLDisplay) iv6Var.b;
        fdeVar.a = eGLDisplay;
        EGLConfig eGLConfigC = gke.c(eGLDisplay, 4);
        fdeVar.b = eGLConfigC;
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfigC, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        if (fni.a(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
            gke.b("eglCreateContext", new int[0]);
        }
        fdeVar.c = eGLContextEglCreateContext;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, gke.c(eGLDisplay, 1), new int[]{12375, 1, 12374, 1, 12417, 12380, 12416, 12380, 12344}, 0);
        if (fni.a(eGLSurfaceEglCreatePbufferSurface, EGL14.EGL_NO_SURFACE)) {
            gke.b("eglCreatePbufferSurface", new int[0]);
        }
        fdeVar.d = eGLSurfaceEglCreatePbufferSurface;
        this.o = fdeVar;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.c = new rc(getLooper(), new WeakReference(this));
            Looper looper = getLooper();
            if (looper == null && (looper = Looper.myLooper()) == null) {
                looper = Looper.getMainLooper();
            }
            new Handler(looper);
            this.b.signal();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
    public final void run() {
        super.run();
        fde fdeVar = this.o;
        if (fdeVar == null) {
            fdeVar = null;
        }
        fdeVar.C(new ffb(27, this));
        this.X.clear();
        this.Y.clear();
        fde fdeVar2 = this.o;
        if (fdeVar2 == null) {
            fdeVar2 = null;
        }
        EGLDisplay eGLDisplay = (EGLDisplay) fdeVar2.a;
        if (!fni.a((EGLContext) fdeVar2.c, EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglDestroySurface(eGLDisplay, (EGLSurface) fdeVar2.d);
            gke.b("eglDestroySurface", new int[0]);
            fdeVar2.d = EGL14.EGL_NO_SURFACE;
            EGL14.eglDestroyContext(eGLDisplay, (EGLContext) fdeVar2.c);
            gke.b("eglDestroyContext", new int[0]);
            fdeVar2.c = EGL14.EGL_NO_CONTEXT;
        }
        iv6 iv6Var = this.d;
        iv6 iv6Var2 = iv6Var != null ? iv6Var : null;
        if (fni.a((EGLDisplay) iv6Var2.b, EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGL14.eglTerminate((EGLDisplay) iv6Var2.b);
        gke.b("eglTerminate", new int[0]);
        iv6Var2.b = EGL14.EGL_NO_DISPLAY;
        EGL14.eglReleaseThread();
        gke.b("eglReleaseThread", new int[0]);
    }
}
