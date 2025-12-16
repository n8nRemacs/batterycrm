package defpackage;

/* loaded from: classes2.dex */
public final class fc9 implements t98 {
    public final long X;
    public final int Y = z6b.a;
    public final int a;
    public final s5g b;
    public final hoe c;
    public final Integer d;
    public final foe o;

    public fc9(int i, s5g s5gVar, hoe hoeVar, Integer num, foe foeVar) {
        this.a = i;
        this.b = s5gVar;
        this.c = hoeVar;
        this.d = num;
        this.o = foeVar;
        this.X = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fc9)) {
            return false;
        }
        fc9 fc9Var = (fc9) obj;
        return this.a == fc9Var.a && fni.a(this.b, fc9Var.b) && this.c == fc9Var.c && fni.a(this.d, fc9Var.d) && fni.a(this.o, fc9Var.o);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.X;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + xc0.d(Integer.hashCode(this.a) * 31, 31, this.b)) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        foe foeVar = this.o;
        return iHashCode2 + (foeVar != null ? foeVar.hashCode() : 0);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.Y;
    }

    public final String toString() {
        return "MemberListActionItem(id=" + this.a + ", text=" + this.b + ", type=" + this.c + ", startIconRes=" + this.d + ", endViewType=" + this.o + ")";
    }
}
