package defpackage;

/* loaded from: classes.dex */
public final class za implements lb {
    public final boolean a;
    public final boolean b;

    public za(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za)) {
            return false;
        }
        za zaVar = (za) obj;
        return this.a == zaVar.a && this.b == zaVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xc0.g("DisableAllCameraInCall(isSuccess=", this.a, ", isEnabled=", this.b, ")");
    }
}
