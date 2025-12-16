package defpackage;

/* loaded from: classes2.dex */
public final class a1h implements c1h {
    public final long a;
    public final String b;
    public final m00 c;
    public final long d;
    public final long e;
    public final boolean f;

    public a1h(long j, String str, m00 m00Var, long j2, long j3, boolean z) {
        this.a = j;
        this.b = str;
        this.c = m00Var;
        this.d = j2;
        this.e = j3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1h)) {
            return false;
        }
        a1h a1hVar = (a1h) obj;
        return this.a == a1hVar.a && fni.a(this.b, a1hVar.b) && fni.a(this.c, a1hVar.c) && this.d == a1hVar.d && this.e == a1hVar.e && this.f == a1hVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + a9h.a(a9h.a((this.c.hashCode() + u45.e(Long.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("OpenVideo(msgId=", this.a, ", attachLocalId=", this.b);
        sbN.append(", attachModel=");
        sbN.append(this.c);
        sbN.append(", playerPosition=");
        sbN.append(this.d);
        az1.r(this.e, ", videoDuration=", ", isVideoLive=", sbN);
        return az1.k(sbN, this.f, ")");
    }
}
