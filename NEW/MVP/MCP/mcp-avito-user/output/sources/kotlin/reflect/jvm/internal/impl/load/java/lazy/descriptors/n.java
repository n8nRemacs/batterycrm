package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.I;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.impl.load.kotlin.x;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k;

/* compiled from: LazyJavaPackageFragment.kt */
/* loaded from: classes8.dex */
public final class n extends I {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f408174p;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final k51.u f408175h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408176i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final m51.e f408177j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f408178k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final d f408179l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k<List<kotlin.reflect.jvm.internal.impl.name.c>> f408180m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f408181n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f408182o;

    /* compiled from: LazyJavaPackageFragment.kt */
    @s0
    public static final class a extends N implements Y41.a<Map<String, ? extends kotlin.reflect.jvm.internal.impl.load.kotlin.z>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<String, ? extends kotlin.reflect.jvm.internal.impl.load.kotlin.z> invoke() {
            n nVar = n.this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = nVar.f408176i.f408253a;
            nVar.f407568f.b();
            C42784z0<String> c42784z0A = cVar.f408087l.a();
            ArrayList arrayList = new ArrayList();
            for (String str : c42784z0A) {
                kotlin.reflect.jvm.internal.impl.name.b bVarJ = kotlin.reflect.jvm.internal.impl.name.b.j(new kotlin.reflect.jvm.internal.impl.name.c(p51.d.d(str).f428199a.replace('/', '.')));
                kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar2 = nVar.f408176i.f408253a;
                m51.e eVar = nVar.f408177j;
                x.a.b bVarA = cVar2.f408078c.a(bVarJ);
                kotlin.reflect.jvm.internal.impl.load.kotlin.z zVar = bVarA != null ? bVarA.f408560a : null;
                Q q12 = zVar != null ? new Q(str, zVar) : null;
                if (q12 != null) {
                    arrayList.add(q12);
                }
            }
            return P0.p(arrayList);
        }
    }

    /* compiled from: LazyJavaPackageFragment.kt */
    public static final class b extends N implements Y41.a<HashMap<p51.d, p51.d>> {

        /* compiled from: LazyJavaPackageFragment.kt */
        public /* synthetic */ class a {
            static {
                int[] iArr = new int[KotlinClassHeader.Kind.values().length];
                try {
                    iArr[5] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    KotlinClassHeader.Kind.a aVar = KotlinClassHeader.Kind.f408496c;
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        public b() {
            super(0);
        }

        @Override // Y41.a
        public final HashMap<p51.d, p51.d> invoke() {
            HashMap<p51.d, p51.d> map = new HashMap<>();
            n nVar = n.this;
            nVar.getClass();
            kotlin.reflect.n<Object> nVar2 = n.f408174p[0];
            for (Map.Entry entry : ((Map) nVar.f408178k.invoke()).entrySet()) {
                String str = (String) entry.getKey();
                kotlin.reflect.jvm.internal.impl.load.kotlin.z zVar = (kotlin.reflect.jvm.internal.impl.load.kotlin.z) entry.getValue();
                p51.d dVarD = p51.d.d(str);
                KotlinClassHeader kotlinClassHeaderA = zVar.a();
                int iOrdinal = kotlinClassHeaderA.f408489a.ordinal();
                if (iOrdinal == 2) {
                    map.put(dVarD, dVarD);
                } else if (iOrdinal == 5) {
                    String str2 = kotlinClassHeaderA.f408489a == KotlinClassHeader.Kind.f408503j ? kotlinClassHeaderA.f408494f : null;
                    if (str2 != null) {
                        map.put(dVarD, p51.d.d(str2));
                    }
                }
            }
            return map;
        }
    }

    /* compiled from: LazyJavaPackageFragment.kt */
    @s0
    public static final class c extends N implements Y41.a<List<? extends kotlin.reflect.jvm.internal.impl.name.c>> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final List<? extends kotlin.reflect.jvm.internal.impl.name.c> invoke() {
            C42784z0 c42784z0E = n.this.f408175h.e();
            ArrayList arrayList = new ArrayList(C42745f0.q(c42784z0E, 10));
            Iterator<E> it = c42784z0E.iterator();
            while (it.hasNext()) {
                arrayList.add(((k51.u) it.next()).d());
            }
            return arrayList;
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f408174p = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(n.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), n0Var.i(new h0(n0Var.b(n.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public n(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, @Y61.k k51.u uVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVarA;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
        super(cVar.f408090o, uVar.d());
        this.f408175h = uVar;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVarB = kotlin.reflect.jvm.internal.impl.load.java.lazy.b.b(hVar, this, null, 6);
        this.f408176i = hVarB;
        C42954k c42954k = cVar.f408079d.f408539a;
        (c42954k != null ? c42954k : null).f409916c.getClass();
        this.f408177j = m51.e.f414319g;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar2 = hVarB.f408253a;
        a aVar = new a();
        kotlin.reflect.jvm.internal.impl.storage.p pVar = cVar2.f408076a;
        this.f408178k = pVar.g(aVar);
        this.f408179l = new d(hVarB, uVar, this);
        this.f408180m = pVar.a(new c(), C42784z0.f406748b);
        if (cVar2.f408097v.f408426c) {
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f407522s2.getClass();
            gVarA = g.a.f407524b;
        } else {
            gVarA = kotlin.reflect.jvm.internal.impl.load.java.lazy.f.a(hVarB, uVar);
        }
        this.f408181n = gVarA;
        this.f408182o = pVar.g(new b());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.I, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42871o, kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42885n
    @Y61.k
    public final b0 e() {
        return new kotlin.reflect.jvm.internal.impl.load.kotlin.A(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f408181n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.K
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j n() {
        return this.f408179l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.I, kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractC42870n
    @Y61.k
    public final String toString() {
        return "Lazy Java package fragment: " + this.f407568f + " of module " + this.f408176i.f408253a.f408090o;
    }
}
