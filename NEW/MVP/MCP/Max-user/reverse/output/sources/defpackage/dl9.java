package defpackage;

/* loaded from: classes2.dex */
public final class dl9 {
    public static final dl9 d = new dl9(-1, null, null);
    public final long a;
    public final String b;
    public final CharSequence c;

    public dl9(long j, CharSequence charSequence, String str) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl9)) {
            return false;
        }
        dl9 dl9Var = (dl9) obj;
        return this.a == dl9Var.a && fni.a(this.b, dl9Var.b) && fni.a(this.c, dl9Var.c);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.c;
        return iHashCode2 + (charSequence != null ? charSequence.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("AvatarParams(id=", this.a, ", url=", this.b);
        sbN.append(", placeholder=");
        sbN.append((Object) this.c);
        sbN.append(")");
        return sbN.toString();
    }
}
