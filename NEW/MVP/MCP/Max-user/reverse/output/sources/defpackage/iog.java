package defpackage;

/* loaded from: classes2.dex */
public final class iog implements log {
    public final n5g a;
    public final jog b;
    public final jog c;

    public iog(n5g n5gVar, jog jogVar, jog jogVar2) {
        int i = ivd.a;
        this.a = n5gVar;
        this.b = jogVar;
        this.c = jogVar2;
    }

    public static iog c(iog iogVar, jog jogVar, jog jogVar2, int i) {
        iogVar.getClass();
        int i2 = ivd.a;
        n5g n5gVar = iogVar.a;
        if ((i & 4) != 0) {
            jogVar = iogVar.b;
        }
        if ((i & 8) != 0) {
            jogVar2 = iogVar.c;
        }
        iogVar.getClass();
        return new iog(n5gVar, jogVar, jogVar2);
    }

    @Override // defpackage.log
    public final s5g a() {
        return null;
    }

    @Override // defpackage.log
    public final boolean b() {
        return (this.b.c == null && this.c.c == null) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iog)) {
            return false;
        }
        iog iogVar = (iog) obj;
        int i = ivd.a;
        iogVar.getClass();
        return this.a.equals(iogVar.a) && fni.a(this.b, iogVar.b) && fni.a(this.c, iogVar.c);
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
        return this.c.hashCode() + ((this.b.hashCode() + xrf.k(this.a.c, Integer.hashCode(ivd.k1) * 31, 31)) * 31);
    }

    public final String toString() {
        return "CreatePassword(icon=" + ivd.k1 + ", title=" + this.a + ", inputState=" + this.b + ", secondInputState=" + this.c + ")";
    }
}
