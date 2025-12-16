package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class po3 {
    public final String a;
    public final nud b;
    public final Map c;
    public final qxg d;
    public final Map e;

    public /* synthetic */ po3(us usVar, qxg qxgVar, int i) {
        this(null, null, (i & 4) != 0 ? null : usVar, qxgVar, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po3)) {
            return false;
        }
        po3 po3Var = (po3) obj;
        return fni.a(this.a, po3Var.a) && fni.a(this.b, po3Var.b) && fni.a(this.c, po3Var.c) && fni.a(this.d, po3Var.d) && fni.a(this.e, po3Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        nud nudVar = this.b;
        int iHashCode2 = (iHashCode + (nudVar == null ? 0 : nudVar.hashCode())) * 31;
        Map map = this.c;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        qxg qxgVar = this.d;
        int iHashCode4 = (iHashCode3 + (qxgVar == null ? 0 : qxgVar.hashCode())) * 31;
        Map map2 = this.e;
        return iHashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb;
        Map map = this.c;
        if (map == null || map.isEmpty()) {
            sb = null;
        } else {
            sb = new StringBuilder();
            sb.append('[');
            for (Map.Entry entry : map.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                fy2 fy2Var = (fy2) entry.getValue();
                sb.append('#');
                sb.append(jLongValue);
                sb.append(':');
                sb.append(fy2Var);
            }
            sb.append(']');
        }
        return "Configuration: user=" + this.d + ", hash=" + this.a + ", chatsCount=" + (map != null ? Integer.valueOf(map.size()) : null) + ", chats=" + ((Object) sb) + ", server=" + this.b + " experiments=" + this.e;
    }

    public po3(String str, nud nudVar, Map map, qxg qxgVar, Map map2) {
        this.a = str;
        this.b = nudVar;
        this.c = map;
        this.d = qxgVar;
        this.e = map2;
    }
}
