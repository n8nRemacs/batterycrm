package defpackage;

/* loaded from: classes.dex */
public final class hb implements lb {
    public final zi1 a;
    public final boolean b;

    public hb(zi1 zi1Var, boolean z) {
        this.a = zi1Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb)) {
            return false;
        }
        hb hbVar = (hb) obj;
        return this.a.equals(hbVar.a) && this.b == hbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DisableMicForParticipant(id=" + this.a + ", isSuccess=" + this.b + ")";
    }
}
