package defpackage;

/* loaded from: classes2.dex */
public final class z9 implements pr9 {
    public final x8d a;
    public final String b;
    public final long c;

    public z9(long j, x8d x8dVar, String str) {
        this.a = x8dVar;
        this.b = str;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9)) {
            return false;
        }
        z9 z9Var = (z9) obj;
        return fni.a(this.a, z9Var.a) && fni.a(this.b, z9Var.b) && this.c == z9Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + u45.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddReactionEffect(reaction=");
        sb.append((Object) this.a);
        sb.append(", effectUrl=");
        sb.append(this.b);
        sb.append(", msgId=");
        return ho7.k(sb, this.c, ")");
    }
}
