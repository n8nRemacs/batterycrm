package defpackage;

/* loaded from: classes2.dex */
public final class wbe extends xbe {
    public final String b;
    public final String c;
    public final n10 d;
    public final int e;

    public wbe(String str, String str2, n10 n10Var, int i) {
        super(str);
        this.b = str;
        this.c = str2;
        this.d = n10Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wbe)) {
            return false;
        }
        wbe wbeVar = (wbe) obj;
        return fni.a(this.b, wbeVar.b) && fni.a(this.c, wbeVar.c) && this.d.equals(wbeVar.d) && this.e == wbeVar.e;
    }

    public final int hashCode() {
        return az1.v(this.e) + ((this.d.hashCode() + u45.e(this.b.hashCode() * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("Photo(localCroppedUri=", this.b, ", originalUri=", this.c, ", relativeCrop=");
        sbL.append(this.d);
        sbL.append(", source=");
        sbL.append(xc0.n(this.e));
        sbL.append(")");
        return sbL.toString();
    }
}
