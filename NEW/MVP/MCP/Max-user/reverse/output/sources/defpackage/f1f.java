package defpackage;

/* loaded from: classes2.dex */
public final class f1f {
    public final int a;
    public final s5g b;
    public final Integer c;
    public final Integer d;
    public final Integer e;

    public f1f(int i, s5g s5gVar, Integer num, Integer num2, Integer num3) {
        this.a = i;
        this.b = s5gVar;
        this.c = num;
        this.d = num2;
        this.e = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1f)) {
            return false;
        }
        f1f f1fVar = (f1f) obj;
        return this.a == f1fVar.a && fni.a(this.b, f1fVar.b) && fni.a(this.c, f1fVar.c) && fni.a(this.d, f1fVar.d) && fni.a(this.e, f1fVar.e);
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
        return "SimpleContextMenuAction(id=" + this.a + ", text=" + this.b + ", textColor=" + this.c + ", icon=" + this.d + ", iconColor=" + this.e + ")";
    }
}
