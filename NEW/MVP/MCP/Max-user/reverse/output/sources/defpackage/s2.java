package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class s2 extends AbstractMap {
    public final /* synthetic */ int a;
    public final transient Map b;
    public transient AbstractSet c;
    public transient AbstractCollection d;
    public final /* synthetic */ Serializable o;

    public /* synthetic */ s2(Serializable serializable, Map map, int i) {
        this.a = i;
        this.o = serializable;
        this.b = map;
    }

    public pg7 a(Map.Entry entry) {
        Object key = entry.getKey();
        k2 k2Var = (k2) this.o;
        List list = (List) ((Collection) entry.getValue());
        return new pg7(key, list instanceof RandomAccess ? new w2(k2Var, key, list, null) : new a3(k2Var, key, list, (a3) null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        switch (this.a) {
            case 0:
                k2 k2Var = (k2) this.o;
                if (this.b != k2Var.d) {
                    r2 r2Var = new r2(this);
                    while (r2Var.hasNext()) {
                        r2Var.next();
                        r2Var.remove();
                    }
                    break;
                } else {
                    k2Var.b();
                    break;
                }
            default:
                hgi hgiVar = (hgi) this.o;
                if (this.b != hgiVar.c) {
                    r2 r2Var2 = new r2(this, (byte) 0);
                    while (r2Var2.hasNext()) {
                        r2Var2.next();
                        r2Var2.remove();
                    }
                    break;
                } else {
                    wi3 wi3Var = hgiVar.c;
                    Iterator it = wi3Var.values().iterator();
                    while (it.hasNext()) {
                        ((Collection) it.next()).clear();
                    }
                    wi3Var.clear();
                    break;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case 0:
                Map map = this.b;
                map.getClass();
                try {
                    return map.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                Map map2 = this.b;
                map2.getClass();
                try {
                    return map2.containsKey(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    return false;
                }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case 0:
                q2 q2Var = (q2) this.c;
                if (q2Var != null) {
                    return q2Var;
                }
                q2 q2Var2 = new q2(this);
                this.c = q2Var2;
                return q2Var2;
            default:
                mfi mfiVar = (mfi) this.c;
                if (mfiVar != null) {
                    return mfiVar;
                }
                mfi mfiVar2 = new mfi(this);
                this.c = mfiVar2;
                return mfiVar2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (this == obj || this.b.equals(obj)) {
                }
                break;
            default:
                if (this == obj || this.b.equals(obj)) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        switch (this.a) {
            case 0:
                Map map = this.b;
                map.getClass();
                try {
                    obj2 = map.get(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection == null) {
                    return null;
                }
                k2 k2Var = (k2) this.o;
                List list = (List) collection;
                return list instanceof RandomAccess ? new w2(k2Var, obj, list, null) : new a3(k2Var, obj, list, (a3) null);
            default:
                Map map2 = this.b;
                map2.getClass();
                try {
                    obj3 = map2.get(obj);
                } catch (ClassCastException | NullPointerException unused2) {
                    obj3 = null;
                }
                Collection collection2 = (Collection) obj3;
                if (collection2 == null) {
                    return null;
                }
                hgi hgiVar = (hgi) this.o;
                hgiVar.getClass();
                List list2 = (List) collection2;
                return list2 instanceof RandomAccess ? new ufi(hgiVar, obj, list2, null) : new a3(hgiVar, obj, list2, (a3) null);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        switch (this.a) {
            case 0:
                return this.b.hashCode();
            default:
                return this.b.hashCode();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        switch (this.a) {
            case 0:
                k2 k2Var = (k2) this.o;
                Set set = k2Var.a;
                if (set != null) {
                    return set;
                }
                Set setE = k2Var.e();
                k2Var.a = setE;
                return setE;
            default:
                return ((hgi) this.o).b();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case 0:
                k2 k2Var = (k2) this.o;
                Collection collection = (Collection) this.b.remove(obj);
                if (collection == null) {
                    return null;
                }
                Collection collectionD = k2Var.d();
                collectionD.addAll(collection);
                k2Var.o -= collection.size();
                collection.clear();
                return collectionD;
            default:
                hgi hgiVar = (hgi) this.o;
                Collection collection2 = (Collection) this.b.remove(obj);
                if (collection2 == null) {
                    return null;
                }
                hgiVar.getClass();
                ArrayList arrayList = new ArrayList(3);
                arrayList.addAll(collection2);
                collection2.size();
                collection2.clear();
                return arrayList;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        switch (this.a) {
        }
        return this.b.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        switch (this.a) {
        }
        return this.b.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        switch (this.a) {
            case 0:
                e3 e3Var = (e3) this.d;
                if (e3Var != null) {
                    return e3Var;
                }
                e3 e3Var2 = new e3(this, 2);
                this.d = e3Var2;
                return e3Var2;
            default:
                e3 e3Var3 = (e3) this.d;
                if (e3Var3 != null) {
                    return e3Var3;
                }
                e3 e3Var4 = new e3(this, 4);
                this.d = e3Var4;
                return e3Var4;
        }
    }
}
