package defpackage;

/* loaded from: classes.dex */
public final class c17 {
    public static final xx0 d = r8j.f(":");
    public static final xx0 e = r8j.f(":status");
    public static final xx0 f = r8j.f(":method");
    public static final xx0 g = r8j.f(":path");
    public static final xx0 h = r8j.f(":scheme");
    public static final xx0 i = r8j.f(":authority");
    public final int a;
    public final xx0 b;
    public final xx0 c;

    public c17(xx0 xx0Var, xx0 xx0Var2) {
        this.b = xx0Var;
        this.c = xx0Var2;
        this.a = xx0Var2.d() + xx0Var.d() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c17)) {
            return false;
        }
        c17 c17Var = (c17) obj;
        return fni.a(this.b, c17Var.b) && fni.a(this.c, c17Var.c);
    }

    public final int hashCode() {
        xx0 xx0Var = this.b;
        int iHashCode = (xx0Var != null ? xx0Var.hashCode() : 0) * 31;
        xx0 xx0Var2 = this.c;
        return iHashCode + (xx0Var2 != null ? xx0Var2.hashCode() : 0);
    }

    public final String toString() {
        return this.b.l() + ": " + this.c.l();
    }

    public c17(xx0 xx0Var, String str) {
        xx0 xx0Var2 = new xx0(str.getBytes(lb2.a));
        xx0Var2.b = str;
        this(xx0Var, xx0Var2);
    }

    public c17(String str, String str2) {
        xx0 xx0Var = new xx0(str.getBytes(lb2.a));
        xx0Var.b = str;
        xx0 xx0Var2 = new xx0(str2.getBytes(lb2.a));
        xx0Var2.b = str2;
        this(xx0Var, xx0Var2);
    }
}
