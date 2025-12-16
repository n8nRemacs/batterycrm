package defpackage;

/* loaded from: classes2.dex */
public final class x1h {
    public final Long a;
    public final String b;

    public x1h(String str, Long l) {
        this.a = l;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1h)) {
            return false;
        }
        x1h x1hVar = (x1h) obj;
        return fni.a(this.a, x1hVar.a) && fni.a(this.b, x1hVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RejectedParticipants(id=" + this.a + ", errorCode=" + this.b + ")";
    }
}
