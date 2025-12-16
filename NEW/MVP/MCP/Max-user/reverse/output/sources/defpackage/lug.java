package defpackage;

/* loaded from: classes2.dex */
public final class lug {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;

    public lug(long j, String str, String str2, long j2, long j3, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = j3;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lug)) {
            return false;
        }
        lug lugVar = (lug) obj;
        return this.a == lugVar.a && fni.a(this.b, lugVar.b) && fni.a(this.c, lugVar.c) && this.d == lugVar.d && this.e == lugVar.e && fni.a(this.f, lugVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + a9h.a(a9h.a(u45.e(u45.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("Input(requestId=", this.a, ", externalUrl=", this.b);
        sbN.append(", attachLocalId=");
        sbN.append(this.c);
        sbN.append(", messageId=");
        sbN.append(this.d);
        az1.r(this.e, ", chatId=", ", stickerId=", sbN);
        return ho7.l(sbN, this.f, ")");
    }
}
