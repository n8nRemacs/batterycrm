package defpackage;

/* loaded from: classes2.dex */
public final class h92 {
    public final n5g a;
    public final Integer b;

    public h92(n5g n5gVar, Integer num) {
        this.a = n5gVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h92)) {
            return false;
        }
        h92 h92Var = (h92) obj;
        return this.a.equals(h92Var.a) && this.b.equals(h92Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a.c) * 31);
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ", iconRes=" + this.b + ")";
    }
}
