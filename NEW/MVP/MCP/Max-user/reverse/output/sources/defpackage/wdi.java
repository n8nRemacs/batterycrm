package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class wdi extends mdi {
    public final transient bei c;
    public final transient Object[] d;
    public final transient int o;

    public wdi(bei beiVar, Object[] objArr, int i) {
        this.c = beiVar;
        this.d = objArr;
        this.o = i;
    }

    @Override // defpackage.pci
    public final int a(Object[] objArr) {
        zci udiVar = this.b;
        if (udiVar == null) {
            udiVar = new udi(this);
            this.b = udiVar;
        }
        return udiVar.a(objArr);
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
        zci udiVar = this.b;
        if (udiVar == null) {
            udiVar = new udi(this);
            this.b = udiVar;
        }
        return udiVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.o;
    }
}
