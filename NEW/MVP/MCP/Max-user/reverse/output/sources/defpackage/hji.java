package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class hji extends dii {
    public final transient nji c;
    public final transient Object[] d;
    public final transient int o = 1;

    public hji(nji njiVar, Object[] objArr) {
        this.c = njiVar;
        this.d = objArr;
    }

    @Override // defpackage.qhi
    public final int a(int i, Object[] objArr) {
        zhi fjiVar = this.b;
        if (fjiVar == null) {
            fjiVar = new fji(this);
            this.b = fjiVar;
        }
        return fjiVar.a(i, objArr);
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
        zhi fjiVar = this.b;
        if (fjiVar == null) {
            fjiVar = new fji(this);
            this.b = fjiVar;
        }
        return fjiVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.o;
    }
}
