package defpackage;

/* loaded from: classes2.dex */
public final class kmc extends lmc {
    public final Integer a;
    public final s5g b;

    public kmc(s5g s5gVar, Integer num) {
        this.a = num;
        this.b = s5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmc)) {
            return false;
        }
        kmc kmcVar = (kmc) obj;
        return fni.a(this.a, kmcVar.a) && fni.a(this.b, kmcVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        return this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "ShowSuccessSnackbar(iconRes=" + this.a + ", textSource=" + this.b + ")";
    }
}
