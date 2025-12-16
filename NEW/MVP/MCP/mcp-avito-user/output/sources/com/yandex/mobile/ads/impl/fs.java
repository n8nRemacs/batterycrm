package com.yandex.mobile.ads.impl;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import java.util.Locale;

@j.X
/* loaded from: classes8.dex */
public final class fs implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f385485h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b, reason: collision with root package name */
    private final Handler f385486b;

    /* renamed from: c, reason: collision with root package name */
    private final int[] f385487c = new int[1];

    /* renamed from: d, reason: collision with root package name */
    @j.P
    private EGLDisplay f385488d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private EGLContext f385489e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    private EGLSurface f385490f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    private SurfaceTexture f385491g;

    public static final class a extends RuntimeException {
        public /* synthetic */ a(String str, int i12) {
            this(str);
        }

        private a(String str) {
            super(str);
        }
    }

    public fs(Handler handler) {
        this.f385486b = handler;
    }

    public final SurfaceTexture a() {
        SurfaceTexture surfaceTexture = this.f385491g;
        surfaceTexture.getClass();
        return surfaceTexture;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b() {
        this.f385486b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f385491g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f385487c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f385488d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f385488d;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f385490f;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f385488d, this.f385490f);
            }
            EGLContext eGLContext = this.f385489e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f385488d, eGLContext);
            }
            if (pc1.f388768a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay3 = this.f385488d;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f385488d);
            }
            this.f385488d = null;
            this.f385489e = null;
            this.f385490f = null;
            this.f385491g = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f385486b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f385491g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }

    public final void a(int i12) {
        EGLConfig eGLConfig;
        int[] iArr;
        int[] iArr2;
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        int i13 = 0;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        if (eGLDisplayEglGetDisplay != null) {
            int[] iArr3 = new int[2];
            if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr3, 0, iArr3, 1)) {
                this.f385488d = eGLDisplayEglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr4 = new int[1];
                boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplayEglGetDisplay, f385485h, 0, eGLConfigArr, 0, 1, iArr4, 0);
                if (zEglChooseConfig && iArr4[0] > 0 && (eGLConfig = eGLConfigArr[0]) != null) {
                    EGLDisplay eGLDisplay = this.f385488d;
                    if (i12 == 0) {
                        iArr = new int[]{12440, 2, 12344};
                    } else {
                        iArr = new int[]{12440, 2, 12992, 1, 12344};
                    }
                    EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
                    if (eGLContextEglCreateContext != null) {
                        this.f385489e = eGLContextEglCreateContext;
                        EGLDisplay eGLDisplay2 = this.f385488d;
                        if (i12 == 1) {
                            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
                        } else {
                            if (i12 == 2) {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                            } else {
                                iArr2 = new int[]{12375, 1, 12374, 1, 12344};
                            }
                            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay2, eGLConfig, iArr2, 0);
                            if (eGLSurfaceEglCreatePbufferSurface == null) {
                                throw new a("eglCreatePbufferSurface failed", i13);
                            }
                        }
                        if (EGL14.eglMakeCurrent(eGLDisplay2, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContextEglCreateContext)) {
                            this.f385490f = eGLSurfaceEglCreatePbufferSurface;
                            GLES20.glGenTextures(1, this.f385487c, 0);
                            qy.a();
                            SurfaceTexture surfaceTexture = new SurfaceTexture(this.f385487c[0]);
                            this.f385491g = surfaceTexture;
                            surfaceTexture.setOnFrameAvailableListener(this);
                            return;
                        }
                        throw new a("eglMakeCurrent failed", i13);
                    }
                    throw new a("eglCreateContext failed", i13);
                }
                Object[] objArr = {Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr4[0]), eGLConfigArr[0]};
                int i14 = pc1.f388768a;
                throw new a(String.format(Locale.US, "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", objArr), i13);
            }
            throw new a("eglInitialize failed", i13);
        }
        throw new a("eglGetDisplay failed", i13);
    }
}
