package defpackage;

/* loaded from: classes.dex */
public final class bu1 implements cu1 {
    public final zi1 a;
    public final r5g b;
    public final r5g c;
    public final mc0 d;
    public final String e;
    public final long f;

    public bu1(zi1 zi1Var, r5g r5gVar, r5g r5gVar2, mc0 mc0Var, String str, long j) {
        this.a = zi1Var;
        this.b = r5gVar;
        this.c = r5gVar2;
        this.d = mc0Var;
        this.e = str;
        this.f = j;
    }

    @Override // defpackage.cu1
    public final long a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu1)) {
            return false;
        }
        bu1 bu1Var = (bu1) obj;
        return fni.a(this.a, bu1Var.a) && this.b.equals(bu1Var.b) && this.c.equals(bu1Var.c) && this.d.equals(bu1Var.d) && fni.a(this.e, bu1Var.e) && this.f == bu1Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        String str = this.e;
        return Long.hashCode(this.f) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Single(id=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", avatarAbbreviationModel=" + this.d + ", url=" + this.e + ", lastUpdate=" + this.f + ")";
    }
}
