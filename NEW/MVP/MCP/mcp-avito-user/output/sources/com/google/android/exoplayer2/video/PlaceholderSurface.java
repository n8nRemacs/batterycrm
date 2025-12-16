package com.google.android.exoplayer2.video;

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
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import com.google.android.exoplayer2.util.GlUtil;
import com.google.android.exoplayer2.util.U;
import j.P;
import j.X;
import java.util.Locale;

@X
/* loaded from: classes6.dex */
public final class PlaceholderSurface extends Surface {

    /* renamed from: e, reason: collision with root package name */
    public static int f348171e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f348172f;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f348173b;

    /* renamed from: c, reason: collision with root package name */
    public final b f348174c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f348175d;

    public static class b extends HandlerThread implements Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        public EGLSurfaceTexture f348176b;

        /* renamed from: c, reason: collision with root package name */
        public Handler f348177c;

        /* renamed from: d, reason: collision with root package name */
        @P
        public Error f348178d;

        /* renamed from: e, reason: collision with root package name */
        @P
        public RuntimeException f348179e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public PlaceholderSurface f348180f;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        public final void a(int i12) {
            EGLConfig eGLConfig;
            EGLSurface eGLSurfaceEglCreatePbufferSurface;
            this.f348176b.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.f348176b;
            eGLSurfaceTexture.getClass();
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            if (eGLDisplayEglGetDisplay == null) {
                throw new EGLSurfaceTexture.GlException("eglGetDisplay failed", null);
            }
            int[] iArr = new int[2];
            if (!EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1)) {
                throw new EGLSurfaceTexture.GlException("eglInitialize failed", null);
            }
            eGLSurfaceTexture.f348066d = eGLDisplayEglGetDisplay;
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            int[] iArr2 = new int[1];
            boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, EGLSurfaceTexture.f348063h, 0, eGLConfigArr, 0, 1, iArr2, 0);
            if (!zEglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]};
                int i13 = U.f348106a;
                throw new EGLSurfaceTexture.GlException(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), null);
            }
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLSurfaceTexture.f348066d, eGLConfig, EGL14.EGL_NO_CONTEXT, i12 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
            if (eGLContextEglCreateContext == null) {
                throw new EGLSurfaceTexture.GlException("eglCreateContext failed", null);
            }
            eGLSurfaceTexture.f348067e = eGLContextEglCreateContext;
            EGLDisplay eGLDisplay = eGLSurfaceTexture.f348066d;
            if (i12 == 1) {
                eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
            } else {
                eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i12 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                if (eGLSurfaceEglCreatePbufferSurface == null) {
                    throw new EGLSurfaceTexture.GlException("eglCreatePbufferSurface failed", null);
                }
            }
            if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                throw new EGLSurfaceTexture.GlException("eglMakeCurrent failed", null);
            }
            eGLSurfaceTexture.f348068f = eGLSurfaceEglCreatePbufferSurface;
            int[] iArr3 = eGLSurfaceTexture.f348065c;
            GLES20.glGenTextures(1, iArr3, 0);
            GlUtil.b();
            SurfaceTexture surfaceTexture = new SurfaceTexture(iArr3[0]);
            eGLSurfaceTexture.f348069g = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(eGLSurfaceTexture);
            SurfaceTexture surfaceTexture2 = this.f348176b.f348069g;
            surfaceTexture2.getClass();
            this.f348180f = new PlaceholderSurface(this, surfaceTexture2, i12 != 0, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void b() {
            this.f348176b.getClass();
            EGLSurfaceTexture eGLSurfaceTexture = this.f348176b;
            eGLSurfaceTexture.f348064b.removeCallbacks(eGLSurfaceTexture);
            try {
                SurfaceTexture surfaceTexture = eGLSurfaceTexture.f348069g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, eGLSurfaceTexture.f348065c, 0);
                }
            } finally {
                EGLDisplay eGLDisplay = eGLSurfaceTexture.f348066d;
                if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGLDisplay eGLDisplay2 = eGLSurfaceTexture.f348066d;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = eGLSurfaceTexture.f348068f;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(eGLSurfaceTexture.f348066d, eGLSurfaceTexture.f348068f);
                }
                EGLContext eGLContext = eGLSurfaceTexture.f348067e;
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(eGLSurfaceTexture.f348066d, eGLContext);
                }
                if (U.f348106a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = eGLSurfaceTexture.f348066d;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(eGLSurfaceTexture.f348066d);
                }
                eGLSurfaceTexture.f348066d = null;
                eGLSurfaceTexture.f348067e = null;
                eGLSurfaceTexture.f348068f = null;
                eGLSurfaceTexture.f348069g = null;
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
                } catch (Error e12) {
                    C36605v.a("Failed to initialize placeholder surface", e12);
                    this.f348178d = e12;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e13) {
                    C36605v.a("Failed to initialize placeholder surface", e13);
                    this.f348179e = e13;
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
        this.f348174c = bVar;
        this.f348173b = z12;
    }

    public static int a(Context context) {
        String strEglQueryString;
        String strEglQueryString2;
        int i12 = U.f348106a;
        if (i12 >= 24 && ((i12 >= 26 || !(Constants.REFERRER_API_SAMSUNG.equals(U.f348108c) || "XT1650".equals(U.f348109d))) && ((i12 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content")))) {
            return (i12 >= 17 && (strEglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString2.contains("EGL_KHR_surfaceless_context")) ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f348172f) {
                f348171e = a(context);
                f348172f = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f348171e != 0;
    }

    public static PlaceholderSurface c(Context context, boolean z12) {
        boolean z13 = false;
        C36585a.d(!z12 || b(context));
        b bVar = new b();
        int i12 = z12 ? f348171e : 0;
        bVar.start();
        Handler handler = new Handler(bVar.getLooper(), bVar);
        bVar.f348177c = handler;
        bVar.f348176b = new EGLSurfaceTexture(handler);
        synchronized (bVar) {
            bVar.f348177c.obtainMessage(1, i12, 0).sendToTarget();
            while (bVar.f348180f == null && bVar.f348179e == null && bVar.f348178d == null) {
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
        RuntimeException runtimeException = bVar.f348179e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = bVar.f348178d;
        if (error != null) {
            throw error;
        }
        PlaceholderSurface placeholderSurface = bVar.f348180f;
        placeholderSurface.getClass();
        return placeholderSurface;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f348174c) {
            try {
                if (!this.f348175d) {
                    b bVar = this.f348174c;
                    bVar.f348177c.getClass();
                    bVar.f348177c.sendEmptyMessage(2);
                    this.f348175d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
