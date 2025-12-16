package OU0;

import Y61.k;
import Y61.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42821v;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;

/* compiled from: KotlinxJson.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LOU0/c;", "LOU0/e;", "LPU0/d;", "kotlinx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c extends e implements PU0.d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final JsonArray f12288b;

    /* compiled from: KotlinxJson.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"OU0/c$a", "", "LPU0/f;", "kotlinx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Iterator<PU0.f>, Z41.a {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Iterator<JsonElement> f12289b;

        public a(c cVar) {
            this.f12289b = cVar.f12288b.f412948b.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f12289b.hasNext();
        }

        @Override // java.util.Iterator
        public final PU0.f next() {
            return f.b(this.f12289b.next());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c() {
        throw null;
    }

    public c(@k JsonArray jsonArray) {
        super(null);
        this.f12288b = jsonArray;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i12, PU0.f fVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final boolean addAll(int i12, Collection<? extends PU0.f> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof PU0.f) {
            return this.f12288b.contains(f.a((PU0.f) obj));
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(@k Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        ArrayList arrayList = new ArrayList(C42745f0.q(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(f.a((PU0.f) it.next()));
        }
        return this.f12288b.f412948b.containsAll(arrayList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(@l Object obj) {
        return L.f(this.f12288b.f412948b, obj);
    }

    @Override // java.util.List
    public final PU0.f get(int i12) {
        return f.b(this.f12288b.f412948b.get(i12));
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        return this.f12288b.f412948b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof PU0.f) {
            return this.f12288b.indexOf(f.a((PU0.f) obj));
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f12288b.f412948b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @k
    public final Iterator<PU0.f> iterator() {
        return new a(this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof PU0.f) {
            return this.f12288b.lastIndexOf(f.a((PU0.f) obj));
        }
        return -1;
    }

    @Override // java.util.List
    @k
    public final ListIterator<PU0.f> listIterator() {
        return new b(null, this);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ PU0.f remove(int i12) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final void replaceAll(UnaryOperator<PU0.f> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ PU0.f set(int i12, PU0.f fVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f12288b.f412948b.size();
    }

    @Override // java.util.List
    public final void sort(Comparator<? super PU0.f> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @k
    public final List<PU0.f> subList(int i12, int i13) {
        List<JsonElement> listSubList = this.f12288b.f412948b.subList(i12, i13);
        ArrayList arrayList = new ArrayList(C42745f0.q(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(f.b((JsonElement) it.next()));
        }
        return arrayList;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C42821v.a(this);
    }

    @k
    public final String toString() {
        return this.f12288b.toString();
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends PU0.f> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    @k
    public final ListIterator<PU0.f> listIterator(int i12) {
        return new b(Integer.valueOf(i12), this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C42821v.b(this, tArr);
    }
}
