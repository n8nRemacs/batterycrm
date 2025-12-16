package defpackage;

/* loaded from: classes2.dex */
public final class rkc extends id0 {
    public final long b;
    public final pdc c;

    public rkc(long j, pdc pdcVar) {
        super(16);
        this.b = j;
        this.c = pdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkc)) {
            return false;
        }
        rkc rkcVar = (rkc) obj;
        return this.b == rkcVar.b && this.c == rkcVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return "EditProfile(id=" + this.b + ", type=" + this.c + ")";
    }
}
