package defpackage;

/* loaded from: classes2.dex */
public final class inf {
    public final hnf a;
    public final jnf b;
    public final knf c;

    public inf(hnf hnfVar, jnf jnfVar, knf knfVar) {
        this.a = hnfVar;
        this.b = jnfVar;
        this.c = knfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inf)) {
            return false;
        }
        inf infVar = (inf) obj;
        return fni.a(this.a, infVar.a) && fni.a(this.b, infVar.b) && fni.a(this.c, infVar.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + xrf.k(this.b.a, Integer.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        return "StrokeLocalColors(carver=" + this.a + ", tabBar=" + this.b + ", topBar=" + this.c + ")";
    }
}
