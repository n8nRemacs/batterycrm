package androidx.core.content.res;

/* compiled from: ViewingConditions.java */
/* loaded from: classes.dex */
final class m {

    /* renamed from: k, reason: collision with root package name */
    public static final m f44684k;

    /* renamed from: a, reason: collision with root package name */
    public final float f44685a;

    /* renamed from: b, reason: collision with root package name */
    public final float f44686b;

    /* renamed from: c, reason: collision with root package name */
    public final float f44687c;

    /* renamed from: d, reason: collision with root package name */
    public final float f44688d;

    /* renamed from: e, reason: collision with root package name */
    public final float f44689e;

    /* renamed from: f, reason: collision with root package name */
    public final float f44690f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f44691g;

    /* renamed from: h, reason: collision with root package name */
    public final float f44692h;

    /* renamed from: i, reason: collision with root package name */
    public final float f44693i;

    /* renamed from: j, reason: collision with root package name */
    public final float f44694j;

    static {
        float[] fArr = b.f44653c;
        float fC2 = (float) ((b.c() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f44651a;
        float f12 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f13 = fArr3[0] * f12;
        float f14 = fArr[1];
        float f15 = (fArr3[1] * f14) + f13;
        float f16 = fArr[2];
        float f17 = (fArr3[2] * f16) + f15;
        float[] fArr4 = fArr2[1];
        float f18 = (fArr4[2] * f16) + (fArr4[1] * f14) + (fArr4[0] * f12);
        float[] fArr5 = fArr2[2];
        float f19 = (f16 * fArr5[2]) + (f14 * fArr5[1]) + (f12 * fArr5[0]);
        float f22 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fC2) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d12 = fExp;
        if (d12 > 1.0d) {
            fExp = 1.0f;
        } else if (d12 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f17) * fExp) + 1.0f) - fExp, (((100.0f / f18) * fExp) + 1.0f) - fExp, (((100.0f / f19) * fExp) + 1.0f) - fExp};
        float f23 = 1.0f / ((5.0f * fC2) + 1.0f);
        float f24 = f23 * f23 * f23 * f23;
        float f25 = 1.0f - f24;
        float fCbrt = (0.1f * f25 * f25 * ((float) Math.cbrt(fC2 * 5.0d))) + (f24 * fC2);
        float fC3 = b.c() / fArr[1];
        double d13 = fC3;
        float fSqrt = ((float) Math.sqrt(d13)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d13, 0.2d));
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * fCbrt) * f17) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * fCbrt) * f18) / 100.0d, 0.42d), (float) Math.pow(((fArr6[2] * fCbrt) * f19) / 100.0d, 0.42d)};
        float f26 = fArr7[0];
        float f27 = (f26 * 400.0f) / (f26 + 27.13f);
        float f28 = fArr7[1];
        float f29 = (f28 * 400.0f) / (f28 + 27.13f);
        float f32 = fArr7[2];
        float[] fArr8 = {f27, f29, (400.0f * f32) / (f32 + 27.13f)};
        f44684k = new m(fC3, ((fArr8[2] * 0.05f) + (fArr8[0] * 2.0f) + fArr8[1]) * fPow, fPow, fPow, f22, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public m(float f12, float f13, float f14, float f15, float f16, float f17, float[] fArr, float f18, float f19, float f22) {
        this.f44690f = f12;
        this.f44685a = f13;
        this.f44686b = f14;
        this.f44687c = f15;
        this.f44688d = f16;
        this.f44689e = f17;
        this.f44691g = fArr;
        this.f44692h = f18;
        this.f44693i = f19;
        this.f44694j = f22;
    }
}
