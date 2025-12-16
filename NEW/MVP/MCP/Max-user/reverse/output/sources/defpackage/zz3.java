package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class zz3 implements Serializable {
    public final String a;
    public final yz3 b;
    public final String c;

    public zz3(String str, yz3 yz3Var, String str2) {
        this.a = str;
        this.b = yz3Var;
        this.c = str2;
    }

    public final String a() {
        yz3 yz3Var = yz3.b;
        String str = this.a;
        yz3 yz3Var2 = this.b;
        if (yz3Var2 == yz3Var || yz3Var2 == yz3.a) {
            String str2 = this.c;
            if (l8g.d(str2)) {
                return u45.k(str, " ", str2);
            }
        }
        return str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{firstName='");
        sb.append(this.a);
        sb.append("', type=");
        sb.append(this.b);
        sb.append("', lastName=");
        return ho7.l(sb, this.c, "}");
    }
}
