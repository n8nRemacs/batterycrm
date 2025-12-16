package defpackage;

/* loaded from: classes2.dex */
public final class ha6 implements t98 {
    public final boolean X;
    public final int Y;
    public final long a;
    public final String b;
    public final CharSequence c;
    public final long d;
    public final CharSequence o;

    public ha6(long j, String str, CharSequence charSequence, long j2, CharSequence charSequence2, boolean z, int i) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
        this.d = j2;
        this.o = charSequence2;
        this.X = z;
        this.Y = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha6)) {
            return false;
        }
        ha6 ha6Var = (ha6) obj;
        return this.a == ha6Var.a && fni.a(this.b, ha6Var.b) && fni.a(this.c, ha6Var.c) && this.d == ha6Var.d && fni.a(this.o, ha6Var.o) && this.X == ha6Var.X && this.Y == ha6Var.Y;
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return Integer.hashCode(this.Y) + a9h.b(u45.g(this.o, a9h.a(u45.g(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d), 31), 31, this.X);
    }

    @Override // defpackage.t98
    /* renamed from: m */
    public final int getK0() {
        return this.Y;
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("FolderMemberItem(itemId=", this.a, ", avatarUrl=", this.b);
        sbN.append(", title=");
        sbN.append((Object) this.c);
        sbN.append(", avatarSourceId=");
        sbN.append(this.d);
        sbN.append(", abbreviation=");
        sbN.append((Object) this.o);
        sbN.append(", isVerified=");
        sbN.append(this.X);
        sbN.append(", viewType=");
        sbN.append(this.Y);
        sbN.append(")");
        return sbN.toString();
    }
}
