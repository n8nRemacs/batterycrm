package defpackage;

/* loaded from: classes.dex */
public final class p37 extends v37 {
    public final long a;
    public final CharSequence b;
    public final String c;
    public final boolean d;

    public p37(long j, CharSequence charSequence, String str, boolean z) {
        this.a = j;
        this.b = charSequence;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p37)) {
            return false;
        }
        p37 p37Var = (p37) obj;
        return this.a == p37Var.a && fni.a(this.b, p37Var.b) && fni.a(this.c, p37Var.c) && this.d == p37Var.d;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        CharSequence charSequence = this.b;
        int iHashCode2 = (iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Avatar(avatarColorId=" + this.a + ", abbreviation=" + ((Object) this.b) + ", avatar=" + this.c + ", isCallLink=" + this.d + ")";
    }
}
