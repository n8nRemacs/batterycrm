package defpackage;

/* loaded from: classes2.dex */
public final class pad {
    public final x8d a;
    public final long b;
    public final long c;
    public final xl9 d;

    public pad(x8d x8dVar, long j, long j2, xl9 xl9Var) {
        this.a = x8dVar;
        this.b = j;
        this.c = j2;
        this.d = xl9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pad)) {
            return false;
        }
        pad padVar = (pad) obj;
        return fni.a(this.a, padVar.a) && this.b == padVar.b && this.c == padVar.c && fni.a(this.d, padVar.d);
    }

    public final int hashCode() {
        int iA = a9h.a(a9h.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        xl9 xl9Var = this.d;
        return iA + (xl9Var == null ? 0 : xl9Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelfReactionData(selfReaction=");
        sb.append((Object) this.a);
        sb.append(", msgLocalId=");
        sb.append(this.b);
        az1.r(this.c, ", msgServerId=", ", reactions=", sb);
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
