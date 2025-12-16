package defpackage;

/* loaded from: classes.dex */
public final class cb implements lb {
    public final boolean a;

    public cb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cb) && this.a == ((cb) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("DisableAllMicOnce(isSuccess=", ")", this.a);
    }
}
