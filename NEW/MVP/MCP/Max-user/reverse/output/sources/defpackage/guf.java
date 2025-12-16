package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class guf {
    public static final int[] a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int[] c = {12445, 13120, 12344, 12344};
    public static final int[] d = {12445, 13632, 12344, 12344};
    public static final int[] e = {12344};

    public static void a(int i, int i2) throws GlUtil$GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        hsi.f("Create a OpenGL context first or run the GL methods on an OpenGL thread.", i3 > 0);
        if (i < 0 || i2 < 0) {
            throw new GlUtil$GlException("width or height is less than 0");
        }
        if (i > i3 || i2 > i3) {
            throw new GlUtil$GlException(ho7.f(i3, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
    }

    public static void b(int i, int i2, int i3) throws GlUtil$GlException {
        GLES20.glBindTexture(i, i2);
        d();
        GLES20.glTexParameteri(i, 10240, i3);
        d();
        GLES20.glTexParameteri(i, 10241, i3);
        d();
        GLES20.glTexParameteri(i, 10242, 33071);
        d();
        GLES20.glTexParameteri(i, 10243, 33071);
        d();
    }

    public static void c(String str) throws GlUtil$GlException {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbO = ho7.o(str, ", error code: 0x");
        sbO.append(Integer.toHexString(iEglGetError));
        throw new GlUtil$GlException(sbO.toString());
    }

    public static void d() throws GlUtil$GlException {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new GlUtil$GlException(sb.toString());
        }
    }

    public static void e(String str, boolean z) throws GlUtil$GlException {
        if (!z) {
            throw new GlUtil$GlException(str);
        }
    }

    public static void f() throws GlUtil$GlException {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        d();
    }

    public static float[] g() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static Handler h(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return zp4.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static EGLContext i(EGLContext eGLContext, EGLDisplay eGLDisplay, int i, int[] iArr) throws GlUtil$GlException {
        boolean z = true;
        hsi.b(Arrays.equals(iArr, a) || Arrays.equals(iArr, b));
        if (i != 2 && i != 3) {
            z = false;
        }
        hsi.b(z);
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, p(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
        if (eGLContextEglCreateContext == null || eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglTerminate(eGLDisplay);
            throw new GlUtil$GlException(ho7.f(i, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
        }
        d();
        return eGLContextEglCreateContext;
    }

    public static EGLSurface j(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil$GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (s("EGL_KHR_surfaceless_context")) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, p(eGLDisplay, a), new int[]{12375, 1, 12374, 1, 12344}, 0);
            c("Error creating a new EGL Pbuffer surface");
        }
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext);
        c("Error making context current");
        n(0, 1, 1);
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static long k() throws GlUtil$GlException {
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, new int[1], 0);
        d();
        if (r0[0] < 3) {
            return 0L;
        }
        long jGlFenceSync = GLES30.glFenceSync(37143, 0);
        d();
        GLES20.glFlush();
        d();
        return jGlFenceSync;
    }

    public static void l(EGLContext eGLContext, EGLDisplay eGLDisplay) throws GlUtil$GlException {
        if (eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        c("Error releasing context");
        if (eGLContext != null && !eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            c("Error destroying context");
        }
        EGL14.eglReleaseThread();
        c("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        c("Error terminating display");
    }

    public static void m(EGLDisplay eGLDisplay, EGLSurface eGLSurface) throws GlUtil$GlException {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) || eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
        c("Error destroying surface");
    }

    public static void n(int i, int i2, int i3) throws GlUtil$GlException {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i) {
            GLES20.glBindFramebuffer(36160, i);
        }
        d();
        GLES20.glViewport(0, 0, i2, i3);
        d();
    }

    public static EGLDisplay o() throws GlUtil$GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        e("No EGL display.", !eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        e("Error in eglInitialize.", EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0));
        d();
        return eGLDisplayEglGetDisplay;
    }

    public static EGLConfig p(EGLDisplay eGLDisplay, int[] iArr) throws GlUtil$GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new GlUtil$GlException("eglChooseConfig failed.");
    }

    public static float[] q() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean r() {
        return Build.VERSION.SDK_INT >= 33 && s("EGL_EXT_gl_colorspace_bt2020_pq");
    }

    public static boolean s(String str) {
        String strEglQueryString = EGL14.eglQueryString(o(), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static final String t(Reader reader) throws IOException {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int i = reader.read(cArr);
        while (i >= 0) {
            stringWriter.write(cArr, 0, i);
            i = reader.read(cArr);
        }
        return stringWriter.toString();
    }
}
