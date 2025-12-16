package defpackage;

/* loaded from: classes2.dex */
public final class a18 implements qfc {
    public final String a;
    public final zf3 b;

    public a18(String str, zf3 zf3Var) {
        this.a = str;
        this.b = zf3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a18)) {
            return false;
        }
        a18 a18Var = (a18) obj;
        return fni.a(this.a, a18Var.a) && fni.a(this.b, a18Var.b);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 2;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return ((long) 2) == t98Var.getItemId();
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        zf3 zf3Var = this.b;
        return iHashCode + (zf3Var != null ? zf3Var.a.hashCode() : 0);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        if (t98Var instanceof a18) {
            return new ggc(((a18) t98Var).b);
        }
        return null;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 2;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        return "LastNameItem(text=" + this.a + ", errorText=" + this.b + ")";
    }
}
