package defpackage;

/* loaded from: classes2.dex */
public final class ix3 extends l0g {
    public final gx3 c;

    public ix3(gx3 gx3Var) {
        this.c = gx3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ix3) && fni.a(this.c, ((ix3) obj).c);
    }

    public final int hashCode() {
        gx3 gx3Var = this.c;
        if (gx3Var == null) {
            return 0;
        }
        return gx3Var.hashCode();
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "CONTACT_INFO_BY_PHONE.Response(contact=" + String.valueOf(this.c) + ')';
    }
}
