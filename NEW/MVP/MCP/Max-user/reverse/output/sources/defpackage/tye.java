package defpackage;

/* loaded from: classes2.dex */
public final class tye extends e13 {
    public final s5g a;
    public final Integer b;
    public final s5g c;

    public tye(s5g s5gVar, Integer num, s5g s5gVar2) {
        this.a = s5gVar;
        this.b = num;
        this.c = s5gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tye)) {
            return false;
        }
        tye tyeVar = (tye) obj;
        return fni.a(this.a, tyeVar.a) && fni.a(this.b, tyeVar.b) && fni.a(this.c, tyeVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        s5g s5gVar = this.c;
        return iHashCode2 + (s5gVar != null ? s5gVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.a + ", icon=" + this.b + ", description=" + this.c + ")";
    }
}
