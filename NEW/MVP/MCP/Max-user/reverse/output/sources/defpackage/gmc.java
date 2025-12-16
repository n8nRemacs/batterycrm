package defpackage;

/* loaded from: classes2.dex */
public final class gmc extends lmc {
    public final n5g a;
    public final Integer b;
    public final s5g c;

    public gmc(n5g n5gVar, Integer num, s5g s5gVar) {
        this.a = n5gVar;
        this.b = num;
        this.c = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmc)) {
            return false;
        }
        gmc gmcVar = (gmc) obj;
        return this.a.equals(gmcVar.a) && fni.a(this.b, gmcVar.b) && fni.a(this.c, gmcVar.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.c) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        s5g s5gVar = this.c;
        return iHashCode2 + (s5gVar != null ? s5gVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowInfoSnackbar(title=" + this.a + ", iconRes=" + this.b + ", description=" + this.c + ")";
    }
}
