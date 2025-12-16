package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* loaded from: classes.dex */
public final class p65 extends Surface {
    public static int d;
    public static boolean o;
    public final boolean a;
    public final o65 b;
    public boolean c;

    public p65(o65 o65Var, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = o65Var;
        this.a = z;
    }

    public static int a(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i = xxg.a;
        if (i >= 24 && ((i >= 26 || !("samsung".equals(xxg.c) || "XT1650".equals(xxg.d))) && ((i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!o) {
                d = a(context);
                o = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return d != 0;
    }

    public static p65 c(Context context, boolean z) {
        boolean z2 = false;
        fsi.d(!z || b(context));
        o65 o65Var = new o65("ExoPlayer:DummySurface", 0);
        int i = z ? d : 0;
        o65Var.start();
        Handler handler = new Handler(o65Var.getLooper(), o65Var);
        o65Var.b = handler;
        o65Var.o = new f85(handler, 0);
        synchronized (o65Var) {
            o65Var.b.obtainMessage(1, i, 0).sendToTarget();
            while (((p65) o65Var.X) == null && o65Var.d == null && o65Var.c == null) {
                try {
                    o65Var.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = o65Var.d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = o65Var.c;
        if (error != null) {
            throw error;
        }
        p65 p65Var = (p65) o65Var.X;
        p65Var.getClass();
        return p65Var;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    o65 o65Var = this.b;
                    o65Var.b.getClass();
                    o65Var.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
