package defpackage;

/* loaded from: classes.dex */
public final class jr1 extends gxi {
    public final String a;
    public final boolean b;

    public jr1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jr1)) {
            return false;
        }
        jr1 jr1Var = (jr1) obj;
        return fni.a(this.a, jr1Var.a) && this.b == jr1Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Link(link=" + this.a + ", isJoinByExistLink=" + this.b + ")";
    }
}
