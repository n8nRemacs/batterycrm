package defpackage;

/* loaded from: classes2.dex */
public final class nm2 extends id0 {
    public final n5g b;
    public final Integer c;
    public final s5g d;

    public nm2(n5g n5gVar, Integer num, s5g s5gVar) {
        super(4);
        this.b = n5gVar;
        this.c = num;
        this.d = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm2)) {
            return false;
        }
        nm2 nm2Var = (nm2) obj;
        return fni.a(this.b, nm2Var.b) && fni.a(this.c, nm2Var.c) && fni.a(this.d, nm2Var.d);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.b.c) * 31;
        Integer num = this.c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        s5g s5gVar = this.d;
        return iHashCode2 + (s5gVar != null ? s5gVar.hashCode() : 0);
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.b + ", icon=" + this.c + ", description=" + this.d + ")";
    }
}
