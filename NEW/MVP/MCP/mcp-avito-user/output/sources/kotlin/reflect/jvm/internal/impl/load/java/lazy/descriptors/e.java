package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import j51.InterfaceC42201a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import k51.InterfaceC42516a;
import k51.InterfaceC42517b;
import k51.InterfaceC42518c;
import k51.InterfaceC42520e;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.descriptors.C42904w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.H;
import kotlin.reflect.jvm.internal.impl.load.java.E;
import kotlin.reflect.jvm.internal.impl.resolve.constants.C42938a;
import kotlin.reflect.jvm.internal.impl.resolve.constants.s;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C42954k;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.x0;

/* compiled from: LazyJavaAnnotationDescriptor.kt */
@s0
/* loaded from: classes8.dex */
public final class e implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.c, kotlin.reflect.jvm.internal.impl.load.java.descriptors.g {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f408117i;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.h f408118a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42516a f408119b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.l f408120c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f408121d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42201a f408122e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.storage.k f408123f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f408124g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f408125h;

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    @s0
    public static final class a extends N implements Y41.a<Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Map<kotlin.reflect.jvm.internal.impl.name.f, ? extends kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> invoke() {
            e eVar = e.this;
            ArrayList<InterfaceC42517b> arrayListD = eVar.f408119b.D();
            ArrayList arrayList = new ArrayList();
            for (InterfaceC42517b interfaceC42517b : arrayListD) {
                kotlin.reflect.jvm.internal.impl.name.f name = interfaceC42517b.getName();
                if (name == null) {
                    name = E.f407915b;
                }
                kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVarC = eVar.c(interfaceC42517b);
                Q q12 = gVarC != null ? new Q(name, gVarC) : null;
                if (q12 != null) {
                    arrayList.add(q12);
                }
            }
            return P0.p(arrayList);
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    public static final class b extends N implements Y41.a<kotlin.reflect.jvm.internal.impl.name.c> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.reflect.jvm.internal.impl.name.c invoke() {
            return e.this.f408119b.c().b();
        }
    }

