package defpackage;

/* loaded from: classes2.dex */
public final class oi {
    public final long a;
    public final String b;
    public final int c;

    public oi(long j, String str, int i) {
        this.a = j;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) obj;
        return this.a == oiVar.a && fni.a(this.b, oiVar.b) && this.c == oiVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + u45.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("Key(animojiId=", this.a, ", url=", this.b);
        sbN.append(", size=");
        sbN.append(this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
