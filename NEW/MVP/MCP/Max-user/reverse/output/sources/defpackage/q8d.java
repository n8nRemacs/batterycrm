package defpackage;

/* loaded from: classes2.dex */
public final class q8d extends u8d {
    public final long a;
    public final long b;
    public final float c;
    public final long d;
    public final Long e;
    public final Long f;

    public q8d(long j, long j2, float f, long j3, Long l, Long l2) {
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = j3;
        this.e = l;
        this.f = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8d)) {
            return false;
        }
        q8d q8dVar = (q8d) obj;
        return this.a == q8dVar.a && this.b == q8dVar.b && Float.compare(this.c, q8dVar.c) == 0 && this.d == q8dVar.d && fni.a(this.e, q8dVar.e) && fni.a(this.f, q8dVar.f);
    }

    public final int hashCode() {
        int iA = a9h.a(hf3.b(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), this.c, 31), 31, this.d);
        Long l = this.e;
        int iHashCode = (iA + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "Downloading(messageId=", ", totalBytes=");
        sbL.append(this.b);
        sbL.append(", progress=");
        sbL.append(this.c);
        az1.r(this.d, ", bytesDownloaded=", ", fileId=", sbL);
        sbL.append(this.e);
        sbL.append(", fileSize=");
        sbL.append(this.f);
        sbL.append(")");
        return sbL.toString();
    }
}
