package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C42727D;
import kotlin.C42829l0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.Z;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42881j;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42905x;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C42873q;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C42892d;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.x;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.b;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k;

/* compiled from: KPackageImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/F;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class F extends KDeclarationContainerImpl {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Class<?> f406986e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Object f406987f = C42727D.b(LazyThreadSafetyMode.f406615c, new b());

    /* compiled from: KPackageImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/F$a;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl$b;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends KDeclarationContainerImpl.b {

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ kotlin.reflect.n<Object>[] f406988h;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final Z.a f406989c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Z.a f406990d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final Object f406991e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final Object f406992f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Z.a f406993g;

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/f;", "invoke", "()Lkotlin/reflect/jvm/internal/impl/descriptors/runtime/components/f;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: kotlin.reflect.jvm.internal.F$a$a, reason: collision with other inner class name */
        public static final class C11641a extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ F f406994l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11641a(F f12) {
                super(0);
                this.f406994l = f12;
            }

            @Override // Y41.a
            public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f invoke() {
                f.a aVar = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f.f407808c;
                Class<?> cls = this.f406994l.f406986e;
                aVar.getClass();
                return f.a.a(cls);
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001 \u0002*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "Lkotlin/reflect/jvm/internal/l;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/Collection;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends kotlin.jvm.internal.N implements Y41.a<Collection<? extends AbstractC43003l<?>>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ F f406995l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ a f406996m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(a aVar, F f12) {
                super(0);
                this.f406995l = f12;
                this.f406996m = aVar;
            }

            @Override // Y41.a
            public final Collection<? extends AbstractC43003l<?>> invoke() {
                a aVar = this.f406996m;
                aVar.getClass();
                kotlin.reflect.n<Object> nVar = a.f406988h[1];
                return this.f406995l.m((kotlin.reflect.jvm.internal.impl.resolve.scopes.j) aVar.f406990d.invoke(), KDeclarationContainerImpl.MemberBelonginess.f407020b);
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/l0;", "Lm51/f;", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$f;", "Lm51/e;", "invoke", "()Lkotlin/l0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class c extends kotlin.jvm.internal.N implements Y41.a<C42829l0<? extends m51.f, ? extends ProtoBuf.f, ? extends m51.e>> {
            public c() {
                super(0);
            }

            @Override // Y41.a
            public final C42829l0<? extends m51.f, ? extends ProtoBuf.f, ? extends m51.e> invoke() throws InvalidProtocolBufferException {
                KotlinClassHeader kotlinClassHeader;
                String[] strArr;
                String[] strArr2;
                kotlin.reflect.n<Object>[] nVarArr = a.f406988h;
                a aVar = a.this;
                aVar.getClass();
                kotlin.reflect.n<Object> nVar = a.f406988h[0];
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f fVar = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f) aVar.f406989c.invoke();
                if (fVar == null || (kotlinClassHeader = fVar.f407810b) == null || (strArr = kotlinClassHeader.f408491c) == null || (strArr2 = kotlinClassHeader.f408493e) == null) {
                    return null;
                }
                kotlin.Q<m51.f, ProtoBuf.f> qH2 = m51.i.h(strArr, strArr2);
                return new C42829l0<>(qH2.f406619b, qH2.f406620c, kotlinClassHeader.f408490b);
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class d extends kotlin.jvm.internal.N implements Y41.a<Class<?>> {

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ F f406999m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(F f12) {
                super(0);
                this.f406999m = f12;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
            @Override // Y41.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Class<?> invoke() {
                /*
                    r4 = this;
                    kotlin.reflect.n<java.lang.Object>[] r0 = kotlin.reflect.jvm.internal.F.a.f406988h
                    kotlin.reflect.jvm.internal.F$a r0 = kotlin.reflect.jvm.internal.F.a.this
                    r0.getClass()
                    kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.F.a.f406988h
                    r2 = 0
                    r1 = r1[r2]
                    kotlin.reflect.jvm.internal.Z$a r0 = r0.f406989c
                    java.lang.Object r0 = r0.invoke()
                    kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f r0 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f) r0
                    r1 = 0
                    if (r0 == 0) goto L24
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r0.f407810b
                    if (r0 == 0) goto L24
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r2 = kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader.Kind.f408503j
                    kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind r3 = r0.f408489a
                    if (r3 != r2) goto L24
                    java.lang.String r0 = r0.f408494f
                    goto L25
                L24:
                    r0 = r1
                L25:
                    if (r0 == 0) goto L41
                    int r2 = r0.length()
                    if (r2 <= 0) goto L41
                    kotlin.reflect.jvm.internal.F r1 = r4.f406999m
                    java.lang.Class<?> r1 = r1.f406986e
                    java.lang.ClassLoader r1 = r1.getClassLoader()
                    r2 = 47
                    r3 = 46
                    java.lang.String r0 = r0.replace(r2, r3)
                    java.lang.Class r1 = r1.loadClass(r0)
                L41:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.F.a.d.invoke():java.lang.Object");
            }
        }

        /* compiled from: KPackageImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;", "kotlin.jvm.PlatformType", "invoke", "()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class e extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.j> {
            public e() {
                super(0);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
            /* JADX WARN: Type inference failed for: r6v2 */
            /* JADX WARN: Type inference failed for: r6v6, types: [java.util.ArrayList] */
            @Override // Y41.a
            public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j invoke() throws ClassNotFoundException {
                ?? SingletonList;
                kotlin.reflect.n<Object>[] nVarArr = a.f406988h;
                a aVar = a.this;
                aVar.getClass();
                kotlin.reflect.n<Object> nVar = a.f406988h[0];
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f fVar = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.f) aVar.f406989c.invoke();
                if (fVar == null) {
                    return j.c.f409687b;
                }
                kotlin.reflect.n<Object> nVar2 = KDeclarationContainerImpl.b.f407024b[0];
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a aVar2 = ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k) aVar.f407025a.invoke()).f407817b;
                ConcurrentHashMap<kotlin.reflect.jvm.internal.impl.name.b, kotlin.reflect.jvm.internal.impl.resolve.scopes.j> concurrentHashMap = aVar2.f407804c;
                Class<?> cls = fVar.f407809a;
                kotlin.reflect.jvm.internal.impl.name.b bVarA = C42892d.a(cls);
                kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar = concurrentHashMap.get(bVarA);
                if (jVar == null) {
                    kotlin.reflect.jvm.internal.impl.name.c cVarG = C42892d.a(cls).g();
                    KotlinClassHeader kotlinClassHeader = fVar.f407810b;
                    KotlinClassHeader.Kind kind = kotlinClassHeader.f408489a;
                    KotlinClassHeader.Kind kind2 = KotlinClassHeader.Kind.f408502i;
                    kotlin.reflect.jvm.internal.impl.load.kotlin.o oVar = aVar2.f407802a;
                    if (kind == kind2) {
                        String[] strArr = kind == kind2 ? kotlinClassHeader.f408491c : null;
                        List listAsList = strArr != null ? Arrays.asList(strArr) : null;
                        if (listAsList == null) {
                            listAsList = C42784z0.f406748b;
                        }
                        SingletonList = new ArrayList();
                        Iterator it = listAsList.iterator();
                        while (it.hasNext()) {
                            kotlin.reflect.jvm.internal.impl.name.b bVarJ = kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c(p51.d.d((String) it.next()).f428199a.replace('/', '.')));
                            C42954k c42954k = oVar.f408539a;
                            if (c42954k == null) {
                                c42954k = null;
                            }
                            c42954k.f409916c.getClass();
                            m51.e eVar = m51.e.f414319g;
                            x.a.b bVarA2 = aVar2.f407803b.a(bVarJ);
                            kotlin.reflect.jvm.internal.impl.load.kotlin.z zVar = bVarA2 != null ? bVarA2.f408560a : null;
                            if (zVar != null) {
                                SingletonList.add(zVar);
                            }
                        }
                    } else {
                        SingletonList = Collections.singletonList(fVar);
                    }
                    C42954k c42954k2 = oVar.f408539a;
                    C42873q c42873q = new C42873q((c42954k2 != null ? c42954k2 : null).f409915b, cVarG);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((Iterable) SingletonList).iterator();
                    while (it2.hasNext()) {
                        kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w wVarA = oVar.a(c42873q, (kotlin.reflect.jvm.internal.impl.load.kotlin.z) it2.next());
                        if (wVarA != null) {
                            arrayList.add(wVarA);
                        }
                    }
                    List listM0 = C42745f0.M0(arrayList);
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.b.f409648d.getClass();
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarA = b.a.a(listM0, "package " + cVarG + " (" + fVar + ')');
                    kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarPutIfAbsent = concurrentHashMap.putIfAbsent(bVarA, jVarA);
                    jVar = jVarPutIfAbsent == null ? jVarA : jVarPutIfAbsent;
                }
                return jVar;
            }
        }

        static {
            n0 n0Var = m0.f406844a;
            f406988h = new kotlin.reflect.n[]{n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), n0Var.i(new kotlin.jvm.internal.h0(n0Var.b(a.class), "members", "getMembers()Ljava/util/Collection;"))};
        }

        public a(F f12) {
            super(f12);
            this.f406989c = Z.a(null, new C11641a(f12));
            this.f406990d = Z.a(null, new e());
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406615c;
            this.f406991e = C42727D.b(lazyThreadSafetyMode, new d(f12));
            this.f406992f = C42727D.b(lazyThreadSafetyMode, new c());
            this.f406993g = Z.a(null, new b(this, f12));
        }
    }

    /* compiled from: KPackageImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00060\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/F$a;", "Lkotlin/reflect/jvm/internal/F;", "invoke", "()Lkotlin/reflect/jvm/internal/F$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final a invoke() {
            return new a(F.this);
        }
    }

    /* compiled from: KPackageImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends kotlin.jvm.internal.G implements Y41.p<kotlin.reflect.jvm.internal.impl.serialization.deserialization.z, ProtoBuf.h, kotlin.reflect.jvm.internal.impl.descriptors.U> {

        /* renamed from: b, reason: collision with root package name */
        public static final c f407002b = new c();

        public c() {
            super(2);
        }

        @Override // kotlin.jvm.internal.AbstractC42817q, kotlin.reflect.c
        @Y61.k
        /* renamed from: getName */
        public final String getF407039i() {
            return "loadProperty";
        }

        @Override // kotlin.jvm.internal.AbstractC42817q
        @Y61.k
        public final kotlin.reflect.h getOwner() {
            return m0.f406844a.b(kotlin.reflect.jvm.internal.impl.serialization.deserialization.z.class);
        }

        @Override // kotlin.jvm.internal.AbstractC42817q
        @Y61.k
        public final String getSignature() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // Y41.p
        public final kotlin.reflect.jvm.internal.impl.descriptors.U invoke(kotlin.reflect.jvm.internal.impl.serialization.deserialization.z zVar, ProtoBuf.h hVar) {
            return zVar.f(hVar);
        }
    }

    public F(@Y61.k Class<?> cls) {
        this.f406986e = cls;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof F) {
            if (kotlin.jvm.internal.L.f(this.f406986e, ((F) obj).f406986e)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.jvm.internal.InterfaceC42819t
    @Y61.k
    public final Class<?> f() {
        return this.f406986e;
    }

    public final int hashCode() {
        return this.f406986e.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Y61.k
    public final Collection<InterfaceC42881j> j() {
        return C42784z0.f406748b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Y61.k
    public final Collection<InterfaceC42905x> k(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        a aVar = (a) this.f406987f.getValue();
        aVar.getClass();
        kotlin.reflect.n<Object> nVar = a.f406988h[1];
        return ((kotlin.reflect.jvm.internal.impl.resolve.scopes.j) aVar.f406990d.invoke()).d(fVar, NoLookupLocation.f407885c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.descriptors.U l(int i12) {
        C42829l0 c42829l0 = (C42829l0) ((a) this.f406987f.getValue()).f406992f.getValue();
        if (c42829l0 == null) {
            return null;
        }
        m51.f fVar = (m51.f) c42829l0.f406871b;
        ProtoBuf.f fVar2 = (ProtoBuf.f) c42829l0.f406872c;
        m51.e eVar = (m51.e) c42829l0.f406873d;
        h.g<ProtoBuf.f, List<ProtoBuf.h>> gVar = JvmProtoBuf.f409158n;
        ProtoBuf.h hVar = (ProtoBuf.h) (i12 < fVar2.i(gVar) ? fVar2.h(gVar, i12) : null);
        if (hVar != null) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.U) i0.f(this.f406986e, hVar, fVar, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(fVar2.f408959h), eVar, c.f407002b);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Y61.k
    public final Class<?> n() {
        Class<?> cls = (Class) ((a) this.f406987f.getValue()).f406991e.getValue();
        return cls == null ? this.f406986e : cls;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Y61.k
    public final Collection<kotlin.reflect.c<?>> o0() {
        a aVar = (a) this.f406987f.getValue();
        aVar.getClass();
        kotlin.reflect.n<Object> nVar = a.f406988h[2];
        return (Collection) aVar.f406993g.invoke();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
    @Override // kotlin.reflect.jvm.internal.KDeclarationContainerImpl
    @Y61.k
    public final Collection<kotlin.reflect.jvm.internal.impl.descriptors.U> p(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar) {
        a aVar = (a) this.f406987f.getValue();
        aVar.getClass();
        kotlin.reflect.n<Object> nVar = a.f406988h[1];
        return ((kotlin.reflect.jvm.internal.impl.resolve.scopes.j) aVar.f406990d.invoke()).f(fVar, NoLookupLocation.f407885c);
    }

    @Y61.k
    public final String toString() {
        return "file class " + C42892d.a(this.f406986e).b();
    }
}
