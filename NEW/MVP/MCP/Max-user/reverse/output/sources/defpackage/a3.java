package defpackage;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class a3 extends AbstractCollection implements List {
    public final /* synthetic */ Serializable X;
    public final /* synthetic */ Serializable Y;
    public final /* synthetic */ int a = 1;
    public final Object b;
    public Collection c;
    public final Collection d;
    public final AbstractCollection o;

    public a3(hgi hgiVar, Object obj, List list, a3 a3Var) {
        this.Y = hgiVar;
        this.X = hgiVar;
        this.b = obj;
        this.c = list;
        this.o = a3Var;
        this.d = a3Var == null ? null : a3Var.c;
    }

    public void a() {
        a3 a3Var = (a3) this.o;
        if (a3Var != null) {
            a3Var.a();
        } else {
            ((k2) this.X).d.put(this.b, this.c);
        }
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        switch (this.a) {
            case 0:
                b();
                boolean zIsEmpty = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                ((k2) this.Y).o++;
                if (zIsEmpty) {
                    a();
                    break;
                }
                break;
            default:
                e();
                boolean zIsEmpty2 = this.c.isEmpty();
                ((List) this.c).add(i, obj);
                if (zIsEmpty2) {
                    d();
                    break;
                }
                break;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zAddAll = ((List) this.c).addAll(i, collection);
                if (!zAddAll) {
                    return zAddAll;
                }
                int size2 = this.c.size();
                ((k2) this.Y).o += size2 - size;
                if (size != 0) {
                    return zAddAll;
                }
                a();
                return zAddAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean zAddAll2 = ((List) this.c).addAll(i, collection);
                if (!zAddAll2) {
                    return zAddAll2;
                }
                this.c.size();
                if (size3 != 0) {
                    return zAddAll2;
                }
                d();
                return true;
        }
    }

    public void b() {
        Collection collection;
        a3 a3Var = (a3) this.o;
        if (a3Var != null) {
            a3Var.b();
            if (a3Var.c != this.d) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.c.isEmpty() || (collection = (Collection) ((k2) this.X).d.get(this.b)) == null) {
                return;
            }
            this.c = collection;
        }
    }

    public void c() {
        a3 a3Var = (a3) this.o;
        if (a3Var != null) {
            a3Var.c();
        } else if (this.c.isEmpty()) {
            ((k2) this.X).d.remove(this.b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        switch (this.a) {
            case 0:
                int size = size();
                if (size != 0) {
                    this.c.clear();
                    ((k2) this.X).o -= size;
                    c();
                    break;
                }
                break;
            default:
                if (size() != 0) {
                    this.c.clear();
                    f();
                    break;
                }
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                b();
                break;
            default:
                e();
                break;
        }
        return this.c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                b();
                break;
            default:
                e();
                break;
        }
        return this.c.containsAll(collection);
    }

    public void d() {
        a3 a3Var = (a3) this.o;
        if (a3Var != null) {
            a3Var.d();
            return;
        }
        ((hgi) this.X).c.put(this.b, this.c);
    }

    public void e() {
        a3 a3Var = (a3) this.o;
        if (a3Var != null) {
            a3Var.e();
            if (a3Var.c != this.d) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.c.isEmpty()) {
            hgi hgiVar = (hgi) this.X;
            Collection collection = (Collection) hgiVar.c.get(this.b);
            if (collection != null) {
                this.c = collection;
            }
        }
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj == this) {
                    return true;
                }
                b();
                return this.c.equals(obj);
            default:
                if (obj == this) {
                    return true;
                }
                e();
                return this.c.equals(obj);
        }
    }

    public void f() {
        a3 a3Var = (a3) this.o;
        if (a3Var != null) {
            a3Var.f();
        } else if (this.c.isEmpty()) {
            hgi hgiVar = (hgi) this.X;
            hgiVar.c.remove(this.b);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                b();
                break;
            default:
                e();
                break;
        }
        return ((List) this.c).get(i);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        switch (this.a) {
            case 0:
                b();
                return this.c.hashCode();
            default:
                e();
                return this.c.hashCode();
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                b();
                break;
            default:
                e();
                break;
        }
        return ((List) this.c).indexOf(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                b();
                return new r2(this);
            default:
                e();
                return new r2(this, (byte) 0);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.a) {
            case 0:
                b();
                break;
            default:
                e();
                break;
        }
        return ((List) this.c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                b();
                return new z2(this);
            default:
                e();
                return new xfi(this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.a) {
            case 0:
                b();
                Object objRemove = ((List) this.c).remove(i);
                k2 k2Var = (k2) this.Y;
                k2Var.o--;
                c();
                return objRemove;
            default:
                e();
                Object objRemove2 = ((List) this.c).remove(i);
                f();
                return objRemove2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zRemoveAll = this.c.removeAll(collection);
                if (!zRemoveAll) {
                    return zRemoveAll;
                }
                int size2 = this.c.size();
                ((k2) this.X).o += size2 - size;
                c();
                return zRemoveAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                size();
                boolean zRemoveAll2 = this.c.removeAll(collection);
                if (!zRemoveAll2) {
                    return zRemoveAll2;
                }
                this.c.size();
                f();
                return zRemoveAll2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                collection.getClass();
                int size = size();
                boolean zRetainAll = this.c.retainAll(collection);
                if (zRetainAll) {
                    int size2 = this.c.size();
                    ((k2) this.X).o += size2 - size;
                    c();
                }
                return zRetainAll;
            default:
                collection.getClass();
                size();
                boolean zRetainAll2 = this.c.retainAll(collection);
                if (zRetainAll2) {
                    this.c.size();
                    f();
                }
                return zRetainAll2;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.a) {
            case 0:
                b();
                break;
            default:
                e();
                break;
        }
        return ((List) this.c).set(i, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
            case 0:
                b();
                break;
            default:
                e();
                break;
        }
        return this.c.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.a) {
            case 0:
                b();
                k2 k2Var = (k2) this.Y;
                List listSubList = ((List) this.c).subList(i, i2);
                a3 a3Var = (a3) this.o;
                if (a3Var == null) {
                    a3Var = this;
                }
                boolean z = listSubList instanceof RandomAccess;
                Object obj = this.b;
                return z ? new w2(k2Var, obj, listSubList, a3Var) : new a3(k2Var, obj, listSubList, a3Var);
            default:
                e();
                List listSubList2 = ((List) this.c).subList(i, i2);
                a3 a3Var2 = (a3) this.o;
                if (a3Var2 == null) {
                    a3Var2 = this;
                }
                hgi hgiVar = (hgi) this.Y;
                boolean z2 = listSubList2 instanceof RandomAccess;
                Object obj2 = this.b;
                return z2 ? new ufi(hgiVar, obj2, listSubList2, a3Var2) : new a3(hgiVar, obj2, listSubList2, a3Var2);
        }
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        switch (this.a) {
            case 0:
                b();
                break;
            default:
                e();
                break;
        }
        return this.c.toString();
    }

    public a3(k2 k2Var, Object obj, List list, a3 a3Var) {
        this.Y = k2Var;
        this.X = k2Var;
        this.b = obj;
        this.c = list;
        this.o = a3Var;
        this.d = a3Var == null ? null : a3Var.c;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                b();
                return new z2(this, i);
            default:
                e();
                return new xfi(this, i);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                b();
                boolean zRemove = this.c.remove(obj);
                if (zRemove) {
                    k2 k2Var = (k2) this.X;
                    k2Var.o--;
                    c();
                }
                return zRemove;
            default:
                e();
                boolean zRemove2 = this.c.remove(obj);
                if (zRemove2) {
                    f();
                }
                return zRemove2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                b();
                boolean zIsEmpty = this.c.isEmpty();
                boolean zAdd = this.c.add(obj);
                if (zAdd) {
                    ((k2) this.X).o++;
                    if (zIsEmpty) {
                        a();
                    }
                }
                return zAdd;
            default:
                e();
                boolean zIsEmpty2 = this.c.isEmpty();
                boolean zAdd2 = this.c.add(obj);
                if (!zAdd2 || !zIsEmpty2) {
                    return zAdd2;
                }
                d();
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                if (collection.isEmpty()) {
                    return false;
                }
                int size = size();
                boolean zAddAll = this.c.addAll(collection);
                if (!zAddAll) {
                    return zAddAll;
                }
                int size2 = this.c.size();
                ((k2) this.X).o += size2 - size;
                if (size != 0) {
                    return zAddAll;
                }
                a();
                return zAddAll;
            default:
                if (collection.isEmpty()) {
                    return false;
                }
                int size3 = size();
                boolean zAddAll2 = this.c.addAll(collection);
                if (!zAddAll2) {
                    return zAddAll2;
                }
                this.c.size();
                if (size3 != 0) {
                    return zAddAll2;
                }
                d();
                return true;
        }
    }
}
