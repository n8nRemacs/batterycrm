package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import i51.InterfaceC41228b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import k51.InterfaceC42522g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.InterfaceC42920b;
import kotlin.reflect.jvm.internal.impl.load.java.r;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.x;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42950g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k;

/* compiled from: LazyJavaPackageScope.kt */
@s0
/* loaded from: classes8.dex */
public final class o extends A {

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final k51.u f408186n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final n f408187o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.l<Set<String>> f408188p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.j<a, InterfaceC42851d> f408189q;

    /* compiled from: LazyJavaPackageScope.kt */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.name.f f408190a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final InterfaceC42522g f408191b;

        public a(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.l InterfaceC42522g interfaceC42522g) {
            this.f408190a = fVar;
            this.f408191b = interfaceC42522g;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (obj instanceof a) {
                if (L.f(this.f408190a, ((a) obj).f408190a)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f408190a.hashCode();
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    public static abstract class b {

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public final InterfaceC42851d f408192a;

            public a(@Y61.k InterfaceC42851d interfaceC42851d) {
                super(null);
                this.f408192a = interfaceC42851d;
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.o$b$b, reason: collision with other inner class name */
        public static final class C11661b extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C11661b f408193a = new C11661b();

            public C11661b() {
                super(null);
            }
        }

        /* compiled from: LazyJavaPackageScope.kt */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final c f408194a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    @s0
    public static final class c extends N implements Y41.l<a, InterfaceC42851d> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ o f408195l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408196m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, o oVar) {
            super(1);
            this.f408195l = oVar;
            this.f408196m = hVar;
        }

        @Override // Y41.l
        public final InterfaceC42851d invoke(a aVar) {
            x.a.b bVarA;
            b aVar2;
            InterfaceC42851d interfaceC42851dA;
            a aVar3 = aVar;
            o oVar = this.f408195l;
            kotlin.reflect.jvm.internal.impl.name.b bVar = new kotlin.reflect.jvm.internal.impl.name.b(oVar.f408187o.f407568f, aVar3.f408190a);
            kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = this.f408196m;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
            InterfaceC42522g interfaceC42522gB = aVar3.f408191b;
            if (interfaceC42522gB != null) {
                o.u(oVar);
                bVarA = cVar.f408078c.b(interfaceC42522gB);
            } else {
                o.u(oVar);
                bVarA = cVar.f408078c.a(bVar);
            }
            kotlin.reflect.jvm.internal.impl.load.kotlin.z zVar = bVarA != null ? bVarA.f408560a : null;
            kotlin.reflect.jvm.internal.impl.name.b bVarC = zVar != null ? zVar.c() : null;
            if (bVarC != null && (!bVarC.f409240b.e().d() || bVarC.f409241c)) {
                return null;
            }
            if (zVar == null) {
                aVar2 = b.C11661b.f408193a;
            } else if (zVar.a().f408489a == KotlinClassHeader.Kind.f408499f) {
                kotlin.reflect.jvm.internal.impl.load.kotlin.o oVar2 = oVar.f408200b.f408253a.f408079d;
                C42950g c42950gF = oVar2.f(zVar);
                if (c42950gF == null) {
                    interfaceC42851dA = null;
                } else {
                    C42954k c42954k = oVar2.f408539a;
                    if (c42954k == null) {
                        c42954k = null;
                    }
                    interfaceC42851dA = c42954k.f409934u.a(zVar.c(), c42950gF);
                }
                aVar2 = interfaceC42851dA != null ? new b.a(interfaceC42851dA) : b.C11661b.f408193a;
            } else {
                aVar2 = b.c.f408194a;
            }
            if (aVar2 instanceof b.a) {
                return ((b.a) aVar2).f408192a;
            }
            if (aVar2 instanceof b.c) {
                return null;
            }
            if (!(aVar2 instanceof b.C11661b)) {
                throw new NoWhenBranchMatchedException();
            }
            if (interfaceC42522gB == null) {
                interfaceC42522gB = cVar.f408077b.b(new r.a(bVar, null, null, 4, null));
            }
            InterfaceC42522g interfaceC42522g = interfaceC42522gB;
            LightClassOriginKind[] lightClassOriginKindArr = LightClassOriginKind.f408302b;
            kotlin.reflect.jvm.internal.impl.name.c cVarD = interfaceC42522g != null ? interfaceC42522g.d() : null;
            if (cVarD == null || cVarD.d() || !L.f(cVarD.e(), oVar.f408187o.f407568f)) {
                return null;
            }
            f fVar = new f(hVar, oVar.f408187o, interfaceC42522g, null, 8, null);
            cVar.f408094s.getClass();
            return fVar;
        }
    }

    /* compiled from: LazyJavaPackageScope.kt */
    public static final class d extends N implements Y41.a<Set<? extends String>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408197l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ o f408198m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, o oVar) {
            super(0);
            this.f408197l = hVar;
            this.f408198m = oVar;
        }

        @Override // Y41.a
        public final Set<? extends String> invoke() {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = this.f408197l.f408253a;
            kotlin.reflect.jvm.internal.impl.name.c cVar2 = this.f408198m.f408187o.f407568f;
            cVar.f408077b.getClass();
            return null;
        }
    }

