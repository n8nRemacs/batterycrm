package defpackage;

/* loaded from: classes2.dex */
public final class tcg {
    public final ucg a;
    public final vcg b;

    public tcg(ucg ucgVar, vcg vcgVar) {
        this.a = ucgVar;
        this.b = vcgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tcg)) {
            return false;
        }
        tcg tcgVar = (tcg) obj;
        return fni.a(this.a, tcgVar.a) && fni.a(this.b, tcgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopbarBackgroundColors(default=" + this.a + ", disabled=" + this.b + ")";
    }
}
