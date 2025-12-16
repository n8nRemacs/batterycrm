package defpackage;

/* loaded from: classes2.dex */
public final class a94 {
    public final x2b a;
    public final int b;
    public final s5g c;

    public a94(x2b x2bVar, int i, s5g s5gVar) {
        this.a = x2bVar;
        this.b = i;
        this.c = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a94)) {
            return false;
        }
        a94 a94Var = (a94) obj;
        return fni.a(this.a, a94Var.a) && this.b == a94Var.b && fni.a(this.c, a94Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + xrf.k(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CountryInfoModel(country=" + this.a + ", maxNumbersSize=" + this.b + ", hint=" + this.c + ")";
    }
}
