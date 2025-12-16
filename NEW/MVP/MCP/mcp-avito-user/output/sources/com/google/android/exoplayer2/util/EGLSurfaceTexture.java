package com.google.android.exoplayer2.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import j.X;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@X
/* loaded from: classes6.dex */
public final class EGLSurfaceTexture implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f348063h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b, reason: collision with root package name */
    public final Handler f348064b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f348065c = new int[1];

    /* renamed from: d, reason: collision with root package name */
    @j.P
    public EGLDisplay f348066d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public EGLContext f348067e;

    /* renamed from: f, reason: collision with root package name */
    @j.P
    public EGLSurface f348068f;

    /* renamed from: g, reason: collision with root package name */
    @j.P
    public SurfaceTexture f348069g;

    public static final class GlException extends RuntimeException {
        public GlException(String str, a aVar) {
            super(str);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public interface c {
    }

    public EGLSurfaceTexture(Handler handler) {
        this.f348064b = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f348064b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f348069g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
