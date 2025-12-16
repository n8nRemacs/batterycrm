package defpackage;

/* loaded from: classes2.dex */
public final class k94 implements t98 {
    public final int a;
    public final int b;
    public final n5g c;

    public k94(int i, int i2, n5g n5gVar) {
        this.a = i;
        this.b = i2;
        this.c = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k94)) {
            return false;
        }
        k94 k94Var = (k94) obj;
        return this.a == k94Var.a && this.b == k94Var.b && this.c.equals(k94Var.c);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.c) + xrf.k(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return ndb.n;
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("CreateButton(id=", this.a, ", icon=", this.b, ", text=");
        sbK.append(this.c);
        sbK.append(")");
        return sbK.toString();
    }
}
