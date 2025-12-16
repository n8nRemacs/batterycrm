package defpackage;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public final class aj9 implements Serializable {
    public static final zi9 Y = new zi9();
    public final Map X;
    public final long a;
    public final String b;
    public final ej9 c;
    public final short d;
    public final short o;

    public aj9(long j, String str, ej9 ej9Var, short s, short s2, Map map) {
        this.a = j;
        this.b = str;
        this.c = ej9Var;
        this.d = s;
        this.o = s2;
        this.X = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj9)) {
            return false;
        }
        aj9 aj9Var = (aj9) obj;
        return this.a == aj9Var.a && fni.a(this.b, aj9Var.b) && this.c == aj9Var.c && this.d == aj9Var.d && this.o == aj9Var.o && fni.a(this.X, aj9Var.X);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (Short.hashCode(this.o) + ((Short.hashCode(this.d) + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        Map map = this.X;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("MessageElement(entityId=", this.a, ", entityName=", this.b);
        sbN.append(", type=");
        sbN.append(this.c);
        sbN.append(", from=");
        sbN.append((int) this.d);
        sbN.append(", length=");
        sbN.append((int) this.o);
        sbN.append(", attributes=");
        sbN.append(this.X);
        sbN.append(")");
        return sbN.toString();
    }
}
