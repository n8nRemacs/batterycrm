package defpackage;

/* loaded from: classes2.dex */
public final class zm7 extends cda {
    public final String b;
    public final String c;
    public final int d;

    public zm7(String str, String str2, int i) {
        super(qqg.a);
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm7)) {
            return false;
        }
        zm7 zm7Var = (zm7) obj;
        return fni.a(this.b, zm7Var.b) && fni.a(this.c, zm7Var.c) && this.d == zm7Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + u45.e(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return ho7.j(wy1.l("PhoneConfirmScreen(verifyToken=", this.b, ", phone=", this.c, ", codeLength="), this.d, ")");
    }
}
