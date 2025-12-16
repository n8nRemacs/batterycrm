package defpackage;

/* loaded from: classes2.dex */
public final class yvb {
    public final Double a;
    public final Double b;
    public final Double c;
    public final Double d;
    public final s5g e;
    public final String f;
    public final boolean g;

    public yvb(Double d, Double d2, Double d3, Double d4, s5g s5gVar, String str, boolean z) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = s5gVar;
        this.f = str;
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [s5g] */
    public static yvb a(yvb yvbVar, Double d, Double d2, Double d3, Double d4, n5g n5gVar, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            d = yvbVar.a;
        }
        Double d5 = d;
        if ((i & 2) != 0) {
            d2 = yvbVar.b;
        }
        Double d6 = d2;
        if ((i & 4) != 0) {
            d3 = yvbVar.c;
        }
        Double d7 = d3;
        if ((i & 8) != 0) {
            d4 = yvbVar.d;
        }
        Double d8 = d4;
        n5g n5gVar2 = n5gVar;
        if ((i & 16) != 0) {
            n5gVar2 = yvbVar.e;
        }
        n5g n5gVar3 = n5gVar2;
        if ((i & 32) != 0) {
            str = yvbVar.f;
        }
        String str2 = str;
        if ((i & 64) != 0) {
            z = yvbVar.g;
        }
        yvbVar.getClass();
        return new yvb(d5, d6, d7, d8, n5gVar3, str2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvb)) {
            return false;
        }
        yvb yvbVar = (yvb) obj;
        return fni.a(this.a, yvbVar.a) && fni.a(this.b, yvbVar.b) && fni.a(this.c, yvbVar.c) && fni.a(this.d, yvbVar.d) && fni.a(this.e, yvbVar.e) && fni.a(this.f, yvbVar.f) && this.g == yvbVar.g;
    }

    public final int hashCode() {
        Double d = this.a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        int iHashCode2 = (iHashCode + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.c;
        int iHashCode3 = (iHashCode2 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.d;
        int iD = xc0.d((iHashCode3 + (d4 == null ? 0 : d4.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.g) + ((iD + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PickLocationState(myLocationLat=");
        sb.append(this.a);
        sb.append(", myLocationLon=");
        sb.append(this.b);
        sb.append(", locationLat=");
        sb.append(this.c);
        sb.append(", locationLon=");
        sb.append(this.d);
        sb.append(", sendTitle=");
        sb.append(this.e);
        sb.append(", locationText=");
        sb.append(this.f);
        sb.append(", geoCodingInProgress=");
        return az1.k(sb, this.g, ")");
    }
}
