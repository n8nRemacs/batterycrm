package kotlin.collections.builders;

import Y61.k;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.L;

/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/collections/builders/e;", "K", "V", "Lkotlin/collections/builders/a;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e<K, V> extends a<Map.Entry<K, V>, K, V> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d<K, V> f406704b;

    public e(@k d<K, V> dVar) {
        this.f406704b = dVar;
    }

    @Override // kotlin.collections.builders.a
    public final boolean a(@k Map.Entry<? extends K, ? extends V> entry) {
        d<K, V> dVar = this.f406704b;
        dVar.getClass();
        int iG2 = dVar.g(entry.getKey());
        if (iG2 < 0) {
            return false;
        }
        return L.f(dVar.f406686c[iG2], entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(@k Collection<? extends Map.Entry<K, V>> collection) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.builders.a
    public final boolean b(@k Map.Entry entry) {
        d<K, V> dVar = this.f406704b;
        dVar.c();
        int iG2 = dVar.g(entry.getKey());
        if (iG2 < 0 || !L.f(dVar.f406686c[iG2], entry.getValue())) {
            return false;
        }
        dVar.l(iG2);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f406704b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(@k Collection<? extends Object> collection) {
        return this.f406704b.e(collection);
    }

    @Override // kotlin.collections.AbstractC42748h
    /* renamed from: getSize */
    public final int getF395508f() {
        return this.f406704b.f406693j;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f406704b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @k
    public final Iterator<Map.Entry<K, V>> iterator() {
        d<K, V> dVar = this.f406704b;
        dVar.getClass();
        return new d.b(dVar);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(@k Collection<? extends Object> collection) {
        this.f406704b.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(@k Collection<? extends Object> collection) {
        this.f406704b.c();
        return super.retainAll(collection);
    }
}
