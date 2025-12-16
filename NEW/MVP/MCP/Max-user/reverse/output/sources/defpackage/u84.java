package defpackage;

/* loaded from: classes2.dex */
public final class u84 {
    public static final u84 b = new u84(0);
    public final int a;

    public u84(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u84) && this.a == ((u84) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wy1.e(this.a, "Counter(count=", ")");
    }
}
