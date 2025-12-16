package defpackage;

/* loaded from: classes2.dex */
public final class l70 extends l0g {
    public final wac X;
    public final String c;
    public final fi8 d;
    public final String o;

    public l70(String str, fi8 fi8Var, String str2, wac wacVar) {
        this.c = str;
        this.d = fi8Var;
        this.o = str2;
        this.X = wacVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l70)) {
            return false;
        }
        l70 l70Var = (l70) obj;
        return fni.a(this.c, l70Var.c) && this.d == l70Var.d && fni.a(this.o, l70Var.o) && fni.a(this.X, l70Var.X);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        String str = this.o;
        return this.X.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "{token='" + l8g.f(this.c) + ", tokenType=" + this.d + ", userToken='" + l8g.f(this.o) + ", profile=" + this.X + "}";
    }
}
