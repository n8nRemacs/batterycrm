package kotlin.reflect.jvm.internal.impl.types;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.r;
import u51.InterfaceC48805g;

/* compiled from: IntersectionTypeConstructor.kt */
@kotlin.jvm.internal.s0
/* loaded from: classes8.dex */
public final class M implements q0, InterfaceC48805g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public O f410031a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet<O> f410032b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410033c;

    /* compiled from: IntersectionTypeConstructor.kt */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<kotlin.reflect.jvm.internal.impl.types.checker.i, Y> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Y invoke(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
            kotlin.reflect.jvm.internal.impl.types.checker.i iVar2 = iVar;
            M m12 = M.this;
            LinkedHashSet<O> linkedHashSet = m12.f410032b;
            ArrayList arrayList = new ArrayList(C42745f0.q(linkedHashSet, 10));
            Iterator<T> it = linkedHashSet.iterator();
            boolean z12 = false;
            while (it.hasNext()) {
                arrayList.add(((O) it.next()).J0(iVar2));
                z12 = true;
            }
            M m13 = null;
            if (z12) {
                O o12 = m12.f410031a;
                O oM02 = o12 != null ? o12.J0(iVar2) : null;
                M m14 = new M(new M(arrayList).f410032b);
                m14.f410031a = oM02;
                m13 = m14;
            }
            if (m13 != null) {
                m12 = m13;
            }
            return m12.d();
        }
    }

    /* compiled from: Comparisons.kt */
    @kotlin.jvm.internal.s0
    public static final class b<T> implements Comparator {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f410035b;

        public b(Y41.l lVar) {
            this.f410035b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            Y41.l lVar = this.f410035b;
            return kotlin.comparisons.a.b(lVar.invoke((O) t12).toString(), lVar.invoke((O) t13).toString());
        }
    }

    /* compiled from: IntersectionTypeConstructor.kt */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<O, CharSequence> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<O, Object> f410036l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super O, ? extends Object> lVar) {
            super(1);
            this.f410036l = lVar;
        }

        @Override // Y41.l
        public final CharSequence invoke(O o12) {
            return this.f410036l.invoke(o12).toString();
        }
    }

    public M() {
        throw null;
    }

    public M(@Y61.k AbstractCollection abstractCollection) {
        abstractCollection.isEmpty();
        LinkedHashSet<O> linkedHashSet = new LinkedHashSet<>(abstractCollection);
        this.f410032b = linkedHashSet;
        this.f410033c = linkedHashSet.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    public final Collection<O> C() {
        return this.f410032b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.l
    public final InterfaceC42853f b() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    public final boolean c() {
        return false;
    }

    @Y61.k
    public final Y d() {
        n0.f410236c.getClass();
        n0 n0Var = n0.f410237d;
        C42784z0 c42784z0 = C42784z0.f406748b;
        r.a aVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.r.f409702c;
        LinkedHashSet<O> linkedHashSet = this.f410032b;
        aVar.getClass();
        return P.g(n0Var, this, c42784z0, false, r.a.a("member scope for intersection type", linkedHashSet), new a());
    }

    @Y61.k
    public final String e(@Y61.k Y41.l<? super O, ? extends Object> lVar) {
        return C42745f0.O(C42745f0.B0(this.f410032b, new b(lVar)), " & ", "{", "}", new c(lVar), 24);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M) {
            return kotlin.jvm.internal.L.f(this.f410032b, ((M) obj).f410032b);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    public final List<kotlin.reflect.jvm.internal.impl.descriptors.g0> getParameters() {
        return C42784z0.f406748b;
    }

    public final int hashCode() {
        return this.f410033c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.builtins.k m() {
        return this.f410032b.iterator().next().H0().m();
    }

    @Y61.k
    public final String toString() {
        return e(N.f410037l);
    }
}
