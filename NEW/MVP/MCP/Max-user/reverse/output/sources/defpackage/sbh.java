package defpackage;

/* loaded from: classes2.dex */
public final class sbh {
    public final int a;
    public final int b;
    public final int c;

    public sbh(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbh)) {
            return false;
        }
        sbh sbhVar = (sbh) obj;
        return this.a == sbhVar.a && this.b == sbhVar.b && this.c == sbhVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + iti.a(this.b, Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return ho7.j(wy1.k("VideoQualityUpdate(maxBitrate=", this.a, ", maxDimension=", this.b, ", source="), this.c, ")");
    }
}
