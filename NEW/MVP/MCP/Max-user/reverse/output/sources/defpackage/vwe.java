package defpackage;

/* loaded from: classes2.dex */
public final class vwe implements qfc {
    public final laj a;

    public vwe(laj lajVar) {
        this.a = lajVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vwe) && this.a.equals(((vwe) obj).a);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 16;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return ((long) 16) == t98Var.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(-2147483632) + (this.a.hashCode() * 31);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        if (t98Var instanceof vwe) {
            return new hgc(((vwe) t98Var).a);
        }
        return null;
    }

    @Override // defpackage.t98
    public final int m() {
        return -2147483632;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        return "ShortLinkInputItem(state=" + this.a + ", viewType=-2147483632)";
    }
}
