package defpackage;

/* loaded from: classes2.dex */
public final class c5c {
    public static final c5c c = new c5c(0, null);
    public final long a;
    public final String b;

    public c5c(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5c)) {
            return false;
        }
        c5c c5cVar = (c5c) obj;
        return this.a == c5cVar.a && fni.a(this.b, c5cVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("CurrentItem(messageId=", this.a, ", attachId=", this.b);
        sbN.append(")");
        return sbN.toString();
    }
}
