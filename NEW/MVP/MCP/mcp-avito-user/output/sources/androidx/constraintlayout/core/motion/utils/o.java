package androidx.constraintlayout.core.motion.utils;

/* compiled from: Schlick.java */
/* loaded from: classes.dex */
public class o extends d {

    /* renamed from: d, reason: collision with root package name */
    public double f43325d;

    /* renamed from: e, reason: collision with root package name */
    public double f43326e;

    @Override // androidx.constraintlayout.core.motion.utils.d
    public final double a(double d12) {
        double d13 = this.f43326e;
        double d14 = this.f43325d;
        if (d12 < d13) {
            return (d13 * d12) / (((d13 - d12) * d14) + d12);
        }
        return ((d12 - 1.0d) * (1.0d - d13)) / ((1.0d - d12) - ((d13 - d12) * d14));
    }

    @Override // androidx.constraintlayout.core.motion.utils.d
    public final double b(double d12) {
        double d13 = this.f43326e;
        double d14 = this.f43325d;
        if (d12 < d13) {
            double d15 = d14 * d13 * d13;
            double d16 = ((d13 - d12) * d14) + d12;
            return d15 / (d16 * d16);
        }
        double d17 = d13 - 1.0d;
        double d18 = (((d13 - d12) * (-d14)) - d12) + 1.0d;
        return ((d17 * d14) * d17) / (d18 * d18);
    }
}
