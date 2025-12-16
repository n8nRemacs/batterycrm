package h0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.external.kotlinx.collections.immutable.i;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.u;
import androidx.compose.runtime.internal.P;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractC42750i;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PersistentOrderedSet.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lh0/b;", "E", "Lkotlin/collections/i;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/i;", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b<E> extends AbstractC42750i<E> implements i<E> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f396955f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final b f396956g;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Object f396957c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Object f396958d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, C40753a> f396959e;

    /* compiled from: PersistentOrderedSet.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lh0/b$a;", "", "<init>", "()V", "Lh0/b;", "", "EMPTY", "Lh0/b;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        i0.c cVar = i0.c.f398334a;
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f38327g.getClass();
        f396956g = new b(cVar, cVar, androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f38328h);
    }

    public b(@l Object obj, @l Object obj2, @k androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, C40753a> dVar) {
        this.f396957c = obj;
        this.f396958d = obj2;
        this.f396959e = dVar;
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.i
    @k
    public final i<E> add(E e12) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, C40753a> dVar = this.f396959e;
        if (dVar.containsKey(e12)) {
            return this;
        }
        if (isEmpty()) {
            return new b(e12, e12, dVar.g(e12, new C40753a()));
        }
        Object obj = this.f396958d;
        return new b(this.f396957c, e12, dVar.g(obj, new C40753a(((C40753a) dVar.get(obj)).f396953a, e12)).g(e12, new C40753a(obj)));
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.i
    @k
    public final i<E> addAll(@k Collection<? extends E> collection) {
        c cVar = new c(this);
        cVar.addAll(collection);
        return cVar.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.i
    @k
    public final i.a<E> builder() {
        return new c(this);
    }

    @Override // kotlin.collections.AbstractC42734a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f396959e.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC42734a
    /* renamed from: getSize */
    public final int getF406660f() {
        return this.f396959e.getF38330f();
    }

    @Override // kotlin.collections.AbstractC42750i, java.util.Collection, java.lang.Iterable, java.util.Set
    @k
    public final Iterator<E> iterator() {
        return new d(this.f396959e, this.f396957c);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.i
    @k
    public final i<E> remove(E e12) {
        androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<E, C40753a> dVarG = this.f396959e;
        C40753a c40753a = dVarG.get(e12);
        if (c40753a == null) {
            return this;
        }
        int iHashCode = e12 != null ? e12.hashCode() : 0;
        u<E, C40753a> uVar = dVarG.f38329e;
        u<E, C40753a> uVarV = uVar.v(iHashCode, 0, e12);
        if (uVar != uVarV) {
            if (uVarV == null) {
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f38327g.getClass();
                dVarG = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d.f38328h;
            } else {
                dVarG = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.d<>(uVarV, dVarG.f38330f - 1);
            }
        }
        i0.c cVar = i0.c.f398334a;
        Object obj = c40753a.f396953a;
        boolean z12 = obj != cVar;
        Object obj2 = c40753a.f396954b;
        if (z12) {
            dVarG = dVarG.g(obj, new C40753a(dVarG.get(obj).f396953a, obj2));
        }
        if (obj2 != cVar) {
            dVarG = dVarG.g(obj2, new C40753a(obj, dVarG.get(obj2).f396954b));
        }
        Object obj3 = obj != cVar ? this.f396957c : obj2;
        if (obj2 != cVar) {
            obj = this.f396958d;
        }
        return new b(obj3, obj, dVarG);
    }

    @Override // java.util.Collection, java.util.Set, androidx.compose.runtime.external.kotlinx.collections.immutable.i
    @k
    public final i<E> removeAll(@k Collection<? extends E> collection) {
        c cVar = new c(this);
        cVar.removeAll(collection);
        return cVar.build();
    }
}
