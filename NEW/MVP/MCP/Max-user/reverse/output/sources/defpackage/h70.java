package defpackage;

/* loaded from: classes2.dex */
public final class h70 extends l0g {
    public final String c;
    public final String d;

    public h70(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h70)) {
            return false;
        }
        h70 h70Var = (h70) obj;
        return fni.a(this.c, h70Var.c) && fni.a(this.d, h70Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return wy1.j("Response(trackId='", this.c, "',email='", l8g.f(this.d), "')");
    }
}
