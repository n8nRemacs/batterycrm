package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class yp4 implements gsf, SurfaceTexture.OnFrameAvailableListener {
    public final float[] X;
    public final float[] Y;
    public final LinkedHashMap Z;
    public final tz4 a;
    public final HandlerThread b;
    public final a07 c;
    public final Handler d;
    public final AtomicBoolean o;
    public int s0;
    public boolean t0;
    public final ArrayList u0;

    public yp4(u75 u75Var) {
        Map map = Collections.EMPTY_MAP;
        this.o = new AtomicBoolean(false);
        this.X = new float[16];
        this.Y = new float[16];
        this.Z = new LinkedHashMap();
        this.s0 = 0;
        this.t0 = false;
        this.u0 = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new a07(handler);
        this.a = new tz4();
        try {
            try {
                ixi.a(new i00(this, u75Var)).get();
            } catch (InterruptedException | ExecutionException e) {
                e = e;
                e = e instanceof ExecutionException ? e.getCause() : e;
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
                }
                throw ((RuntimeException) e);
            }
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    public final void a() {
        if (this.t0 && this.s0 == 0) {
            LinkedHashMap linkedHashMap = this.Z;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((fsf) it.next()).close();
            }
            Iterator it2 = this.u0.iterator();
            while (it2.hasNext()) {
                ((u90) it2.next()).c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            this.a.q();
            this.b.quit();
        }
    }

    public final void b(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new cj(this, runnable2, runnable, 20));
        } catch (RejectedExecutionException e) {
            gri.j("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void c(Exception exc) {
        ArrayList arrayList = this.u0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((u90) it.next()).c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap d(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        fui.c(fArr2, i);
        fui.d(fArr2);
        Size sizeF = bhg.f(size, i);
        tz4 tz4Var = this.a;
        tz4Var.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeF.getHeight() * sizeF.getWidth() * 4);
        z5j.a("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeF.getHeight() * sizeF.getWidth()) * 4);
        z5j.a("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = ho6.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        ho6.b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        ho6.b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        ho6.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeF.getWidth(), sizeF.getHeight(), 0, 6407, 5121, null);
        ho6.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        ho6.b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        ho6.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        ho6.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        ho6.b("glActiveTexture");
        GLES20.glBindTexture(36197, tz4Var.b);
        ho6.b("glBindTexture");
        tz4Var.k = null;
        GLES20.glViewport(0, 0, sizeF.getWidth(), sizeF.getHeight());
        GLES20.glScissor(0, 0, sizeF.getWidth(), sizeF.getHeight());
        fo6 fo6Var = (fo6) tz4Var.m;
        fo6Var.getClass();
        if (fo6Var instanceof go6) {
            GLES20.glUniformMatrix4fv(((go6) fo6Var).f, 1, false, fArr2, 0);
            ho6.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        ho6.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeF.getWidth(), sizeF.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        ho6.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        ho6.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        ho6.b("glDeleteFramebuffers");
        int i4 = tz4Var.b;
        GLES20.glActiveTexture(33984);
        ho6.b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        ho6.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeF.getWidth(), sizeF.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.f(bitmapCreateBitmap, byteBufferAllocateDirect, sizeF.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void e(cjg cjgVar) throws IOException {
        ArrayList arrayList = this.u0;
        if (arrayList.isEmpty()) {
            return;
        }
        if (cjgVar == null) {
            c(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i = -1;
                int i2 = -1;
                Bitmap bitmapD = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    u90 u90Var = (u90) it.next();
                    int i3 = u90Var.b;
                    int i4 = u90Var.a;
                    if (i != i3 || bitmapD == null) {
                        if (bitmapD != null) {
                            bitmapD.recycle();
                        }
                        bitmapD = d((Size) cjgVar.b, (float[]) cjgVar.c, i3);
                        i2 = -1;
                        i = i3;
                    }
                    if (i2 != i4) {
                        byteArrayOutputStream.reset();
                        bitmapD.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        i2 = i4;
                    }
                    Surface surface = (Surface) cjgVar.a;
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.i(byteArray, surface);
                    u90Var.c.b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            c(e);
        }
    }

    @Override // defpackage.gsf
    public final void f(msf msfVar) {
        if (this.o.get()) {
            msfVar.d();
        } else {
            b(new my1(this, 29, msfVar), new wp4(msfVar, 0));
        }
    }

    @Override // defpackage.gsf
    public final ha8 h(int i, int i2) {
        return wsf.g(ixi.a(new aj4(this, i, i2)));
    }

    @Override // defpackage.gsf
    public final void j(fsf fsfVar) {
        if (this.o.get()) {
            fsfVar.close();
            return;
        }
        my1 my1Var = new my1(this, 28, fsfVar);
        Objects.requireNonNull(fsfVar);
        b(my1Var, new qj4(4, fsfVar));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) throws IOException {
        if (this.o.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.X;
        surfaceTexture.getTransformMatrix(fArr);
        cjg cjgVar = null;
        for (Map.Entry entry : this.Z.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            fsf fsfVar = (fsf) entry.getKey();
            float[] fArr2 = this.Y;
            fsfVar.w(fArr2, fArr);
            int i = fsfVar.c;
            if (i == 34) {
                try {
                    this.a.t(surfaceTexture.getTimestamp(), fArr2, surface);
                } catch (RuntimeException e) {
                    gri.c("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            } else {
                z5j.f("Unsupported format: " + i, i == 256);
                z5j.f("Only one JPEG output is supported.", cjgVar == null);
                cjgVar = new cjg(surface, fsfVar.d, (float[]) fArr2.clone());
            }
        }
        try {
            e(cjgVar);
        } catch (RuntimeException e2) {
            c(e2);
        }
    }

    @Override // defpackage.gsf
    public final void release() {
        if (this.o.getAndSet(true)) {
            return;
        }
        b(new qj4(5, this), new mc(6));
    }
}
