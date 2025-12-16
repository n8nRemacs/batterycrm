package defpackage;

/* loaded from: classes2.dex */
public final class rs3 {
    public final boolean a;
    public final double b;
    public final double c;

    public rs3(boolean z, Double d, Double d2) {
        double dDoubleValue = d != null ? d.doubleValue() : 0.01d;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 48000.0d;
        this.a = z;
        this.b = dDoubleValue;
        this.c = dDoubleValue2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs3)) {
            return false;
        }
        rs3 rs3Var = (rs3) obj;
        return this.a == rs3Var.a && Double.compare(this.b, rs3Var.b) == 0 && Double.compare(this.c, rs3Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + wsf.a(Boolean.hashCode(this.a) * 31, this.b);
    }

    public final String toString() {
        return "Config(isEnabled=" + this.a + ", maxLoss=" + this.b + ", minBandwidth=" + this.c + ")";
    }
}
