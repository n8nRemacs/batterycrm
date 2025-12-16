package defpackage;

/* loaded from: classes2.dex */
public final class aw5 extends l0g {
    public final String c;
    public final Boolean d;

    public aw5(String str, Boolean bool) {
        this.c = str;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw5)) {
            return false;
        }
        aw5 aw5Var = (aw5) obj;
        return fni.a(this.c, aw5Var.c) && fni.a(this.d, aw5Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        Boolean bool = this.d;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(url=" + this.c + ", unsafe=" + this.d + ")";
    }
}
