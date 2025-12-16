package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import h51.C40774a;
import i51.InterfaceC41228b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42882k;
import kotlin.reflect.jvm.internal.impl.descriptors.a0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import w51.C49448a;

/* compiled from: JvmPackageScope.kt */
@s0
/* loaded from: classes8.dex */
public final class d implements kotlin.reflect.jvm.internal.impl.resolve.scopes.j {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f408111f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408112b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final n f408113c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final o f408114d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f408115e;

    /* compiled from: JvmPackageScope.kt */
    @s0
    public static final class a extends N implements Y41.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.j[]> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j[] invoke() {
            d dVar = d.this;
            n nVar = dVar.f408113c;
            nVar.getClass();
            kotlin.reflect.n<Object> nVar2 = n.f408174p[0];
            Collection<kotlin.reflect.jvm.internal.impl.load.kotlin.z> collectionValues = ((Map) nVar.f408178k.invoke()).values();
            ArrayList arrayList = new ArrayList();
            for (kotlin.reflect.jvm.internal.impl.load.kotlin.z zVar : collectionValues) {
                kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = dVar.f408112b.f408253a;
                kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.w wVarA = cVar.f408079d.a(dVar.f408113c, zVar);
                if (wVarA != null) {
                    arrayList.add(wVarA);
                }
            }
            return (kotlin.reflect.jvm.internal.impl.resolve.scopes.j[]) C49448a.b(arrayList).toArray(new kotlin.reflect.jvm.internal.impl.resolve.scopes.j[0]);
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f408111f = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(d.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
    }

    public d(@Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, @Y61.k k51.u uVar, @Y61.k n nVar) {
        this.f408112b = hVar;
        this.f408113c = nVar;
        this.f408114d = new o(hVar, uVar, nVar);
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
        this.f408115e = cVar.f408076a.g(new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> a() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j[] jVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar : jVarArrH) {
            C42745f0.h(jVar.a(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f408114d.a());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j[] jVarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar : jVarArrH) {
            C42745f0.h(jVar.b(), linkedHashSet);
        }
        linkedHashSet.addAll(this.f408114d.b());
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.l
    public final Set<kotlin.reflect.jvm.internal.impl.name.f> c() {
        HashSet hashSetA = kotlin.reflect.jvm.internal.impl.resolve.scopes.l.a(C42756l.e(h()));
        if (hashSetA == null) {
            return null;
        }
        hashSetA.addAll(this.f408114d.c());
        return hashSetA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Collection<a0> d(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        C40774a.b(this.f408112b.f408253a.f408089n, interfaceC41228b, this.f408113c, fVar);
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j[] jVarArrH = h();
        Collection<a0> collectionD = this.f408114d.d(fVar, interfaceC41228b);
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar : jVarArrH) {
            collectionD = C49448a.a(collectionD, jVar.d(fVar, interfaceC41228b));
        }
        return collectionD == null ? B0.f406639b : collectionD;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.k
    public final Collection<InterfaceC42882k> e(@Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.d dVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> lVar) {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j[] jVarArrH = h();
        Collection<InterfaceC42882k> collectionE = this.f408114d.e(dVar, lVar);
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar : jVarArrH) {
            collectionE = C49448a.a(collectionE, jVar.e(dVar, lVar));
        }
        return collectionE == null ? B0.f406639b : collectionE;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.j
    @Y61.k
    public final Collection f(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k NoLookupLocation noLookupLocation) {
        C40774a.b(this.f408112b.f408253a.f408089n, noLookupLocation, this.f408113c, fVar);
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j[] jVarArrH = h();
        this.f408114d.getClass();
        Collection collectionA = C42784z0.f406748b;
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar : jVarArrH) {
            collectionA = C49448a.a(collectionA, jVar.f(fVar, noLookupLocation));
        }
        return collectionA == null ? B0.f406639b : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.m
    @Y61.l
    public final InterfaceC42853f g(@Y61.k kotlin.reflect.jvm.internal.impl.name.f fVar, @Y61.k InterfaceC41228b interfaceC41228b) {
        C40774a.b(this.f408112b.f408253a.f408089n, interfaceC41228b, this.f408113c, fVar);
        InterfaceC42853f interfaceC42853f = null;
        InterfaceC42851d interfaceC42851dV = this.f408114d.v(fVar, null);
        if (interfaceC42851dV != null) {
            return interfaceC42851dV;
        }
        for (kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar : h()) {
            InterfaceC42853f interfaceC42853fG = jVar.g(fVar, interfaceC41228b);
            if (interfaceC42853fG != null) {
                if (!(interfaceC42853fG instanceof InterfaceC42854g) || !((InterfaceC42854g) interfaceC42853fG).O()) {
                    return interfaceC42853fG;
                }
                if (interfaceC42853f == null) {
                    interfaceC42853f = interfaceC42853fG;
                }
            }
        }
        return interfaceC42853f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kotlin.reflect.jvm.internal.impl.resolve.scopes.j[] h() {
        kotlin.reflect.n<Object> nVar = f408111f[0];
        return (kotlin.reflect.jvm.internal.impl.resolve.scopes.j[]) this.f408115e.invoke();
    }

    @Y61.k
    public final String toString() {
        return "scope for " + this.f408113c;
    }
}
