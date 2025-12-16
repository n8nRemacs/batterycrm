package com.otaliastudios.opengl.core;

import X41.n;
import Y61.k;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.s0;

/* compiled from: Egloo.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/otaliastudios/opengl/core/f;", "", "<init>", "()V", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    @k
    public static final float[] f365917a;

    static {
        new f();
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        f365917a = fArr;
    }

    @n
    public static final void a(@k String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError != q11.e.f428963d) {
            throw new RuntimeException(r.m(iEglGetError, r.A("Error during ", str, ": EGL error 0x")));
        }
    }

    @n
    public static final void b(@k String str) {
        int iGlGetError = GLES20.glGetError();
        int i12 = s0.f410475c;
        int i13 = q11.g.f428977a;
        if (iGlGetError == 0) {
            return;
        }
        StringBuilder sbA = r.A("Error during ", str, ": glError 0x");
        sbA.append(Integer.toHexString(iGlGetError));
        sbA.append(": ");
        sbA.append(GLU.gluErrorString(iGlGetError));
        throw new RuntimeException(sbA.toString());
    }
}
