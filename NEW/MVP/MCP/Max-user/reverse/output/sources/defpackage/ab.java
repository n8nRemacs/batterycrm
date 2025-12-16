package defpackage;

/* loaded from: classes.dex */
public final class ab implements lb {
    public final boolean a;

    public ab(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ab) && this.a == ((ab) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("DisableAllCamerasOnce(isSuccess=", ")", this.a);
    }
}
