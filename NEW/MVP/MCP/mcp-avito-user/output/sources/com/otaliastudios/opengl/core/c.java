package com.otaliastudios.opengl.core;

import X41.j;
import Y61.l;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EglCore.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/opengl/core/c;", "Lcom/otaliastudios/opengl/core/e;", "a", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class c extends e {

    /* compiled from: EglCore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/otaliastudios/opengl/core/c$a;", "", "<init>", "()V", "", "FLAG_RECORDABLE", "I", "FLAG_TRY_GLES3", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public c() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public final void a() {
        q11.d dVar = this.f365914a;
        q11.d dVar2 = q11.e.f428961b;
        if (dVar != dVar2) {
            q11.f fVar = q11.e.f428962c;
            q11.c cVar = q11.e.f428960a;
            EGLDisplay eGLDisplay = dVar.f428959a;
            EGLSurface eGLSurface = fVar.f428976a;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, cVar.f428958a);
            EGL14.eglDestroyContext(this.f365914a.f428959a, this.f365915b.f428958a);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f365914a.f428959a);
        }
        this.f365914a = dVar2;
        this.f365915b = q11.e.f428960a;
        this.f365916c = null;
    }

    public final void finalize() {
        a();
    }

    public /* synthetic */ c(EGLContext eGLContext, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? EGL14.EGL_NO_CONTEXT : eGLContext, (i13 & 2) != 0 ? 0 : i12);
    }

    @j
    public c(@l EGLContext eGLContext, int i12) {
        super(new q11.c(eGLContext), i12);
    }
}
