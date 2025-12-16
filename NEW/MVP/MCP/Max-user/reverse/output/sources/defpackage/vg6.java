package defpackage;

/* loaded from: classes.dex */
public final class vg6 {
    public final s5g a;
    public final boolean b;
    public final az c;
    public final boolean d;

    public vg6(s5g s5gVar, boolean z, az azVar, boolean z2) {
        this.a = s5gVar;
        this.b = z;
        this.c = azVar;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg6)) {
            return false;
        }
        vg6 vg6Var = (vg6) obj;
        return fni.a(this.a, vg6Var.a) && this.b == vg6Var.b && fni.a(this.c, vg6Var.c) && this.d == vg6Var.d;
    }

    public final int hashCode() {
        int iB = a9h.b(this.a.hashCode() * 31, 31, this.b);
        az azVar = this.c;
        return Boolean.hashCode(this.d) + ((iB + (azVar == null ? 0 : azVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ForwardQuoteData(title=" + this.a + ", showVerificationMark=" + this.b + ", attachDescription=" + this.c + ", isAuthorVisibilityAvailable=" + this.d + ")";
    }
}
