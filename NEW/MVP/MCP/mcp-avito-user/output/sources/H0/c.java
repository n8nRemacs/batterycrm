package h0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.external.kotlinx.collections.immutable.i;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.f;
import androidx.compose.runtime.internal.P;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42748h;

/* compiled from: PersistentOrderedSetBuilder.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lh0/c;", "E", "Lkotlin/collections/h;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i$a;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c<E> extends AbstractC42748h<E> implements i.a<E> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public b<E> f396960b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public Object f396961c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Object f396962d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final f<E, C40753a> f396963e;

    public c(@k b<E> bVar) {
        this.f396960b = bVar;
        this.f396961c = bVar.f396957c;
        this.f396962d = bVar.f396958d;
        this.f396963e = bVar.f396959e.builder();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e12) {
        f<E, C40753a> fVar = this.f396963e;
        if (fVar.containsKey(e12)) {
            return false;
        }
        if (isEmpty()) {
            this.f396961c = e12;
            this.f396962d = e12;
            fVar.put(e12, new C40753a());
            return true;
        }
        fVar.put(this.f396962d, new C40753a(((C40753a) fVar.get(this.f396962d)).f396953a, e12));
        fVar.put(e12, new C40753a(this.f396962d));
        this.f396962d = e12;
        return true;
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.i.a
    @k
    public final i<E> build() {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, C40753a> dVarD = this.f396963e.d();
        b<E> bVar = this.f396960b;
        if (dVarD != bVar.f396959e) {
            bVar = new b<>(this.f396961c, this.f396962d, dVarD);
        }
        this.f396960b = bVar;
        return bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f396963e.clear();
        i0.c cVar = i0.c.f398334a;
        this.f396961c = cVar;
        this.f396962d = cVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f396963e.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC42748h
    /* renamed from: getSize */
    public final int getF395508f() {
        return this.f396963e.getF38339g();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    @k
    public final Iterator<E> iterator() {
        return new e(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        f<E, C40753a> fVar = this.f396963e;
        C40753a c40753a = (C40753a) fVar.remove(obj);
        if (c40753a == null) {
            return false;
        }
        i0.c cVar = i0.c.f398334a;
        Object obj2 = c40753a.f396953a;
        boolean z12 = obj2 != cVar;
        Object obj3 = c40753a.f396954b;
        if (z12) {
            fVar.put(obj2, new C40753a(((C40753a) fVar.get(obj2)).f396953a, obj3));
        } else {
            this.f396961c = obj3;
        }
        if (obj3 != cVar) {
            fVar.put(obj3, new C40753a(obj2, ((C40753a) fVar.get(obj3)).f396954b));
        } else {
            this.f396962d = obj2;
        }
        return true;
    }
}
