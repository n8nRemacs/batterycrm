package defpackage;

/* loaded from: classes2.dex */
public final class h5h {
    public final boolean a;
    public final boolean b;

    public h5h(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5h)) {
            return false;
        }
        h5h h5hVar = (h5h) obj;
        return this.a == h5hVar.a && this.b == h5hVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xc0.g("TorchState(isAvailable=", this.a, ", isEnabled=", this.b, ")");
    }
}
