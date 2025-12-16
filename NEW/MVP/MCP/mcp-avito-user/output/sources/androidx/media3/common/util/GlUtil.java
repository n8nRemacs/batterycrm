package androidx.media3.common.util;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import j.InterfaceC42164u;
import j.P;
import j.X;

@J
/* loaded from: classes.dex */
public final class GlUtil {

    public static final class GlException extends Exception {
    }

    @X
    public static final class a {
        @InterfaceC42164u
        public static EGLContext a(EGLContext eGLContext, EGLDisplay eGLDisplay, int i12, int[] iArr) throws GlException {
            EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, i(eGLDisplay, iArr), eGLContext, new int[]{12440, i12, 12344}, 0);
            if (eGLContextEglCreateContext != null) {
                GlUtil.b();
                return eGLContextEglCreateContext;
            }
            EGL14.eglTerminate(eGLDisplay);
            throw new GlException(AK.c.g(i12, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
        }

        @InterfaceC42164u
        public static EGLDisplay b() throws GlException {
            EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
            GlUtil.c("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
            GlUtil.c("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
            GlUtil.b();
            return eGLDisplayEglGetDisplay;
        }

        @InterfaceC42164u
        public static EGLSurface c(EGLDisplay eGLDisplay, int[] iArr, int[] iArr2) throws GlException {
            EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, i(eGLDisplay, iArr), iArr2, 0);
            GlUtil.a("Error creating surface");
            return eGLSurfaceEglCreatePbufferSurface;
        }

        @InterfaceC42164u
        public static EGLSurface d(EGLDisplay eGLDisplay, Object obj, int[] iArr, int[] iArr2) throws GlException {
            EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, i(eGLDisplay, iArr), obj, iArr2, 0);
            GlUtil.a("Error creating surface");
            return eGLSurfaceEglCreateWindowSurface;
        }

        @InterfaceC42164u
        public static void e(@P EGLDisplay eGLDisplay, @P EGLContext eGLContext) throws GlException {
            if (eGLDisplay == null) {
                return;
            }
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            GlUtil.a("Error releasing context");
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                GlUtil.a("Error destroying context");
            }
            EGL14.eglReleaseThread();
            GlUtil.a("Error releasing thread");
            EGL14.eglTerminate(eGLDisplay);
            GlUtil.a("Error terminating display");
        }

        @InterfaceC42164u
        public static void f(@P EGLDisplay eGLDisplay, @P EGLSurface eGLSurface) throws GlException {
            if (eGLDisplay == null || eGLSurface == null) {
                return;
            }
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            GlUtil.a("Error destroying surface");
        }

        @InterfaceC42164u
        public static void g(int i12, int i13, int i14) throws GlException {
            GlUtil.c("No current context", !M.a(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT));
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(36006, iArr, 0);
            if (iArr[0] != i12) {
                GLES20.glBindFramebuffer(36160, i12);
            }
            GlUtil.b();
            GLES20.glViewport(0, 0, i13, i14);
            GlUtil.b();
        }

        @InterfaceC42164u
        public static void h(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i12, int i13, int i14) throws GlException {
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            GlUtil.a("Error making context current");
            g(i12, i13, i14);
        }

        @InterfaceC42164u
        private static EGLConfig i(EGLDisplay eGLDisplay, int[] iArr) throws GlException {
            EGLConfig[] eGLConfigArr = new EGLConfig[1];
            if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
                return eGLConfigArr[0];
            }
            throw new GlException("eglChooseConfig failed.");
        }
    }

    public static void a(String str) throws GlException {
        int iEglGetError = EGL14.eglGetError();
        c(str + ", error code: " + iEglGetError, iEglGetError == 12288);
    }

    public static void b() throws GlException {
        StringBuilder sb2 = new StringBuilder();
        boolean z12 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z12) {
                sb2.append('\n');
            }
            sb2.append("glError: ");
            sb2.append(GLU.gluErrorString(iGlGetError));
            z12 = true;
        }
        if (z12) {
            throw new GlException(sb2.toString());
        }
    }

    public static void c(String str, boolean z12) throws GlException {
        if (!z12) {
            throw new GlException(str);
        }
    }
}
