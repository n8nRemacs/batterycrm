package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class hn4 extends jo7 implements Map {
    public final /* synthetic */ int X;
    public final Map Y;

    public /* synthetic */ hn4(Map map, int i) {
        this.X = i;
        this.Y = map;
    }

    @Override // defpackage.jo7
    public final Object a() {
        switch (this.X) {
        }
        return this.Y;
    }

    @Override // java.util.Map
    public final void clear() {
        j().clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.X) {
            case 0:
                if (obj == null || !i(obj)) {
                }
                break;
            default:
                if (obj == null || !i(obj)) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        ro8 ro8Var = new ro8(entrySet().iterator());
        if (obj == null) {
            while (ro8Var.hasNext()) {
                if (ro8Var.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (ro8Var.hasNext()) {
            if (obj.equals(ro8Var.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.X) {
            case 0:
                return w9j.c(k(), new gn4(2));
            default:
                return w9j.c(k(), new gn4(1));
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.X) {
            case 0:
                if (obj == null || !nsi.b(this, obj)) {
                }
                break;
            default:
                if (obj == null || !nsi.b(this, obj)) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        switch (this.X) {
            case 0:
                if (obj != null) {
                    break;
                }
                break;
            default:
                if (obj != null) {
                    break;
                }
                break;
        }
        return (List) l(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.X) {
        }
        return w9j.d(entrySet());
    }

    public final boolean i(Object obj) {
        return j().containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.X) {
            case 0:
                if (!m()) {
                    if (o() != 1 || !i(null)) {
                    }
                }
                break;
            default:
                if (!m()) {
                    if (o() != 1 || !i(null)) {
                    }
                }
                break;
        }
        return true;
    }

    public final Map j() {
        switch (this.X) {
        }
        return this.Y;
    }

    public final Set k() {
        return j().entrySet();
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.X) {
            case 0:
                return w9j.c(n(), new gn4(0));
            default:
                return w9j.c(n(), new gn4(3));
        }
    }

    public final Object l(Object obj) {
        return j().get(obj);
    }

    public final boolean m() {
        return j().isEmpty();
    }

    public final Set n() {
        return j().keySet();
    }

    public final int o() {
        return j().size();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return j().put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        j().putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return j().remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        int iO;
        int i;
        switch (this.X) {
            case 0:
                iO = o();
                i = i(null);
                break;
            default:
                iO = o();
                i = i(null);
                break;
        }
        return iO - i;
    }

    @Override // java.util.Map
    public final Collection values() {
        return j().values();
    }
}
