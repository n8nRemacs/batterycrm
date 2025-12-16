package androidx.constraintlayout.core.motion.utils;

/* compiled from: StopLogicEngine.java */
/* loaded from: classes.dex */
public class t implements s {

    /* renamed from: a, reason: collision with root package name */
    public float f43342a;

    /* renamed from: b, reason: collision with root package name */
    public float f43343b;

    /* renamed from: c, reason: collision with root package name */
    public float f43344c;

    /* renamed from: d, reason: collision with root package name */
    public float f43345d;

    /* renamed from: e, reason: collision with root package name */
    public float f43346e;

    /* renamed from: f, reason: collision with root package name */
    public float f43347f;

    /* renamed from: g, reason: collision with root package name */
    public float f43348g;

    /* renamed from: h, reason: collision with root package name */
    public float f43349h;

    /* renamed from: i, reason: collision with root package name */
    public float f43350i;

    /* renamed from: j, reason: collision with root package name */
    public int f43351j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f43352k = false;

    /* renamed from: l, reason: collision with root package name */
    public float f43353l;

    /* renamed from: m, reason: collision with root package name */
    public float f43354m;

    @Override // androidx.constraintlayout.core.motion.utils.s
    public final float a() {
        return this.f43352k ? -c(this.f43354m) : c(this.f43354m);
    }

    @Override // androidx.constraintlayout.core.motion.utils.s
    public final boolean b() {
        return a() < 1.0E-5f && Math.abs(this.f43350i - this.f43354m) < 1.0E-5f;
    }

    public final float c(float f12) {
        float f13;
        float f14;
        float f15 = this.f43345d;
        if (f12 <= f15) {
            f13 = this.f43342a;
            f14 = this.f43343b;
        } else {
            int i12 = this.f43351j;
            if (i12 == 1) {
                return 0.0f;
            }
            f12 -= f15;
            f15 = this.f43346e;
            if (f12 >= f15) {
                if (i12 == 2) {
                    return this.f43349h;
                }
                float f16 = f12 - f15;
                float f17 = this.f43347f;
                if (f16 >= f17) {
                    return this.f43350i;
                }
                float f18 = this.f43344c;
                return f18 - ((f16 * f18) / f17);
            }
            f13 = this.f43343b;
            f14 = this.f43344c;
        }
        return (((f14 - f13) * f12) / f15) + f13;
    }

    public final void d(float f12, float f13, float f14, float f15, float f16) {
        if (f12 == 0.0f) {
            f12 = 1.0E-4f;
        }
        this.f43342a = f12;
        float f17 = f12 / f14;
        float f18 = (f17 * f12) / 2.0f;
        if (f12 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f13 - ((((-f12) / f14) * f12) / 2.0f)) * f14);
            if (fSqrt < f15) {
                this.f43351j = 2;
                this.f43342a = f12;
                this.f43343b = fSqrt;
                this.f43344c = 0.0f;
                float f19 = (fSqrt - f12) / f14;
                this.f43345d = f19;
                this.f43346e = fSqrt / f14;
                this.f43348g = ((f12 + fSqrt) * f19) / 2.0f;
                this.f43349h = f13;
                this.f43350i = f13;
                return;
            }
            this.f43351j = 3;
            this.f43342a = f12;
            this.f43343b = f15;
            this.f43344c = f15;
            float f22 = (f15 - f12) / f14;
            this.f43345d = f22;
            float f23 = f15 / f14;
            this.f43347f = f23;
            float f24 = ((f12 + f15) * f22) / 2.0f;
            float f25 = (f23 * f15) / 2.0f;
            this.f43346e = ((f13 - f24) - f25) / f15;
            this.f43348g = f24;
            this.f43349h = f13 - f25;
            this.f43350i = f13;
            return;
        }
        if (f18 >= f13) {
            this.f43351j = 1;
            this.f43342a = f12;
            this.f43343b = 0.0f;
            this.f43348g = f13;
            this.f43345d = (2.0f * f13) / f12;
            return;
        }
        float f26 = f13 - f18;
        float f27 = f26 / f12;
        if (f27 + f17 < f16) {
            this.f43351j = 2;
            this.f43342a = f12;
            this.f43343b = f12;
            this.f43344c = 0.0f;
            this.f43348g = f26;
            this.f43349h = f13;
            this.f43345d = f27;
            this.f43346e = f17;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f12 * f12) / 2.0f) + (f14 * f13));
        float f28 = (fSqrt2 - f12) / f14;
        this.f43345d = f28;
        float f29 = fSqrt2 / f14;
        this.f43346e = f29;
        if (fSqrt2 < f15) {
            this.f43351j = 2;
            this.f43342a = f12;
            this.f43343b = fSqrt2;
            this.f43344c = 0.0f;
            this.f43345d = f28;
            this.f43346e = f29;
            this.f43348g = ((f12 + fSqrt2) * f28) / 2.0f;
            this.f43349h = f13;
            return;
        }
        this.f43351j = 3;
        this.f43342a = f12;
        this.f43343b = f15;
        this.f43344c = f15;
        float f32 = (f15 - f12) / f14;
        this.f43345d = f32;
        float f33 = f15 / f14;
        this.f43347f = f33;
        float f34 = ((f12 + f15) * f32) / 2.0f;
        float f35 = (f33 * f15) / 2.0f;
        this.f43346e = ((f13 - f34) - f35) / f15;
        this.f43348g = f34;
        this.f43349h = f13 - f35;
        this.f43350i = f13;
    }

    @Override // androidx.constraintlayout.core.motion.utils.s
    public final float getInterpolation(float f12) {
        float f13;
        float f14 = this.f43345d;
        if (f12 <= f14) {
            float f15 = this.f43342a;
            f13 = ((((this.f43343b - f15) * f12) * f12) / (f14 * 2.0f)) + (f15 * f12);
        } else {
            int i12 = this.f43351j;
            if (i12 == 1) {
                f13 = this.f43348g;
            } else {
                float f16 = f12 - f14;
                float f17 = this.f43346e;
                if (f16 < f17) {
                    float f18 = this.f43348g;
                    float f19 = this.f43343b;
                    f13 = ((((this.f43344c - f19) * f16) * f16) / (f17 * 2.0f)) + (f19 * f16) + f18;
                } else if (i12 == 2) {
                    f13 = this.f43349h;
                } else {
                    float f22 = f16 - f17;
                    float f23 = this.f43347f;
                    if (f22 <= f23) {
                        float f24 = this.f43349h;
                        float f25 = this.f43344c * f22;
                        f13 = (f24 + f25) - ((f25 * f22) / (f23 * 2.0f));
                    } else {
                        f13 = this.f43350i;
                    }
                }
            }
        }
        this.f43354m = f12;
        return this.f43352k ? this.f43353l - f13 : this.f43353l + f13;
    }
}
