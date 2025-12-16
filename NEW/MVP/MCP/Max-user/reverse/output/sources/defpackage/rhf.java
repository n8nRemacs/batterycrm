package defpackage;

/* loaded from: classes2.dex */
public final class rhf {
    public final String a;
    public final long b;

    public /* synthetic */ rhf(String str, int i) {
        this((i & 1) != 0 ? null : str, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhf)) {
            return false;
        }
        rhf rhfVar = (rhf) obj;
        return fni.a(this.a, rhfVar.a) && this.b == rhfVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Long.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("QueryState(query=", this.b, this.a, ", marker=");
        sbQ.append(")");
        return sbQ.toString();
    }

    public rhf(String str, long j) {
        this.a = str;
        this.b = j;
    }
}
