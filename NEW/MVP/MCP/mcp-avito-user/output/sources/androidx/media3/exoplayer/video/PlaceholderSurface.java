package androidx.media3.exoplayer.video;

import android.content.Context;
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
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.RunnableC23121l;
import androidx.media3.common.util.s;
import com.adjust.sdk.Constants;
import j.P;
import j.X;
import java.util.Locale;

@J
@X
/* loaded from: classes.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: e, reason: collision with root package name */
    public static int f50178e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f50179f;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f50180b;

    /* renamed from: c, reason: collision with root package name */
    public final b f50181c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f50182d;

    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        public RunnableC23121l f50183b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f50184c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public Error f50185d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public RuntimeException f50186e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public PlaceholderSurface f50187f;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public final void a(int i12) throws GlUtil.GlException {
            EGLSurface eGLSurfaceEglCreatePbufferSurface;
            this.f50183b.getClass();
            RunnableC23121l runnableC23121l = this.f50183b;
            runnableC23121l.getClass();
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.c("eglGetDisplay failed", eGLDisplayEglGetDisplay != null);
            int[] iArr = new int[2];
            GlUtil.c("eglInitialize failed", EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1));
            runnableC23121l.f47917d = eGLDisplayEglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, RunnableC23121l.f47914h, 0, eGLConfigArr, 0, 1, iArr2, 0);
            boolean z12 = zEglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null;
            Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
            int i13 = M.f47887a;
            GlUtil.c(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), z12);
            EGLConfig eGLConfig = eGLConfigArr[0];
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(runnableC23121l.f47917d, eGLConfig, EGL14.EGL_NO_CONTEXT, i12 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            GlUtil.c("eglCreateContext failed", eGLContextEglCreateContext != null);
            runnableC23121l.f47918e = eGLContextEglCreateContext;
            EGLDisplay eGLDisplay = runnableC23121l.f47917d;
            if (i12 == 1) {
                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i12 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                GlUtil.c("eglCreatePbufferSurface failed", eGLSurfaceEglCreatePbufferSurface != null);
            }
            GlUtil.c("eglMakeCurrent failed", EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext));
            runnableC23121l.f47919f = eGLSurfaceEglCreatePbufferSurface;
            int[] iArr3 = runnableC23121l.f47916c;
            GLES20.glGenTextures(1, iArr3, 0);
            GlUtil.b();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
            runnableC23121l.f47920g = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(runnableC23121l);
            SurfaceTexture surfaceTexture2 = this.f50183b.f47920g;
            surfaceTexture2.getClass();
            this.f50187f = new PlaceholderSurface(this, surfaceTexture2, i12 != 0, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            this.f50183b.getClass();
            RunnableC23121l runnableC23121l = this.f50183b;
            runnableC23121l.f47915b.removeCallbacks(runnableC23121l);
            try {
                SurfaceTexture surfaceTexture = runnableC23121l.f47920g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, runnableC23121l.f47916c, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = runnableC23121l.f47917d;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = runnableC23121l.f47917d;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = runnableC23121l.f47919f;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(runnableC23121l.f47917d, runnableC23121l.f47919f);
                }
                EGLContext eGLContext = runnableC23121l.f47918e;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(runnableC23121l.f47917d, eGLContext);
                }
                if (M.f47887a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = runnableC23121l.f47917d;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(runnableC23121l.f47917d);
                }
                runnableC23121l.f47917d = null;
                runnableC23121l.f47918e = null;
                runnableC23121l.f47919f = null;
                runnableC23121l.f47920g = null;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i12 = message.what;
            try {
                if (i12 != 1) {
                    if (i12 != 2) {
                        return true;
                    }
                    try {
                        b();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    a(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (GlUtil.GlException e12) {
                    s.d("Failed to initialize placeholder surface", e12);
                    this.f50186e = new IllegalStateException(e12);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e13) {
                    s.d("Failed to initialize placeholder surface", e13);
                    this.f50185d = e13;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e14) {
                    s.d("Failed to initialize placeholder surface", e14);
                    this.f50186e = e14;
                    synchronized (this) {
                        notify();
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

    public PlaceholderSurface(b bVar, SurfaceTexture surfaceTexture, boolean z12, a aVar) {
        super(surfaceTexture);
        this.f50181c = bVar;
        this.f50180b = z12;
    }

    public static int a(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i12 = M.f47887a;
        if (i12 >= 24 && ((i12 >= 26 || !(Constants.REFERRER_API_SAMSUNG.equals(M.f47889c) || "XT1650".equals(M.f47890d))) && ((i12 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i12 >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f50179f) {
                f50178e = a(context);
                f50179f = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f50178e != 0;
    }

    public static PlaceholderSurface c(Context context, boolean z12) {
        boolean z13 = false;
        C23110a.g(!z12 || b(context));
        b bVar = new b();
        int i12 = z12 ? f50178e : 0;
        bVar.start();
        Handler handler = new Handler(bVar.getLooper(), bVar);
        bVar.f50184c = handler;
        bVar.f50183b = new RunnableC23121l(handler);
        synchronized (bVar) {
            bVar.f50184c.obtainMessage(1, i12, 0).sendToTarget();
            while (bVar.f50187f == null && bVar.f50186e == null && bVar.f50185d == null) {
                try {
                    bVar.wait();
                } catch (InterruptedException unused) {
                    z13 = true;
                }
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = bVar.f50186e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = bVar.f50185d;
        if (error != null) {
            throw error;
        }
        PlaceholderSurface placeholderSurface = bVar.f50187f;
        placeholderSurface.getClass();
        return placeholderSurface;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f50181c) {
            try {
                if (!this.f50182d) {
                    b bVar = this.f50181c;
                    bVar.f50184c.getClass();
                    bVar.f50184c.sendEmptyMessage(2);
                    this.f50182d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
