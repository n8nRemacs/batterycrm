package defpackage;

/* loaded from: classes2.dex */
public final class ume implements wme {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final bwf e = new bwf(new prd(15, this));

    public ume(int i, String str, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ume)) {
            return false;
        }
        ume umeVar = (ume) obj;
        return fni.a(this.a, umeVar.a) && this.b == umeVar.b && this.c == umeVar.c && this.d == umeVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xrf.k(this.c, utb.k(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = az1.n("Media(iconUrl=", this.a, ", alignment=");
        sbN.append(ctd.w(this.b));
        sbN.append(", width=");
        sbN.append(this.c);
        sbN.append(", height=");
        return ho7.j(sbN, this.d, ")");
    }
}
