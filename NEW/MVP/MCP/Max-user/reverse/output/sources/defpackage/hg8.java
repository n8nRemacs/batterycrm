package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class hg8 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final Map e;
    public final long f;

    public hg8(long j, long j2, long j3, String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = map;
        this.f = j3;
        if (vmf.F(str) || vmf.F(str2)) {
            throw new IllegalArgumentException("type or event can't be empty");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg8)) {
            return false;
        }
        hg8 hg8Var = (hg8) obj;
        return fni.a(this.a, hg8Var.a) && fni.a(this.b, hg8Var.b) && this.c == hg8Var.c && this.d == hg8Var.d && fni.a(this.e, hg8Var.e) && this.f == hg8Var.f;
    }

    public final int hashCode() {
        return Long.hashCode(this.f) + ((this.e.hashCode() + a9h.a(a9h.a(u45.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = wy1.l("LogEntry(type=", this.a, ", event=", this.b, ", userId=");
        sbL.append(this.c);
        az1.r(this.d, ", sessionId=", ", params=", sbL);
        sbL.append(this.e);
        sbL.append(", time=");
        sbL.append(this.f);
        sbL.append(")");
        return sbL.toString();
    }

    public hg8(String str, String str2, long j, long j2, Map map, long j3, int i) {
        this((i & 4) != 0 ? 0L : j, (i & 8) != 0 ? 0L : j2, (i & 32) != 0 ? System.currentTimeMillis() : j3, str, str2, map);
    }
}
