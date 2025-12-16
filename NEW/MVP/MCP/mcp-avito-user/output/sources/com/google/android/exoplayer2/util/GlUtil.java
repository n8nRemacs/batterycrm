package com.google.android.exoplayer2.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import j.InterfaceC42164u;
import j.X;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes6.dex */
public final class GlUtil {

    public static final class GlException extends RuntimeException {
    }

    @X
    public static final class a {
        @InterfaceC42164u
        public static EGLContext a(EGLDisplay eGLDisplay, int i12, int[] iArr) {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, f(eGLDisplay, iArr), EGL14.EGL_NO_CONTEXT, new int[]{12440, i12, 12344}, 0);
            if (eGLContextEglCreateContext == null) {
                EGL14.eglTerminate(eGLDisplay);
            }
            GlUtil.b();
            return eGLContextEglCreateContext;
        }

        @InterfaceC42164u
        public static EGLDisplay b() {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY);
            EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0);
            GlUtil.b();
            return eGLDisplayEglGetDisplay;
        }

        @InterfaceC42164u
        public static EGLSurface c(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) {
            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, f(eGLDisplay, iArr), iArr2, 0);
            EGL14.eglGetError();
            return eGLSurfaceEglCreatePbufferSurface;
        }

        @InterfaceC42164u
        public static void d(@j.P EGLDisplay eGLDisplay, @j.P EGLContext eGLContext) {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglGetError();
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                EGL14.eglGetError();
            }
            EGL14.eglReleaseThread();
            EGL14.eglGetError();
            EGL14.eglTerminate(eGLDisplay);
            EGL14.eglGetError();
        }

        @InterfaceC42164u
        public static void e(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i12, int i13, int i14) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != i12) {
                GLES20.glBindFramebuffer(36160, i12);
            }
            GlUtil.b();
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            EGL14.eglGetError();
            GLES20.glViewport(0, 0, i13, i14);
            GlUtil.b();
        }

        @InterfaceC42164u
        private static EGLConfig f(EGLDisplay eGLDisplay, int[] iArr) {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0);
            return eGLConfigArr[0];
        }

        @InterfaceC42164u
        public static EGLSurface g(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) {
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, f(eGLDisplay, iArr), obj, iArr2, 0);
            EGL14.eglGetError();
            return eGLSurfaceEglCreateWindowSurface;
        }
    }

    public static void a(int i12, int i13) {
        GLES20.glBindTexture(i12, i13);
        b();
        GLES20.glTexParameteri(i12, 10240, 9729);
        b();
        GLES20.glTexParameteri(i12, 10241, 9729);
        b();
        GLES20.glTexParameteri(i12, 10242, 33071);
        b();
        GLES20.glTexParameteri(i12, 10243, 33071);
        b();
    }

    public static void b() {
        int i12 = 0;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            GLU.gluErrorString(iGlGetError);
            i12 = iGlGetError;
        }
        if (i12 != 0) {
            GLU.gluErrorString(i12);
        }
    }

    public static FloatBuffer c(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }
}
