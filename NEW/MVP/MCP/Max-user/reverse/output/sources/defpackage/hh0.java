package defpackage;

/* loaded from: classes.dex */
public final class hh0 implements ih0 {
    public final boolean a;

    public hh0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hh0) && this.a == ((hh0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("NotificationsPermissionChange(isGranted=", ")", this.a);
    }
}
