package defpackage;

/* loaded from: classes2.dex */
public final class ps8 {
    public final double a;
    public final double b;

    public ps8(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps8)) {
            return false;
        }
        ps8 ps8Var = (ps8) obj;
        return Double.compare(this.a, ps8Var.a) == 0 && Double.compare(this.b, ps8Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NetworkState(roundTripTimeMs=" + this.a + ", lostPacketsFraction=" + this.b + ")";
    }
}
