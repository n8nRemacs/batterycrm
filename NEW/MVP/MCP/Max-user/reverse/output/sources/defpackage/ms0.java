package defpackage;

/* loaded from: classes2.dex */
public final class ms0 {
    public final int a;
    public final int b;
    public final boolean c;

    public ms0(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ms0)) {
            return false;
        }
        ms0 ms0Var = (ms0) obj;
        return this.a == ms0Var.a && this.b == ms0Var.b && this.c == ms0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + utb.k(this.b, az1.v(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomInsetConfig(persistentType=");
        sb.append(vb9.m(this.a));
        sb.append(", imeInsetChange=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "Immediate" : "Animated" : "None");
        sb.append(", applyDeviceRoundCorners=");
        return az1.k(sb, this.c, ")");
    }
}
