package defpackage;

/* loaded from: classes.dex */
public final class nr1 {
    public static final nr1 d = new nr1(2, null, null);
    public final int a;
    public final CharSequence b;
    public final CharSequence c;

    public nr1(int i, CharSequence charSequence, CharSequence charSequence2) {
        this.a = i;
        this.b = charSequence;
        this.c = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr1)) {
            return false;
        }
        nr1 nr1Var = (nr1) obj;
        return this.a == nr1Var.a && fni.a(this.b, nr1Var.b) && fni.a(this.c, nr1Var.c);
    }

    public final int hashCode() {
        int iV = az1.v(this.a) * 31;
        CharSequence charSequence = this.b;
        int iHashCode = (iV + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        return iHashCode + (charSequence2 != null ? charSequence2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallTimeData(place=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? "null" : "SPEAKER" : "HEADER");
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", status=");
        sb.append((Object) this.c);
        sb.append(")");
        return sb.toString();
    }
}
