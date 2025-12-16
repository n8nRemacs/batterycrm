package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class u8a implements List, oy7 {
    public final w8a a;

    public u8a(w8a w8aVar) {
        this.a = w8aVar;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        this.a.b(obj);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        w8a w8aVar = this.a;
        if (i < 0 || i > w8aVar.b) {
            StringBuilder sbM = ho7.m(i, "Index ", " must be in 0..");
            sbM.append(w8aVar.b);
            throw new IndexOutOfBoundsException(sbM.toString());
        }
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        w8aVar.e(collection.size() + w8aVar.b);
        Object[] objArr = w8aVar.a;
        if (i != w8aVar.b) {
            ys.l(collection.size() + i, i, w8aVar.b, objArr, objArr);
        }
        for (Object obj : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ve3.p();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i3;
        }
        w8aVar.b = collection.size() + w8aVar.b;
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        this.a.d();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.g(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (this.a.g(it.next()) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        rqa.a(i, this);
        return this.a.f(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.a.g(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a.h();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new t8a(0, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        w8a w8aVar = this.a;
        if (obj == null) {
            Object[] objArr = w8aVar.a;
            for (int i = w8aVar.b - 1; -1 < i; i--) {
                if (objArr[i] == null) {
                    return i;
                }
            }
        } else {
            Object[] objArr2 = w8aVar.a;
            for (int i2 = w8aVar.b - 1; -1 < i2; i2--) {
                if (obj.equals(objArr2[i2])) {
                    return i2;
                }
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new t8a(0, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        w8a w8aVar = this.a;
        int iG = w8aVar.g(obj);
        if (iG < 0) {
            return false;
        }
        w8aVar.i(iG);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        w8a w8aVar = this.a;
        int i = w8aVar.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            int iG = w8aVar.g(it.next());
            if (iG >= 0) {
                w8aVar.i(iG);
            }
        }
        return i != w8aVar.b;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        w8a w8aVar = this.a;
        int i = w8aVar.b;
        Object[] objArr = w8aVar.a;
        for (int i2 = i - 1; -1 < i2; i2--) {
            if (!collection.contains(objArr[i2])) {
                w8aVar.i(i2);
            }
        }
        return i != w8aVar.b;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        rqa.a(i, this);
        w8a w8aVar = this.a;
        if (i < 0) {
            w8aVar.getClass();
        } else if (i < w8aVar.b) {
            Object[] objArr = w8aVar.a;
            Object obj2 = objArr[i];
            objArr[i] = obj;
            return obj2;
        }
        StringBuilder sbM = ho7.m(i, "set index ", " must be between 0 .. ");
        sbM.append(w8aVar.b - 1);
        throw new IndexOutOfBoundsException(sbM.toString());
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a.b;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        rqa.b(this, i, i2);
        return new v8a(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return zg4.e(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        this.a.a(i, obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new t8a(i, this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return zg4.f(this, objArr);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        rqa.a(i, this);
        return this.a.i(i);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        w8a w8aVar = this.a;
        int i = w8aVar.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            w8aVar.b(it.next());
        }
        return i != w8aVar.b;
    }
}
