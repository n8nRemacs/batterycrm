package defpackage;

import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class ep7 implements Runnable {
    public final float X;
    public final float Y;
    public final WeakReference a;
    public final float d;
    public final float o;
    public final long c = System.currentTimeMillis();
    public final long b = 200;

    public ep7(fp7 fp7Var, float f, float f2, float f3, float f4) {
        this.a = new WeakReference(fp7Var);
        this.d = f;
        this.o = f2;
        this.X = f3;
        this.Y = f4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fp7 fp7Var = (fp7) this.a.get();
        if (fp7Var == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.c;
        long j = this.b;
        float fMin = Math.min(j, jCurrentTimeMillis);
        float f = j;
        float fA = o7j.a(fMin, this.o, f);
        if (fMin >= f) {
            fp7Var.setImageToWrapCropBounds(true);
        } else {
            fp7Var.j(this.d + fA, this.X, this.Y);
            fp7Var.post(this);
        }
    }
}
