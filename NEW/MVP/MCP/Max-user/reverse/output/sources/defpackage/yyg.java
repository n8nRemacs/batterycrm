package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class yyg {
    public final xyg a;
    public final vyg b;
    public final vyg c;
    public final List d;
    public final List e;
    public final Integer f;

    public yyg(xyg xygVar, vyg vygVar, vyg vygVar2, ArrayList arrayList, ArrayList arrayList2, Integer num) {
        this.a = xygVar;
        this.b = vygVar;
        this.c = vygVar2;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yyg)) {
            return false;
        }
        yyg yygVar = (yyg) obj;
        return fni.a(this.a, yygVar.a) && fni.a(this.b, yygVar.b) && fni.a(this.c, yygVar.c) && fni.a(this.d, yygVar.d) && fni.a(this.e, yygVar.e) && fni.a(this.f, yygVar.f);
    }

    public final int hashCode() {
        xyg xygVar = this.a;
        int iHashCode = (xygVar == null ? 0 : xygVar.hashCode()) * 31;
        vyg vygVar = this.b;
        int iHashCode2 = (iHashCode + (vygVar == null ? 0 : vygVar.hashCode())) * 31;
        vyg vygVar2 = this.c;
        int iHashCode3 = (iHashCode2 + (vygVar2 == null ? 0 : vygVar2.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "VectorBackgroundModel(pattern=" + this.a + ", gradient=" + this.b + ", patternGradient=" + this.c + ", gradientEllipse=" + this.d + ", patternGradientEllipse=" + this.e + ", fillColor=" + this.f + ")";
    }
}
