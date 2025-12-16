package defpackage;

/* loaded from: classes2.dex */
public final class k2c implements qfc {
    public final n5g a;

    public k2c(n5g n5gVar) {
        this.a = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2c) && this.a.equals(((k2c) obj).a);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 65536;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return ((long) 65536) == t98Var.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(-2147418112) + (Integer.hashCode(this.a.c) * 31);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        if (t98Var instanceof vwe) {
            return new hgc(((vwe) t98Var).a);
        }
        return null;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return -2147418112;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        return "PlaceholderItem(text=" + this.a + ", viewType=-2147418112)";
    }
}
