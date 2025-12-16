package defpackage;

/* loaded from: classes2.dex */
public final class qbe implements qfc {
    public final int a;
    public final boolean b;
    public final n5g c;
    public final n5g d;
    public final int o;

    public qbe(int i, boolean z, n5g n5gVar, n5g n5gVar2, int i2) {
        this.a = i;
        this.b = z;
        this.c = n5gVar;
        this.d = n5gVar2;
        this.o = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qbe)) {
            return false;
        }
        qbe qbeVar = (qbe) obj;
        return this.a == qbeVar.a && this.b == qbeVar.b && this.c.equals(qbeVar.c) && this.d.equals(qbeVar.d) && this.o == qbeVar.o;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 8192;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return ((long) 8192) == t98Var.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + xrf.k(this.d.c, xrf.k(this.c.c, a9h.b(Integer.hashCode(this.a) * 31, 31, this.b), 31), 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.o;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectableItem(valueId=");
        sb.append(this.a);
        sb.append(", isSelected=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", viewType=");
        return ho7.j(sb, this.o, ")");
    }
}
