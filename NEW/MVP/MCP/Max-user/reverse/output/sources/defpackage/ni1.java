package defpackage;

/* loaded from: classes2.dex */
public final class ni1 {
    public final Integer a;
    public final Integer b;
    public final Boolean c;
    public final Integer d;
    public final Integer e;
    public final Double f;
    public final Integer g;
    public final Integer h;

    public ni1(Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, Double d, Integer num5, Integer num6) {
        this.a = num;
        this.b = num2;
        this.c = bool;
        this.d = num3;
        this.e = num4;
        this.f = d;
        this.g = num5;
        this.h = num6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni1)) {
            return false;
        }
        ni1 ni1Var = (ni1) obj;
        return fni.a(this.a, ni1Var.a) && fni.a(this.b, ni1Var.b) && fni.a(this.c, ni1Var.c) && fni.a(this.d, ni1Var.d) && fni.a(this.e, ni1Var.e) && fni.a(this.f, ni1Var.f) && fni.a(this.g, ni1Var.g) && fni.a(this.h, ni1Var.h);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num3 = this.d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.e;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d = this.f;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num5 = this.g;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.h;
        return iHashCode7 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        return "AudioAdaptationParams(minEncoderBitrateKBps=" + this.a + ", minPayloadBitrateKBps=" + this.b + ", useSlowAdaptation=" + this.c + ", minBitrateConstraintBps=" + this.d + ", maxBitrateConstraintBps=" + this.e + ", bitratePriority=" + this.f + ", pTimeMinMs=" + this.g + ", pTimeMaxMs=" + this.h + ")";
    }
}
