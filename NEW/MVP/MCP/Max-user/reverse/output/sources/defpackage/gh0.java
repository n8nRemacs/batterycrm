package defpackage;

/* loaded from: classes.dex */
public final class gh0 implements ih0 {
    public final boolean a;

    public gh0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gh0) && this.a == ((gh0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("ContactsPermissionChange(isGranted=", ")", this.a);
    }
}
