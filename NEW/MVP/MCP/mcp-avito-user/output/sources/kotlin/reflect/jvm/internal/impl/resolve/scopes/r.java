package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import i51.InterfaceC41228b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42848a;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.b;
import kotlin.reflect.jvm.internal.impl.resolve.w;
import kotlin.reflect.jvm.internal.impl.types.O;
import w51.C49448a;

/* compiled from: TypeIntersectionScope.kt */
@s0
/* loaded from: classes8.dex */
public final class r extends kotlin.reflect.jvm.internal.impl.resolve.scopes.a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f409702c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final j f409703b;

    /* compiled from: TypeIntersectionScope.kt */
    @s0
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @X41.n
        @Y61.k
        public static j a(@Y61.k String str, @Y61.k Collection collection) {
            Collection collection2 = collection;
            ArrayList arrayList = new ArrayList(C42745f0.q(collection2, 10));
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                arrayList.add(((O) it.next()).n());
            }
            kotlin.reflect.jvm.internal.impl.utils.f fVarB = C49448a.b(arrayList);
            kotlin.reflect.jvm.internal.impl.resolve.scopes.b.f409648d.getClass();
            j jVarB = b.a.b(str, fVarB);
            return fVarB.f410361b <= 1 ? jVarB : new r(str, jVarB, null);
        }

        public a() {
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    public static final class b extends N implements Y41.l<InterfaceC42848a, InterfaceC42848a> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f409704l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC42848a invoke(InterfaceC42848a interfaceC42848a) {
            return interfaceC42848a;
        }
    }

    /* compiled from: TypeIntersectionScope.kt */
    public static final class c extends N implements Y41.l<a0, InterfaceC42848a> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f409705l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final InterfaceC42848a invoke(a0 a0Var) {
            return a0Var;
        }
    }

    public r(String str, j jVar, C42822w c42822w) {
        this.f409703b = jVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Collection<a0> d(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        return w.a(super.d(fVar, interfaceC41228b), c.f409705l);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.k
    public final Collection<InterfaceC42882k> e(@Y61.k d dVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        Collection<InterfaceC42882k> collectionE = super.e(dVar, lVar);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionE) {
            if (((InterfaceC42882k) obj) instanceof InterfaceC42848a) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return C42745f0.h0(arrayList2, w.a(arrayList, b.f409704l));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation) {
        return w.a(super.f(fVar, noLookupLocation), s.f409706l);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.a
    @Y61.k
    public final j i() {
        return this.f409703b;
    }
}
