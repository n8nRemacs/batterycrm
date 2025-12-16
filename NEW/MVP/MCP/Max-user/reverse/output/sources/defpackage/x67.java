package defpackage;

/* loaded from: classes2.dex */
public final class x67 implements t98 {
    public final String a;
    public final Boolean b;

    public x67(String str, Boolean bool) {
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x67)) {
            return false;
        }
        x67 x67Var = (x67) obj;
        return fni.a(this.a, x67Var.a) && fni.a(this.b, x67Var.b);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a.hashCode();
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return getItemId() == t98Var.getItemId();
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        x67 x67Var = t98Var instanceof x67 ? (x67) t98Var : null;
        if (x67Var != null) {
            Boolean bool = x67Var.b;
            if (!this.b.equals(bool)) {
                return new w67(bool);
            }
        }
        return null;
    }

    @Override // defpackage.t98
    public final int m() {
        return 0;
    }

    public final String toString() {
        return "HostItem(host=" + this.a + ", isSelected=" + this.b + ")";
    }
}
