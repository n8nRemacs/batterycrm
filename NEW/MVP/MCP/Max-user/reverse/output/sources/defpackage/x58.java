package defpackage;

/* loaded from: classes2.dex */
public final class x58 extends y58 {
    public final n5g a;
    public final Integer b;
    public final s5g c;

    public x58(n5g n5gVar, Integer num, n5g n5gVar2, int i) {
        num = (i & 2) != 0 ? null : num;
        n5gVar2 = (i & 4) != 0 ? null : n5gVar2;
        this.a = n5gVar;
        this.b = num;
        this.c = n5gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x58)) {
            return false;
        }
        x58 x58Var = (x58) obj;
        return this.a.equals(x58Var.a) && fni.a(this.b, x58Var.b) && fni.a(this.c, x58Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.c) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        s5g s5gVar = this.c;
        return iHashCode2 + (s5gVar != null ? s5gVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.a + ", icon=" + this.b + ", description=" + this.c + ")";
    }
}
