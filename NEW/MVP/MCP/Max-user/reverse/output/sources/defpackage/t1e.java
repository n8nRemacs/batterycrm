package defpackage;

/* loaded from: classes.dex */
public final class t1e {
    public final long a;
    public final String b;
    public final zi1 c;
    public final long d;
    public final int e;

    public t1e(long j, String str, zi1 zi1Var, long j2, int i) {
        this.a = j;
        this.b = str;
        this.c = zi1Var;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1e)) {
            return false;
        }
        t1e t1eVar = (t1e) obj;
        return this.a == t1eVar.a && fni.a(this.b, t1eVar.b) && this.c.equals(t1eVar.c) && this.d == t1eVar.d && this.e == t1eVar.e;
    }

    public final int hashCode() {
        return az1.v(this.e) + a9h.a((this.c.hashCode() + u45.e(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("ScreenRecordBroadcastData(id=", this.a, ", streamId=", this.b);
        sbN.append(", initiatorId=");
        sbN.append(this.c);
        sbN.append(", startTimeMs=");
        sbN.append(this.d);
        sbN.append(", recordType=");
        int i = this.e;
        sbN.append(i != 1 ? i != 2 ? i != 3 ? "null" : "RECORD" : "STREAM" : "NOTHING");
        sbN.append(")");
        return sbN.toString();
    }
}
