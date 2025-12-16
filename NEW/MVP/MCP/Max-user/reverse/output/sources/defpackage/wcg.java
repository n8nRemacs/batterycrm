package defpackage;

/* loaded from: classes2.dex */
public final class wcg {
    public final tcg a;
    public final xcg b;
    public final adg c;
    public final ddg d;

    public wcg(tcg tcgVar, xcg xcgVar, adg adgVar, ddg ddgVar) {
        this.a = tcgVar;
        this.b = xcgVar;
        this.c = adgVar;
        this.d = ddgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wcg)) {
            return false;
        }
        wcg wcgVar = (wcg) obj;
        return fni.a(this.a, wcgVar.a) && fni.a(this.b, wcgVar.b) && fni.a(this.c, wcgVar.c) && fni.a(this.d, wcgVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TopbarColors(background=" + this.a + ", icon=" + this.b + ", stroke=" + this.c + ", text=" + this.d + ")";
    }
}
