package io.ktor.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42821v;

/* compiled from: DelegatingMutableSet.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/S;", "From", "To", "", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public class S<From, To> implements Set<To>, Z41.h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<From> f400417b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f400418c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.jvm.internal.N f400419d;

    /* renamed from: e, reason: collision with root package name */
    public final int f400420e;

    /* compiled from: DelegatingMutableSet.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010)\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"io/ktor/util/S$a", "", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Iterator<To>, Z41.d {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Iterator<From> f400421b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ S<From, To> f400422c;

        public a(S<From, To> s5) {
            this.f400422c = s5;
            this.f400421b = s5.f400417b.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f400421b.hasNext();
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // java.util.Iterator
        public final To next() {
            return (To) this.f400422c.f400418c.invoke(this.f400421b.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.f400421b.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public S(@Y61.k Set<From> set, @Y61.k Y41.l<? super From, ? extends To> lVar, @Y61.k Y41.l<? super To, ? extends From> lVar2) {
        this.f400417b = set;
        this.f400418c = (kotlin.jvm.internal.N) lVar;
        this.f400419d = (kotlin.jvm.internal.N) lVar2;
        this.f400420e = set.size();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Y61.k
    public final ArrayList a(@Y61.k Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(C42745f0.q(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f400419d.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // java.util.Set, java.util.Collection
    public final boolean add(To to2) {
        return this.f400417b.add(this.f400419d.invoke(to2));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(@Y61.k Collection<? extends To> collection) {
        return this.f400417b.addAll(a(collection));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Y61.k
    public final ArrayList b(@Y61.k Collection collection) {
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(C42745f0.q(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f400418c.invoke(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f400417b.clear();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f400417b.contains(this.f400419d.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(@Y61.k Collection<? extends Object> collection) {
        return this.f400417b.containsAll(a(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(@Y61.l Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        ArrayList arrayListB = b(this.f400417b);
        return ((Set) obj).containsAll(arrayListB) && arrayListB.containsAll((Collection) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f400417b.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f400417b.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @Y61.k
    public final Iterator<To> iterator() {
        return new a(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f400417b.remove(this.f400419d.invoke(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(@Y61.k Collection<? extends Object> collection) {
        return this.f400417b.removeAll(a(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(@Y61.k Collection<? extends Object> collection) {
        return this.f400417b.retainAll(a(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f400420e;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    @Y61.k
    public final String toString() {
        return b(this.f400417b).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }
}
