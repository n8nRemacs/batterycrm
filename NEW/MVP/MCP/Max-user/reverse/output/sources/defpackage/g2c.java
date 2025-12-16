package defpackage;

/* loaded from: classes2.dex */
public final class g2c implements i2c {
    public final String a;
    public final long b;
    public final int c;

    public g2c(long j, String str, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2c)) {
            return false;
        }
        g2c g2cVar = (g2c) obj;
        return fni.a(this.a, g2cVar.a) && this.b == g2cVar.b && this.c == g2cVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + a9h.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbQ = xrf.q("NeuroAvatar(url=", this.b, this.a, ", photoId=");
        sbQ.append(", categoryId=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }
}
