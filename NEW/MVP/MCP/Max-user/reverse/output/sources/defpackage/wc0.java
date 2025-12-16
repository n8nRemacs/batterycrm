package defpackage;

/* loaded from: classes2.dex */
public final class wc0 {
    public final String a;
    public final String b;
    public final n10 c;
    public final int d;

    public wc0(String str, String str2, n10 n10Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = n10Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc0)) {
            return false;
        }
        wc0 wc0Var = (wc0) obj;
        return fni.a(this.a, wc0Var.a) && fni.a(this.b, wc0Var.b) && this.c.equals(wc0Var.c) && this.d == wc0Var.d;
    }

    public final int hashCode() {
        return az1.v(this.d) + ((this.c.hashCode() + u45.e(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("PhotoAvatar(localCroppedUri=", this.a, ", originalUri=", this.b, ", relativeCrop=");
        sbL.append(this.c);
        sbL.append(", source=");
        sbL.append(xc0.n(this.d));
        sbL.append(")");
        return sbL.toString();
    }
}
