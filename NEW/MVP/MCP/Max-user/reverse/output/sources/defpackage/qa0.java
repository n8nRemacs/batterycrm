package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qa0 extends ng8 {
    public final long a;
    public final long b;
    public final r90 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;

    public qa0(long j, long j2, r90 r90Var, Integer num, String str, ArrayList arrayList) {
        wqc wqcVar = wqc.a;
        this.a = j;
        this.b = j2;
        this.c = r90Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ng8)) {
            return false;
        }
        qa0 qa0Var = (qa0) ((ng8) obj);
        if (this.a != qa0Var.a) {
            return false;
        }
        qa0Var.getClass();
        Object obj2 = wqc.a;
        ArrayList arrayList = qa0Var.f;
        String str = qa0Var.e;
        Integer num = qa0Var.d;
        r90 r90Var = qa0Var.c;
        if (this.b != qa0Var.b || !this.c.equals(r90Var)) {
            return false;
        }
        Integer num2 = this.d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ wqc.a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + wqc.a + "}";
    }
}
