package defpackage;

/* loaded from: classes2.dex */
public final class tt0 {
    public final int a;
    public final int b;

    public tt0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt0)) {
            return false;
        }
        tt0 tt0Var = (tt0) obj;
        return this.a == tt0Var.a && this.b == tt0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return wy1.g("BubbleBackgroundFocusRegularColors(max=", this.a, ", min=", this.b, ")");
    }
}
