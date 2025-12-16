package defpackage;

/* loaded from: classes2.dex */
public final class hib extends iib {
    public final long a;
    public final String b;

    public hib(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hib)) {
            return false;
        }
        hib hibVar = (hib) obj;
        return this.a == hibVar.a && fni.a(this.b, hibVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("OpenImage(messageId=", this.a, ", attachLocalId=", this.b);
        sbN.append(")");
        return sbN.toString();
    }
}
