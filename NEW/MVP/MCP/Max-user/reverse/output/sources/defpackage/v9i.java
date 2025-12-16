package defpackage;

import org.webrtc.IceCandidate;

/* loaded from: classes.dex */
public final class v9i {
    public final IceCandidate a;
    public final IceCandidate b;

    public v9i(IceCandidate iceCandidate, IceCandidate iceCandidate2) {
        this.a = iceCandidate;
        this.b = iceCandidate2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v9i)) {
            return false;
        }
        v9i v9iVar = (v9i) obj;
        return fni.a(this.a, v9iVar.a) && fni.a(this.b, v9iVar.b);
    }

    public final int hashCode() {
        IceCandidate iceCandidate = this.a;
        int iHashCode = (iceCandidate == null ? 0 : iceCandidate.hashCode()) * 31;
        IceCandidate iceCandidate2 = this.b;
        return iHashCode + (iceCandidate2 != null ? iceCandidate2.hashCode() : 0);
    }

    public final String toString() {
        return "[local=" + this.a + ",remote=" + this.b + "]";
    }
}
