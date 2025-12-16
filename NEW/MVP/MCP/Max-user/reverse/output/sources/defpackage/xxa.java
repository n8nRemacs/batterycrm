package defpackage;

/* loaded from: classes2.dex */
public final class xxa extends ozi {
    public final int a;

    public xxa(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxa) && this.a == ((xxa) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "Counter(value=", ")");
    }
}
