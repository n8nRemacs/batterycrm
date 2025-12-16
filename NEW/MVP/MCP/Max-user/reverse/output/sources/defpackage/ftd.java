package defpackage;

/* loaded from: classes.dex */
public final class ftd {
    public final int a;
    public final int b;

    public ftd(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftd)) {
            return false;
        }
        ftd ftdVar = (ftd) obj;
        return this.a == ftdVar.a && this.b == ftdVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("IconSize(width=", this.a, ", height=", this.b, ")");
    }
}
