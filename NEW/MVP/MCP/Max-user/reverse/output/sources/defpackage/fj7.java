package defpackage;

/* loaded from: classes2.dex */
public final class fj7 {
    public final ti1 a;
    public final String b;
    public final boolean c;

    public fj7(ti1 ti1Var, String str, boolean z) {
        this.a = ti1Var;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj7)) {
            return false;
        }
        fj7 fj7Var = (fj7) obj;
        return fni.a(this.a, fj7Var.a) && fni.a(this.b, fj7Var.b) && this.c == fj7Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + u45.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InboundMessage(senderId=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", isDirect=");
        return az1.k(sb, this.c, ")");
    }
}
