package defpackage;

/* loaded from: classes2.dex */
public final class sv {
    public final long a;
    public final int b;

    public sv(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv)) {
            return false;
        }
        sv svVar = (sv) obj;
        return this.a == svVar.a && this.b == svVar.b;
    }

    public final int hashCode() {
        return az1.v(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "RemoteKey(time=", ", dir=");
        int i = this.b;
        sbL.append(i != 1 ? i != 2 ? "null" : "BACKWARD" : "FORWARD");
        sbL.append(")");
        return sbL.toString();
    }
}
