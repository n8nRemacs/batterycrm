package defpackage;

/* loaded from: classes2.dex */
public final class eq0 implements t98 {
    public final long a;
    public final String b;
    public final String c;
    public final CharSequence d;

    public eq0(long j, String str, String str2, CharSequence charSequence) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq0)) {
            return false;
        }
        eq0 eq0Var = (eq0) obj;
        return this.a == eq0Var.a && fni.a(this.b, eq0Var.b) && this.c.equals(eq0Var.c) && fni.a(this.d, eq0Var.d);
    }

    @Override // defpackage.t98
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    @Override // defpackage.t98
    public final int m() {
        return 0;
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("BlackListItem(itemId=", this.a, ", avatar=", this.b);
        sbN.append(", name=");
        sbN.append((Object) this.c);
        sbN.append(", abbreviation=");
        sbN.append((Object) this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
