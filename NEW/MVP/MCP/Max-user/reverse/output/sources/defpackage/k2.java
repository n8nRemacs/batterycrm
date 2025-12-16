package defpackage;

import com.google.common.collect.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class k2 extends a implements Serializable {
    public final transient Map d;
    public transient int o;

    public k2(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.d = map;
    }

    @Override // com.google.common.collect.a
    public final Map a() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        Map mapC = c();
        this.c = mapC;
        return mapC;
    }

    public final void b() {
        Map map = this.d;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.o = 0;
    }

    public Map c() {
        return new s2(this, this.d, 0);
    }

    public abstract Collection d();

    public Set e() {
        return new t2(this, this.d);
    }

    public final boolean f(Object obj, Object obj2) {
        Map map = this.d;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.o++;
            return true;
        }
        Collection collectionD = d();
        if (!collectionD.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.o++;
        map.put(obj, collectionD);
        return true;
    }

    public final Collection g() {
        Collection collection = this.b;
        if (collection != null) {
            return collection;
        }
        e3 e3Var = new e3(0, this);
        this.b = e3Var;
        return e3Var;
    }
}
