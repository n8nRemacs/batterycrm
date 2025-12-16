package defpackage;

/* loaded from: classes2.dex */
public final class s0f {
    public final boolean a;
    public final String b;
    public final Long c;

    public s0f(boolean z, String str, Long l) {
        this.a = z;
        this.b = str;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0f)) {
            return false;
        }
        s0f s0fVar = (s0f) obj;
        return this.a == s0fVar.a && fni.a(this.b, s0fVar.b) && fni.a(this.c, s0fVar.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "Params(forceWebSocket=" + this.a + ", conversationId=" + this.b + ", peerId=" + this.c + ")";
    }
}
