package defpackage;

/* loaded from: classes2.dex */
public final class rrb {
    public final boolean a;

    public rrb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rrb) && this.a == ((rrb) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("ContactsPermissionChange(isGranted=", ")", this.a);
    }
}
