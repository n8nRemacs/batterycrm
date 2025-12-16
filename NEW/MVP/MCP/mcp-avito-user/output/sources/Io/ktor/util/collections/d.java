package io.ktor.util.collections;

import Y61.k;
import Y61.l;
import Z41.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42821v;
import kotlin.jvm.internal.s0;

/* compiled from: ConcurrentSet.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lio/ktor/util/collections/d;", "", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class d implements Set<Object>, h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final b<Object, G0> f400449b = new b<>(0, 1, null);

    @Override // java.util.Set, java.util.Collection
    public final boolean add(@k Object obj) {
        b<Object, G0> bVar = this.f400449b;
        if (bVar.f400447b.containsKey(obj)) {
            return false;
        }
        bVar.put(obj, G0.f406611a);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(@k Collection<Object> collection) {
        Collection<Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!add(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f400449b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(@l Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f400449b.f400447b.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(@k Collection<? extends Object> collection) {
        return collection.containsAll(this.f400449b.f400447b.keySet());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f400449b.f400447b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @k
    public final Iterator<Object> iterator() {
        return this.f400449b.f400447b.keySet().iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(@l Object obj) {
        return (obj == null || this.f400449b.f400447b.remove(obj) == null) ? false : true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(@k Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!remove(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(@k Collection<? extends Object> collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : this.f400449b.f400447b.keySet()) {
            if (!collection.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return removeAll(linkedHashSet);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f400449b.f400447b.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }
}
