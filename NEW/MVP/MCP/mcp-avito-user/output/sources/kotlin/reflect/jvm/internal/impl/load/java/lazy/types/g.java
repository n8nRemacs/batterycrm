package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import Y41.l;
import Y61.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.types.A0;
import kotlin.reflect.jvm.internal.impl.types.K;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.u0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* compiled from: RawSubstitution.kt */
@s0
/* loaded from: classes8.dex */
public final class g extends A0 {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f408287d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a f408288e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final f f408289b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final u0 f408290c;

    /* compiled from: RawSubstitution.kt */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RawSubstitution.kt */
    public static final class b extends N implements l<kotlin.reflect.jvm.internal.impl.types.checker.i, Y> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC42851d f408291l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC42851d interfaceC42851d, g gVar, Y y12, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
            super(1);
            this.f408291l = interfaceC42851d;
        }

        @Override // Y41.l
        public final Y invoke(kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
            kotlin.reflect.jvm.internal.impl.types.checker.i iVar2 = iVar;
            InterfaceC42851d interfaceC42851d = this.f408291l;
            if (interfaceC42851d == null) {
                interfaceC42851d = null;
            }
            if (interfaceC42851d != null && kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.f(interfaceC42851d) != null) {
                iVar2.getClass();
            }
            return null;
        }
    }

    static {
        new a(null);
        TypeUsage typeUsage = TypeUsage.f410066c;
        f408287d = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.a(typeUsage, false, null, 5).f(JavaTypeFlexibility.f408268d);
        f408288e = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.a(typeUsage, false, null, 5).f(JavaTypeFlexibility.f408267c);
    }

    public g() {
        this(null, 1, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.A0
    public final x0 d(O o12) {
        return new z0(h(o12, new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a(TypeUsage.f410066c, null, false, false, null, null, 62, null)));
    }

    public final Q<Y, Boolean> g(Y y12, InterfaceC42851d interfaceC42851d, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        if (y12.H0().getParameters().isEmpty()) {
            return new Q<>(y12, Boolean.FALSE);
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.k.x(y12)) {
            x0 x0Var = y12.F0().get(0);
            return new Q<>(P.e(y12.G0(), y12.H0(), Collections.singletonList(new z0(h(x0Var.getType(), aVar), x0Var.a())), y12.I0(), null), Boolean.FALSE);
        }
        if (kotlin.reflect.jvm.internal.impl.types.Q.a(y12)) {
            return new Q<>(kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410163o, y12.H0().toString()), Boolean.FALSE);
        }
        j jVarR = interfaceC42851d.R(this);
        n0 n0VarG0 = y12.G0();
        q0 q0VarL = interfaceC42851d.l();
        List<g0> parameters = interfaceC42851d.l().getParameters();
        ArrayList arrayList = new ArrayList(C42745f0.q(parameters, 10));
        for (g0 g0Var : parameters) {
            u0 u0Var = this.f408290c;
            arrayList.add(this.f408289b.a(g0Var, aVar, u0Var, u0Var.b(g0Var, aVar)));
        }
        return new Q<>(P.g(n0VarG0, q0VarL, arrayList, y12.I0(), jVarR, new b(interfaceC42851d, this, y12, aVar)), Boolean.TRUE);
    }

    public final O h(O o12, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVar) {
        InterfaceC42853f interfaceC42853fB = o12.H0().b();
        if (interfaceC42853fB instanceof g0) {
            aVar.getClass();
            return h(this.f408290c.b((g0) interfaceC42853fB, kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a.e(aVar, null, true, null, null, 59)), aVar);
        }
        if (!(interfaceC42853fB instanceof InterfaceC42851d)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC42853fB).toString());
        }
        InterfaceC42853f interfaceC42853fB2 = K.b(o12).H0().b();
        if (interfaceC42853fB2 instanceof InterfaceC42851d) {
            Q<Y, Boolean> qG2 = g(K.a(o12), (InterfaceC42851d) interfaceC42853fB, f408287d);
            Y y12 = qG2.f406619b;
            boolean zBooleanValue = qG2.f406620c.booleanValue();
            Q<Y, Boolean> qG3 = g(K.b(o12), (InterfaceC42851d) interfaceC42853fB2, f408288e);
            Y y13 = qG3.f406619b;
            return (zBooleanValue || qG3.f406620c.booleanValue()) ? new i(y12, y13, 0) : P.c(y12, y13);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC42853fB2 + "\" while for lower it's \"" + interfaceC42853fB + '\"').toString());
    }

    public g(u0 u0Var, int i12, C42822w c42822w) {
        u0Var = (i12 & 1) != 0 ? null : u0Var;
        f fVar = new f();
        this.f408289b = fVar;
        this.f408290c = u0Var == null ? new u0(fVar, null, 2, null) : u0Var;
    }
}
