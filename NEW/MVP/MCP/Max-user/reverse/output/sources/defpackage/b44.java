package defpackage;

/* loaded from: classes2.dex */
public final class b44 {
    public final int a;
    public final s5g b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public /* synthetic */ b44(int i, s5g s5gVar, Integer num, Integer num2, int i2) {
        this(i, s5gVar, (Integer) null, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? null : num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b44)) {
            return false;
        }
        b44 b44Var = (b44) obj;
        return this.a == b44Var.a && fni.a(this.b, b44Var.b) && fni.a(this.c, b44Var.c) && fni.a(this.d, b44Var.d) && fni.a(this.e, b44Var.e);
    }

    public final int hashCode() {
        int iD = xc0.d(Integer.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int iHashCode = (iD + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.e;
        return iHashCode2 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        return "ContextMenuAction(id=" + this.a + ", text=" + this.b + ", textColor=" + this.c + ", icon=" + this.d + ", iconColor=" + this.e + ")";
    }

    public b44(int i, s5g s5gVar, Integer num, Integer num2, Integer num3) {
        this.a = i;
        this.b = s5gVar;
        this.c = num;
        this.d = num2;
        this.e = num3;
    }
}
