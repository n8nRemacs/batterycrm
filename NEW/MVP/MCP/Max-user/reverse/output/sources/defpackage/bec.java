package defpackage;

/* loaded from: classes2.dex */
public final class bec implements cec {
    public final s5g a;
    public final Integer b;

    public bec(s5g s5gVar, Integer num) {
        this.a = s5gVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bec)) {
            return false;
        }
        bec becVar = (bec) obj;
        return fni.a(this.a, becVar.a) && fni.a(this.b, becVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ", iconRes=" + this.b + ")";
    }
}
