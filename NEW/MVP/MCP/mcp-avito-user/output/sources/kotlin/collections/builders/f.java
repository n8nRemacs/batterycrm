package kotlin.collections.builders;

import Y61.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC42748h;
import kotlin.collections.builders.d;

/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/builders/f;", "E", "", "Lkotlin/collections/h;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class f<E> extends AbstractC42748h<E> implements Set<E>, Z41.h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d<E, ?> f406705b;

    public f(@k d<E, ?> dVar) {
        this.f406705b = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(@k Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f406705b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f406705b.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC42748h
    /* renamed from: getSize */
    public final int getF395508f() {
        return this.f406705b.f406693j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f406705b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @k
    public final Iterator<E> iterator() {
        d<E, ?> dVar = this.f406705b;
        dVar.getClass();
        return new d.e(dVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        d<E, ?> dVar = this.f406705b;
        dVar.c();
        int iG2 = dVar.g(obj);
        if (iG2 < 0) {
            return false;
        }
        dVar.l(iG2);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(@k Collection<? extends Object> collection) {
        this.f406705b.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(@k Collection<? extends Object> collection) {
        this.f406705b.c();
        return super.retainAll(collection);
    }
}
