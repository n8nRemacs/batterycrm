package defpackage;

/* loaded from: classes.dex */
public final class s9i {
    public final Long a;
    public final String b;

    public s9i(String str, Long l) {
        this.a = l;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9i)) {
            return false;
        }
        s9i s9iVar = (s9i) obj;
        return fni.a(this.a, s9iVar.a) && fni.a(this.b, s9iVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PeerInfo(peerId=" + this.a + ", conversationId=" + this.b + ")";
    }
}
