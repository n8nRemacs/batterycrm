package defpackage;

import android.graphics.RectF;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class dp7 implements Runnable {
    public final float X;
    public final float Y;
    public final float Z;
    public final WeakReference a;
    public final long b = 500;
    public final long c = System.currentTimeMillis();
    public final float d;
    public final float o;
    public final float s0;
    public final boolean t0;

    public dp7(fp7 fp7Var, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        this.a = new WeakReference(fp7Var);
        this.d = f;
        this.o = f2;
        this.X = f3;
        this.Y = f4;
        this.Z = f5;
        this.s0 = f6;
        this.t0 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fp7 fp7Var = (fp7) this.a.get();
        if (fp7Var == null) {
            return;
        }
        RectF rectF = fp7Var.B0;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
        long j = this.b;
        float fMin = Math.min(j, jCurrentTimeMillis);
        float f = j;
        float f2 = (fMin / f) - 1.0f;
        float f3 = (f2 * f2 * f2) + 1.0f;
        float f4 = (this.X * f3) + 0.0f;
        float f5 = (f3 * this.Y) + 0.0f;
        float fA = o7j.a(fMin, this.s0, f);
        if (fMin < f) {
            float[] fArr = fp7Var.o;
            fp7Var.g(f4 - (fArr[0] - this.d), f5 - (fArr[1] - this.o));
            if (!this.t0) {
                fp7Var.j(this.Z + fA, rectF.centerX(), rectF.centerY());
            }
            if (fp7Var.i(fp7Var.d)) {
                return;
            }
            fp7Var.post(this);
        }
    }
}
