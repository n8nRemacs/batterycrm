package defpackage;

/* loaded from: classes2.dex */
public final class wl6 {
    public final vl6 a;
    public final vl6 b;

    public wl6(vl6 vl6Var, vl6 vl6Var2) {
        this.a = vl6Var;
        this.b = vl6Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl6)) {
            return false;
        }
        wl6 wl6Var = (wl6) obj;
        return fni.a(this.a, wl6Var.a) && fni.a(this.b, wl6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Results(fts=" + this.a + ", like=" + this.b + ")";
    }
}
