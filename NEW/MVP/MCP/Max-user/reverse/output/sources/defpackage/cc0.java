package defpackage;

/* loaded from: classes.dex */
public final class cc0 {
    public static final cc0 d = new cc0(0, 0, 0);
    public static final cc0 e = new cc0(1, 3, 2);
    public static final cc0 f = new cc0(6, 7, 1);
    public static final cc0 g = new cc0(6, 6, 1);
    public final int a;
    public final int b;
    public final int c;

    public cc0(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cc0)) {
            return false;
        }
        cc0 cc0Var = (cc0) obj;
        return this.a == cc0Var.a && this.b == cc0Var.b && this.c == cc0Var.c;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb.append(this.a);
        sb.append(", transfer=");
        sb.append(this.b);
        sb.append(", range=");
        return ho7.j(sb, this.c, "}");
    }
}
