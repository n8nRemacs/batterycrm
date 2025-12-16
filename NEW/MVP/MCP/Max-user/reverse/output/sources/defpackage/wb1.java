package defpackage;

/* loaded from: classes.dex */
public final class wb1 extends id0 {
    public final n41 b;
    public final boolean c;

    public wb1(n41 n41Var, boolean z) {
        super(1);
        this.b = n41Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wb1)) {
            return false;
        }
        wb1 wb1Var = (wb1) obj;
        return fni.a(this.b, wb1Var.b) && this.c == wb1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenIncomingCall(chatInfo=" + this.b + ", isVideo=" + this.c + ")";
    }
}
