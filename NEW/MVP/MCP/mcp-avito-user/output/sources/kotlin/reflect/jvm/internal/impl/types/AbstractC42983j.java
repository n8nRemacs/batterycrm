package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;

/* compiled from: AbstractTypeConstructor.kt */
/* renamed from: kotlin.reflect.jvm.internal.impl.types.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42983j extends AbstractC42994t {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k<b> f410213b;

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.j$a */
    public final class a implements q0 {
        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        public final Collection C() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        @Y61.k
        public final InterfaceC42853f b() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        public final boolean c() {
            throw null;
        }

        public final boolean equals(@Y61.l Object obj) {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        @Y61.k
        public final List<kotlin.reflect.jvm.internal.impl.descriptors.g0> getParameters() {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.builtins.k m() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            throw null;
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.j$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Collection<O> f410214a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public List<? extends O> f410215b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.k Collection<? extends O> collection) {
            this.f410214a = collection;
            kotlin.reflect.jvm.internal.impl.types.error.h.f410195a.getClass();
            this.f410215b = Collections.singletonList(kotlin.reflect.jvm.internal.impl.types.error.h.f410198d);
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.j$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<b> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final b invoke() {
            return new b(AbstractC42983j.this.e());
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.j$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<Boolean, b> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f410217l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final b invoke(Boolean bool) {
            bool.getClass();
            kotlin.reflect.jvm.internal.impl.types.error.h.f410195a.getClass();
            return new b(Collections.singletonList(kotlin.reflect.jvm.internal.impl.types.error.h.f410198d));
        }
    }

    /* compiled from: AbstractTypeConstructor.kt */
    @kotlin.jvm.internal.s0
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.j$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<b, kotlin.G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(b bVar) {
            b bVar2 = bVar;
            AbstractC42983j abstractC42983j = AbstractC42983j.this;
            kotlin.reflect.jvm.internal.impl.descriptors.e0 e0VarI = abstractC42983j.i();
            new C42988m(abstractC42983j);
            new C42989n(abstractC42983j);
            List listA = e0VarI.a(bVar2.f410214a);
            if (listA.isEmpty()) {
                O oF2 = abstractC42983j.f();
                List listSingletonList = oF2 != null ? Collections.singletonList(oF2) : null;
                if (listSingletonList == null) {
                    listSingletonList = C42784z0.f406748b;
                }
                listA = listSingletonList;
            }
            List<O> listM0 = listA instanceof List ? (List) listA : null;
            if (listM0 == null) {
                listM0 = C42745f0.M0(listA);
            }
            bVar2.f410215b = abstractC42983j.k(listM0);
            return kotlin.G0.f406611a;
        }
    }

    public AbstractC42983j(@Y61.k kotlin.reflect.jvm.internal.impl.storage.p pVar) {
        this.f410213b = pVar.d(new c(), d.f410217l, new e());
    }

    @Y61.k
    public abstract Collection<O> e();

    @Y61.l
    public O f() {
        return null;
    }

    @Y61.k
    public Collection<O> g(boolean z12) {
        return C42784z0.f406748b;
    }

    @Y61.k
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.e0 i();

    @Override // kotlin.reflect.jvm.internal.impl.types.q0
    @Y61.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final List<O> C() {
        return this.f410213b.invoke().f410215b;
    }

    @Y61.k
    public List<O> k(@Y61.k List<O> list) {
        return list;
    }

    public void l(@Y61.k O o12) {
    }
}
