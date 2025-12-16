package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class tv3 {
    public static final tv3 e = new tv3("", sv3.d, "");
    public final String a;
    public final String b;
    public final sv3 c;
    public String d = null;

    public tv3(String str, sv3 sv3Var, String str2) {
        this.a = str;
        this.c = sv3Var;
        this.b = str2;
    }

    public final String a() {
        if (equals(e) || this.c == sv3.d) {
            return "";
        }
        String str = this.b;
        boolean zD = l8g.d(str);
        String str2 = this.a;
        if (!zD) {
            return l8g.c(str2) ? "" : str2;
        }
        if (this.d == null) {
            this.d = str2 + " " + str;
        }
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tv3) {
            tv3 tv3Var = (tv3) obj;
            if (this.c == tv3Var.c && Objects.equals(this.a, tv3Var.a) && this.b.equals(tv3Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.c) + ((Objects.hashCode(this.b) + (Objects.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        String simpleName = tv3.class.getSimpleName();
        boolean zA = wqi.a();
        String str = this.b;
        sv3 sv3Var = this.c;
        String str2 = this.a;
        if (!zA) {
            return simpleName + "type=" + sv3Var + ",f=" + l8g.d(str2) + ",l=" + l8g.d(str);
        }
        return simpleName + "{firstName='" + str2 + "', type=" + sv3Var + "', lastName=" + str + '}';
    }
}
