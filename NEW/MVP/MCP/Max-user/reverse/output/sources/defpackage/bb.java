package defpackage;

/* loaded from: classes.dex */
public final class bb implements lb {
    public final boolean a;
    public final boolean b;

    public bb(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        return this.a == bbVar.a && this.b == bbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xc0.g("DisableAllMicInCall(isSuccess=", this.a, ", isEnabled=", this.b, ")");
    }
}
