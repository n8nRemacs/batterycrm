package defpackage;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* loaded from: classes2.dex */
public final class ah1 {
    public final y6d a;
    public final EglBase.Context b;
    public final ue c;
    public final String d;
    public final yg1 e;
    public final Matrix f;
    public final VideoFrameDrawer g;
    public final GlRectDrawer h;
    public final ArrayList i;

    public ah1(y6d y6dVar, EglBase.Context context, int[] iArr, String str) {
        this.a = y6dVar;
        this.b = context;
        this.d = wy1.h("CallOpenGL_renderer_", str);
        yg1 yg1Var = new yg1(y6dVar, ((EglBase14.Context) context).getRawContext(), iArr, new ts9(1, this, ah1.class, "onReleaseContext", "onReleaseContext(Lru/ok/android/webrtc/opengl/CallOpenGLContext;)V", 0, 16), str);
        this.e = yg1Var;
        this.f = new Matrix();
        this.g = new VideoFrameDrawer();
        this.h = new GlRectDrawer();
        this.i = new ArrayList();
        ue ueVar = new ue(6, this);
        try {
            yg1Var.k.postDelayed(ueVar, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        } catch (IllegalStateException e) {
            yg1Var.a.reportException(yg1Var.j, "OpenGL tread died, is it fine?", e);
        }
        this.c = ueVar;
    }

    public final void a() {
        yg1 yg1Var = this.e;
        yg1Var.a.log(yg1Var.j, "Release requested");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (yg1Var.h) {
            if (yg1Var.i) {
                yg1Var.i = false;
                yg1Var.k.postAtFrontOfQueue(new ud(yg1Var, 18, countDownLatch));
                yg1Var.a.log(yg1Var.j, "Release action submitted");
            } else {
                yg1Var.a.log(yg1Var.j, "Already released, ignore");
                countDownLatch.countDown();
            }
        }
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    public final void b(yg1 yg1Var, kt1 kt1Var, VideoFrame videoFrame, al1 al1Var) {
        EGLSurface eGLSurface = kt1Var.a;
        if (eGLSurface == null || eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            return;
        }
        long jNanoTime = System.nanoTime();
        yg1Var.b(eGLSurface);
        yg1.a("makeCurrent()");
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16384);
        Matrix matrix = this.f;
        matrix.reset();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(al1Var.c ? -1.0f : 1.0f, 1.0f);
        matrix.preScale(al1Var.a, al1Var.b);
        matrix.preTranslate(-0.5f, -0.5f);
        RendererCommon.GlDrawer glDrawer = kt1Var.k;
        if (glDrawer == null) {
            glDrawer = this.h;
        }
        RendererCommon.GlDrawer glDrawer2 = glDrawer;
        EGLDisplay eGLDisplay = yg1Var.e;
        if (eGLDisplay == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
        int i = iArr[0];
        EGLDisplay eGLDisplay2 = yg1Var.e;
        if (eGLDisplay2 == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        int[] iArr2 = new int[1];
        EGL14.eglQuerySurface(eGLDisplay2, eGLSurface, 12374, iArr2, 0);
        this.g.drawFrame(videoFrame, glDrawer2, matrix, 0, 0, i, iArr2[0]);
        yg1.a("drawFrame()");
        long jNanoTime2 = System.nanoTime();
        EGLDisplay eGLDisplay3 = yg1Var.e;
        if (eGLDisplay3 == null) {
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
        EGL14.eglSwapBuffers(eGLDisplay3, eGLSurface);
        yg1.a("swapBuffers()");
        long jNanoTime3 = System.nanoTime();
        lt1 lt1Var = kt1Var.l;
        lt1Var.h += jNanoTime3 - jNanoTime;
        lt1Var.i += jNanoTime3 - jNanoTime2;
        yg1.a("swapBuffers()");
    }
}
