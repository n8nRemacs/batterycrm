package defpackage;

/* loaded from: classes.dex */
public final class vp1 {
    public final n5g a;
    public final s5g b;

    public vp1(n5g n5gVar, s5g s5gVar) {
        this.a = n5gVar;
        this.b = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp1)) {
            return false;
        }
        vp1 vp1Var = (vp1) obj;
        return this.a.equals(vp1Var.a) && fni.a(this.b, vp1Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.c) * 31;
        s5g s5gVar = this.b;
        return (iHashCode + (s5gVar == null ? 0 : s5gVar.hashCode())) * 29791;
    }

    public final String toString() {
        return "QuoteData(title=" + this.a + ", body=" + this.b + ", image=null, count=null, placeholder=null)";
    }
}
