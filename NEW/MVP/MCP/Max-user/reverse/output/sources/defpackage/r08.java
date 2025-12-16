package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class r08 {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        String str = zxg.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public r08(String str, String str2) {
        this.a = zxg.V(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r08.class == obj.getClass()) {
            r08 r08Var = (r08) obj;
            if (Objects.equals(this.a, r08Var.a) && Objects.equals(this.b, r08Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
