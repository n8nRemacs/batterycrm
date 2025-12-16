package defpackage;

/* loaded from: classes2.dex */
public final class swe implements qfc {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof swe)) {
            return false;
        }
        ((swe) obj).getClass();
        return true;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 8;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return ((long) 8) == t98Var.getItemId();
    }

    public final int hashCode() {
        return Integer.hashCode(536870920);
    }

    @Override // defpackage.t98
    public final int m() {
        return 536870920;
    }

    @Override // defpackage.t98
    public final boolean q(t98 t98Var) {
        return equals(t98Var);
    }

    public final String toString() {
        return "ShortLinkHeaderItem(viewType=536870920)";
    }
}
