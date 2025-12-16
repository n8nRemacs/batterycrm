package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class cf6 implements Collection, my7 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public cf6(df6 df6Var) {
        this.b = df6Var.a;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof ls8)) {
                    return false;
                }
                return ((ConcurrentSkipListSet) this.b).contains((ls8) obj);
            default:
                return ((c9a) this.b).c(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).containsAll(collection);
            default:
                c9a c9aVar = (c9a) this.b;
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!c9aVar.c(it.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).isEmpty();
            default:
                return ((c9a) this.b).h();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).iterator();
            default:
                return mee.b(new dzd((c9a) this.b, null));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).size();
            default:
                return ((c9a) this.b).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
        }
        return zg4.e(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
        }
        return zg4.f(this, objArr);
    }

    public cf6(c9a c9aVar) {
        this.b = c9aVar;
    }
}
