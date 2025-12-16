package defpackage;

/* loaded from: classes2.dex */
public final class u8h {
    public static final u8h e = new u8h(60, "480", 30, 30);
    public final long a;
    public final String b;
    public final int c;
    public final int d;

    public u8h(long j, String str, int i, int i2) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8h)) {
            return false;
        }
        u8h u8hVar = (u8h) obj;
        return this.a == u8hVar.a && fni.a(this.b, u8hVar.b) && this.c == u8hVar.c && this.d == u8hVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xrf.k(this.c, u45.e(Long.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = ho7.n("VideoMessageServerConfig(maxDuration=", this.a, ", quality=", this.b);
        sbN.append(", minFrameRate=");
        sbN.append(this.c);
        sbN.append(", maxFrameRate=");
        sbN.append(this.d);
        sbN.append(")");
        return sbN.toString();
    }
}
