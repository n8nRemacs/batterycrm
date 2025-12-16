package defpackage;

/* loaded from: classes2.dex */
public final class t8d extends u8d {
    public final long a;
    public final long b;
    public final float c;

    public t8d(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8d)) {
            return false;
        }
        t8d t8dVar = (t8d) obj;
        return this.a == t8dVar.a && this.b == t8dVar.b && Float.compare(this.c, t8dVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + a9h.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbL = az1.l(this.a, "Uploading(messageId=", ", totalBytes=");
        sbL.append(this.b);
        sbL.append(", progress=");
        sbL.append(this.c);
        sbL.append(")");
        return sbL.toString();
    }
}
