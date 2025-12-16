package defpackage;

/* loaded from: classes2.dex */
public final class a44 {
    public final n5g a;
    public final Integer b;
    public final cm6 c;

    public a44(n5g n5gVar, Integer num, cm6 cm6Var, int i) {
        num = (i & 2) != 0 ? null : num;
        this.a = n5gVar;
        this.b = num;
        this.c = cm6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a44)) {
            return false;
        }
        a44 a44Var = (a44) obj;
        return this.a.equals(a44Var.a) && fni.a(this.b, a44Var.b) && this.c.equals(a44Var.c);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a.c) * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((p1g.C0.hashCode() + ((p1g.t0.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ContextMenuAction(title=" + this.a + ", icon=" + this.b + ", iconColor=" + p1g.t0 + ", titleColor=" + p1g.C0 + ", clickAction=" + this.c + ")";
    }
}
