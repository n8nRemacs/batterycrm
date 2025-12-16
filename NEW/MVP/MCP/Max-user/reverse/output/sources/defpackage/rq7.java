package defpackage;

/* loaded from: classes2.dex */
public final class rq7 implements t98 {
    public final qq7 a;
    public final n5g b;
    public final Integer c;
    public final int d = s5b.c;
    public final long o;

    public rq7(qq7 qq7Var, n5g n5gVar, Integer num) {
        this.a = qq7Var;
        this.b = n5gVar;
        this.c = num;
        this.o = qq7Var.ordinal();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rq7)) {
            return false;
        }
        rq7 rq7Var = (rq7) obj;
        return this.a == rq7Var.a && this.b.equals(rq7Var.b) && this.c.equals(rq7Var.c);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.o;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return this.o == t98Var.getItemId();
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.k(this.b.c, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.t98
    public final int m() {
        return this.d;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        return "InviteActionListItem(type=" + this.a + ", text=" + this.b + ", icon=" + this.c + ")";
    }
}
