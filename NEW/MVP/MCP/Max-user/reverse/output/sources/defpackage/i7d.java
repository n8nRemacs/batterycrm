package defpackage;

/* loaded from: classes.dex */
public final class i7d {
    public static final i7d c = new i7d(s5g.b, null);
    public final s5g a;
    public final s5g b;

    public i7d(s5g s5gVar, p5g p5gVar) {
        this.a = s5gVar;
        this.b = p5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7d)) {
            return false;
        }
        i7d i7dVar = (i7d) obj;
        return fni.a(this.a, i7dVar.a) && fni.a(this.b, i7dVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        s5g s5gVar = this.b;
        return iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode());
    }

    public final String toString() {
        return "RaiseHandState(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
