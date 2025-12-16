package defpackage;

/* loaded from: classes.dex */
public final class al3 {
    public final Object a;
    public final em6 b;

    public al3(Object obj, em6 em6Var) {
        this.a = obj;
        this.b = em6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al3)) {
            return false;
        }
        al3 al3Var = (al3) obj;
        return fni.a(this.a, al3Var.a) && fni.a(this.b, al3Var.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "CompletedWithCancellation(result=" + this.a + ", onCancellation=" + this.b + ')';
    }
}
