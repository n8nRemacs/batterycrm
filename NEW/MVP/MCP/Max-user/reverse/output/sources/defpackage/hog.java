package defpackage;

/* loaded from: classes2.dex */
public final class hog implements log {
    public final n5g a;
    public final n5g b;
    public final jog c;

    public hog(n5g n5gVar, n5g n5gVar2, jog jogVar) {
        int i = ivd.a;
        this.a = n5gVar;
        this.b = n5gVar2;
        this.c = jogVar;
    }

    public static hog c(hog hogVar, jog jogVar) {
        hogVar.getClass();
        int i = ivd.a;
        n5g n5gVar = hogVar.a;
        n5g n5gVar2 = hogVar.b;
        hogVar.getClass();
        return new hog(n5gVar, n5gVar2, jogVar);
    }

    @Override // defpackage.log
    public final s5g a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hog)) {
            return false;
        }
        hog hogVar = (hog) obj;
        int i = ivd.a;
        hogVar.getClass();
        return this.a.equals(hogVar.a) && this.b.equals(hogVar.b) && this.c.equals(hogVar.c);
    }

    @Override // defpackage.log
    public final int getIcon() {
        return ivd.c1;
    }

    @Override // defpackage.log
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.k(this.b.c, xrf.k(this.a.c, Integer.hashCode(ivd.c1) * 31, 31), 31);
    }

    public final String toString() {
        return "CreateHint(icon=" + ivd.c1 + ", title=" + this.a + ", subtitle=" + this.b + ", inputState=" + this.c + ")";
    }
}