    /* compiled from: LazyJavaAnnotationDescriptor.kt */
    @s0
    public static final class c extends N implements Y41.a<Y> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Y invoke() {
            e eVar = e.this;
            kotlin.reflect.jvm.internal.impl.name.c cVarD = eVar.d();
            InterfaceC42516a interfaceC42516a = eVar.f408119b;
            if (cVarD == null) {
                return kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410149F, interfaceC42516a.toString());
            }
            kotlin.reflect.jvm.internal.impl.builtins.jvm.d dVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f407256a;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = eVar.f408118a;
            InterfaceC42851d interfaceC42851dB = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.b(dVar, cVarD, hVar.f408253a.f408090o.m());
            if (interfaceC42851dB == null) {
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t tVarF = interfaceC42516a.f();
                kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
                interfaceC42851dB = cVar.f408086k.a(tVarF);
                if (interfaceC42851dB == null) {
                    kotlin.reflect.jvm.internal.impl.name.b bVarJ = kotlin.reflect.jvm.internal.impl.name.b.j(cVarD);
                    C42954k c42954k = cVar.f408079d.f408539a;
                    if (c42954k == null) {
                        c42954k = null;
                    }
                    interfaceC42851dB = C42904w.c(cVar.f408090o, bVarJ, c42954k.f409925l);
                }
            }
            return interfaceC42851dB.q();
        }
    }

    static {
        n0 n0Var = m0.f406844a;
        f408117i = new kotlin.reflect.n[]{n0Var.i(new h0(n0Var.b(e.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), n0Var.i(new h0(n0Var.b(e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), n0Var.i(new h0(n0Var.b(e.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    public e(@Y61.k InterfaceC42516a interfaceC42516a, @Y61.k kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, boolean z12) {
        this.f408118a = hVar;
        this.f408119b = interfaceC42516a;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.c cVar = hVar.f408253a;
        b bVar = new b();
        kotlin.reflect.jvm.internal.impl.storage.p pVar = cVar.f408076a;
        this.f408120c = pVar.f(bVar);
        this.f408121d = pVar.g(new c());
        this.f408122e = cVar.f408085j.a(interfaceC42516a);
        this.f408123f = pVar.g(new a());
        this.f408124g = false;
        this.f408125h = z12;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.g
    public final boolean a() {
        return this.f408124g;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.k
    public final Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b() {
        kotlin.reflect.n<Object> nVar = f408117i[2];
        return (Map) this.f408123f.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> c(InterfaceC42517b interfaceC42517b) {
        O oG2;
        if (interfaceC42517b instanceof k51.o) {
            return kotlin.reflect.jvm.internal.impl.resolve.constants.i.f409588a.b(((k51.o) interfaceC42517b).getValue(), null);
        }
        if (interfaceC42517b instanceof k51.m) {
            k51.m mVar = (k51.m) interfaceC42517b;
            return new kotlin.reflect.jvm.internal.impl.resolve.constants.k(mVar.d(), mVar.e());
        }
        boolean z12 = interfaceC42517b instanceof InterfaceC42520e;
        kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar = this.f408118a;
        if (!z12) {
            if (interfaceC42517b instanceof InterfaceC42518c) {
                return new C42938a(new e(this.f408118a, ((InterfaceC42518c) interfaceC42517b).b(), false, 4, null));
            }
            if (!(interfaceC42517b instanceof k51.h)) {
                return null;
            }
            H hC2 = ((k51.h) interfaceC42517b).c();
            s.a aVar = kotlin.reflect.jvm.internal.impl.resolve.constants.s.f409603b;
            O oD2 = hVar.f408257e.d(hC2, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.a(TypeUsage.f410066c, false, null, 7));
            aVar.getClass();
            if (kotlin.reflect.jvm.internal.impl.types.Q.a(oD2)) {
                return null;
            }
            O type = oD2;
            int i12 = 0;
            while (kotlin.reflect.jvm.internal.impl.builtins.k.x(type)) {
                type = ((x0) C42745f0.u0(type.F0())).getType();
                i12++;
            }
            InterfaceC42853f interfaceC42853fB = type.H0().b();
            if (interfaceC42853fB instanceof InterfaceC42851d) {
                kotlin.reflect.jvm.internal.impl.name.b bVarF = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(interfaceC42853fB);
                return bVarF == null ? new kotlin.reflect.jvm.internal.impl.resolve.constants.s(new s.b.a(oD2)) : new kotlin.reflect.jvm.internal.impl.resolve.constants.s(bVarF, i12);
            }
            if (interfaceC42853fB instanceof g0) {
                return new kotlin.reflect.jvm.internal.impl.resolve.constants.s(kotlin.reflect.jvm.internal.impl.name.b.j(n.a.f407373b.g()), 0);
            }
            return null;
        }
        InterfaceC42520e interfaceC42520e = (InterfaceC42520e) interfaceC42517b;
        kotlin.reflect.jvm.internal.impl.name.f name = interfaceC42520e.getName();
        if (name == null) {
            name = E.f407915b;
        }
        ArrayList arrayListA = interfaceC42520e.a();
        kotlin.reflect.n<Object> nVar = f408117i[1];
        if (kotlin.reflect.jvm.internal.impl.types.Q.a((Y) this.f408121d.invoke())) {
            return null;
        }
        k0 k0VarB = kotlin.reflect.jvm.internal.impl.load.java.components.b.b(name, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.d(this));
        if (k0VarB == null || (oG2 = k0VarB.getType()) == null) {
            kotlin.reflect.jvm.internal.impl.builtins.k kVarM = hVar.f408253a.f408090o.m();
            Variance variance = Variance.f410069d;
            oG2 = kVarM.g(kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410148E, new String[0]));
        }
        ArrayList arrayList = new ArrayList(C42745f0.q(arrayListA, 10));
        Iterator it = arrayListA.iterator();
        while (it.hasNext()) {
            kotlin.reflect.jvm.internal.impl.resolve.constants.g<?> gVarC = c((InterfaceC42517b) it.next());
            if (gVarC == null) {
                gVarC = new kotlin.reflect.jvm.internal.impl.resolve.constants.u();
            }
            arrayList.add(gVarC);
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.i.f409588a.getClass();
        return new kotlin.reflect.jvm.internal.impl.resolve.constants.y(arrayList, oG2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @Y61.l
    public final kotlin.reflect.jvm.internal.impl.name.c d() {
        kotlin.reflect.n<Object> nVar = f408117i[0];
        return (kotlin.reflect.jvm.internal.impl.name.c) this.f408120c.invoke();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public final b0 e() {
        return this.f408122e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public final O getType() {
        kotlin.reflect.n<Object> nVar = f408117i[1];
        return (Y) this.f408121d.invoke();
    }

    @Y61.k
    public final String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.b.f409469b.y(this, null);
    }

    public /* synthetic */ e(kotlin.reflect.jvm.internal.impl.load.java.lazy.h hVar, InterfaceC42516a interfaceC42516a, boolean z12, int i12, C42822w c42822w) {
        this(interfaceC42516a, hVar, (i12 & 4) != 0 ? false : z12);
    }
}
