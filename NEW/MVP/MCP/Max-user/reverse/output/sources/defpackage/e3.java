package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class e3 extends AbstractCollection {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ e3(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((k2) this.b).b();
                break;
            case 1:
                ((wi3) this.b).clear();
                break;
            case 2:
                ((s2) this.b).clear();
                break;
            case 3:
                ((wi3) this.b).clear();
                break;
            default:
                ((s2) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                Iterator it = ((k2) this.b).a().values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            case 3:
            default:
                return super.contains(obj);
            case 2:
                return ((s2) this.b).containsValue(obj);
            case 4:
                return ((s2) this.b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 2:
                return ((s2) this.b).isEmpty();
            case 3:
            default:
                return super.isEmpty();
            case 4:
                return ((s2) this.b).isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new p2((k2) this.b);
            case 1:
                wi3 wi3Var = (wi3) this.b;
                Map mapB = wi3Var.b();
                return mapB != null ? mapB.values().iterator() : new si3(wi3Var, 2);
            case 2:
                return new ro8(((s2) this.b).entrySet().iterator());
            case 3:
                wi3 wi3Var2 = (wi3) this.b;
                Map mapO = wi3Var2.o();
                return mapO != null ? mapO.values().iterator() : new lgi(wi3Var2, 2);
            default:
                return new qii(((s2) this.b).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 2:
                s2 s2Var = (s2) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry : s2Var.entrySet()) {
                        if (uyi.c(obj, entry.getValue())) {
                            s2Var.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            case 3:
            default:
                return super.remove(obj);
            case 4:
                s2 s2Var2 = (s2) this.b;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused2) {
                    for (Map.Entry entry2 : s2Var2.entrySet()) {
                        if (pui.c(obj, entry2.getValue())) {
                            s2Var2.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 2:
                s2 s2Var = (s2) this.b;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : s2Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return s2Var.keySet().removeAll(hashSet);
                }
            case 3:
            default:
                return super.removeAll(collection);
            case 4:
                s2 s2Var2 = (s2) this.b;
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : s2Var2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((hgi) s2Var2.o).b().removeAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 2:
                s2 s2Var = (s2) this.b;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : s2Var.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return s2Var.keySet().retainAll(hashSet);
                }
            case 3:
            default:
                return super.retainAll(collection);
            case 4:
                s2 s2Var2 = (s2) this.b;
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused2) {
                    HashSet hashSet2 = new HashSet();
                    for (Map.Entry entry2 : s2Var2.entrySet()) {
                        if (collection.contains(entry2.getValue())) {
                            hashSet2.add(entry2.getKey());
                        }
                    }
                    return ((hgi) s2Var2.o).b().retainAll(hashSet2);
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((k2) this.b).o;
            case 1:
                return ((wi3) this.b).size();
            case 2:
                return ((s2) this.b).b.size();
            case 3:
                return ((wi3) this.b).size();
            default:
                return ((s2) this.b).b.size();
        }
    }

    public /* synthetic */ e3(AbstractMap abstractMap, int i) {
        this.a = i;
        this.b = abstractMap;
    }
}
