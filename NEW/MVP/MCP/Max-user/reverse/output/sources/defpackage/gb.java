package defpackage;

/* loaded from: classes.dex */
public final class gb implements lb {
    public final zi1 a;
    public final boolean b;

    public gb(zi1 zi1Var, boolean z) {
        this.a = zi1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gb)) {
            return false;
        }
        gb gbVar = (gb) obj;
        return this.a.equals(gbVar.a) && this.b == gbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisableCameraForParticipant(id=" + this.a + ", isSuccess=" + this.b + ")";
    }
}
