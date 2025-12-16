package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class xbj extends r7j {
    public final transient nji c;
    public final transient Object[] d;
    public final transient int o = 1;

    public xbj(nji njiVar, Object[] objArr) {
        this.c = njiVar;
        this.d = objArr;
    }

    @Override // defpackage.jyi
    public final int a(Object[] objArr) {
        n4j wajVar = this.b;
        if (wajVar == null) {
            wajVar = new waj(this);
            this.b = wajVar;
        }
        return wajVar.a(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.c.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        n4j wajVar = this.b;
        if (wajVar == null) {
            wajVar = new waj(this);
            this.b = wajVar;
        }
        return wajVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.o;
    }
}
