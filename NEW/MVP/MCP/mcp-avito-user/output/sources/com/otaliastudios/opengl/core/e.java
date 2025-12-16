package com.otaliastudios.opengl.core;

import Y61.k;
import Y61.l;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q11.C47185b;

/* compiled from: EglNativeCore.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/opengl/core/e;", "", "a", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public q11.d f365914a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public q11.c f365915b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public C47185b f365916c;

    /* compiled from: EglNativeCore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/otaliastudios/opengl/core/e$a;", "", "<init>", "()V", "", "FLAG_RECORDABLE", "I", "FLAG_TRY_GLES3", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
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

    public e() {
        this(null, 0, 3, null);
    }

    public e(q11.c cVar, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? q11.e.f428960a : cVar, (i13 & 2) != 0 ? 0 : i12);
    }

    public e(@k q11.c cVar, int i12) {
        C47185b c47185bA;
        q11.d dVar = q11.e.f428961b;
        this.f365914a = dVar;
        this.f365915b = q11.e.f428960a;
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        q11.d dVar2 = new q11.d(eGLDisplayEglGetDisplay);
        this.f365914a = dVar2;
        if (dVar2 != dVar) {
            if (EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0)) {
                new d();
                boolean z12 = (i12 & 1) != 0;
                int i13 = i12 & 2;
                EGLContext eGLContext = cVar.f428958a;
                if (i13 != 0 && (c47185bA = d.a(this.f365914a, 3, z12)) != null) {
                    q11.c cVar2 = new q11.c(EGL14.eglCreateContext(this.f365914a.f428959a, c47185bA.f428957a, eGLContext, new int[]{q11.e.f428965f, 3, q11.e.f428964e}, 0));
                    try {
                        f.a("eglCreateContext (3)");
                        this.f365916c = c47185bA;
                        this.f365915b = cVar2;
                    } catch (Exception unused) {
                    }
                }
                if (this.f365915b == q11.e.f428960a) {
                    C47185b c47185bA2 = d.a(this.f365914a, 2, z12);
                    if (c47185bA2 != null) {
                        q11.c cVar3 = new q11.c(EGL14.eglCreateContext(this.f365914a.f428959a, c47185bA2.f428957a, eGLContext, new int[]{q11.e.f428965f, 2, q11.e.f428964e}, 0));
                        f.a("eglCreateContext (2)");
                        this.f365916c = c47185bA2;
                        this.f365915b = cVar3;
                        return;
                    }
                    throw new RuntimeException("Unable to find a suitable EGLConfig");
                }
                return;
            }
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }
}
