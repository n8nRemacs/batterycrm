package defpackage;

/* loaded from: classes2.dex */
public final class xcg {
    public final ycg a;
    public final zcg b;

    public xcg(ycg ycgVar, zcg zcgVar) {
        this.a = ycgVar;
        this.b = zcgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xcg)) {
            return false;
        }
        xcg xcgVar = (xcg) obj;
        return fni.a(this.a, xcgVar.a) && fni.a(this.b, xcgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopbarIconColors(default=" + this.a + ", disabled=" + this.b + ")";
    }
}
