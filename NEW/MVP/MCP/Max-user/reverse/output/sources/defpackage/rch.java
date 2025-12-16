package defpackage;

/* loaded from: classes.dex */
public final class rch implements lw0 {
    public final int a;
    public final int b;
    public final int c;
    public final float d;

    public rch(float f, int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rch) {
            rch rchVar = (rch) obj;
            if (this.a == rchVar.a && this.b == rchVar.b && this.c == rchVar.c && this.d == rchVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.d) + ((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31);
    }
}
