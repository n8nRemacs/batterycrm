package f0;

import Y61.k;
import androidx.compose.runtime.external.kotlinx.collections.immutable.i;
import androidx.compose.runtime.internal.P;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42748h;

/* compiled from: PersistentHashSetBuilder.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lf0/b;", "E", "Lkotlin/collections/h;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i$a;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40188b<E> extends AbstractC42748h<E> implements i.a<E> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public C40187a<E> f395504b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public i0.f f395505c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public C40191e<E> f395506d;

    /* renamed from: e, reason: collision with root package name */
    public int f395507e;

    /* renamed from: f, reason: collision with root package name */
    public int f395508f;

    public C40188b() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e12) {
        int f395508f = getF395508f();
        this.f395506d = this.f395506d.j(e12 != null ? e12.hashCode() : 0, e12, 0, this);
        return f395508f != getF395508f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(@k Collection<? extends E> collection) {
        C40187a<E> c40187aBuild = collection instanceof C40187a ? (C40187a) collection : null;
        if (c40187aBuild == null) {
            C40188b c40188b = collection instanceof C40188b ? (C40188b) collection : null;
            c40187aBuild = c40188b != null ? c40188b.build() : null;
        }
        if (c40187aBuild == null) {
            return super.addAll(collection);
        }
        i0.b bVar = new i0.b(0, 1, null);
        int f395508f = getF395508f();
        C40191e<E> c40191eK = this.f395506d.k(c40187aBuild.f395502c, 0, bVar, this);
        int size = (collection.size() + f395508f) - bVar.f398333a;
        if (f395508f != size) {
            this.f395506d = c40191eK;
            d(size);
        }
        return f395508f != getF395508f();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.i.a
    @k
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C40187a<E> build() {
        C40191e<E> c40191e = this.f395506d;
        C40187a<E> c40187a = this.f395504b;
        if (c40191e != c40187a.f395502c) {
            this.f395505c = new i0.f();
            c40187a = new C40187a<>(getF395508f(), this.f395506d);
        }
        this.f395504b = c40187a;
        return c40187a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        C40191e.f395516d.getClass();
        this.f395506d = C40191e.f395517e;
        d(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f395506d.c(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(@k Collection<? extends Object> collection) {
        return collection instanceof C40187a ? this.f395506d.d(0, ((C40187a) collection).f395502c) : collection instanceof C40188b ? this.f395506d.d(0, ((C40188b) collection).f395506d) : super.containsAll(collection);
    }

    public final void d(int i12) {
        this.f395508f = i12;
        this.f395507e++;
    }

    @Override // kotlin.collections.AbstractC42748h
    /* renamed from: getSize, reason: from getter */
    public final int getF395508f() {
        return this.f395508f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @k
    public final Iterator<E> iterator() {
        return new C40190d(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int f395508f = getF395508f();
        this.f395506d = this.f395506d.l(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return f395508f != getF395508f();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(@k Collection<? extends Object> collection) {
        C40187a<E> c40187aBuild = collection instanceof C40187a ? (C40187a) collection : null;
        if (c40187aBuild == null) {
            C40188b c40188b = collection instanceof C40188b ? (C40188b) collection : null;
            c40187aBuild = c40188b != null ? c40188b.build() : null;
        }
        if (c40187aBuild == null) {
            return super.removeAll(collection);
        }
        i0.b bVar = new i0.b(0, 1, null);
        int f395508f = getF395508f();
        Object objM = this.f395506d.m(c40187aBuild.f395502c, 0, bVar, this);
        int i12 = f395508f - bVar.f398333a;
        if (i12 == 0) {
            clear();
        } else if (i12 != f395508f) {
            this.f395506d = (C40191e) objM;
            d(i12);
        }
        return f395508f != getF395508f();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(@k Collection<? extends Object> collection) {
        C40187a<E> c40187aBuild = collection instanceof C40187a ? (C40187a) collection : null;
        if (c40187aBuild == null) {
            C40188b c40188b = collection instanceof C40188b ? (C40188b) collection : null;
            c40187aBuild = c40188b != null ? c40188b.build() : null;
        }
        if (c40187aBuild == null) {
            return super.retainAll(collection);
        }
        i0.b bVar = new i0.b(0, 1, null);
        int f395508f = getF395508f();
        Object objN = this.f395506d.n(c40187aBuild.f395502c, 0, bVar, this);
        int i12 = bVar.f398333a;
        if (i12 == 0) {
            clear();
        } else if (i12 != f395508f) {
            this.f395506d = (C40191e) objN;
            d(i12);
        }
        return f395508f != getF395508f();
    }
}
