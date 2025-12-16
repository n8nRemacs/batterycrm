package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;
import com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class o65 extends HandlerThread implements Handler.Callback {
    public Surface X;
    public final /* synthetic */ int a;
    public Handler b;
    public Error c;
    public RuntimeException d;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o65(String str, int i) {
        super(str);
        this.a = i;
    }

    public final void a(int i) throws GlUtil$GlException {
        EGLConfig eGLConfig;
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2;
        switch (this.a) {
            case 0:
                ((f85) this.o).getClass();
                f85 f85Var = (f85) this.o;
                int[] iArr = f85Var.c;
                EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
                if (eGLDisplayEglGetDisplay == null) {
                    throw new EGLSurfaceTexture$GlException("eglGetDisplay failed");
                }
                int[] iArr2 = new int[2];
                if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr2, 0, iArr2, 1)) {
                    throw new EGLSurfaceTexture$GlException("eglInitialize failed");
                }
                f85Var.d = eGLDisplayEglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr3 = new int[1];
                boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f85.Z, 0, eGLConfigArr, 0, 1, iArr3, 0);
                if (!zEglChooseConfig || iArr3[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                    Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]};
                    int i2 = xxg.a;
                    throw new EGLSurfaceTexture$GlException(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr));
                }
                EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(f85Var.d, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                if (eGLContextEglCreateContext == null) {
                    throw new EGLSurfaceTexture$GlException("eglCreateContext failed");
                }
                f85Var.o = eGLContextEglCreateContext;
                EGLDisplay eGLDisplay = f85Var.d;
                if (i == 1) {
                    eGLSurface = EGL14.EGL_NO_SURFACE;
                } else {
                    EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    if (eGLSurfaceEglCreatePbufferSurface == null) {
                        throw new EGLSurfaceTexture$GlException("eglCreatePbufferSurface failed");
                    }
                    eGLSurface = eGLSurfaceEglCreatePbufferSurface;
                }
                if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContextEglCreateContext)) {
                    throw new EGLSurfaceTexture$GlException("eglMakeCurrent failed");
                }
                f85Var.X = eGLSurface;
                GLES20.glGenTextures(1, iArr, 0);
                t6d.b();
                SurfaceTexture surfaceTexture = new SurfaceTexture(iArr[0]);
                f85Var.Y = surfaceTexture;
                surfaceTexture.setOnFrameAvailableListener(f85Var);
                SurfaceTexture surfaceTexture2 = ((f85) this.o).Y;
                surfaceTexture2.getClass();
                this.X = new p65(this, surfaceTexture2, i != 0);
                return;
            default:
                ((f85) this.o).getClass();
                f85 f85Var2 = (f85) this.o;
                int[] iArr4 = f85Var2.c;
                EGLDisplay eGLDisplayEglGetDisplay2 = EGL14.eglGetDisplay(0);
                guf.e("eglGetDisplay failed", eGLDisplayEglGetDisplay2 != null);
                int[] iArr5 = new int[2];
                guf.e("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay2, iArr5, 0, iArr5, 1));
                f85Var2.d = eGLDisplayEglGetDisplay2;
                EGLConfig[] eGLConfigArr2 = new EGLConfig[1];
                int[] iArr6 = new int[1];
                boolean zEglChooseConfig2 = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay2, f85.s0, 0, eGLConfigArr2, 0, 1, iArr6, 0);
                boolean z = zEglChooseConfig2 && iArr6[0] > 0 && eGLConfigArr2[0] != null;
                Object[] objArr2 = {Boolean.valueOf(zEglChooseConfig2), Integer.valueOf(iArr6[0]), eGLConfigArr2[0]};
                String str = zxg.a;
                guf.e(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr2), z);
                EGLConfig eGLConfig2 = eGLConfigArr2[0];
                EGLContext eGLContextEglCreateContext2 = EGL14.eglCreateContext(f85Var2.d, eGLConfig2, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                guf.e("eglCreateContext failed", eGLContextEglCreateContext2 != null);
                f85Var2.o = eGLContextEglCreateContext2;
                EGLDisplay eGLDisplay2 = f85Var2.d;
                if (i == 1) {
                    eGLSurface2 = EGL14.EGL_NO_SURFACE;
                } else {
                    EGLSurface eGLSurfaceEglCreatePbufferSurface2 = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig2, i == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    guf.e("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface2 != null);
                    eGLSurface2 = eGLSurfaceEglCreatePbufferSurface2;
                }
                guf.e("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface2, eGLSurface2, eGLContextEglCreateContext2));
                f85Var2.X = eGLSurface2;
                GLES20.glGenTextures(1, iArr4, 0);
                guf.d();
                SurfaceTexture surfaceTexture3 = new SurfaceTexture(iArr4[0]);
                f85Var2.Y = surfaceTexture3;
                surfaceTexture3.setOnFrameAvailableListener(f85Var2);
                SurfaceTexture surfaceTexture4 = ((f85) this.o).Y;
                surfaceTexture4.getClass();
                this.X = new l2c(this, surfaceTexture4, i != 0);
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        switch (this.a) {
            case 0:
                ((f85) this.o).getClass();
                f85 f85Var = (f85) this.o;
                f85Var.b.removeCallbacks(f85Var);
                try {
                    SurfaceTexture surfaceTexture = f85Var.Y;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                        GLES20.glDeleteTextures(1, f85Var.c, 0);
                    }
                    return;
                } finally {
                    EGLDisplay eGLDisplay = f85Var.d;
                    if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay2 = f85Var.d;
                        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface2 = f85Var.X;
                    if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(f85Var.d, f85Var.X);
                    }
                    EGLContext eGLContext = f85Var.o;
                    if (eGLContext != null) {
                        EGL14.eglDestroyContext(f85Var.d, eGLContext);
                    }
                    if (xxg.a >= 19) {
                        EGL14.eglReleaseThread();
                    }
                    EGLDisplay eGLDisplay3 = f85Var.d;
                    if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(f85Var.d);
                    }
                    f85Var.d = null;
                    f85Var.o = null;
                    f85Var.X = null;
                    f85Var.Y = null;
                }
            default:
                ((f85) this.o).getClass();
                f85 f85Var2 = (f85) this.o;
                f85Var2.b.removeCallbacks(f85Var2);
                try {
                    SurfaceTexture surfaceTexture2 = f85Var2.Y;
                    if (surfaceTexture2 != null) {
                        surfaceTexture2.release();
                        GLES20.glDeleteTextures(1, f85Var2.c, 0);
                    }
                    return;
                } finally {
                    EGLDisplay eGLDisplay4 = f85Var2.d;
                    if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay5 = f85Var2.d;
                        EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface4 = f85Var2.X;
                    if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(f85Var2.d, f85Var2.X);
                    }
                    EGLContext eGLContext2 = f85Var2.o;
                    if (eGLContext2 != null) {
                        EGL14.eglDestroyContext(f85Var2.d, eGLContext2);
                    }
                    EGL14.eglReleaseThread();
                    EGLDisplay eGLDisplay6 = f85Var2.d;
                    if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(f85Var2.d);
                    }
                    f85Var2.d = null;
                    f85Var2.o = null;
                    f85Var2.X = null;
                    f85Var2.Y = null;
                }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                try {
                    if (i == 1) {
                        try {
                            a(message.arg1);
                            synchronized (this) {
                                notify();
                            }
                        } catch (Error e) {
                            pai.c("DummySurface", "Failed to initialize dummy surface", e);
                            this.c = e;
                            synchronized (this) {
                                notify();
                            }
                        } catch (RuntimeException e2) {
                            pai.c("DummySurface", "Failed to initialize dummy surface", e2);
                            this.d = e2;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } else if (i == 2) {
                        try {
                            b();
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                    return true;
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            default:
                int i2 = message.what;
                try {
                    if (i2 == 1) {
                        try {
                            try {
                                a(message.arg1);
                                synchronized (this) {
                                    notify();
                                }
                            } catch (Error e3) {
                                a8i.h("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                                this.c = e3;
                                synchronized (this) {
                                    notify();
                                }
                            }
                        } catch (GlUtil$GlException e4) {
                            a8i.h("PlaceholderSurface", "Failed to initialize placeholder surface", e4);
                            this.d = new IllegalStateException(e4);
                            synchronized (this) {
                                notify();
                            }
                        } catch (RuntimeException e5) {
                            a8i.h("PlaceholderSurface", "Failed to initialize placeholder surface", e5);
                            this.d = e5;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } else if (i2 == 2) {
                        try {
                            b();
                        } finally {
                            try {
                            } finally {
                            }
                        }
                    }
                    return true;
                } catch (Throwable th2) {
                    synchronized (this) {
                        notify();
                        throw th2;
                    }
                }
        }
    }
}
