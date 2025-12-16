package defpackage;

/* loaded from: classes2.dex */
public final class qh3 implements rh3 {
    public final pb2 a;
    public final CharSequence b;
    public final String c;
    public final long d;

    static {
        qh3.class.hashCode();
    }

    public qh3(pb2 pb2Var, CharSequence charSequence, String str) {
        this.a = pb2Var;
        this.b = charSequence;
        this.c = str;
        this.d = pb2Var.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh3)) {
            return false;
        }
        qh3 qh3Var = (qh3) obj;
        return this.d == qh3Var.d && fni.a(this.b, qh3Var.b) && this.c.equals(qh3Var.c);
    }

    @Override // defpackage.rh3
    public final long getId() {
        return this.d;
    }

    public final int hashCode() {
        return this.c.hashCode() + u45.g(this.b, a9h.a(qh3.class.getName().hashCode() * 31, 31, this.d), 31);
    }
}
