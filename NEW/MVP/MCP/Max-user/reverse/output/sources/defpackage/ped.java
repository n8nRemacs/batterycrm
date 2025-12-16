package defpackage;

/* loaded from: classes2.dex */
public final class ped implements red {
    public final boolean a;
    public final boolean b;

    public ped(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ped)) {
            return false;
        }
        ped pedVar = (ped) obj;
        return this.a == pedVar.a && this.b == pedVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xc0.g("Recording(afterPause=", this.a, ", isLocked=", this.b, ")");
    }
}
