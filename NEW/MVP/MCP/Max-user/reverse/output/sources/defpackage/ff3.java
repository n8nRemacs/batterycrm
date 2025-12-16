package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ff3 implements lw0 {
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public int o;

    public ff3(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ff3.class == obj.getClass()) {
            ff3 ff3Var = (ff3) obj;
            if (this.a == ff3Var.a && this.b == ff3Var.b && this.c == ff3Var.c && Arrays.equals(this.d, ff3Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.o == 0) {
            this.o = Arrays.hashCode(this.d) + ((((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31);
        }
        return this.o;
    }

    public final String toString() {
        boolean z = this.d != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
