package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ba0 {
    public final String a;
    public final Integer b;
    public final ee5 c;
    public final long d;
    public final long e;
    public final Map f;

    public ba0(String str, Integer num, ee5 ee5Var, long j, long j2, HashMap map) {
        this.a = str;
        this.b = num;
        this.c = ee5Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final goh c() {
        goh gohVar = new goh();
        String str = this.a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        gohVar.a = str;
        gohVar.b = this.b;
        ee5 ee5Var = this.c;
        if (ee5Var == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        gohVar.c = ee5Var;
        gohVar.d = Long.valueOf(this.d);
        gohVar.e = Long.valueOf(this.e);
        gohVar.f = new HashMap(this.f);
        return gohVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ba0) {
            ba0 ba0Var = (ba0) obj;
            String str = ba0Var.a;
            Integer num2 = ba0Var.b;
            if (this.a.equals(str) && ((num = this.b) != null ? num.equals(num2) : num2 == null) && this.c.equals(ba0Var.c) && this.d == ba0Var.d && this.e == ba0Var.e && this.f.equals(ba0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
