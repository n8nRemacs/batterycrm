package defpackage;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class r2 implements Iterator {
    public final /* synthetic */ int a = 2;
    public final Iterator b;
    public Object c;
    public final /* synthetic */ Object d;

    public r2(a3 a3Var, ListIterator listIterator, byte b) {
        this.d = a3Var;
        this.c = a3Var.c;
        this.b = listIterator;
    }

    public void a() {
        a3 a3Var = (a3) this.d;
        a3Var.b();
        if (a3Var.c != ((Collection) this.c)) {
            throw new ConcurrentModificationException();
        }
    }

    public void b() {
        a3 a3Var = (a3) this.d;
        a3Var.e();
        if (a3Var.c != ((Collection) this.c)) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                a();
                break;
            case 3:
                break;
            default:
                b();
                break;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) this.b.next();
                this.c = (Collection) entry.getValue();
                return ((s2) this.d).a(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) this.b.next();
                this.c = entry2;
                return entry2.getKey();
            case 2:
                a();
                return this.b.next();
            case 3:
                Map.Entry entry3 = (Map.Entry) this.b.next();
                this.c = (Collection) entry3.getValue();
                Object key = entry3.getKey();
                Collection collection = (Collection) entry3.getValue();
                hgi hgiVar = (hgi) ((s2) this.d).o;
                hgiVar.getClass();
                List list = (List) collection;
                return new shi(key, list instanceof RandomAccess ? new ufi(hgiVar, key, list, null) : new a3(hgiVar, key, list, (a3) null));
            default:
                b();
                return this.b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                if (!(((Collection) this.c) != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                this.b.remove();
                ((k2) ((s2) this.d).o).o -= ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            case 1:
                Map.Entry entry = (Map.Entry) this.c;
                if (!(entry != null)) {
                    throw new IllegalStateException("no calls to next() since the last call to remove()");
                }
                Collection collection = (Collection) entry.getValue();
                this.b.remove();
                ((t2) this.d).c.o -= collection.size();
                collection.clear();
                this.c = null;
                return;
            case 2:
                this.b.remove();
                a3 a3Var = (a3) this.d;
                k2 k2Var = (k2) a3Var.X;
                k2Var.o--;
                a3Var.c();
                return;
            case 3:
                rui.e("no calls to next() since the last call to remove()", ((Collection) this.c) != null);
                this.b.remove();
                ((hgi) ((s2) this.d).o).getClass();
                ((Collection) this.c).size();
                ((Collection) this.c).clear();
                this.c = null;
                return;
            default:
                this.b.remove();
                ((a3) this.d).f();
                return;
        }
    }

    public r2(s2 s2Var, byte b) {
        this.d = s2Var;
        this.b = s2Var.b.entrySet().iterator();
    }

    public r2(a3 a3Var, byte b) {
        Iterator it;
        this.d = a3Var;
        Collection collection = a3Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public r2(a3 a3Var) {
        Iterator it;
        this.d = a3Var;
        Collection collection = a3Var.c;
        this.c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.b = it;
    }

    public r2(a3 a3Var, ListIterator listIterator) {
        this.d = a3Var;
        this.c = a3Var.c;
        this.b = listIterator;
    }

    public r2(t2 t2Var, Iterator it) {
        this.b = it;
        this.d = t2Var;
    }

    public r2(s2 s2Var) {
        this.d = s2Var;
        this.b = s2Var.b.entrySet().iterator();
    }
}
