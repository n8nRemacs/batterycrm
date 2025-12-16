package defpackage;

/* loaded from: classes.dex */
public final class uj7 {
    public final int a;
    public final Object b;

    public uj7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj7)) {
            return false;
        }
        uj7 uj7Var = (uj7) obj;
        return this.a == uj7Var.a && fni.a(this.b, uj7Var.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Object obj = this.b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ')';
    }
}
