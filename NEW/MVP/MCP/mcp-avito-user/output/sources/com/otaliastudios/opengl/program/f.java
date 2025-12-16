package com.otaliastudios.opengl.program;

import Y61.k;
import android.opengl.GLES20;
import androidx.camera.camera2.internal.G;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.s0;

/* compiled from: GlShader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/otaliastudios/opengl/program/f;", "", "a", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f365947b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f365948a;

    /* compiled from: GlShader.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/opengl/program/f$a;", "", "<init>", "()V", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public f(int i12, @k String str) {
        f365947b.getClass();
        int i13 = s0.f410475c;
        int iGlCreateShader = GLES20.glCreateShader(i12);
        com.otaliastudios.opengl.core.f.b(L.j(Integer.valueOf(i12), "glCreateShader type="));
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, q11.g.f428990n, iArr, 0);
        if (iArr[0] != 0) {
            this.f365948a = iGlCreateShader;
            return;
        }
        StringBuilder sbJ = G.j(i12, "Could not compile shader ", ": '");
        sbJ.append((Object) GLES20.glGetShaderInfoLog(iGlCreateShader));
        sbJ.append("' source: ");
        sbJ.append(str);
        String string = sbJ.toString();
        GLES20.glDeleteShader(iGlCreateShader);
        throw new RuntimeException(string);
    }
}
