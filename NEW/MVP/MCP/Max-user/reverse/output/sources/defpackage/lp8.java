package defpackage;

/* loaded from: classes.dex */
public final class lp8 extends q85 {
    public final float B0;

    public lp8(float f) {
        super(0);
        this.B0 = f - 0.001f;
    }

    @Override // defpackage.q85
    public final void p(float f, float f2, float f3, gte gteVar) {
        double d = this.B0;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
        gteVar.d(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2, 270.0f, 0.0f);
        gteVar.c(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        gteVar.c(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
    }
}
