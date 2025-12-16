package defpackage;

/* loaded from: classes2.dex */
public final class rt {
    public final fje a;
    public final k21 b;

    public rt(fje fjeVar, k21 k21Var) {
        this.a = fjeVar;
        this.b = k21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt)) {
            return false;
        }
        rt rtVar = (rt) obj;
        return fni.a(this.a, rtVar.a) && fni.a(this.b, rtVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "StartAsrRecord(sessionRoomId=" + this.a + ", callAsrInfo=" + this.b + ")";
    }
}
