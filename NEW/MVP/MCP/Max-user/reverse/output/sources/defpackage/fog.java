package defpackage;

/* loaded from: classes2.dex */
public final class fog implements log {
    public final n5g a;
    public final n5g b;
    public final jog c;

    public fog(n5g n5gVar, n5g n5gVar2, jog jogVar) {
        int i = ivd.a;
        this.a = n5gVar;
        this.b = n5gVar2;
        this.c = jogVar;
    }

    public static fog c(fog fogVar, jog jogVar) {
        fogVar.getClass();
        int i = ivd.a;
        n5g n5gVar = fogVar.a;
        n5g n5gVar2 = fogVar.b;
        fogVar.getClass();
        return new fog(n5gVar, n5gVar2, jogVar);
    }

    @Override // defpackage.log
    public final s5g a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fog)) {
            return false;
        }
        fog fogVar = (fog) obj;
        int i = ivd.a;
        fogVar.getClass();
        return this.a.equals(fogVar.a) && this.b.equals(fogVar.b) && this.c.equals(fogVar.c);
    }

    @Override // defpackage.log
    public final int getIcon() {
        return ivd.g1;
    }

    @Override // defpackage.log
    public final s5g getTitle() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.k(this.b.c, xrf.k(this.a.c, Integer.hashCode(ivd.g1) * 31, 31), 31);
    }

    public final String toString() {
        return "AddEmail(icon=" + ivd.g1 + ", title=" + this.a + ", subtitle=" + this.b + ", inputState=" + this.c + ")";
    }
}
