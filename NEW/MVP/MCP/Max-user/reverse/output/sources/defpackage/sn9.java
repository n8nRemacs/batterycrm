package defpackage;

/* loaded from: classes2.dex */
public final class sn9 {
    public final int a;
    public final s5g b;
    public final boolean c;
    public final az d;
    public final boolean e;
    public final Integer f;
    public final boolean g;

    public sn9(int i, s5g s5gVar, boolean z, az azVar, boolean z2, Integer num, boolean z3) {
        this.a = i;
        this.b = s5gVar;
        this.c = z;
        this.d = azVar;
        this.e = z2;
        this.f = num;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sn9)) {
            return false;
        }
        sn9 sn9Var = (sn9) obj;
        return this.a == sn9Var.a && fni.a(this.b, sn9Var.b) && this.c == sn9Var.c && fni.a(this.d, sn9Var.d) && this.e == sn9Var.e && fni.a(this.f, sn9Var.f) && this.g == sn9Var.g;
    }

    public final int hashCode() {
        int iB = a9h.b(xc0.d(az1.v(this.a) * 31, 31, this.b), 31, this.c);
        az azVar = this.d;
        int iB2 = a9h.b((iB + (azVar == null ? 0 : azVar.hashCode())) * 31, 31, this.e);
        Integer num = this.f;
        return Boolean.hashCode(this.g) + ((iB2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuoteData(type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "FORWARD" : "REPLY" : "EDIT");
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", showVerificationMark=");
        sb.append(this.c);
        sb.append(", attachDescription=");
        sb.append(this.d);
        sb.append(", isForwardAuthorHidden=");
        sb.append(this.e);
        sb.append(", startIconResId=");
        sb.append(this.f);
        sb.append(", isAuthorVisibilityAvailable=");
        return az1.k(sb, this.g, ")");
    }
}
