package defpackage;

/* loaded from: classes2.dex */
public final class fuh implements avh {
    public final boolean a;

    public fuh(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fuh) && this.a == ((fuh) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("CloseScreen(isFromBridge=", ")", this.a);
    }
}
