package defpackage;

/* loaded from: classes2.dex */
public final class vl6 {
    public final String a;
    public final String b;
    public final vl6 c;

    public vl6(String str, String str2, vl6 vl6Var) {
        this.a = str;
        this.b = str2;
        this.c = vl6Var;
    }

    public static vl6 a(vl6 vl6Var, String str) {
        String str2 = vl6Var.a;
        vl6 vl6Var2 = vl6Var.c;
        vl6Var.getClass();
        return new vl6(str2, str, vl6Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl6)) {
            return false;
        }
        vl6 vl6Var = (vl6) obj;
        return fni.a(this.a, vl6Var.a) && fni.a(this.b, vl6Var.b) && fni.a(this.c, vl6Var.c);
    }

    public final int hashCode() {
        int iE = u45.e(this.a.hashCode() * 31, 31, this.b);
        vl6 vl6Var = this.c;
        return iE + (vl6Var == null ? 0 : vl6Var.hashCode());
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("Result(normalized=", this.a, ", original=", this.b, ", noEmoji=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
