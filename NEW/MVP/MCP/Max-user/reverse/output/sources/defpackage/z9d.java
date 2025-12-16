package defpackage;

/* loaded from: classes2.dex */
public final class z9d {
    public final long a;
    public final String b;
    public final x8d c;

    public z9d(long j, x8d x8dVar, String str) {
        this.a = j;
        this.b = str;
        this.c = x8dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9d)) {
            return false;
        }
        z9d z9dVar = (z9d) obj;
        return this.a == z9dVar.a && fni.a(this.b, z9dVar.b) && fni.a(this.c, z9dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + u45.e(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("PlayingState(msgId=", this.a, ", url=", this.b);
        sbN.append(", reaction=");
        sbN.append((Object) this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
