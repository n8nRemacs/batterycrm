package defpackage;

/* loaded from: classes2.dex */
public final class mt4 implements qfc {
    public final n5g a;

    public mt4(n5g n5gVar) {
        this.a = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mt4) && this.a.equals(((mt4) obj).a);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 128;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return ((long) 128) == t98Var.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.c);
    }

    @Override // defpackage.t98
    public final int m() {
        return 128;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        return "DeleteProfileItem(text=" + this.a + ")";
    }
}
