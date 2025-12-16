package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import i51.InterfaceC41228b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.collections.b1;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.AbstractC42887p;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.U;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.resolve.l;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42952i;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42956m;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.G;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.J;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.K;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.M;
import kotlin.reflect.jvm.internal.impl.types.Y;

/* compiled from: DeserializedMemberScope.kt */
/* loaded from: classes8.dex */
public abstract class l extends kotlin.reflect.jvm.internal.impl.resolve.scopes.k {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f409847f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C42956m f409848b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final a f409849c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f409850d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.l f409851e;

    /* compiled from: DeserializedMemberScope.kt */
    public interface a {
        @Y61.k
        Set<kotlin.reflect.jvm.internal.impl.name.f> a();

        @Y61.k
        Set<kotlin.reflect.jvm.internal.impl.name.f> b();

        @Y61.l
        f0 c(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar);

        @Y61.k
        Set<kotlin.reflect.jvm.internal.impl.name.f> d();

        @Y61.k
        Collection e(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar);

        @Y61.k
        Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar);

        void g(@Y61.k ArrayList arrayList, @Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.k Y41.l lVar);
    }

    /* compiled from: DeserializedMemberScope.kt */
    @s0
    public final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.n<Object>[] f409852a;

        static {
            n0 n0Var = m0.f406844a;
            f409852a = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(b.class), "declaredFunctions", "getDeclaredFunctions()Ljava/util/List;")), n0Var.i(new h0(n0Var.b(b.class), "declaredProperties", "getDeclaredProperties()Ljava/util/List;")), n0Var.i(new h0(n0Var.b(b.class), "allTypeAliases", "getAllTypeAliases()Ljava/util/List;")), n0Var.i(new h0(n0Var.b(b.class), "allFunctions", "getAllFunctions()Ljava/util/List;")), n0Var.i(new h0(n0Var.b(b.class), "allProperties", "getAllProperties()Ljava/util/List;")), n0Var.i(new h0(n0Var.b(b.class), "typeAliasesByName", "getTypeAliasesByName()Ljava/util/Map;")), n0Var.i(new h0(n0Var.b(b.class), "functionsByName", "getFunctionsByName()Ljava/util/Map;")), n0Var.i(new h0(n0Var.b(b.class), "propertiesByName", "getPropertiesByName()Ljava/util/Map;")), n0Var.i(new h0(n0Var.b(b.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), n0Var.i(new h0(n0Var.b(b.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.a
        @Y61.k
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
            kotlin.reflect.n<Object> nVar = f409852a[8];
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.a
        @Y61.k
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            kotlin.reflect.n<Object> nVar = f409852a[9];
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.a
        @Y61.l
        public final f0 c(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
            kotlin.reflect.n<Object> nVar = f409852a[5];
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.a
        @Y61.k
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            new LinkedHashSet();
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.a
        @Y61.k
        public final Collection e(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (!b().contains(fVar)) {
                return C42784z0.f406748b;
            }
            kotlin.reflect.n<Object> nVar = f409852a[7];
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.a
        @Y61.k
        public final Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
            if (!a().contains(fVar)) {
                return C42784z0.f406748b;
            }
            kotlin.reflect.n<Object> nVar = f409852a[6];
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.a
        public final void g(@Y61.k ArrayList arrayList, @Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.k Y41.l lVar) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409654c.getClass();
            boolean zA2 = dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409660i);
            kotlin.reflect.n<Object>[] nVarArr = f409852a;
            if (zA2) {
                kotlin.reflect.n<Object> nVar = nVarArr[4];
                throw null;
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409654c.getClass();
            if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409659h)) {
                kotlin.reflect.n<Object> nVar2 = nVarArr[3];
                throw null;
            }
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    @s0
    public final class c implements a {

        /* renamed from: j, reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.n<Object>[] f409853j;

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f409854a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LinkedHashMap f409855b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Object f409856c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.name.f, Collection<a0>> f409857d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.name.f, Collection<U>> f409858e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.storage.j<kotlin.reflect.jvm.internal.impl.name.f, f0> f409859f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.storage.k f409860g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final kotlin.reflect.jvm.internal.impl.storage.k f409861h;

        /* compiled from: DeserializedMemberScope.kt */
        @s0
        public static final class a extends N implements Y41.a {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.b f409863l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ ByteArrayInputStream f409864m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ l f409865n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(kotlin.reflect.jvm.internal.impl.protobuf.b bVar, ByteArrayInputStream byteArrayInputStream, l lVar) {
                super(0);
                this.f409863l = bVar;
                this.f409864m = byteArrayInputStream;
                this.f409865n = lVar;
            }

            @Override // Y41.a
            public final Object invoke() {
                kotlin.reflect.jvm.internal.impl.protobuf.f fVar = this.f409865n.f409848b.f409936a.f409929p;
                return this.f409863l.c(this.f409864m, fVar);
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        public static final class b extends N implements Y41.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ l f409867m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l lVar) {
                super(0);
                this.f409867m = lVar;
            }

            @Override // Y41.a
            public final Set<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                return b1.h(c.this.f409854a.keySet(), this.f409867m.o());
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l$c$c, reason: collision with other inner class name */
        public static final class C11691c extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends a0>> {
            public C11691c() {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
            @Override // Y41.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.a0> invoke(kotlin.reflect.jvm.internal.impl.name.f r6) {
                /*
                    r5 = this;
                    kotlin.reflect.jvm.internal.impl.name.f r6 = (kotlin.reflect.jvm.internal.impl.name.f) r6
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l$c r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.c.this
                    java.util.LinkedHashMap r1 = r0.f409854a
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$e> r2 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.e.f408917w
                    java.lang.Object r1 = r1.get(r6)
                    byte[] r1 = (byte[]) r1
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.this
                    if (r1 == 0) goto L2b
                    java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
                    r3.<init>(r1)
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l$c$a r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l$c$a
                    kotlin.reflect.jvm.internal.impl.protobuf.b r2 = (kotlin.reflect.jvm.internal.impl.protobuf.b) r2
                    r1.<init>(r2, r3, r0)
                    kotlin.sequences.a r1 = kotlin.sequences.C43033p.s(r1)
                    java.util.List r1 = kotlin.sequences.C43033p.D(r1)
                    if (r1 == 0) goto L2b
                    java.util.Collection r1 = (java.util.Collection) r1
                    goto L2d
                L2b:
                    kotlin.collections.z0 r1 = kotlin.collections.C42784z0.f406748b
                L2d:
                    r2 = r1
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.ArrayList r3 = new java.util.ArrayList
                    int r1 = r1.size()
                    r3.<init>(r1)
                    java.util.Iterator r1 = r2.iterator()
                L3d:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L5f
                    java.lang.Object r2 = r1.next()
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$e r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.e) r2
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r4 = r0.f409848b
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.z r4 = r4.f409944i
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.y r2 = r4.e(r2)
                    boolean r4 = r0.r(r2)
                    if (r4 == 0) goto L58
                    goto L59
                L58:
                    r2 = 0
                L59:
                    if (r2 == 0) goto L3d
                    r3.add(r2)
                    goto L3d
                L5f:
                    r0.j(r3, r6)
                    java.util.List r6 = kotlin.reflect.jvm.internal.impl.utils.a.b(r3)
                    java.util.Collection r6 = (java.util.Collection) r6
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.c.C11691c.invoke(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        public static final class d extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, Collection<? extends U>> {
            public d() {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
            @Override // Y41.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.U> invoke(kotlin.reflect.jvm.internal.impl.name.f r6) {
                /*
                    r5 = this;
                    kotlin.reflect.jvm.internal.impl.name.f r6 = (kotlin.reflect.jvm.internal.impl.name.f) r6
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l$c r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.c.this
                    java.util.LinkedHashMap r1 = r0.f409855b
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$h> r2 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.h.f408985w
                    java.lang.Object r1 = r1.get(r6)
                    byte[] r1 = (byte[]) r1
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l r0 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.this
                    if (r1 == 0) goto L2b
                    java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream
                    r3.<init>(r1)
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l$c$a r1 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l$c$a
                    kotlin.reflect.jvm.internal.impl.protobuf.b r2 = (kotlin.reflect.jvm.internal.impl.protobuf.b) r2
                    r1.<init>(r2, r3, r0)
                    kotlin.sequences.a r1 = kotlin.sequences.C43033p.s(r1)
                    java.util.List r1 = kotlin.sequences.C43033p.D(r1)
                    if (r1 == 0) goto L2b
                    java.util.Collection r1 = (java.util.Collection) r1
                    goto L2d
                L2b:
                    kotlin.collections.z0 r1 = kotlin.collections.C42784z0.f406748b
                L2d:
                    r2 = r1
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.ArrayList r3 = new java.util.ArrayList
                    int r1 = r1.size()
                    r3.<init>(r1)
                    java.util.Iterator r1 = r2.iterator()
                L3d:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L55
                    java.lang.Object r2 = r1.next()
                    kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$h r2 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.h) r2
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r4 = r0.f409848b
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.z r4 = r4.f409944i
                    kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.x r2 = r4.f(r2)
                    r3.add(r2)
                    goto L3d
                L55:
                    r0.k(r3, r6)
                    java.util.List r6 = kotlin.reflect.jvm.internal.impl.utils.a.b(r3)
                    java.util.Collection r6 = (java.util.Collection) r6
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.c.d.invoke(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        public static final class e extends N implements Y41.l<kotlin.reflect.jvm.internal.impl.name.f, f0> {
            public e() {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Map] */
            @Override // Y41.l
            public final f0 invoke(kotlin.reflect.jvm.internal.impl.name.f fVar) {
                C42956m c42956m;
                ProtoBuf.Type typeA;
                ProtoBuf.Type typeA2;
                c cVar = c.this;
                byte[] bArr = (byte[]) cVar.f409856c.get(fVar);
                z zVar = null;
                if (bArr != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    l lVar = l.this;
                    ProtoBuf.j jVar = (ProtoBuf.j) ((kotlin.reflect.jvm.internal.impl.protobuf.b) ProtoBuf.j.f409029q).c(byteArrayInputStream, lVar.f409848b.f409936a.f409929p);
                    if (jVar != null) {
                        kotlin.reflect.jvm.internal.impl.serialization.deserialization.z zVar2 = lVar.f409848b.f409944i;
                        zVar2.getClass();
                        g.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2;
                        List<ProtoBuf.Annotation> list = jVar.f409039l;
                        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                        Iterator<T> it = list.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            c42956m = zVar2.f409968a;
                            if (!zHasNext) {
                                break;
                            }
                            arrayList.add(zVar2.f409969b.a((ProtoBuf.Annotation) it.next(), c42956m.f409937b));
                        }
                        aVar.getClass();
                        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVarA = g.a.a(arrayList);
                        J j12 = J.f409752a;
                        AbstractC42887p abstractC42887pA = K.a(kotlin.reflect.jvm.internal.impl.metadata.deserialization.b.f409113d.c(jVar.f409032e));
                        kotlin.reflect.jvm.internal.impl.storage.p pVar = c42956m.f409936a.f409914a;
                        kotlin.reflect.jvm.internal.impl.name.f fVarB = G.b(c42956m.f409937b, jVar.f409033f);
                        kotlin.reflect.jvm.internal.impl.metadata.deserialization.g gVar = c42956m.f409939d;
                        zVar = new z(pVar, c42956m.f409938c, gVarA, fVarB, abstractC42887pA, jVar, c42956m.f409937b, gVar, c42956m.f409940e, c42956m.f409942g);
                        M m12 = c42956m.a(zVar, jVar.f409034g, c42956m.f409937b, c42956m.f409939d, c42956m.f409940e, c42956m.f409941f).f409943h;
                        List<g0> listB = m12.b();
                        int i12 = jVar.f409031d;
                        if ((i12 & 4) == 4) {
                            typeA = jVar.f409035h;
                        } else {
                            if ((i12 & 8) != 8) {
                                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                            }
                            typeA = gVar.a(jVar.f409036i);
                        }
                        Y yD2 = m12.d(typeA, false);
                        int i13 = jVar.f409031d;
                        if ((i13 & 16) == 16) {
                            typeA2 = jVar.f409037j;
                        } else {
                            if ((i13 & 32) != 32) {
                                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                            }
                            typeA2 = gVar.a(jVar.f409038k);
                        }
                        Y yD3 = m12.d(typeA2, false);
                        zVar.f407654i = listB;
                        zVar.f409893q = yD2;
                        zVar.f409894r = yD3;
                        zVar.f409895s = kotlin.reflect.jvm.internal.impl.descriptors.h0.b(zVar);
                        zVar.f409896t = zVar.n0();
                    }
                }
                return zVar;
            }
        }

        /* compiled from: DeserializedMemberScope.kt */
        public static final class f extends N implements Y41.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ l f409872m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(l lVar) {
                super(0);
                this.f409872m = lVar;
            }

            @Override // Y41.a
            public final Set<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
                return b1.h(c.this.f409855b.keySet(), this.f409872m.p());
            }
        }

        static {
            n0 n0Var = m0.f406844a;
            f409853j = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(c.class), "functionNames", "getFunctionNames()Ljava/util/Set;")), n0Var.i(new h0(n0Var.b(c.class), "variableNames", "getVariableNames()Ljava/util/Set;"))};
        }

        public c(@Y61.k List<ProtoBuf.e> list, @Y61.k List<ProtoBuf.h> list2, @Y61.k List<ProtoBuf.j> list3) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                kotlin.reflect.jvm.internal.impl.name.f fVarB = G.b(l.this.f409848b.f409937b, ((ProtoBuf.e) ((kotlin.reflect.jvm.internal.impl.protobuf.o) obj)).f408922g);
                Object arrayList = linkedHashMap.get(fVarB);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(fVarB, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            this.f409854a = h(linkedHashMap);
            l lVar = l.this;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj2 : list2) {
                kotlin.reflect.jvm.internal.impl.name.f fVarB2 = G.b(lVar.f409848b.f409937b, ((ProtoBuf.h) ((kotlin.reflect.jvm.internal.impl.protobuf.o) obj2)).f408990g);
                Object arrayList2 = linkedHashMap2.get(fVarB2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap2.put(fVarB2, arrayList2);
                }
                ((List) arrayList2).add(obj2);
            }
            this.f409855b = h(linkedHashMap2);
            l.this.f409848b.f409936a.f409916c.getClass();
            l lVar2 = l.this;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : list3) {
                kotlin.reflect.jvm.internal.impl.name.f fVarB3 = G.b(lVar2.f409848b.f409937b, ((ProtoBuf.j) ((kotlin.reflect.jvm.internal.impl.protobuf.o) obj3)).f409033f);
                Object arrayList3 = linkedHashMap3.get(fVarB3);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap3.put(fVarB3, arrayList3);
                }
                ((List) arrayList3).add(obj3);
            }
            this.f409856c = h(linkedHashMap3);
            this.f409857d = l.this.f409848b.f409936a.f409914a.c(new C11691c());
            this.f409858e = l.this.f409848b.f409936a.f409914a.c(new d());
            this.f409859f = l.this.f409848b.f409936a.f409914a.b(new e());
            l lVar3 = l.this;
            this.f409860g = lVar3.f409848b.f409936a.f409914a.g(new b(lVar3));
            l lVar4 = l.this;
            this.f409861h = lVar4.f409848b.f409936a.f409914a.g(new f(lVar4));
        }

        public static LinkedHashMap h(LinkedHashMap linkedHashMap) throws IOException {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(P0.f(linkedHashMap.size()));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                Object key = entry.getKey();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Iterable<kotlin.reflect.jvm.internal.impl.protobuf.a> iterable = (Iterable) entry.getValue();
                ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
                for (kotlin.reflect.jvm.internal.impl.protobuf.a aVar : iterable) {
                    int serializedSize = aVar.getSerializedSize();
                    int iF2 = CodedOutputStream.f(serializedSize) + serializedSize;
                    if (iF2 > 4096) {
                        iF2 = 4096;
                    }
                    CodedOutputStream codedOutputStreamJ = CodedOutputStream.j(byteArrayOutputStream, iF2);
                    codedOutputStreamJ.v(serializedSize);
                    aVar.a(codedOutputStreamJ);
                    codedOutputStreamJ.i();
                    arrayList.add(G0.f406611a);
                }
                linkedHashMap2.put(key, byteArrayOutputStream.toByteArray());
            }
            return linkedHashMap2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.a
        @Y61.k
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
            kotlin.reflect.n<Object> nVar = f409853j[0];
            return (Set) this.f409860g.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.a
        @Y61.k
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
            kotlin.reflect.n<Object> nVar = f409853j[1];
            return (Set) this.f409861h.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.a
        @Y61.l
        public final f0 c(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
            return this.f409859f.invoke(fVar);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.a
        @Y61.k
        public final Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
            return this.f409856c.keySet();
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.a
        @Y61.k
        public final Collection e(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
            return !b().contains(fVar) ? C42784z0.f406748b : this.f409858e.invoke(fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.a
        @Y61.k
        public final Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
            return !a().contains(fVar) ? C42784z0.f406748b : this.f409857d.invoke(fVar);
        }

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.l.a
        public final void g(@Y61.k ArrayList arrayList, @Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.k Y41.l lVar) {
            NoLookupLocation noLookupLocation = NoLookupLocation.f407884b;
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409654c.getClass();
            if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409660i)) {
                Set<kotlin.reflect.jvm.internal.impl.name.f> setB = b();
                ArrayList arrayList2 = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.name.f fVar : setB) {
                    if (((Boolean) lVar.invoke(fVar)).booleanValue()) {
                        arrayList2.addAll(e(fVar));
                    }
                }
                C42745f0.z0(arrayList2, l.b.f409645b);
                arrayList.addAll(arrayList2);
            }
            kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409654c.getClass();
            if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409659h)) {
                Set<kotlin.reflect.jvm.internal.impl.name.f> setA = a();
                ArrayList arrayList3 = new ArrayList();
                for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : setA) {
                    if (((Boolean) lVar.invoke(fVar2)).booleanValue()) {
                        arrayList3.addAll(f(fVar2));
                    }
                }
                C42745f0.z0(arrayList3, l.b.f409645b);
                arrayList.addAll(arrayList3);
            }
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    public static final class d extends N implements Y41.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ N f409873l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Y41.a<? extends Collection<kotlin.reflect.jvm.internal.impl.name.f>> aVar) {
            super(0);
            this.f409873l = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // Y41.a
        public final Set<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            return C42745f0.P0((Iterable) this.f409873l.invoke());
        }
    }

    /* compiled from: DeserializedMemberScope.kt */
    public static final class e extends N implements Y41.a<Set<? extends kotlin.reflect.jvm.internal.impl.name.f>> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Set<? extends kotlin.reflect.jvm.internal.impl.name.f> invoke() {
            l lVar = l.this;
            Set<kotlin.reflect.jvm.internal.impl.name.f> setN = lVar.n();
            if (setN == null) {
                return null;
            }
            return b1.h(b1.h(lVar.m(), lVar.f409849c.d()), setN);
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f409847f = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(l.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), n0Var.i(new h0(n0Var.b(l.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};
    }

    public l(@Y61.k C42956m c42956m, @Y61.k List<ProtoBuf.e> list, @Y61.k List<ProtoBuf.h> list2, @Y61.k List<ProtoBuf.j> list3, @Y61.k Y41.a<? extends Collection<kotlin.reflect.jvm.internal.impl.name.f>> aVar) {
        this.f409848b = c42956m;
        C42954k c42954k = c42956m.f409936a;
        c42954k.f409916c.getClass();
        this.f409849c = new c(list, list2, list3);
        d dVar = new d(aVar);
        kotlin.reflect.jvm.internal.impl.storage.p pVar = c42954k.f409914a;
        this.f409850d = pVar.g(dVar);
        this.f409851e = pVar.f(new e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
        return this.f409849c.a();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return this.f409849c.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.l
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        kotlin.reflect.n<Object> nVar = f409847f[1];
        return (Set) this.f409851e.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public Collection<a0> d(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        return this.f409849c.f(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation) {
        return this.f409849c.e(fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.l
    public InterfaceC42853f g(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        if (!q(fVar)) {
            a aVar = this.f409849c;
            if (aVar.d().contains(fVar)) {
                return aVar.c(fVar);
            }
            return null;
        }
        C42954k c42954k = this.f409848b.f409936a;
        kotlin.reflect.jvm.internal.impl.name.b bVarL = l(fVar);
        c42954k.getClass();
        C42952i.b bVar = C42952i.f409904c;
        return c42954k.f409934u.a(bVarL, null);
    }

    public abstract void h(@Y61.k ArrayList arrayList);

    @Y61.k
    public final Collection i(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.k Y41.l lVar) {
        NoLookupLocation noLookupLocation = NoLookupLocation.f407884b;
        ArrayList arrayList = new ArrayList(0);
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409654c.getClass();
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409656e)) {
            h(arrayList);
        }
        a aVar = this.f409849c;
        aVar.g(arrayList, dVar, lVar);
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409662k)) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar : m()) {
                if (((Boolean) lVar.invoke(fVar)).booleanValue()) {
                    C42954k c42954k = this.f409848b.f409936a;
                    kotlin.reflect.jvm.internal.impl.name.b bVarL = l(fVar);
                    c42954k.getClass();
                    C42952i.b bVar = C42952i.f409904c;
                    kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, c42954k.f409934u.a(bVarL, null));
                }
            }
        }
        kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409654c.getClass();
        if (dVar.a(kotlin.reflect.jvm.internal.impl.resolve.scopes.d.f409657f)) {
            for (kotlin.reflect.jvm.internal.impl.name.f fVar2 : aVar.d()) {
                if (((Boolean) lVar.invoke(fVar2)).booleanValue()) {
                    kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, aVar.c(fVar2));
                }
            }
        }
        return kotlin.reflect.jvm.internal.impl.utils.a.b(arrayList);
    }

    @Y61.k
    public abstract kotlin.reflect.jvm.internal.impl.name.b l(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar);

    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> m() {
        kotlin.reflect.n<Object> nVar = f409847f[0];
        return (Set) this.f409850d.invoke();
    }

    @Y61.l
    public abstract Set<kotlin.reflect.jvm.internal.impl.name.f> n();

    @Y61.k
    public abstract Set<kotlin.reflect.jvm.internal.impl.name.f> o();

    @Y61.k
    public abstract Set<kotlin.reflect.jvm.internal.impl.name.f> p();

    public boolean q(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        return m().contains(fVar);
    }

    public boolean r(@Y61.k y yVar) {
        return true;
    }

    public void j(@Y61.k ArrayList arrayList, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
    }

    public void k(@Y61.k ArrayList arrayList, @Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
    }
}
