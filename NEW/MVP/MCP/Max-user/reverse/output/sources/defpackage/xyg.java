package defpackage;

/* loaded from: classes2.dex */
public final class xyg {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public xyg(String str, int i, int i2, int i3, boolean z, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyg)) {
            return false;
        }
        xyg xygVar = (xyg) obj;
        return fni.a(this.a, xygVar.a) && this.b == xygVar.b && this.c == xygVar.c && this.d == xygVar.d && this.e == xygVar.e && this.f == xygVar.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + a9h.b(xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, this.a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbM = utb.m(this.b, "Pattern(image=", this.a, ", width=", ", height=");
        hf3.g(sbM, this.c, ", opacity=", this.d, ", isOverlay=");
        sbM.append(this.e);
        sbM.append(", color=");
        sbM.append(this.f);
        sbM.append(")");
        return sbM.toString();
    }
}
