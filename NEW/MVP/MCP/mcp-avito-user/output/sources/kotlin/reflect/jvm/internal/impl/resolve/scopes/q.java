package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import i51.InterfaceC41228b;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.m;
import kotlin.reflect.jvm.internal.impl.types.A0;
import kotlin.reflect.jvm.internal.impl.types.E0;

/* compiled from: SubstitutingScope.kt */
@s0
/* loaded from: classes8.dex */
public final class q implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f409695b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f409696c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E0 f409697d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public HashMap f409698e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f409699f = C42727D.c(new a());

    /* compiled from: SubstitutingScope.kt */
    public static final class a extends N implements Y41.a<Collection<? extends InterfaceC42882k>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Collection<? extends InterfaceC42882k> invoke() {
            q qVar = q.this;
            return qVar.h(m.a.a(qVar.f409695b, null, 3));
        }
    }

    /* compiled from: SubstitutingScope.kt */
    public static final class b extends N implements Y41.a<E0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ E0 f409701l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(E0 e02) {
            super(0);
            this.f409701l = e02;
        }

        @Override // Y41.a
        public final E0 invoke() {
            A0 a0G = this.f409701l.g();
            a0G.getClass();
            return E0.e(a0G);
        }
    }

    public q(@Y61.k j jVar, @Y61.k E0 e02) {
        this.f409695b = jVar;
        this.f409696c = C42727D.c(new b(e02));
        this.f409697d = E0.e(kotlin.reflect.jvm.internal.impl.resolve.calls.inference.d.b(e02.g()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
        return this.f409695b.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return this.f409695b.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.l
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        return this.f409695b.c();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Collection<? extends a0> d(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        return h(this.f409695b.d(fVar, interfaceC41228b));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.k
    public final Collection<InterfaceC42882k> e(@Y61.k d dVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        return (Collection) this.f409699f.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation) {
        return h(this.f409695b.f(fVar, noLookupLocation));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.l
    public final InterfaceC42853f g(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        InterfaceC42853f interfaceC42853fG = this.f409695b.g(fVar, interfaceC41228b);
        if (interfaceC42853fG != null) {
            return (InterfaceC42853f) i(interfaceC42853fG);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends InterfaceC42882k> Collection<D> h(Collection<? extends D> collection) {
        if (this.f409697d.f410010a.e() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        LinkedHashSet linkedHashSet = new LinkedHashSet(size >= 3 ? (size / 3) + size + 1 : 3);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((InterfaceC42882k) it.next()));
        }
        return linkedHashSet;
    }

    public final <D extends InterfaceC42882k> D i(D d12) {
        E0 e02 = this.f409697d;
        if (e02.f410010a.e()) {
            return d12;
        }
        if (this.f409698e == null) {
            this.f409698e = new HashMap();
        }
        HashMap map = this.f409698e;
        Object objB = map.get(d12);
        if (objB == null) {
            if (!(d12 instanceof d0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d12).toString());
            }
            objB = ((d0) d12).b(e02);
            if (objB == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d12 + " substitution fails");
            }
            map.put(d12, objB);
        }
        return (D) objB;
    }
}
