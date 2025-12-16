package defpackage;

/* loaded from: classes.dex */
public final class dn1 extends en1 {
    public final p5g D;
    public final da1 E;

    public dn1(p5g p5gVar, da1 da1Var) {
        this.D = p5gVar;
        this.E = da1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn1)) {
            return false;
        }
        dn1 dn1Var = (dn1) obj;
        dn1Var.getClass();
        return this.D.equals(dn1Var.D) && this.E.equals(dn1Var.E);
    }

    public final int hashCode() {
        return this.E.hashCode() + ((this.D.hashCode() + (km1.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ShowTimerSnackbar(priority=" + km1.b + ", textSource=" + this.D + ", action=" + this.E + ")";
    }
}
