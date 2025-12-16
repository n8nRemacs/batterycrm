package defpackage;

/* loaded from: classes2.dex */
public final class qed implements red {
    public final boolean a;
    public final boolean b;

    public /* synthetic */ qed(boolean z, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qed)) {
            return false;
        }
        qed qedVar = (qed) obj;
        return this.a == qedVar.a && this.b == qedVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return xc0.g("Stop(wasLocked=", this.a, ", afterSwipe=", this.b, ")");
    }

    public qed(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
