package defpackage;

/* loaded from: classes2.dex */
public final class fjc extends mjc {
    public final int a;
    public final toe b;
    public final boolean c;
    public final int d;

    public fjc(int i, toe toeVar, boolean z, int i2) {
        this.a = i;
        this.b = toeVar;
        this.c = z;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjc)) {
            return false;
        }
        fjc fjcVar = (fjc) obj;
        return this.a == fjcVar.a && this.b.equals(fjcVar.b) && this.c == fjcVar.c && this.d == fjcVar.d;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + a9h.b((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.d;
    }

    public final String toString() {
        return "InviteActionItem(actionId=" + this.a + ", model=" + this.b + ", isEnabled=" + this.c + ", itemViewType=" + j6j.c(this.d) + ")";
    }
}
