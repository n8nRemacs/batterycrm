package defpackage;

/* loaded from: classes2.dex */
public final class gog implements log {
    public final n5g a;
    public final n5g b;
    public final jog c;

    public gog(n5g n5gVar, n5g n5gVar2, jog jogVar) {
        int i = ivd.a;
        this.a = n5gVar;
        this.b = n5gVar2;
        this.c = jogVar;
    }

    public static gog c(gog gogVar, jog jogVar) {
        gogVar.getClass();
        int i = ivd.a;
        n5g n5gVar = gogVar.a;
        n5g n5gVar2 = gogVar.b;
        gogVar.getClass();
        return new gog(n5gVar, n5gVar2, jogVar);
    }

    @Override // defpackage.log
    public final s5g a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gog)) {
            return false;
        }
        gog gogVar = (gog) obj;
        int i = ivd.a;
        gogVar.getClass();
        return this.a.equals(gogVar.a) && this.b.equals(gogVar.b) && this.c.equals(gogVar.c);
    }

    @Override // defpackage.log
    public final int getIcon() {
        return ivd.k1;
    }

    @Override // defpackage.log
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.k(this.b.c, xrf.k(this.a.c, Integer.hashCode(ivd.k1) * 31, 31), 31);
    }

    public final String toString() {
        return "CheckPassword(icon=" + ivd.k1 + ", title=" + this.a + ", subtitle=" + this.b + ", inputState=" + this.c + ")";
    }
}
