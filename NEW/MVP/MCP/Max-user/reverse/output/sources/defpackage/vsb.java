package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class vsb extends o2 {
    public static final vsb c = new vsb(uig.e, 0);
    public final uig a;
    public final int b;

    public vsb(uig uigVar, int i) {
        this.a = uigVar;
        this.b = i;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.d(obj == null ? 0 : obj.hashCode(), 0, obj);
    }

    @Override // defpackage.o2, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this.b != map.size()) {
            return false;
        }
        boolean z = map instanceof vsb;
        uig uigVar = this.a;
        return z ? uigVar.g(((vsb) obj).a, xf3.o) : map instanceof xsb ? uigVar.g(((xsb) obj).c, xf3.X) : super.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.a.h(obj == null ? 0 : obj.hashCode(), 0, obj);
    }
}
