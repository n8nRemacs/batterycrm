package defpackage;

/* loaded from: classes2.dex */
public final class u14 implements t98 {
    public final int a;
    public final Integer b;
    public final int c;

    public u14(int i, Integer num) {
        int i2 = yud.a;
        int i3 = v1b.a;
        this.a = i;
        this.b = num;
        this.c = u1b.q;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u14)) {
            return false;
        }
        u14 u14Var = (u14) obj;
        int i = yud.a;
        u14Var.getClass();
        int i2 = v1b.a;
        return this.a == u14Var.a && fni.a(this.b, u14Var.b);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return 0L;
    }

    @Override // defpackage.t98
    public final boolean h(t98 t98Var) {
        return t98Var instanceof u14;
    }

    public final int hashCode() {
        int iK = xrf.k(this.a, xrf.k(v1b.t, Integer.hashCode(yud.G0) * 31, 31), 31);
        Integer num = this.b;
        return iK + (num == null ? 0 : num.hashCode());
    }

    @Override // defpackage.t98
    public final Object k(t98 t98Var) {
        u14 u14Var = t98Var instanceof u14 ? (u14) t98Var : null;
        if (u14Var != null) {
            Integer num = u14Var.b;
            if (!fni.a(num, this.b)) {
                return new t14(num);
            }
        }
        return null;
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("ContactsEmptySearchResultItem(iconRes=", yud.G0, ", titleRes=", v1b.t, ", descriptionRes=");
        sbK.append(this.a);
        sbK.append(", buttonTitleRes=");
        sbK.append(this.b);
        sbK.append(")");
        return sbK.toString();
    }
}
