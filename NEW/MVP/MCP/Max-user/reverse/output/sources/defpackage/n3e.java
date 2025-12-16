package defpackage;

/* loaded from: classes2.dex */
public final class n3e {
    public final long a;
    public final long b;
    public final x8d c;

    public n3e(long j, long j2, x8d x8dVar) {
        this.a = j;
        this.b = j2;
        this.c = x8dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3e)) {
            return false;
        }
        n3e n3eVar = (n3e) obj;
        return this.a == n3eVar.a && this.b == n3eVar.b && fni.a(this.c, n3eVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a9h.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "ReactionInfo(messageServerId=", ", messageTime=");
        sbL.append(this.b);
        sbL.append(", reaction=");
        sbL.append((Object) this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
