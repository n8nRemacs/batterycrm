package com.yandex.mobile.ads.embedded.guava.collect;

import com.yandex.mobile.ads.impl.e80;
import com.yandex.mobile.ads.impl.iu0;
import com.yandex.mobile.ads.impl.ju0;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes8.dex */
class i<E> extends AbstractCollection<E> {

    /* renamed from: a, reason: collision with root package name */
    final Collection<E> f382773a;

    /* renamed from: b, reason: collision with root package name */
    final ju0<? super E> f382774b;

    public i(Collection<E> collection, ju0<? super E> ju0Var) {
        this.f382773a = collection;
        this.f382774b = ju0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(E e12) {
        iu0.a(this.f382774b.apply(e12));
        return this.f382773a.add(e12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            iu0.a(this.f382774b.apply(it.next()));
        }
        return this.f382773a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        e80.b(this.f382773a, this.f382774b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@I41.a Object obj) {
        boolean zContains;
        Collection<E> collection = this.f382773a;
        collection.getClass();
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.f382774b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return !e80.a(this.f382773a, this.f382774b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        Iterator<E> it = this.f382773a.iterator();
        ju0<? super E> ju0Var = this.f382774b;
        it.getClass();
        ju0Var.getClass();
        return new s(it, ju0Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(@I41.a Object obj) {
        return contains(obj) && this.f382773a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<E> it = this.f382773a.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f382774b.apply(next) && collection.contains(next)) {
                it.remove();
                z12 = true;
            }
        }
        return z12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        Iterator<E> it = this.f382773a.iterator();
        boolean z12 = false;
        while (it.hasNext()) {
            E next = it.next();
            if (this.f382774b.apply(next) && !collection.contains(next)) {
                it.remove();
                z12 = true;
            }
        }
        return z12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator<E> it = this.f382773a.iterator();
        int i12 = 0;
        while (it.hasNext()) {
            if (this.f382774b.apply(it.next())) {
                i12++;
            }
        }
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        u.a(arrayList, (Iterator) it);
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        Iterator<E> it = iterator();
        ArrayList arrayList = new ArrayList();
        u.a(arrayList, (Iterator) it);
        return (T[]) arrayList.toArray(tArr);
    }
}
