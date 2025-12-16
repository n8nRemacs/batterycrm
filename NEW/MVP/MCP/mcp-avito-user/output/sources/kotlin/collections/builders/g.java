package kotlin.collections.builders;

import Y61.k;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42742e;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.L;

/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/builders/g;", "V", "", "Lkotlin/collections/e;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class g<V> extends AbstractC42742e<V> implements Collection<V>, Z41.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d<?, V> f406706b;

    public g(@k d<?, V> dVar) {
        this.f406706b = dVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(V v12) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(@k Collection<? extends V> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f406706b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f406706b.containsValue(obj);
    }

    @Override // kotlin.collections.AbstractC42742e
    public final int getSize() {
        return this.f406706b.f406693j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f406706b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    @k
    public final Iterator<V> iterator() {
        d<?, V> dVar = this.f406706b;
        dVar.getClass();
        return new d.f(dVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i12;
        d<?, V> dVar = this.f406706b;
        dVar.c();
        int i13 = dVar.f406690g;
        while (true) {
            i12 = -1;
            i13--;
            if (i13 >= 0) {
                if (dVar.f406687d[i13] >= 0 && L.f(dVar.f406686c[i13], obj)) {
                    i12 = i13;
                    break;
                }
            } else {
                break;
            }
        }
        if (i12 < 0) {
            return false;
        }
        dVar.l(i12);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(@k Collection<? extends Object> collection) {
        this.f406706b.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(@k Collection<? extends Object> collection) {
        this.f406706b.c();
        return super.retainAll(collection);
    }
}
