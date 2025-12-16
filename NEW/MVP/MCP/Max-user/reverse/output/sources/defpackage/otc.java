package defpackage;

/* loaded from: classes2.dex */
public final class otc implements rtc {
    public final pd8 a;
    public final int b;

    public otc(pd8 pd8Var, int i) {
        this.a = pd8Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otc)) {
            return false;
        }
        otc otcVar = (otc) obj;
        return fni.a(this.a, otcVar.a) && this.b == otcVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFullScreenMedia(localMedia=" + this.a + ", position=" + this.b + ")";
    }
}
