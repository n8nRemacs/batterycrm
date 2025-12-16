package defpackage;

/* loaded from: classes2.dex */
public final class oed implements red {
    public final boolean a;
    public final boolean b;

    public oed(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oed)) {
            return false;
        }
        oed oedVar = (oed) obj;
        return this.a == oedVar.a && this.b == oedVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xc0.g("PauseWithoutResume(wasLocked=", this.a, ", isForced=", this.b, ")");
    }
}
