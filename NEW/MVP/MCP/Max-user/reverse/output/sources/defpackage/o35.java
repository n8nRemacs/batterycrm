package defpackage;

/* loaded from: classes2.dex */
public final class o35 {
    public final d35 a;
    public final d35 b;

    public o35(d35 d35Var, d35 d35Var2) {
        this.a = d35Var;
        this.b = d35Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o35)) {
            return false;
        }
        o35 o35Var = (o35) obj;
        return fni.a(this.a, o35Var.a) && fni.a(this.b, o35Var.b);
    }

    public final int hashCode() {
        d35 d35Var = this.a;
        int iHashCode = (d35Var == null ? 0 : d35Var.hashCode()) * 31;
        d35 d35Var2 = this.b;
        return iHashCode + (d35Var2 != null ? d35Var2.hashCode() : 0);
    }

    public final String toString() {
        return "DraftsNews(chats=" + this.a + ", users=" + this.b + ")";
    }
}
