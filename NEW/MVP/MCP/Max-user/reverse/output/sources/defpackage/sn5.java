package defpackage;

/* loaded from: classes2.dex */
public final class sn5 {
    public final byte a;
    public final int b;

    public sn5(int i, byte b) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException("length must be >= 0");
        }
        this.a = b;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sn5) {
            sn5 sn5Var = (sn5) obj;
            if (this.a == sn5Var.a && this.b == sn5Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    public final String toString() {
        return String.format("ExtensionTypeHeader(type:%d, length:%,d)", Byte.valueOf(this.a), Integer.valueOf(this.b));
    }
}
