package defpackage;

/* loaded from: classes2.dex */
public final class ced implements eed {
    public final s5g a;
    public final Integer b;

    public ced(s5g s5gVar, Integer num) {
        this.a = s5gVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ced)) {
            return false;
        }
        ced cedVar = (ced) obj;
        return fni.a(this.a, cedVar.a) && fni.a(this.b, cedVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(textSource=" + this.a + ", iconRes=" + this.b + ")";
    }
}
