package defpackage;

/* loaded from: classes2.dex */
public final class t0f {
    public final ti1 a;
    public final String b;

    public t0f(ti1 ti1Var, String str) {
        this.a = ti1Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0f)) {
            return false;
        }
        t0f t0fVar = (t0f) obj;
        return fni.a(this.a, t0fVar.a) && fni.a(this.b, t0fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignalingUrlSharingInfo(initiator=" + this.a + ", url=" + this.b + ")";
    }
}
