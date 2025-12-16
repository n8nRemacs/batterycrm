package defpackage;

/* loaded from: classes2.dex */
public final class gr2 {
    public final int a;
    public final s5g b;
    public final boolean c;

    public gr2(int i, s5g s5gVar, boolean z) {
        this.a = i;
        this.b = s5gVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr2)) {
            return false;
        }
        gr2 gr2Var = (gr2) obj;
        return this.a == gr2Var.a && fni.a(this.b, gr2Var.b) && this.c == gr2Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + xc0.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatMembersInfo(titleRes=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", isAdminWithPermission=");
        return az1.k(sb, this.c, ")");
    }
}
