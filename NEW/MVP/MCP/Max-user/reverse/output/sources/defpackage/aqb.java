package defpackage;

/* loaded from: classes2.dex */
public final class aqb {
    public final int a;
    public final int b;

    public aqb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqb)) {
            return false;
        }
        aqb aqbVar = (aqb) obj;
        return this.a == aqbVar.a && this.b == aqbVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("Bitrate(dimension=", this.a, ", bitrate=", this.b, ")");
    }
}
