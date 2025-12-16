package defpackage;

/* loaded from: classes2.dex */
public final class ax0 {
    public final Integer a;
    public final int b;

    public ax0(int i, Integer num) {
        this.a = num;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ax0)) {
            return false;
        }
        ax0 ax0Var = (ax0) obj;
        return fni.a(this.a, ax0Var.a) && this.b == ax0Var.b;
    }

    public final int hashCode() {
        Integer num = this.a;
        return Integer.hashCode(this.b) + ((num == null ? 0 : num.hashCode()) * 31);
    }

    public final String toString() {
        return "BackgroundColors(color=" + this.a + ", rippleColor=" + this.b + ")";
    }
}
