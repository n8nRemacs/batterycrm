package defpackage;

/* loaded from: classes.dex */
public final class fb implements lb {
    public final boolean a;
    public final boolean b;

    public fb(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb)) {
            return false;
        }
        fb fbVar = (fb) obj;
        return this.a == fbVar.a && this.b == fbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xc0.g("DisableAllScreenSharingInCall(isSuccess=", this.a, ", isEnabled=", this.b, ")");
    }
}
