package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.ImageProcessingUtil;
import androidx.core.os.OperationCanceledException;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class gd7 implements kf7 {
    public ByteBuffer A0;
    public volatile boolean X;
    public Executor Y;
    public ov8 Z;
    public yc7 a;
    public volatile int b;
    public volatile int c;
    public volatile boolean o;
    public ImageWriter s0;
    public ByteBuffer x0;
    public ByteBuffer y0;
    public ByteBuffer z0;
    public volatile int d = 1;
    public Rect t0 = new Rect();
    public Rect u0 = new Rect();
    public Matrix v0 = new Matrix();
    public Matrix w0 = new Matrix();
    public final Object B0 = new Object();
    public boolean C0 = true;

    public abstract jf7 a(lf7 lf7Var);

    public final ha8 b(final jf7 jf7Var) throws Throwable {
        Object obj;
        final Executor executor;
        final yc7 yc7Var;
        boolean z;
        ov8 ov8Var;
        ImageWriter imageWriter;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        ByteBuffer byteBuffer4;
        kd7 kd7Var;
        kd7 kd7VarH;
        int i = this.o ? this.b : 0;
        Object obj2 = this.B0;
        synchronized (obj2) {
            try {
                try {
                    executor = this.Y;
                    yc7Var = this.a;
                    z = this.o && i != this.c;
                    if (z) {
                        h(jf7Var, i);
                    }
                    if (this.o) {
                        e(jf7Var);
                    }
                    try {
                        ov8Var = this.Z;
                        try {
                            imageWriter = this.s0;
                            byteBuffer = this.x0;
                            try {
                                byteBuffer2 = this.y0;
                                byteBuffer3 = this.z0;
                                byteBuffer4 = this.A0;
                            } catch (Throwable th) {
                                th = th;
                                obj = obj2;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        obj = obj2;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = obj2;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        if (yc7Var == null || executor == null || !this.C0) {
            return new ag7(1, new OperationCanceledException("No analyzer or executor currently set."));
        }
        if (ov8Var == null) {
            kd7Var = null;
        } else {
            if (this.d == 2) {
                kd7VarH = ImageProcessingUtil.d(jf7Var, ov8Var, byteBuffer, i, this.X);
            } else {
                if (this.d == 1) {
                    if (this.X) {
                        ImageProcessingUtil.a(jf7Var);
                    }
                    if (imageWriter != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null) {
                        kd7VarH = ImageProcessingUtil.h(jf7Var, ov8Var, imageWriter, byteBuffer2, byteBuffer3, byteBuffer4, i);
                    }
                }
                kd7Var = null;
            }
            kd7Var = kd7VarH;
        }
        boolean z2 = kd7Var == null;
        final jf7 jf7Var2 = z2 ? jf7Var : kd7Var;
        final Rect rect = new Rect();
        final Matrix matrix = new Matrix();
        synchronized (this.B0) {
            if (z && !z2) {
                try {
                    g(jf7Var.getWidth(), jf7Var.getHeight(), jf7Var2.getWidth(), jf7Var2.getHeight());
                } finally {
                }
            }
            this.c = i;
            rect.set(this.u0);
            matrix.set(this.w0);
        }
        return ixi.a(new uu1() { // from class: ed7
            @Override // defpackage.uu1
            public final String m(final tu1 tu1Var) {
                final gd7 gd7Var = this.a;
                final jf7 jf7Var3 = jf7Var;
                final Matrix matrix2 = matrix;
                final jf7 jf7Var4 = jf7Var2;
                final Rect rect2 = rect;
                final yc7 yc7Var2 = yc7Var;
                executor.execute(new Runnable() { // from class: fd7
                    @Override // java.lang.Runnable
                    public final void run() {
                        gd7 gd7Var2 = gd7Var;
                        jf7 jf7Var5 = jf7Var3;
                        Matrix matrix3 = matrix2;
                        jf7 jf7Var6 = jf7Var4;
                        Rect rect3 = rect2;
                        yc7 yc7Var3 = yc7Var2;
                        tu1 tu1Var2 = tu1Var;
                        if (!gd7Var2.C0) {
                            tu1Var2.d(new OperationCanceledException("ImageAnalysis is detached"));
                            return;
                        }
                        jke jkeVar = new jke(jf7Var6, null, new ja0(jf7Var5.getImageInfo().e(), jf7Var5.getImageInfo().getTimestamp(), gd7Var2.o ? 0 : gd7Var2.b, matrix3));
                        if (!rect3.isEmpty()) {
                            jkeVar.d(rect3);
                        }
                        yc7Var3.k(jkeVar);
                        tu1Var2.b(null);
                    }
                });
                return "analyzeImage";
            }
        });
    }

    public abstract void c();

    @Override // defpackage.kf7
    public final void d(lf7 lf7Var) {
        try {
            jf7 jf7VarA = a(lf7Var);
            if (jf7VarA != null) {
                f(jf7VarA);
            }
        } catch (IllegalStateException e) {
            gri.c("ImageAnalysisAnalyzer", "Failed to acquire image.", e);
        }
    }

    public final void e(jf7 jf7Var) {
        if (this.d != 1) {
            if (this.d == 2 && this.x0 == null) {
                this.x0 = ByteBuffer.allocateDirect(jf7Var.getHeight() * jf7Var.getWidth() * 4);
                return;
            }
            return;
        }
        if (this.y0 == null) {
            this.y0 = ByteBuffer.allocateDirect(jf7Var.getHeight() * jf7Var.getWidth());
        }
        this.y0.position(0);
        if (this.z0 == null) {
            this.z0 = ByteBuffer.allocateDirect((jf7Var.getHeight() * jf7Var.getWidth()) / 4);
        }
        this.z0.position(0);
        if (this.A0 == null) {
            this.A0 = ByteBuffer.allocateDirect((jf7Var.getHeight() * jf7Var.getWidth()) / 4);
        }
        this.A0.position(0);
    }

    public abstract void f(jf7 jf7Var);

    public final void g(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        Matrix matrix = new Matrix();
        if (i5 > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, i, i2);
            RectF rectF2 = bhg.a;
            Matrix.ScaleToFit scaleToFit = Matrix.ScaleToFit.FILL;
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            matrix.postRotate(i5);
            RectF rectF3 = new RectF(0.0f, 0.0f, i3, i4);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF2, rectF3, scaleToFit);
            matrix.postConcat(matrix2);
        }
        RectF rectF4 = new RectF(this.t0);
        matrix.mapRect(rectF4);
        Rect rect = new Rect();
        rectF4.round(rect);
        this.u0 = rect;
        this.w0.setConcat(this.v0, matrix);
    }

    public final void h(jf7 jf7Var, int i) {
        ov8 ov8Var = this.Z;
        if (ov8Var == null) {
            return;
        }
        ov8Var.a();
        int width = jf7Var.getWidth();
        int height = jf7Var.getHeight();
        int iF = this.Z.f();
        int iM = this.Z.m();
        boolean z = i == 90 || i == 270;
        int i2 = z ? height : width;
        if (!z) {
            width = height;
        }
        this.Z = new ov8(ofi.c(i2, width, iF, iM));
        if (this.d == 1) {
            ImageWriter imageWriter = this.s0;
            if (imageWriter != null) {
                imageWriter.close();
            }
            this.s0 = ImageWriter.newInstance(this.Z.getSurface(), this.Z.m());
        }
    }
}
