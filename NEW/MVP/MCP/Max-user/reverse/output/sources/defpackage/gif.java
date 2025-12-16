package defpackage;

/* loaded from: classes2.dex */
public final class gif {
    public final long a;
    public final String b;

    public gif(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gif)) {
            return false;
        }
        gif gifVar = (gif) obj;
        return this.a == gifVar.a && fni.a(this.b, gifVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("QueryState(marker=", this.a, ", query=", this.b);
        sbN.append(")");
        return sbN.toString();
    }

    public /* synthetic */ gif(String str, int i) {
        this(0L, (i & 2) != 0 ? null : str);
    }
}
