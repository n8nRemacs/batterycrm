package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class rs2 {
    public static final rs2 c = new rs2(id5.a, 0);
    public final Map a;
    public final int b;

    public rs2(Map map, int i) {
        this.a = map;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rs2)) {
            return false;
        }
        rs2 rs2Var = (rs2) obj;
        return fni.a(this.a, rs2Var.a) && this.b == rs2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        if (equals(c)) {
            return rs2.class.getSimpleName().concat(".Empty");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(rs2.class.getSimpleName());
        sb.append("(size=");
        Map map = this.a;
        sb.append(map.size());
        sb.append(",totalUnreadMessagesCount=");
        sb.append(this.b);
        sb.append(",notifications=" + map);
        sb.append(')');
        return sb.toString();
    }
}
