package defpackage;

/* loaded from: classes2.dex */
public final class ub7 {
    public final int a;

    public ub7(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ub7) && this.a == ((ub7) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "IconLocalPromoColors(accent=", ")");
    }
}
