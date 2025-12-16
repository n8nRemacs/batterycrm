package androidx.media3.common.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;
import j.P;
import j.X;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: EGLSurfaceTexture.java */
@J
@X
/* renamed from: androidx.media3.common.util.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC23121l implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f47914h = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b, reason: collision with root package name */
    public final Handler f47915b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f47916c = new int[1];

    /* renamed from: d, reason: collision with root package name */
    @P
    public EGLDisplay f47917d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public EGLContext f47918e;

    /* renamed from: f, reason: collision with root package name */
    @P
    public EGLSurface f47919f;

    /* renamed from: g, reason: collision with root package name */
    @P
    public SurfaceTexture f47920g;

    /* compiled from: EGLSurfaceTexture.java */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.media3.common.util.l$a */
    public @interface a {
    }

    /* compiled from: EGLSurfaceTexture.java */
    /* renamed from: androidx.media3.common.util.l$b */
    public interface b {
    }

    public RunnableC23121l(Handler handler) {
        this.f47915b = handler;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f47915b.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceTexture surfaceTexture = this.f47920g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
