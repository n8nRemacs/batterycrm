package androidx.constraintlayout.core.motion.utils;

/* compiled from: SpringStopEngine.java */
/* loaded from: classes.dex */
public class q implements s {

    /* renamed from: b, reason: collision with root package name */
    public double f43333b;

    /* renamed from: c, reason: collision with root package name */
    public double f43334c;

    /* renamed from: d, reason: collision with root package name */
    public float f43335d;

    /* renamed from: e, reason: collision with root package name */
    public float f43336e;

    /* renamed from: f, reason: collision with root package name */
    public float f43337f;

    /* renamed from: g, reason: collision with root package name */
    public float f43338g;

    /* renamed from: h, reason: collision with root package name */
    public float f43339h;

    /* renamed from: a, reason: collision with root package name */
    public double f43332a = 0.5d;

    /* renamed from: i, reason: collision with root package name */
    public int f43340i = 0;

    @Override // androidx.constraintlayout.core.motion.utils.s
    public final float a() {
        return 0.0f;
    }

    @Override // androidx.constraintlayout.core.motion.utils.s
    public final boolean b() {
        double d12 = this.f43336e - this.f43334c;
        double d13 = this.f43333b;
        double d14 = this.f43337f;
        return Math.sqrt((((d13 * d12) * d12) + ((d14 * d14) * ((double) this.f43338g))) / d13) <= ((double) this.f43339h);
    }

    @Override // androidx.constraintlayout.core.motion.utils.s
    public final float getInterpolation(float f12) {
        q qVar = this;
        float f13 = f12;
        double d12 = f13 - qVar.f43335d;
        double d13 = qVar.f43333b;
        double d14 = qVar.f43332a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d13 / qVar.f43338g) * d12) * 4.0d)) + 1.0d);
        double d15 = d12 / iSqrt;
        int i12 = 0;
        while (i12 < iSqrt) {
            double d16 = qVar.f43336e;
            double d17 = qVar.f43334c;
            int i13 = iSqrt;
            int i14 = i12;
            double d18 = qVar.f43337f;
            double d19 = qVar.f43338g;
            double d22 = ((((((-d13) * (d16 - d17)) - (d14 * d18)) / d19) * d15) / 2.0d) + d18;
            double d23 = ((((-((((d15 * d22) / 2.0d) + d16) - d17)) * d13) - (d22 * d14)) / d19) * d15;
            float f14 = (float) (d18 + d23);
            this.f43337f = f14;
            float f15 = (float) ((((d23 / 2.0d) + d18) * d15) + d16);
            this.f43336e = f15;
            int i15 = this.f43340i;
            if (i15 > 0) {
                if (f15 < 0.0f && (i15 & 1) == 1) {
                    this.f43336e = -f15;
                    this.f43337f = -f14;
                }
                float f16 = this.f43336e;
                if (f16 > 1.0f && (i15 & 2) == 2) {
                    this.f43336e = 2.0f - f16;
                    this.f43337f = -this.f43337f;
                }
            }
            f13 = f12;
            iSqrt = i13;
            i12 = i14 + 1;
            qVar = this;
        }
        q qVar2 = qVar;
        qVar2.f43335d = f13;
        return qVar2.f43336e;
    }
}
