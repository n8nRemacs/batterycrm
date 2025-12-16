package defpackage;

/* loaded from: classes.dex */
public final class qk1 {
    public final int a;
    public final n5g b;

    public qk1(int i, n5g n5gVar) {
        this.a = i;
        this.b = n5gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk1)) {
            return false;
        }
        qk1 qk1Var = (qk1) obj;
        return this.a == qk1Var.a && this.b.equals(qk1Var.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.c) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ChipData(id=" + this.a + ", title=" + this.b + ")";
    }
}
