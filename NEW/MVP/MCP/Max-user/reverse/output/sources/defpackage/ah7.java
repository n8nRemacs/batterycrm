package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes.dex */
public abstract class ah7 implements Map, Serializable {
    public transient hh7 a;
    public transient hh7 b;
    public transient ng7 c;

    public static ah7 a(Map map) {
        if ((map instanceof ah7) && !(map instanceof SortedMap)) {
            ah7 ah7Var = (ah7) map;
            if (!ah7Var.f()) {
                return ah7Var;
            }
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        lk6 lk6Var = new lk6(setEntrySet != null ? setEntrySet.size() : 4);
        if (setEntrySet != null) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) lk6Var.c;
            if (size > objArr.length) {
                lk6Var.c = Arrays.copyOf(objArr, mg7.h(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            lk6Var.T(entry.getKey(), entry.getValue());
        }
        return lk6Var.u();
    }

    public abstract hh7 b();

    public abstract hh7 c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract ng7 d();

    @Override // java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public hh7 entrySet() {
        hh7 hh7Var = this.a;
        if (hh7Var != null) {
            return hh7Var;
        }
        hh7 hh7VarB = b();
        this.a = hh7VarB;
        return hh7VarB;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return nsi.b(this, obj);
    }

    public abstract boolean f();

    @Override // java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public hh7 keySet() {
        hh7 hh7Var = this.b;
        if (hh7Var != null) {
            return hh7Var;
        }
        hh7 hh7VarC = c();
        this.b = hh7VarC;
        return hh7VarC;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public ng7 values() {
        ng7 ng7Var = this.c;
        if (ng7Var != null) {
            return ng7Var;
        }
        ng7 ng7VarD = d();
        this.c = ng7VarD;
        return ng7VarD;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return w9j.d(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        u4j.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