    public o(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, @Y61.k k51.u uVar, @Y61.k n nVar) {
        super(hVar);
        this.f408186n = uVar;
        this.f408187o = nVar;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
        d dVar = new d(hVar, this);
        kotlin.reflect.jvm.internal.impl.storage.p pVar = cVar.f408076a;
        this.f408188p = pVar.f(dVar);
        this.f408189q = pVar.b(new c(hVar, this));
    }

    public static final m51.e u(o oVar) {
        C42954k c42954k = oVar.f408200b.f408253a.f408079d.f408539a;
        if (c42954k == null) {
            c42954k = null;
        }
        c42954k.f409916c.getClass();
        return m51.e.f414319g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.k
    public final Collection<InterfaceC42882k> e(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409654c.getClass();
        if (!dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409662k | kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409655d)) {
            return C42784z0.f406748b;
        }
        Collection<InterfaceC42882k> collectionInvoke = this.f408202d.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionInvoke) {
            InterfaceC42882k interfaceC42882k = (InterfaceC42882k) obj;
            if ((interfaceC42882k instanceof InterfaceC42851d) && lVar.invoke(((InterfaceC42851d) interfaceC42882k).getName()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation) {
        return C42784z0.f406748b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    public final InterfaceC42853f g(kotlin.reflect.jvm.internal.impl.name.f fVar, InterfaceC41228b interfaceC41228b) {
        return v(fVar, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> h(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.l Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409654c.getClass();
        if (!dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409655d)) {
            return B0.f406639b;
        }
        Set<String> setInvoke = this.f408188p.invoke();
        if (setInvoke != null) {
            HashSet hashSet = new HashSet();
            Iterator<T> it = setInvoke.iterator();
            while (it.hasNext()) {
                hashSet.add(kotlin.reflect.jvm.internal.impl.name.f.e((String) it.next()));
            }
            return hashSet;
        }
        if (lVar == null) {
            Y41.l<Object, Boolean> lVar2 = kotlin.reflect.jvm.internal.impl.utils.e.f410353a;
        }
        C42784z0<InterfaceC42522g> c42784z0J = this.f408186n.j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC42522g interfaceC42522g : c42784z0J) {
            interfaceC42522g.getClass();
            LightClassOriginKind[] lightClassOriginKindArr = LightClassOriginKind.f408302b;
            kotlin.reflect.jvm.internal.impl.name.f name = interfaceC42522g.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> i(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.l Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        return B0.f406639b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    @Y61.k
    public final InterfaceC42920b k() {
        return InterfaceC42920b.a.f408110a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    @Y61.k
    public final Set n() {
        return B0.f406639b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    public final InterfaceC42882k p() {
        return this.f408187o;
    }

    public final InterfaceC42851d v(kotlin.reflect.jvm.internal.impl.name.f fVar, InterfaceC42522g interfaceC42522g) {
        kotlin.reflect.jvm.internal.impl.name.h.f409256a.getClass();
        if (fVar.b().length() <= 0 || fVar.f409253c) {
            return null;
        }
        Set<String> setInvoke = this.f408188p.invoke();
        if (interfaceC42522g == null && setInvoke != null && !setInvoke.contains(fVar.b())) {
            return null;
        }
        return this.f408189q.invoke(new a(fVar, interfaceC42522g));
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.p
    public final void l(@Y61.k LinkedHashSet linkedHashSet, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
    }
}
