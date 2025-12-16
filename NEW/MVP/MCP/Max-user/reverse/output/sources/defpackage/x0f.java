package defpackage;

/* loaded from: classes.dex */
public final class x0f implements t98 {
    public final int a;
    public final n5g b;
    public final r5g c;
    public final long d;
    public final int o = vxc.about_app_simple_cell_view_type;

    public x0f(int i, n5g n5gVar, r5g r5gVar) {
        this.a = i;
        this.b = n5gVar;
        this.c = r5gVar;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0f)) {
            return false;
        }
        x0f x0fVar = (x0f) obj;
        return this.a == x0fVar.a && this.b.equals(x0fVar.b) && this.c.equals(x0fVar.c);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.k(this.b.c, Integer.hashCode(this.a) * 31, 31);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.o;
    }

    public final String toString() {
        return "SimpleActionItem(id=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ")";
    }
}
