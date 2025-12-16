package defpackage;

/* loaded from: classes2.dex */
public final class ti8 implements qfc {
    public static final ti8 a = new ti8();

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ti8);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 512;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return ((long) 512) == t98Var.getItemId();
    }

    public final int hashCode() {
        return -95268716;
    }

    @Override // defpackage.t98
    public final int m() {
        return 512;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        return "LogoutItem";
    }
}
