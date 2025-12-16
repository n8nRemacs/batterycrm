package defpackage;

/* loaded from: classes2.dex */
public final class s58 extends y58 {
    public final cda a;
    public final String b;

    public s58(cda cdaVar, String str) {
        this.a = cdaVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s58)) {
            return false;
        }
        s58 s58Var = (s58) obj;
        return fni.a(this.a, s58Var.a) && fni.a(this.b, s58Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Navigation(navEvent=" + this.a + ", externalCallbackParam=" + this.b + ")";
    }
}
