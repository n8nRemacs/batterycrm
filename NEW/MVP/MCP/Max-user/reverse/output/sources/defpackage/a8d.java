package defpackage;

/* loaded from: classes.dex */
public final class a8d {
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;

    public a8d(long j, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = i > 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8d)) {
            return false;
        }
        a8d a8dVar = (a8d) obj;
        return this.a == a8dVar.a && this.b == a8dVar.b && this.c == a8dVar.c && this.d == a8dVar.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("RateCallParams(threshold=", this.a, ", sdkThreshold=", this.b, ", minimumCallDuration=");
        sbK.append(this.c);
        sbK.append(", delaySec=");
        sbK.append(this.d);
        sbK.append(")");
        return sbK.toString();
    }
}
