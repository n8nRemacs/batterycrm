package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class xsb extends g3 {
    public Object d;
    public int o;
    public vsb a = vsb.c;
    public lcj b = new lcj(24);
    public uig c = uig.e;
    public int X = 0;

    @Override // defpackage.g3
    public final Set a() {
        return new zsb(0, this);
    }

    @Override // defpackage.g3
    public final Set b() {
        return new zsb(1, this);
    }

    @Override // defpackage.g3
    public final Collection c() {
        return new pn8(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.c = uig.e;
        e(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.c.d(obj == null ? 0 : obj.hashCode(), 0, obj);
    }

    public final vsb d() {
        uig uigVar = this.c;
        vsb vsbVar = this.a;
        if (uigVar != vsbVar.a) {
            this.b = new lcj(24);
            vsbVar = new vsb(this.c, getSize());
        }
        this.a = vsbVar;
        return vsbVar;
    }

    public final void e(int i) {
        this.X = i;
        this.o++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (getSize() != map.size()) {
            return false;
        }
        if (map instanceof vsb) {
            return this.c.g(((vsb) obj).a, xf3.Y);
        }
        if (map instanceof xsb) {
            return this.c.g(((xsb) obj).c, xf3.Z);
        }
        if (size() != map.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!map.isEmpty()) {
            for (Map.Entry entry : map.entrySet()) {
                V v = get(entry.getKey());
                Boolean boolValueOf = v == 0 ? null : Boolean.valueOf(v.equals(entry.getValue()));
                if (!(boolValueOf == null ? entry.getValue() == null && containsKey(entry.getKey()) : boolValueOf.booleanValue())) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        return this.c.h(obj == null ? 0 : obj.hashCode(), 0, obj);
    }

    @Override // defpackage.g3
    public final int getSize() {
        return this.X;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.d = null;
        this.c = this.c.m(obj == null ? 0 : obj.hashCode(), obj, obj2, 0, this);
        return this.d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        vsb vsbVarD = null;
        vsb vsbVar = map instanceof vsb ? (vsb) map : null;
        if (vsbVar == null) {
            xsb xsbVar = map instanceof xsb ? (xsb) map : null;
            if (xsbVar != null) {
                vsbVarD = xsbVar.d();
            }
        } else {
            vsbVarD = vsbVar;
        }
        if (vsbVarD == null) {
            super.putAll(map);
            return;
        }
        rt4 rt4Var = new rt4();
        rt4Var.a = 0;
        int size = getSize();
        this.c = this.c.n(vsbVarD.a, 0, rt4Var, this);
        int i = (vsbVarD.b + size) - rt4Var.a;
        if (size != i) {
            e(i);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int size = getSize();
        uig uigVarP = this.c.p(obj == null ? 0 : obj.hashCode(), obj, obj2, 0, this);
        if (uigVarP == null) {
            uigVarP = uig.e;
        }
        this.c = uigVarP;
        return size != getSize();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        this.d = null;
        uig uigVarO = this.c.o(obj == null ? 0 : obj.hashCode(), obj, 0, this);
        if (uigVarO == null) {
            uigVarO = uig.e;
        }
        this.c = uigVarO;
        return this.d;
    }
}
