package defpackage;

/* loaded from: classes2.dex */
public final class lh8 extends mh8 {
    public final s5g d;
    public final s5g e;

    public lh8(s5g s5gVar, s5g s5gVar2) {
        super(s5gVar, null);
        this.d = s5gVar;
        this.e = s5gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lh8)) {
            return false;
        }
        lh8 lh8Var = (lh8) obj;
        return fni.a(this.d, lh8Var.d) && fni.a(this.e, lh8Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "SmsCountExceeded(title=" + this.d + ", description=" + this.e + ")";
    }
}
