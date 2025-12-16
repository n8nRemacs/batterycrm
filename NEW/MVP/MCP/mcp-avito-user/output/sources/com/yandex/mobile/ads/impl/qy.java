package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes8.dex */
public final class qy {

    /* renamed from: a, reason: collision with root package name */
    private static final ry f389331a = tv0.c();

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f389332b = 0;

    public static boolean a(Context context) {
        String strEglQueryString;
        int i12 = pc1.f388768a;
        if (i12 < 24) {
            return false;
        }
        if (i12 < 26) {
            ry ryVar = f389331a;
            if (ryVar.a().equals(pc1.f388770c) || ryVar.b().equals(pc1.f388771d)) {
                return false;
            }
        }
        return (i12 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_EXT_protected_content");
    }

    public static int b() {
        if (pc1.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            ka0.b("GlUtil", "No current context");
        }
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        a();
        int i12 = iArr[0];
        GLES20.glBindTexture(36197, i12);
        a();
        GLES20.glTexParameteri(36197, 10240, 9729);
        a();
        GLES20.glTexParameteri(36197, 10241, 9729);
        a();
        GLES20.glTexParameteri(36197, 10242, 33071);
        a();
        GLES20.glTexParameteri(36197, 10243, 33071);
        a();
        return i12;
    }

    public static boolean c() {
        String strEglQueryString;
        return pc1.f388768a >= 17 && (strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) != null && strEglQueryString.contains("EGL_KHR_surfaceless_context");
    }

    public static void a() {
        int i12 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            StringBuilder sbA = Cif.a("glError: ");
            sbA.append(GLU.gluErrorString(iGlGetError));
            ka0.b("GlUtil", sbA.toString());
            i12 = iGlGetError;
        }
        if (i12 != 0) {
            StringBuilder sbA2 = Cif.a("glError: ");
            sbA2.append(GLU.gluErrorString(i12));
            ka0.b("GlUtil", sbA2.toString());
        }
    }

    public static FloatBuffer a(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void a(String str) {
        ka0.b("GlUtil", str);
    }
}
