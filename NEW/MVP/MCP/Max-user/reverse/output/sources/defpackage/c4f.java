package defpackage;

/* loaded from: classes.dex */
public final class c4f {
    public static final c4f c = new c4f(-1, -1);
    public final int a;
    public final int b;

    static {
        new c4f(0, 0);
    }

    public c4f(int i, int i2) {
        hsi.b((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof c4f) {
            c4f c4fVar = (c4f) obj;
            if (this.a == c4fVar.a && this.b == c4fVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        return ((i >>> 16) | (i << 16)) ^ this.b;
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
