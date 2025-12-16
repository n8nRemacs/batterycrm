package com.otaliastudios.opengl.core;

import Y61.k;
import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EglContextFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/otaliastudios/opengl/core/b;", "", "<init>", "()V", "a", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f365913a = 0;

    /* compiled from: EglContextFactory.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/otaliastudios/opengl/core/b$a;", "Landroid/opengl/GLSurfaceView$EGLContextFactory;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a implements GLSurfaceView.EGLContextFactory {
        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        @k
        public final EGLContext createContext(@k EGL10 egl10, @k EGLDisplay eGLDisplay, @k EGLConfig eGLConfig) {
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public final void destroyContext(@k EGL10 egl10, @k EGLDisplay eGLDisplay, @k EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            int i12 = b.f365913a;
            eGLDisplay.toString();
            eGLContext.toString();
            throw new RuntimeException(L.j(Integer.valueOf(egl10.eglGetError()), "eglDestroyContex"));
        }
    }

    static {
        new b();
    }
}
