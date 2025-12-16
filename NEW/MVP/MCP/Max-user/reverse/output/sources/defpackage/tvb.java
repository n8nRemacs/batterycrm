package defpackage;

/* loaded from: classes2.dex */
public final class tvb extends cda {
    public final double b;
    public final double c;

    public tvb(double d, double d2) {
        super(qqg.a);
        this.b = d;
        this.c = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tvb)) {
            return false;
        }
        tvb tvbVar = (tvb) obj;
        return Double.compare(this.b, tvbVar.b) == 0 && Double.compare(this.c, tvbVar.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + (Double.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "SendLocation(lat=" + this.b + ", lon=" + this.c + ")";
    }
}
