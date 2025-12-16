package defpackage;

/* loaded from: classes2.dex */
public final class dj7 implements qfc {
    public final l5g a;

    public dj7(l5g l5gVar) {
        this.a = l5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dj7) && this.a.equals(((dj7) obj).a);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 64;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return ((long) 64) == t98Var.getItemId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.t98
    public final int m() {
        return 64;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        return "InactiveTimeDeleteProfileItem(text=" + this.a + ")";
    }
}
