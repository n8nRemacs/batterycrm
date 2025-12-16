package defpackage;

/* loaded from: classes2.dex */
public final class li3 {
    public final int a;
    public final int b;

    public li3(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof li3)) {
            return false;
        }
        li3 li3Var = (li3) obj;
        return this.a == li3Var.a && this.b == li3Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("CommonStatesIconDisabledColors(negative=", this.a, ", themed=", this.b, ")");
    }
}
