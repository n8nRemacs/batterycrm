package defpackage;

/* loaded from: classes.dex */
public final class db implements lb {
    public final boolean a;

    public db(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof db) && this.a == ((db) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("DisableAllRaiseHandsOnce(isSuccess=", ")", this.a);
    }
}
