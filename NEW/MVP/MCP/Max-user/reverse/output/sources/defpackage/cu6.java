package defpackage;

/* loaded from: classes2.dex */
public final class cu6 {
    public final String a;
    public final String b;
    public final mc0 c;

    public cu6(String str, String str2, mc0 mc0Var) {
        this.a = str;
        this.b = str2;
        this.c = mc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu6)) {
            return false;
        }
        cu6 cu6Var = (cu6) obj;
        return fni.a(this.a, cu6Var.a) && fni.a(this.b, cu6Var.b) && fni.a(this.c, cu6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + u45.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("WebAppContactData(displayName=", this.a, ", avatarUrl=", this.b, ", abbreviationModel=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
