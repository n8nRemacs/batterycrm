package defpackage;

/* loaded from: classes2.dex */
public final class isc {
    public static final ov5 g = new ov5(19);
    public final gsc a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final boolean f;

    public isc(gsc gscVar, int i, int i2, int i3, long j, boolean z) {
        this.a = gscVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isc)) {
            return false;
        }
        isc iscVar = (isc) obj;
        return this.a == iscVar.a && this.b == iscVar.b && this.c == iscVar.c && this.d == iscVar.d && this.e == iscVar.e && this.f == iscVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + a9h.a(xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("Quality(", this.b, "x", this.c, "|");
        sbK.append(this.d);
        sbK.append("|");
        sbK.append(this.e);
        sbK.append("B|ioq=");
        sbK.append(this.f);
        sbK.append("|");
        sbK.append(this.a);
        sbK.append(")");
        return sbK.toString();
    }
}
