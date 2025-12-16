package defpackage;

/* loaded from: classes2.dex */
public final class esd {
    public final ti1 a;
    public final String b;
    public final fje c;

    public esd(ti1 ti1Var, String str, fje fjeVar) {
        this.a = ti1Var;
        this.b = str;
        this.c = fjeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esd)) {
            return false;
        }
        esd esdVar = (esd) obj;
        return fni.a(this.a, esdVar.a) && fni.a(this.b, esdVar.b) && fni.a(this.c, esdVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "RoomSignalingUrlSharingInfo(initiator=" + this.a + ", url=" + this.b + ", roomId=" + this.c + ")";
    }
}
