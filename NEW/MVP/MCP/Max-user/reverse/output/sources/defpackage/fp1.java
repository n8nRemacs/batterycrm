package defpackage;

/* loaded from: classes2.dex */
public final class fp1 {
    public final fje a;
    public final zie b;

    public fp1(fje fjeVar, zie zieVar) {
        this.a = fjeVar;
        this.b = zieVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp1)) {
            return false;
        }
        fp1 fp1Var = (fp1) obj;
        return fni.a(this.a, fp1Var.a) && fni.a(this.b, fp1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        zie zieVar = this.b;
        return iHashCode + (zieVar == null ? 0 : zieVar.hashCode());
    }

    public final String toString() {
        return "ActiveRoomChangedParams(roomId=" + this.a + ", room=" + this.b + ")";
    }
}
