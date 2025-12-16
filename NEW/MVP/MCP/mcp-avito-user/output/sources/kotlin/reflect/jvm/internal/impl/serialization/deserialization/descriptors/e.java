package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import h51.C40774a;
import i51.InterfaceC41228b;
import i51.InterfaceC41229c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42900s;
import kotlin.reflect.jvm.internal.impl.descriptors.C42906y;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.F;
import kotlin.reflect.jvm.internal.impl.descriptors.H;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42850c;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42902u;
import kotlin.reflect.jvm.internal.impl.descriptors.K;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.X;
import kotlin.reflect.jvm.internal.impl.descriptors.Y;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42858b;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42866j;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.h;
import kotlin.reflect.jvm.internal.impl.resolve.C42935a;
import kotlin.reflect.jvm.internal.impl.resolve.C42936b;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.m;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42952i;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42956m;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.G;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.I;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.J;
import kotlin.reflect.jvm.internal.impl.types.AbstractC42961b;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.q0;
import r51.C47496b;

/* compiled from: DeserializedClassDescriptor.kt */
@s0
/* loaded from: classes8.dex */
public final class e extends AbstractC42858b implements InterfaceC42902u {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ int f409800A = 0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ProtoBuf.Class f409801g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.a f409802h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final b0 f409803i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.b f409804j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Modality f409805k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final AbstractC42887p f409806l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ClassKind f409807m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C42956m f409808n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.k f409809o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final b f409810p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Y<a> f409811q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final c f409812r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42882k f409813s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.l<InterfaceC42850c> f409814t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k<Collection<InterfaceC42850c>> f409815u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.l<InterfaceC42851d> f409816v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k<Collection<InterfaceC42851d>> f409817w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.l<i0<kotlin.reflect.jvm.internal.impl.types.Y>> f409818x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final I.a f409819y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f409820z;

    /* compiled from: DeserializedClassDescriptor.kt */
    @s0
    public final class a extends l {

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.types.checker.i f409821g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.storage.k<Collection<InterfaceC42882k>> f409822h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.storage.k<Collection<O>> f409823i;

        /* compiled from: DeserializedClassDescriptor.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$a$a, reason: collision with other inner class name */
        public static final class C11689a extends N implements Y41.a<List<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ArrayList f409825l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11689a(ArrayList arrayList) {
                super(0);
                this.f409825l = arrayList;
            }

