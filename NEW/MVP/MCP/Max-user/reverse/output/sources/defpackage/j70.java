package defpackage;

/* loaded from: classes2.dex */
public final class j70 {
    public final String a;
    public final Long b;

    public j70(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j70)) {
            return false;
        }
        j70 j70Var = (j70) obj;
        return fni.a(this.a, j70Var.a) && fni.a(this.b, j70Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "TokenAttributes(token=" + this.a + ", tokenTtl=" + this.b + ")";
    }
}
