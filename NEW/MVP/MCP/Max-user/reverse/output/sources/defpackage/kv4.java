package defpackage;

/* loaded from: classes.dex */
public final class kv4 implements lw0 {
    public final int a;
    public final int b;
    public final int c;

    public kv4(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv4)) {
            return false;
        }
        kv4 kv4Var = (kv4) obj;
        return this.a == kv4Var.a && this.b == kv4Var.b && this.c == kv4Var.c;
    }

    public final int hashCode() {
        return ((((527 + this.a) * 31) + this.b) * 31) + this.c;
    }
}
