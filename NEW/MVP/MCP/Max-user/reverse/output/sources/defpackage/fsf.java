package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class fsf implements Closeable {
    public ju3 X;
    public Executor Y;
    public final Surface b;
    public final int c;
    public final Size d;
    public final float[] o;
    public final wu1 t0;
    public tu1 u0;
    public final Object a = new Object();
    public boolean Z = false;
    public boolean s0 = false;

    public fsf(Surface surface, int i, Size size, rb0 rb0Var, rb0 rb0Var2) {
        float[] fArr = new float[16];
        this.o = fArr;
        this.b = surface;
        this.c = i;
        this.d = size;
        c(fArr, new float[16], rb0Var);
        c(new float[16], new float[16], rb0Var2);
        this.t0 = ixi.a(new u4e(23, this));
    }

    public static void c(float[] fArr, float[] fArr2, rb0 rb0Var) {
        Matrix.setIdentityM(fArr, 0);
        if (rb0Var == null) {
            return;
        }
        Size size = rb0Var.a;
        boolean z = rb0Var.e;
        int i = rb0Var.d;
        fui.d(fArr);
        fui.c(fArr, i);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeF = bhg.f(size, i);
        float f = 0;
        android.graphics.Matrix matrixA = bhg.a(new RectF(f, f, size.getWidth(), size.getHeight()), new RectF(f, f, sizeF.getWidth(), sizeF.getHeight()), i, z);
        RectF rectF = new RectF(rb0Var.b);
        matrixA.mapRect(rectF);
        float width = rectF.left / sizeF.getWidth();
        float height = ((sizeF.getHeight() - rectF.height()) - rectF.top) / sizeF.getHeight();
        float fWidth = rectF.width() / sizeF.getWidth();
        float fHeight = rectF.height() / sizeF.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        n22 n22Var = rb0Var.c;
        Matrix.setIdentityM(fArr2, 0);
        fui.d(fArr2);
        if (n22Var != null) {
            z5j.f("Camera has no transform.", n22Var.l());
            fui.c(fArr2, n22Var.n().b());
            if (n22Var.n().h() == 0) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.s0) {
                    this.s0 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.u0.b(null);
    }

    public final Surface d(a07 a07Var, ju3 ju3Var) {
        boolean z;
        synchronized (this.a) {
            this.Y = a07Var;
            this.X = ju3Var;
            z = this.Z;
        }
        if (z) {
            l();
        }
        return this.b;
    }

    public final void l() {
        Executor executor;
        ju3 ju3Var;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.a) {
            try {
                if (this.Y == null || (ju3Var = this.X) == null) {
                    this.Z = true;
                } else if (!this.s0) {
                    atomicReference.set(ju3Var);
                    executor = this.Y;
                    this.Z = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new aee(this, 18, atomicReference));
            } catch (RejectedExecutionException e) {
                if (gri.d(3, "SurfaceOutputImpl")) {
                    Log.d("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
                }
            }
        }
    }

    public final void w(float[] fArr, float[] fArr2) {
        Matrix.multiplyMM(fArr, 0, fArr2, 0, this.o, 0);
    }
}
