package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.gl.effects.VideoMessageStencilHolder;
import one.me.sdk.gl.effects.objects.FrameBuffer;
import one.me.sdk.gl.effects.objects.OesToImage2dRenderer;
import one.me.sdk.gl.effects.objects.TrivialFragmentShader;

/* loaded from: classes2.dex */
public final class r8h extends tz4 {
    public final Size o;
    public final String p;
    public hef q;
    public OesToImage2dRenderer r;
    public TrivialFragmentShader s;
    public final float[] t;
    public long u;
    public int v;
    public dse w;

    public r8h(Size size, u75 u75Var) {
        this.o = size;
        String name = r8h.class.getName();
        this.p = name;
        this.t = new float[16];
        this.v = -1;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "init, previewSize=" + size + ", dynamicRange=" + u75Var, null);
            }
        }
        Map map = Collections.EMPTY_MAP;
        n(u75Var);
    }

    @Override // defpackage.tz4
    public final void q() {
        wqi.q(this.p, "release", new Object[0]);
        TrivialFragmentShader trivialFragmentShader = this.s;
        if (trivialFragmentShader != null) {
            trivialFragmentShader.release();
        }
        this.s = null;
        OesToImage2dRenderer oesToImage2dRenderer = this.r;
        if (oesToImage2dRenderer != null) {
            oesToImage2dRenderer.release();
        }
        this.r = null;
        hef hefVar = this.q;
        if (hefVar != null) {
            wqi.q(hefVar.d, "release", new Object[0]);
            hefVar.e.release();
            hefVar.f.release();
        }
        this.q = null;
        this.w = null;
        super.q();
    }

    public final void w(SurfaceTexture surfaceTexture, Surface surface, float[] fArr, boolean z) throws IOException {
        boolean z2;
        TrivialFragmentShader trivialFragmentShader;
        Throwable th;
        dse dseVar;
        wa0 wa0VarL = l(surface);
        if (wa0VarL.equals(ho6.j)) {
            wa0VarL = h(surface);
            if (wa0VarL == null) {
                return;
            } else {
                ((HashMap) this.d).put(surface, wa0VarL);
            }
        }
        ho6.d((AtomicBoolean) this.c, true);
        ho6.c((Thread) this.e);
        int i = this.b;
        int i2 = wa0VarL.b;
        int i3 = wa0VarL.c;
        EGLSurface eGLSurface = wa0VarL.a;
        long timestamp = surfaceTexture.getTimestamp();
        hef hefVar = this.q;
        if (hefVar == null) {
            hefVar = new hef(this.o);
            this.q = hefVar;
        }
        hef hefVar2 = hefVar;
        FrameBuffer frameBuffer = hefVar2.f;
        OesToImage2dRenderer oesToImage2dRenderer = this.r;
        if (oesToImage2dRenderer == null) {
            oesToImage2dRenderer = new OesToImage2dRenderer();
            this.r = oesToImage2dRenderer;
        }
        TrivialFragmentShader trivialFragmentShader2 = this.s;
        if (trivialFragmentShader2 == null) {
            trivialFragmentShader2 = new TrivialFragmentShader(0, false);
            this.s = trivialFragmentShader2;
        }
        long j = this.u;
        float[] fArr2 = this.t;
        if (timestamp == j && i == this.v && Arrays.equals(fArr, fArr2)) {
            trivialFragmentShader = trivialFragmentShader2;
            z2 = false;
        } else {
            frameBuffer.bind();
            GLES20.glViewport(0, 0, hefVar2.b, hefVar2.c);
            z2 = false;
            trivialFragmentShader = trivialFragmentShader2;
            OesToImage2dRenderer.render$default(oesToImage2dRenderer, i, fArr, null, 4, null);
            frameBuffer.unbind();
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.u = timestamp;
            this.v = i;
        }
        boolean z3 = z2;
        VideoMessageStencilHolder videoMessageStencilHolder = hefVar2.e;
        int textureId = frameBuffer.getTextureId();
        Size size = hefVar2.a;
        int width = size.getWidth();
        int height = size.getHeight();
        TrivialFragmentShader trivialFragmentShader3 = trivialFragmentShader;
        videoMessageStencilHolder.render(textureId, width, height, i2, i3, !z, false);
        if (!fni.a((Surface) this.k, surface)) {
            o(eGLSurface);
            this.k = surface;
        }
        GLES20.glViewport(z3 ? 1 : 0, z3 ? 1 : 0, i2, i3);
        trivialFragmentShader3.setTextureId(frameBuffer.getTextureId());
        trivialFragmentShader3.render();
        if (this.w != null) {
            int textureId2 = frameBuffer.getTextureId();
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i2 * i3 * 4);
            GLES20.glViewport(z3 ? 1 : 0, z3 ? 1 : 0, i2, i3);
            float[] fArr3 = new float[16];
            Matrix.setIdentityM(fArr3, z3 ? 1 : 0);
            Matrix.scaleM(fArr3, z3 ? 1 : 0, 1.0f, -1.0f, 1.0f);
            FrameBuffer frameBuffer2 = new FrameBuffer(i2, i3);
            TrivialFragmentShader trivialFragmentShader4 = new TrivialFragmentShader(z3 ? 1 : 0, z3);
            trivialFragmentShader4.setTextureId(textureId2);
            trivialFragmentShader4.setMVPMat(fArr3);
            frameBuffer2.bind();
            trivialFragmentShader4.render();
            th = null;
            GLES20.glReadPixels(0, 0, i2, i3, 6408, 5121, byteBufferAllocateDirect);
            frameBuffer2.unbind();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
            ImageProcessingUtil.f(bitmapCreateBitmap, byteBufferAllocateDirect, i2 * 4);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (byteArray != null && (dseVar = this.w) != null) {
                    dseVar.invoke(byteArray);
                }
                this.w = null;
            } finally {
                bitmapCreateBitmap.recycle();
                byteArrayOutputStream.close();
                frameBuffer2.release();
                trivialFragmentShader4.release();
            }
        } else {
            th = null;
        }
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, timestamp);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            return;
        }
        int iEglGetError = EGL14.eglGetError();
        ozi.a(16);
        wqi.e(this.p, "failed to swap buffers, error=0x" + wni.c(16, iEglGetError & 4294967295L), th);
        s(surface, z3);
    }
}