            @Override // Y41.a
            public final List<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                return this.f409825l;
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        public static final class b extends N implements Y41.a<Collection<? extends InterfaceC42882k>> {
            public b() {
                super(0);
            }

            @Override // Y41.a
            public final Collection<? extends InterfaceC42882k> invoke() {
                kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409663l;
                kotlin.reflect.jvm.internal.impl.resolve.scopes.j.f409683a.getClass();
                Y41.l<kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar = j.a.f409685b;
                NoLookupLocation noLookupLocation = NoLookupLocation.f407884b;
                return a.this.i(dVar, lVar);
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        public static final class c extends N implements Y41.a<Collection<? extends O>> {
            public c() {
                super(0);
            }

            @Override // Y41.a
            public final Collection<? extends O> invoke() {
                a aVar = a.this;
                return aVar.f409821g.b(e.this);
            }
        }

        public a(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
            C42956m c42956m = e.this.f409808n;
            ProtoBuf.Class r82 = e.this.f409801g;
            List<ProtoBuf.e> list = r82.f408654r;
            List<ProtoBuf.h> list2 = r82.f408655s;
            List<ProtoBuf.j> list3 = r82.f408656t;
            List<Integer> list4 = r82.f408648l;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar = c42956m.f409937b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list4, 10));
            Iterator<T> it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(G.b(cVar, ((Number) it.next()).intValue()));
            }
            super(c42956m, list, list2, list3, new C11689a(arrayList));
            this.f409821g = iVar;
            this.f409822h = this.f409848b.f409936a.f409914a.g(new b());
            this.f409823i = this.f409848b.f409936a.f409914a.g(new c());
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
        @Y61.k
        public final Collection<a0> d(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
            C40774a.a(this.f409848b.f409936a.f409922i, interfaceC41228b, e.this, fVar);
            return this.f409849c.f(fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
        @Y61.k
        public final Collection<InterfaceC42882k> e(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
            return this.f409822h.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
        @Y61.k
        public final Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation) {
            C40774a.a(this.f409848b.f409936a.f409922i, noLookupLocation, e.this, fVar);
            return this.f409849c.e(fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
        @Y61.l
        public final InterfaceC42853f g(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
            InterfaceC42851d interfaceC42851dInvoke;
            InterfaceC41229c interfaceC41229c = this.f409848b.f409936a.f409922i;
            e eVar = e.this;
            C40774a.a(interfaceC41229c, interfaceC41228b, eVar, fVar);
            c cVar = eVar.f409812r;
            return (cVar == null || (interfaceC42851dInvoke = cVar.f409832b.invoke(fVar)) == null) ? super.g(fVar, interfaceC41228b) : interfaceC42851dInvoke;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1 */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.collections.z0] */
        /* JADX WARN: Type inference failed for: r2v4, types: [java.util.ArrayList] */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
        public final void h(@Y61.k ArrayList arrayList) {
            ?? arrayList2;
            c cVar = e.this.f409812r;
            if (cVar != null) {
                Set setKeySet = cVar.f409831a.keySet();
                arrayList2 = new ArrayList();
                Iterator it = setKeySet.iterator();
                while (it.hasNext()) {
                    InterfaceC42851d interfaceC42851dInvoke = cVar.f409832b.invoke((kotlin.reflect.jvm.internal.impl.name.f) it.next());
                    if (interfaceC42851dInvoke != null) {
                        arrayList2.add(interfaceC42851dInvoke);
                    }
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = C42784z0.f406748b;
            }
            arrayList.addAll(arrayList2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
        public final void j(@Y61.k ArrayList arrayList, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<O> it = this.f409823i.invoke().iterator();
            while (it.hasNext()) {
                arrayList2.addAll(it.next().n().d(fVar, NoLookupLocation.f407886d));
            }
            C42956m c42956m = this.f409848b;
            arrayList.addAll(c42956m.f409936a.f409927n.a(fVar, e.this));
            ArrayList arrayList3 = new ArrayList(arrayList);
            c42956m.f409936a.f409930q.c().h(fVar, arrayList2, arrayList3, e.this, new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f(arrayList));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
        public final void k(@Y61.k ArrayList arrayList, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<O> it = this.f409823i.invoke().iterator();
            while (it.hasNext()) {
                arrayList2.addAll(it.next().n().f(fVar, NoLookupLocation.f407886d));
            }
            ArrayList arrayList3 = new ArrayList(arrayList);
            this.f409848b.f409936a.f409930q.c().h(fVar, arrayList2, arrayList3, e.this, new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.f(arrayList));
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.name.b l(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
            return e.this.f409804j.d(fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
        @Y61.l
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> n() {
            List<O> listC = e.this.f409810p.C();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                Set<kotlin.reflect.jvm.internal.impl.name.f> setC = ((O) it.next()).n().c();
                if (setC == null) {
                    return null;
                }
                C42745f0.h(setC, linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
        @Y61.k
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> o() {
            e eVar = e.this;
            List<O> listC = eVar.f409810p.C();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                C42745f0.h(((O) it.next()).n().a(), linkedHashSet);
            }
            linkedHashSet.addAll(this.f409848b.f409936a.f409927n.e(eVar));
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
        @Y61.k
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> p() {
            List<O> listC = e.this.f409810p.C();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                C42745f0.h(((O) it.next()).n().b(), linkedHashSet);
            }
            return linkedHashSet;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l
        public final boolean r(@Y61.k y yVar) {
            return this.f409848b.f409936a.f409928o.b(e.this, yVar);
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    @s0
    public final class b extends AbstractC42961b {

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.storage.k<List<g0>> f409828c;

        /* compiled from: DeserializedClassDescriptor.kt */
        public static final class a extends N implements Y41.a<List<? extends g0>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ e f409830l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar) {
                super(0);
                this.f409830l = eVar;
            }

            @Override // Y41.a
            public final List<? extends g0> invoke() {
                return h0.b(this.f409830l);
            }
        }

        public b() {
            super(e.this.f409808n.f409936a.f409914a);
            this.f409828c = e.this.f409808n.f409936a.f409914a.g(new a(e.this));
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42961b, kotlin.reflect.jvm.internal.impl.types.q0
        public final InterfaceC42853f b() {
            return e.this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        public final boolean c() {
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v13 */
        /* JADX WARN: Type inference failed for: r4v2 */
        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
        @Y61.k
        public final Collection<O> e() {
            e eVar = e.this;
            ProtoBuf.Class r12 = eVar.f409801g;
            C42956m c42956m = eVar.f409808n;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = c42956m.f409939d;
            List<ProtoBuf.Type> list = r12.f408645i;
            boolean zIsEmpty = list.isEmpty();
            ?? arrayList = list;
            if (zIsEmpty) {
                arrayList = 0;
            }
            if (arrayList == 0) {
                List<Integer> list2 = r12.f408646j;
                arrayList = new ArrayList(C42745f0.q(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(gVar.a(((Integer) it.next()).intValue()));
                }
            }
            Iterable iterable = (Iterable) arrayList;
            ArrayList arrayList2 = new ArrayList(C42745f0.q(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(c42956m.f409943h.g((ProtoBuf.Type) it2.next()));
            }
            ArrayList arrayListH0 = C42745f0.h0(c42956m.f409936a.f409927n.d(eVar), arrayList2);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayListH0.iterator();
            while (it3.hasNext()) {
                InterfaceC42853f interfaceC42853fB = ((O) it3.next()).H0().b();
                H.b bVar = interfaceC42853fB instanceof H.b ? (H.b) interfaceC42853fB : null;
                if (bVar != null) {
                    arrayList3.add(bVar);
                }
            }
            if (!arrayList3.isEmpty()) {
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.s sVar = c42956m.f409936a.f409921h;
                ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList3, 10));
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    H.b bVar2 = (H.b) it4.next();
                    kotlin.reflect.jvm.internal.impl.name.b bVarF = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(bVar2);
                    arrayList4.add(bVarF != null ? bVarF.b().b() : bVar2.getName().b());
                }
                sVar.a(eVar, arrayList4);
            }
            return C42745f0.M0(arrayListH0);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.q0
        @Y61.k
        public final List<g0> getParameters() {
            return this.f409828c.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42983j
        @Y61.k
        public final e0 i() {
            return e0.a.f407541a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42961b
        /* renamed from: o */
        public final InterfaceC42851d b() {
            return e.this;
        }

        @Y61.k
        public final String toString() {
            return e.this.getName().f409252b;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    @s0
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f409831a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.name.f, InterfaceC42851d> f409832b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.storage.k<Set<kotlin.reflect.jvm.internal.impl.name.f>> f409833c;

        /* compiled from: DeserializedClassDescriptor.kt */
        public static final class a extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, InterfaceC42851d> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ e f409836m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(e eVar) {
                super(1);
                this.f409836m = eVar;
            }

            @Override // Y41.l
            public final InterfaceC42851d invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
                kotlin.reflect.jvm.internal.impl.name.f fVar2 = fVar;
                c cVar = c.this;
                ProtoBuf.d dVar = (ProtoBuf.d) cVar.f409831a.get(fVar2);
                if (dVar == null) {
                    return null;
                }
                e eVar = this.f409836m;
                return kotlin.reflect.jvm.internal.impl.descriptors.impl.r.F0(eVar.f409808n.f409936a.f409914a, eVar, fVar2, cVar.f409833c, new C42947b(eVar.f409808n.f409936a.f409914a, new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.g(eVar, dVar)), b0.f407539a);
            }
        }

        /* compiled from: DeserializedClassDescriptor.kt */
        public static final class b extends N implements Y41.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
            public b() {
                super(0);
            }

            @Override // Y41.a
            public final Set<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                C42956m c42956m;
                c cVar = c.this;
                cVar.getClass();
                HashSet hashSet = new HashSet();
                e eVar = e.this;
                Iterator<O> it = eVar.f409810p.C().iterator();
                while (it.hasNext()) {
                    for (InterfaceC42882k interfaceC42882k : m.a.a(it.next().n(), null, 3)) {
                        if ((interfaceC42882k instanceof a0) || (interfaceC42882k instanceof U)) {
                            hashSet.add(interfaceC42882k.getName());
                        }
                    }
                }
                ProtoBuf.Class r22 = eVar.f409801g;
                Iterator<T> it2 = r22.f408654r.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    c42956m = eVar.f409808n;
                    if (!zHasNext) {
                        break;
                    }
                    hashSet.add(G.b(c42956m.f409937b, ((ProtoBuf.e) it2.next()).f408922g));
                }
                Iterator<T> it3 = r22.f408655s.iterator();
                while (it3.hasNext()) {
                    hashSet.add(G.b(c42956m.f409937b, ((ProtoBuf.h) it3.next()).f408990g));
                }
                return b1.h(hashSet, hashSet);
            }
        }

        public c() {
            List<ProtoBuf.d> list = e.this.f409801g.f408657u;
            int iF2 = P0.f(C42745f0.q(list, 10));
            LinkedHashMap linkedHashMap = new LinkedHashMap(iF2 < 16 ? 16 : iF2);
            for (Object obj : list) {
                linkedHashMap.put(G.b(e.this.f409808n.f409937b, ((ProtoBuf.d) obj).f408911e), obj);
            }
            this.f409831a = linkedHashMap;
            e eVar = e.this;
            this.f409832b = eVar.f409808n.f409936a.f409914a.b(new a(eVar));
            this.f409833c = e.this.f409808n.f409936a.f409914a.g(new b());
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    public static final class d extends N implements Y41.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c>> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> invoke() {
            e eVar = e.this;
            return C42745f0.M0(eVar.f409808n.f409936a.f409918e.a(eVar.f409819y));
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.e$e, reason: collision with other inner class name */
    public static final class C11690e extends N implements Y41.a<InterfaceC42851d> {
        public C11690e() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC42851d invoke() {
            e eVar = e.this;
            ProtoBuf.Class r12 = eVar.f409801g;
            if (!((r12.f408640d & 4) == 4)) {
                return null;
            }
            InterfaceC42853f interfaceC42853fG = eVar.F0().g(G.b(eVar.f409808n.f409937b, r12.f408643g), NoLookupLocation.f407890h);
            if (interfaceC42853fG instanceof InterfaceC42851d) {
                return (InterfaceC42851d) interfaceC42853fG;
            }
            return null;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    public static final class f extends N implements Y41.a<Collection<? extends InterfaceC42850c>> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Collection<? extends InterfaceC42850c> invoke() {
            e eVar = e.this;
            List<ProtoBuf.b> list = eVar.f409801g.f408653q;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409123n.e(((ProtoBuf.b) obj).f408890e).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                C42956m c42956m = eVar.f409808n;
                if (!zHasNext) {
                    return C42745f0.h0(c42956m.f409936a.f409927n.c(eVar), C42745f0.h0(C42745f0.V(eVar.t()), arrayList2));
                }
                arrayList2.add(c42956m.f409944i.d((ProtoBuf.b) it.next(), false));
            }
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    public /* synthetic */ class g extends kotlin.jvm.internal.G implements Y41.l<kotlin.reflect.jvm.internal.impl.types.checker.i, a> {
        @Override // Y41.l
        @Y61.k
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final a invoke(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
            return ((e) this.receiver).new a(iVar);
        }

        @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
        @Y61.k
        /* renamed from: getName */
        public final String getF407039i() {
            return "<init>";
        }

        @Override // kotlin.jvm.internal.AbstractC42817q
        @Y61.k
        public final kotlin.reflect.h getOwner() {
            return m0.f406844a.b(a.class);
        }

        @Override // kotlin.jvm.internal.AbstractC42817q
        @Y61.k
        public final String getSignature() {
            return "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lorg/jetbrains/kotlin/types/checker/KotlinTypeRefiner;)V";
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    public static final class h extends N implements Y41.a<InterfaceC42850c> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final InterfaceC42850c invoke() {
            Object next;
            e eVar = e.this;
            if (eVar.f409807m.a()) {
                C42866j c42866jJ = kotlin.reflect.jvm.internal.impl.resolve.i.j(eVar, b0.f407539a);
                c42866jJ.N0(eVar.q());
                return c42866jJ;
            }
            Iterator<T> it = eVar.f409801g.f408653q.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (!kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409123n.e(((ProtoBuf.b) next).f408890e).booleanValue()) {
                    break;
                }
            }
            ProtoBuf.b bVar = (ProtoBuf.b) next;
            if (bVar != null) {
                return eVar.f409808n.f409944i.d(bVar, true);
            }
            return null;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    public static final class i extends N implements Y41.a<Collection<? extends InterfaceC42851d>> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Collection<? extends InterfaceC42851d> invoke() {
            int i12 = e.f409800A;
            e eVar = e.this;
            eVar.getClass();
            Modality modality = Modality.f407440d;
            Modality modality2 = eVar.f409805k;
            if (modality2 != modality) {
                return C42784z0.f406748b;
            }
            List<Integer> list = eVar.f409801g.f408658v;
            if (list.isEmpty()) {
                C42936b.f409574a.getClass();
                if (modality2 != modality) {
                    return C42784z0.f406748b;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                InterfaceC42882k interfaceC42882k = eVar.f409813s;
                if (interfaceC42882k instanceof K) {
                    C42936b.a(eVar, linkedHashSet, ((K) interfaceC42882k).n(), false);
                }
                C42936b.a(eVar, linkedHashSet, eVar.f0(), true);
                return C42745f0.B0(linkedHashSet, new C42935a());
            }
            ArrayList arrayList = new ArrayList();
            for (Integer num : list) {
                C42956m c42956m = eVar.f409808n;
                C42954k c42954k = c42956m.f409936a;
                kotlin.reflect.jvm.internal.impl.name.b bVarA = G.a(c42956m.f409937b, num.intValue());
                c42954k.getClass();
                C42952i.b bVar = C42952i.f409904c;
                InterfaceC42851d interfaceC42851dA = c42954k.f409934u.a(bVarA, null);
                if (interfaceC42851dA != null) {
                    arrayList.add(interfaceC42851dA);
                }
            }
            return arrayList;
        }
    }

    /* compiled from: DeserializedClassDescriptor.kt */
    public static final class j extends N implements Y41.a<i0<kotlin.reflect.jvm.internal.impl.types.Y>> {
        public j() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type>] */
        /* JADX WARN: Type inference failed for: r4v2 */
        /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.G, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h] */
        @Override // Y41.a
        public final i0<kotlin.reflect.jvm.internal.impl.types.Y> invoke() {
            i0<kotlin.reflect.jvm.internal.impl.types.Y> c42906y;
            u51.i iVar;
            ?? arrayList;
            int i12 = e.f409800A;
            e eVar = e.this;
            if (!eVar.isInline() && !eVar.M()) {
                return null;
            }
            C42956m c42956m = eVar.f409808n;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar = c42956m.f409937b;
            ?? hVar = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h(1, c42956m.f409943h);
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i iVar2 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.i(1, eVar);
            ProtoBuf.Class r82 = eVar.f409801g;
            int size = r82.f408629A.size();
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = c42956m.f409939d;
            if (size > 0) {
                List<Integer> list = r82.f408629A;
                ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(G.b(cVar, ((Integer) it.next()).intValue()));
                }
                Q q12 = new Q(Integer.valueOf(r82.f408632D.size()), Integer.valueOf(r82.f408631C.size()));
                if (q12.equals(new Q(Integer.valueOf(arrayList2.size()), 0))) {
                    List<Integer> list2 = r82.f408632D;
                    arrayList = new ArrayList(C42745f0.q(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(gVar.a(((Integer) it2.next()).intValue()));
                    }
                } else {
                    if (!q12.equals(new Q(0, Integer.valueOf(arrayList2.size())))) {
                        throw new IllegalStateException(("class " + G.b(cVar, r82.f408642f) + " has illegal multi-field value class representation").toString());
                    }
                    arrayList = r82.f408631C;
                }
                Iterable iterable = (Iterable) arrayList;
                ArrayList arrayList3 = new ArrayList(C42745f0.q(iterable, 10));
                Iterator it3 = iterable.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(hVar.invoke(it3.next()));
                }
                c42906y = new F<>(C42745f0.T0(arrayList2, arrayList3));
            } else {
                if ((r82.f408640d & 8) == 8) {
                    kotlin.reflect.jvm.internal.impl.name.f fVarB = G.b(cVar, r82.f408660x);
                    int i13 = r82.f408640d;
                    ProtoBuf.Type typeA = (i13 & 16) == 16 ? r82.f408661y : (i13 & 32) == 32 ? gVar.a(r82.f408662z) : null;
                    if ((typeA == null || (iVar = (u51.i) hVar.invoke(typeA)) == null) && (iVar = (u51.i) iVar2.invoke(fVarB)) == null) {
                        throw new IllegalStateException(("cannot determine underlying type for value class " + kotlin.reflect.jvm.internal.impl.name.f.d(cVar.getString(r82.f408642f)) + " with property " + fVarB).toString());
                    }
                    c42906y = new C42906y<>(fVarB, iVar);
                } else {
                    c42906y = null;
                }
            }
            if (c42906y != null) {
                return c42906y;
            }
            if (eVar.f409802h.a(1, 5, 1)) {
                return null;
            }
            InterfaceC42850c interfaceC42850cT = eVar.t();
            if (interfaceC42850cT == null) {
                throw new IllegalStateException(("Inline class has no primary constructor: " + eVar).toString());
            }
            kotlin.reflect.jvm.internal.impl.name.f name = ((k0) C42745f0.E(interfaceC42850cT.g())).getName();
            kotlin.reflect.jvm.internal.impl.types.Y yG02 = eVar.G0(name);
            if (yG02 != null) {
                return new C42906y(name, yG02);
            }
            throw new IllegalStateException(("Value class has no underlying property: " + eVar).toString());
        }
    }

    public e(@Y61.k C42956m c42956m, @Y61.k ProtoBuf.Class r12, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.c cVar, @Y61.k kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar, @Y61.k b0 b0Var) {
        ClassKind classKind;
        kotlin.reflect.jvm.internal.impl.resolve.scopes.k pVar;
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g b12;
        super(c42956m.f409936a.f409914a, G.a(cVar, r12.f408642f).i());
        this.f409801g = r12;
        this.f409802h = aVar;
        this.f409803i = b0Var;
        int i12 = r12.f408642f;
        this.f409804j = kotlin.reflect.jvm.internal.impl.name.b.e(cVar.a(i12), cVar.b(i12));
        J j12 = J.f409752a;
        ProtoBuf.Modality modalityC = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409114e.c(r12.f408641e);
        j12.getClass();
        this.f409805k = J.a(modalityC);
        this.f409806l = kotlin.reflect.jvm.internal.impl.serialization.deserialization.K.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409113d.c(r12.f408641e));
        ProtoBuf.Class.Kind kindC = kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409115f.c(r12.f408641e);
        switch (kindC == null ? -1 : J.a.f409754b[kindC.ordinal()]) {
            case 1:
                classKind = ClassKind.f407413b;
                break;
            case 2:
                classKind = ClassKind.f407414c;
                break;
            case 3:
                classKind = ClassKind.f407415d;
                break;
            case 4:
                classKind = ClassKind.f407416e;
                break;
            case 5:
                classKind = ClassKind.f407417f;
                break;
            case 6:
            case 7:
                classKind = ClassKind.f407418g;
                break;
            default:
                classKind = ClassKind.f407413b;
                break;
        }
        this.f409807m = classKind;
        List<ProtoBuf.TypeParameter> list = r12.f408644h;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(r12.f408634F);
        h.a aVar2 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.h.f409142b;
        ProtoBuf.m mVar = r12.f408636H;
        aVar2.getClass();
        C42956m c42956mA = c42956m.a(this, list, cVar, gVar, h.a.a(mVar), aVar);
        this.f409808n = c42956mA;
        ClassKind classKind2 = ClassKind.f407415d;
        C42954k c42954k = c42956mA.f409936a;
        if (classKind == classKind2) {
            pVar = new kotlin.reflect.jvm.internal.impl.resolve.scopes.p(c42954k.f409914a, this, kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409122m.e(r12.f408641e).booleanValue() || L.f(c42954k.f409933t.a(), Boolean.TRUE));
        } else {
            pVar = j.c.f409687b;
        }
        this.f409809o = pVar;
        this.f409810p = new b();
        Y.a aVar3 = Y.f407448e;
        kotlin.reflect.jvm.internal.impl.storage.p pVar2 = c42954k.f409914a;
        kotlin.reflect.jvm.internal.impl.types.checker.i iVarA = c42954k.f409930q.a();
        g gVar2 = new g(1, this);
        aVar3.getClass();
        this.f409811q = new Y<>(this, pVar2, gVar2, iVarA, null);
        this.f409812r = classKind == classKind2 ? new c() : null;
        InterfaceC42882k interfaceC42882k = c42956m.f409938c;
        this.f409813s = interfaceC42882k;
        h hVar = new h();
        kotlin.reflect.jvm.internal.impl.storage.p pVar3 = c42954k.f409914a;
        this.f409814t = pVar3.f(hVar);
        this.f409815u = pVar3.g(new f());
        this.f409816v = pVar3.f(new C11690e());
        this.f409817w = pVar3.g(new i());
        this.f409818x = pVar3.f(new j());
        e eVar = interfaceC42882k instanceof e ? (e) interfaceC42882k : null;
        I.a aVar4 = eVar != null ? eVar.f409819y : null;
        this.f409819y = new I.a(r12, c42956mA.f409937b, c42956mA.f409939d, b0Var, aVar4);
        if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409112c.e(r12.f408641e).booleanValue()) {
            b12 = new B(pVar3, new d());
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
            b12 = g.a.f407524b;
        }
        this.f409820z = b12;
    }

    public final a F0() {
        return (a) this.f409811q.a(this.f409808n.f409936a.f409930q.a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final Collection<InterfaceC42850c> G() {
        return this.f409815u.invoke();
    }

    public final kotlin.reflect.jvm.internal.impl.types.Y G0(kotlin.reflect.jvm.internal.impl.name.f fVar) {
        Iterator it = F0().f(fVar, NoLookupLocation.f407890h).iterator();
        boolean z12 = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z12) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((U) next).H() == null) {
                    if (z12) {
                        break;
                    }
                    z12 = true;
                    obj = next;
                }
            }
        }
        obj = null;
        U u12 = (U) obj;
        return (kotlin.reflect.jvm.internal.impl.types.Y) (u12 != null ? u12.getType() : null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.l
    public final i0<kotlin.reflect.jvm.internal.impl.types.Y> I() {
        return this.f409818x.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean M() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409120k.e(this.f409801g.f408641e).booleanValue() && this.f409802h.a(1, 4, 2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.A
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j N(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        return this.f409811q.a(iVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean O() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409119j.e(this.f409801g.f408641e).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j P() {
        return this.f409809o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean W() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409117h.e(this.f409801g.f408641e).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
    public final boolean Y() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409116g.e(this.f409801g.f408641e).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42885n
    @Y61.k
    public final b0 e() {
        return this.f409803i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k
    @Y61.k
    public final InterfaceC42882k f() {
        return this.f409813s;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f409820z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final ClassKind getKind() {
        return this.f409807m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42886o, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final AbstractC42900s getVisibility() {
        return this.f409806l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.B
    @Y61.k
    public final Modality i() {
        return this.f409805k;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean isExternal() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409118i.e(this.f409801g.f408641e).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean isInline() {
        if (kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409120k.e(this.f409801g.f408641e).booleanValue()) {
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.a aVar = this.f409802h;
            int i12 = aVar.f409092b;
            if (i12 < 1) {
                return true;
            }
            if (i12 <= 1) {
                int i13 = aVar.f409093c;
                if (i13 < 4) {
                    return true;
                }
                if (i13 <= 4 && aVar.f409094d <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f
    @Y61.k
    public final q0 l() {
        return this.f409810p;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final Collection<InterfaceC42851d> q0() {
        return this.f409817w.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g
    @Y61.k
    public final List<g0> r() {
        return this.f409808n.f409943h.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.l
    public final InterfaceC42850c t() {
        return this.f409814t.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.B
    public final boolean t0() {
        return false;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("deserialized ");
        sb2.append(O() ? "expect " : "");
        sb2.append("class ");
        sb2.append(getName());
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2 */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42858b, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.k
    public final List<X> u0() {
        C42956m c42956m = this.f409808n;
        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = c42956m.f409939d;
        ProtoBuf.Class r22 = this.f409801g;
        List<ProtoBuf.Type> list = r22.f408650n;
        boolean zIsEmpty = list.isEmpty();
        ?? arrayList = list;
        if (zIsEmpty) {
            arrayList = 0;
        }
        if (arrayList == 0) {
            List<Integer> list2 = r22.f408651o;
            arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(gVar.a(((Integer) it.next()).intValue()));
            }
        }
        Iterable iterable = (Iterable) arrayList;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            O oG2 = c42956m.f409943h.g((ProtoBuf.Type) it2.next());
            X xP02 = p0();
            C47496b c47496b = new C47496b(this, oG2, null);
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
            arrayList2.add(new kotlin.reflect.jvm.internal.impl.descriptors.impl.O(xP02, c47496b, g.a.f407524b));
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean v0() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409115f.c(this.f409801g.f408641e) == ProtoBuf.Class.Kind.COMPANION_OBJECT;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    public final boolean w0() {
        return kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409121l.e(this.f409801g.f408641e).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d
    @Y61.l
    public final InterfaceC42851d x0() {
        return this.f409816v.invoke();
    }
}
