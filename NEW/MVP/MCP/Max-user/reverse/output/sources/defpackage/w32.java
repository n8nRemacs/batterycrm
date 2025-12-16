package defpackage;

/* loaded from: classes2.dex */
public final class w32 implements qfc {
    public final s5g a;

    public w32(s5g s5gVar) {
        this.a = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w32) && fni.a(this.a, ((w32) obj).a);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 256;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return ((long) 256) == t98Var.getItemId();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return 256;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        return "CancelDeleteProfileItem(text=" + this.a + ")";
    }
}
