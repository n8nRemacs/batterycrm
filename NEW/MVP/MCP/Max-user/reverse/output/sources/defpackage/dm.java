package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class dm {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final Map f;

    public dm(long j, long j2, long j3, String str, String str2, Map map) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        return this.a == dmVar.a && this.b == dmVar.b && this.c == dmVar.c && fni.a(this.d, dmVar.d) && fni.a(this.e, dmVar.e) && fni.a(this.f, dmVar.f);
    }

    public final int hashCode() {
        int iE = u45.e(u45.e(a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Map map = this.f;
        return iE + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "ApiLogEntry(time=", ", userId=");
        sbL.append(this.b);
        az1.r(this.c, ", sessionId=", ", type=", sbL);
        ho7.r(sbL, this.d, ", event=", this.e, ", params=");
        sbL.append(this.f);
        sbL.append(")");
        return sbL.toString();
    }
}
