package kotlin.reflect.jvm.internal.impl.types;

import java.util.LinkedHashSet;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.r;
import kotlin.reflect.jvm.internal.impl.types.C42984j0;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC42986k0;
import kotlin.reflect.jvm.internal.impl.types.checker.i;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;

/* compiled from: KotlinTypeFactory.kt */
@kotlin.jvm.internal.s0
/* loaded from: classes8.dex */
public final class P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final P f410039a = new P();

    /* compiled from: KotlinTypeFactory.kt */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l {

        /* renamed from: l, reason: collision with root package name */
        public static final /* synthetic */ int f410040l = 0;

        static {
            new a();
        }

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    public static final class b {
    }

    /* compiled from: KotlinTypeFactory.kt */
    @kotlin.jvm.internal.s0
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<kotlin.reflect.jvm.internal.impl.types.checker.i, Y> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q0 f410041l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<x0> f410042m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(q0 q0Var, List<? extends x0> list, n0 n0Var, boolean z12) {
            super(1);
            this.f410041l = q0Var;
            this.f410042m = list;
        }

        @Override // Y41.l
        public final Y invoke(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
            P.a(P.f410039a, this.f410041l, iVar, this.f410042m);
            return null;
        }
    }

    /* compiled from: KotlinTypeFactory.kt */
    @kotlin.jvm.internal.s0
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<kotlin.reflect.jvm.internal.impl.types.checker.i, Y> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q0 f410043l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<x0> f410044m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.j f410045n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar, n0 n0Var, q0 q0Var, boolean z12) {
            super(1);
            this.f410043l = q0Var;
            this.f410044m = list;
            this.f410045n = jVar;
        }

        @Override // Y41.l
        public final Y invoke(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
            P.a(P.f410039a, this.f410043l, iVar, this.f410044m);
            return null;
        }
    }

    static {
        int i12 = a.f410040l;
    }

    public static final b a(P p12, q0 q0Var, kotlin.reflect.jvm.internal.impl.types.checker.i iVar, List list) {
        p12.getClass();
        if (q0Var.b() == null) {
            return null;
        }
        iVar.getClass();
        return null;
    }

    @X41.n
    @Y61.k
    public static final Y b(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.f0 f0Var, @Y61.k List<? extends x0> list) {
        C42982i0 c42982i0 = new C42982i0(InterfaceC42986k0.a.f410224a);
        C42984j0.f410219e.getClass();
        C42984j0 c42984j0A = C42984j0.a.a(null, f0Var, list);
        n0.f410236c.getClass();
        return c42982i0.c(c42984j0A, n0.f410237d, false, 0, true);
    }

    @X41.n
    @Y61.k
    public static final J0 c(@Y61.k Y y12, @Y61.k Y y13) {
        return y12.equals(y13) ? y12 : new I(y12, y13);
    }

    @X41.n
    @Y61.k
    public static final Y d(@Y61.k n0 n0Var, @Y61.k InterfaceC42851d interfaceC42851d, @Y61.k List<? extends x0> list) {
        return e(n0Var, interfaceC42851d.l(), list, false, null);
    }

    @X41.j
    @X41.n
    @Y61.k
    public static final Y e(@Y61.k n0 n0Var, @Y61.k q0 q0Var, @Y61.k List<? extends x0> list, boolean z12, @Y61.l kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
        kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVarA;
        kotlin.reflect.jvm.internal.impl.descriptors.impl.A a12;
        if (n0Var.isEmpty() && list.isEmpty() && !z12 && q0Var.b() != null) {
            return q0Var.b().q();
        }
        f410039a.getClass();
        InterfaceC42853f interfaceC42853fB = q0Var.b();
        if (interfaceC42853fB instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0) {
            jVarA = ((kotlin.reflect.jvm.internal.impl.descriptors.g0) interfaceC42853fB).q().n();
        } else if (interfaceC42853fB instanceof InterfaceC42851d) {
            if (iVar == null) {
                int i12 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f409615a;
                iVar = i.a.f410099a;
            }
            if (list.isEmpty()) {
                InterfaceC42851d interfaceC42851d = (InterfaceC42851d) interfaceC42853fB;
                kotlin.reflect.jvm.internal.impl.descriptors.impl.A.f407546b.getClass();
                a12 = interfaceC42851d instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.A ? (kotlin.reflect.jvm.internal.impl.descriptors.impl.A) interfaceC42851d : null;
                if (a12 == null || (jVarA = a12.N(iVar)) == null) {
                    jVarA = interfaceC42851d.g0();
                }
            } else {
                InterfaceC42851d interfaceC42851d2 = (InterfaceC42851d) interfaceC42853fB;
                A0 a0A = s0.f410245b.a(q0Var, list);
                kotlin.reflect.jvm.internal.impl.descriptors.impl.A.f407546b.getClass();
                a12 = interfaceC42851d2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.A ? (kotlin.reflect.jvm.internal.impl.descriptors.impl.A) interfaceC42851d2 : null;
                if (a12 == null || (jVarA = a12.L(a0A, iVar)) == null) {
                    jVarA = interfaceC42851d2.R(a0A);
                }
            }
        } else if (interfaceC42853fB instanceof kotlin.reflect.jvm.internal.impl.descriptors.f0) {
            jVarA = kotlin.reflect.jvm.internal.impl.types.error.h.a(ErrorScopeKind.f410138e, true, ((kotlin.reflect.jvm.internal.impl.descriptors.f0) interfaceC42853fB).getName().f409252b);
        } else {
            if (!(q0Var instanceof M)) {
                throw new IllegalStateException("Unsupported classifier: " + interfaceC42853fB + " for constructor: " + q0Var);
            }
            r.a aVar = kotlin.reflect.jvm.internal.impl.resolve.scopes.r.f409702c;
            LinkedHashSet<O> linkedHashSet = ((M) q0Var).f410032b;
            aVar.getClass();
            jVarA = r.a.a("member scope for intersection type", linkedHashSet);
        }
        return g(n0Var, q0Var, list, z12, jVarA, new c(q0Var, list, n0Var, z12));
    }

    @X41.n
    @Y61.k
    public static final Y f(@Y61.k List list, @Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar, @Y61.k n0 n0Var, @Y61.k q0 q0Var, boolean z12) {
        Z z13 = new Z(q0Var, list, z12, jVar, new d(list, jVar, n0Var, q0Var, z12));
        return n0Var.isEmpty() ? z13 : new C42960a0(z13, n0Var);
    }

    @X41.n
    @Y61.k
    public static final Y g(@Y61.k n0 n0Var, @Y61.k q0 q0Var, @Y61.k List<? extends x0> list, boolean z12, @Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar, @Y61.k Y41.l<? super kotlin.reflect.jvm.internal.impl.types.checker.i, ? extends Y> lVar) {
        Z z13 = new Z(q0Var, list, z12, jVar, lVar);
        return n0Var.isEmpty() ? z13 : new C42960a0(z13, n0Var);
    }
}
