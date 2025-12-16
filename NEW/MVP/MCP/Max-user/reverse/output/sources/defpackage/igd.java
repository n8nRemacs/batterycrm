package defpackage;

/* loaded from: classes.dex */
public final class igd {
    public final n5g a;
    public final s5g b;
    public final hgd c;
    public final hgd d;
    public final r5g e;
    public final boolean f;

    public igd(n5g n5gVar, n5g n5gVar2, hgd hgdVar, hgd hgdVar2, r5g r5gVar, boolean z) {
        this.a = n5gVar;
        this.b = n5gVar2;
        this.c = hgdVar;
        this.d = hgdVar2;
        this.e = r5gVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igd)) {
            return false;
        }
        igd igdVar = (igd) obj;
        return this.a.equals(igdVar.a) && fni.a(this.b, igdVar.b) && this.c.equals(igdVar.c) && this.d.equals(igdVar.d) && this.e.equals(igdVar.e) && this.f == igdVar.f;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.c) * 31;
        s5g s5gVar = this.b;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ExitWithRecordState(title=" + this.a + ", subtitle=" + this.b + ", negativeButton=" + this.c + ", positiveButton=" + this.d + ", recordTitle=" + this.e + ", canRemove=" + this.f + ")";
    }
}
