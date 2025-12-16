package defpackage;

/* loaded from: classes2.dex */
public final class ned implements red {
    public final boolean a;

    public ned(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ned) && this.a == ((ned) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("Pause(isForced=", ")", this.a);
    }
}
