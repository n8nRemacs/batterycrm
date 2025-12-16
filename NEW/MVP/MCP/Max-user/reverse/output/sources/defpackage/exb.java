package defpackage;

/* loaded from: classes2.dex */
public final class exb {
    public final boolean a;

    public exb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof exb) && this.a == ((exb) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return xrf.p("OnlineStatus(isOnline=", ")", this.a);
    }
}
