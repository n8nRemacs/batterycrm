package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class b7g {
    public final a7g a;
    public final y6g b;
    public final y6g c;
    public final List d;
    public final List e;
    public final Integer f;

    public b7g(a7g a7gVar, y6g y6gVar, y6g y6gVar2, List list, List list2, Integer num) {
        this.a = a7gVar;
        this.b = y6gVar;
        this.c = y6gVar2;
        this.d = list;
        this.e = list2;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7g)) {
            return false;
        }
        b7g b7gVar = (b7g) obj;
        return fni.a(this.a, b7gVar.a) && fni.a(this.b, b7gVar.b) && fni.a(this.c, b7gVar.c) && fni.a(this.d, b7gVar.d) && fni.a(this.e, b7gVar.e) && fni.a(this.f, b7gVar.f);
    }

    public final int hashCode() {
        a7g a7gVar = this.a;
        int iHashCode = (a7gVar == null ? 0 : a7gVar.a.hashCode()) * 31;
        y6g y6gVar = this.b;
        int iHashCode2 = (iHashCode + (y6gVar == null ? 0 : y6gVar.hashCode())) * 31;
        y6g y6gVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (y6gVar2 == null ? 0 : y6gVar2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "ThemeBackgroundDrawModel(pattern=" + this.a + ", gradient=" + this.b + ", patternGradient=" + this.c + ", gradientEllipse=" + this.d + ", patternGradientEllipse=" + this.e + ", fillColor=" + this.f + ")";
    }
}
