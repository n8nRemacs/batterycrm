package defpackage;

/* loaded from: classes2.dex */
public final class h0f {
    public final long a;
    public final pgd b;
    public final ti1 c;
    public final long d;
    public final String e;
    public final String f;

    public h0f(long j, pgd pgdVar, ti1 ti1Var, long j2, String str, String str2) {
        this.a = j;
        this.b = pgdVar;
        this.c = ti1Var;
        this.d = j2;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0f)) {
            return false;
        }
        h0f h0fVar = (h0f) obj;
        return this.a == h0fVar.a && this.b == h0fVar.b && fni.a(this.c, h0fVar.c) && this.d == h0fVar.d && fni.a(this.e, h0fVar.e) && fni.a(this.f, h0fVar.f);
    }

    public final int hashCode() {
        int iA = a9h.a((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SignalingRecordInfo(recordMovieId=");
        sb.append(this.a);
        sb.append(", recordType=");
        sb.append(this.b);
        sb.append(", initiator=");
        sb.append(this.c);
        sb.append(", recordStartTime=");
        hf3.e(this.d, ", recordExternalMovieId=", this.e, sb);
        return ctd.j(sb, ", recordExternalOwnerId=", this.f, ")");
    }
}
