package com.otaliastudios.opengl.program;

import X41.j;
import X41.n;
import Y61.k;
import android.opengl.GLES20;
import com.otaliastudios.opengl.draw.h;
import com.otaliastudios.opengl.program.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.s0;

/* compiled from: GlProgram.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/opengl/program/c;", "Lcom/otaliastudios/opengl/core/g;", "a", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public class c implements com.otaliastudios.opengl.core.g {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f365933e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f365934a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f365935b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f[] f365936c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f365937d;

    /* compiled from: GlProgram.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/opengl/program/c$a;", "", "<init>", "()V", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        public static int a(@k f... fVarArr) {
            int iGlCreateProgram = GLES20.glCreateProgram();
            int i12 = s0.f410475c;
            com.otaliastudios.opengl.core.f.b("glCreateProgram");
            if (iGlCreateProgram == 0) {
                throw new RuntimeException("Could not create program");
            }
            for (f fVar : fVarArr) {
                GLES20.glAttachShader(iGlCreateProgram, fVar.f365948a);
                com.otaliastudios.opengl.core.f.b("glAttachShader");
            }
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, q11.g.f428991o, iArr, 0);
            if (iArr[0] == 1) {
                return iGlCreateProgram;
            }
            String strJ = L.j(GLES20.glGetProgramInfoLog(iGlCreateProgram), "Could not link program: ");
            GLES20.glDeleteProgram(iGlCreateProgram);
            throw new RuntimeException(strJ);
        }

        public a() {
        }
    }

    public c(int i12, boolean z12, @k f... fVarArr) {
        this.f365934a = i12;
        this.f365935b = z12;
        this.f365936c = fVarArr;
    }

    @j
    public final void a(@k h hVar) {
        com.otaliastudios.opengl.core.f.b("draw start");
        d dVar = new d(this, hVar, hVar.f365920a);
        int i12 = s0.f410475c;
        GLES20.glUseProgram(this.f365934a);
        com.otaliastudios.opengl.core.f.b("glUseProgram");
        dVar.invoke();
        GLES20.glUseProgram(0);
        com.otaliastudios.opengl.core.f.b("draw end");
    }

    @k
    public final e b(@k String str) {
        e.f365941c.getClass();
        return new e(this.f365934a, e.b.f365945c, str, null);
    }

    public void c() {
    }

    public void d(@k h hVar, @k float[] fArr) {
    }
}
