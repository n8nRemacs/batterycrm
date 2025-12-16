package defpackage;

/* loaded from: classes2.dex */
public final class gwe implements t98 {
    public final int a;
    public final int b = z6b.d;
    public final long c;

    public gwe(int i) {
        this.a = i;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gwe) && this.a == ((gwe) obj).a;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    @Override // defpackage.t98
    public final int m() {
        return this.b;
    }

    public final String toString() {
        return wy1.e(this.a, "ShimmerMemberListItem(pos=", ")");
    }
}
