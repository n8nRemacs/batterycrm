package defpackage;

/* loaded from: classes2.dex */
public final class emc extends lmc {
    public final s5g a;
    public final em6 b;

    public emc(s5g s5gVar, em6 em6Var) {
        this.a = s5gVar;
        this.b = em6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emc)) {
            return false;
        }
        emc emcVar = (emc) obj;
        return fni.a(this.a, emcVar.a) && fni.a(this.b, emcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowAbortionSnackbar(titleRes=" + this.a + ", abortAction=" + this.b + ")";
    }
}
