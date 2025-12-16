package defpackage;

/* loaded from: classes2.dex */
public final class a7 implements qfc {
    public final int a;
    public final toe b;
    public final int c;

    public /* synthetic */ a7(int i, toe toeVar) {
        this(i, toeVar, 1024);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a7)) {
            return false;
        }
        a7 a7Var = (a7) obj;
        return this.a == a7Var.a && fni.a(this.b, a7Var.b) && this.c == a7Var.c;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        if (t98Var instanceof a7) {
            return this.a == ((a7) t98Var).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.c;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        if ((t98Var instanceof a7) && !(((a7) t98Var).b.Y instanceof doe)) {
            return equals(t98Var);
        }
        return false;
    }

    public final String toString() {
        String strB = i6j.b(this.c);
        StringBuilder sb = new StringBuilder("ActionItem(actionId=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", itemViewType=");
        return ho7.l(sb, strB, ")");
    }

    public a7(int i, toe toeVar, int i2) {
        this.a = i;
        this.b = toeVar;
        this.c = i2;
    }
}
