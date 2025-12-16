package defpackage;

/* loaded from: classes2.dex */
public final class og7 extends a2 implements gqa {
    public final double a;

    public og7(double d) {
        this.a = d;
    }

    @Override // defpackage.lyg
    public final String a() {
        double d = this.a;
        return (Double.isNaN(d) || Double.isInfinite(d)) ? "null" : Double.toString(d);
    }

    @Override // defpackage.lyg
    public final int d() {
        return 4;
    }

    @Override // defpackage.lyg
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lyg)) {
            return false;
        }
        lyg lygVar = (lyg) obj;
        int iD = ((a2) lygVar).d();
        if (iD == 0) {
            throw null;
        }
        if (iD == 4) {
            return this.a == lygVar.l().a;
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // defpackage.a2, defpackage.lyg
    public final og7 l() {
        return this;
    }

    public final String toString() {
        return Double.toString(this.a);
    }

    @Override // defpackage.a2
    /* renamed from: v */
    public final og7 l() {
        return this;
    }
}
