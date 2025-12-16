package defpackage;

/* loaded from: classes2.dex */
public final class xt1 {
    public final boolean a;

    public xt1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xt1) && this.a == ((xt1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("PromotionApproved(approved=", ")", this.a);
    }
}
