package defpackage;

/* loaded from: classes.dex */
public final class zq implements t98 {
    public final xq a;
    public final Boolean b;
    public final n5g c;

    public zq(xq xqVar, Boolean bool, n5g n5gVar) {
        this.a = xqVar;
        this.b = bool;
        this.c = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq)) {
            return false;
        }
        zq zqVar = (zq) obj;
        return this.a == zqVar.a && this.b.equals(zqVar.b) && this.c.equals(zqVar.c);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a.ordinal();
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return getItemId() == t98Var.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        zq zqVar = t98Var instanceof zq ? (zq) t98Var : null;
        if (zqVar != null) {
            Boolean bool = zqVar.b;
            if (!this.b.equals(bool)) {
                return new yq(bool);
            }
        }
        return null;
    }

    @Override // defpackage.t98
    public final int m() {
        return 0;
    }

    public final String toString() {
        return "AppearanceModeItem(mode=" + this.a + ", isSelected=" + this.b + ", title=" + this.c + ")";
    }
}
