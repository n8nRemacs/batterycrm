package defpackage;

/* loaded from: classes.dex */
public final class r7c {
    public final String a;
    public final Long b;

    public r7c(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r7c)) {
            return false;
        }
        r7c r7cVar = (r7c) obj;
        return fni.a(this.a, r7cVar.a) && fni.a(this.b, r7cVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
