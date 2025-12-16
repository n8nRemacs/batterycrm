package kotlin.reflect.jvm.internal.impl.types.typeUtil;

import X41.j;
import Y41.l;
import Y61.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.H0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42854g;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.C0;
import kotlin.reflect.jvm.internal.impl.types.C42974e0;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.H;
import kotlin.reflect.jvm.internal.impl.types.I0;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.o0;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* compiled from: TypeUtils.kt */
@s0
/* loaded from: classes8.dex */
public final class a {

    /* compiled from: TypeUtils.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.typeUtil.a$a, reason: collision with other inner class name */
    public static final class C11697a extends N implements l<J0, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final C11697a f410247l = new C11697a();

        public C11697a() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(J0 j02) {
            InterfaceC42853f interfaceC42853fB = j02.H0().b();
            boolean z12 = false;
            if (interfaceC42853fB != null && (interfaceC42853fB instanceof g0) && (((g0) interfaceC42853fB).f() instanceof f0)) {
                z12 = true;
            }
            return Boolean.valueOf(z12);
        }
    }

    public static final boolean a(O o12, q0 q0Var, Set<? extends g0> set) {
        x0 x0Var;
        g0 g0Var;
        if (L.f(o12.H0(), q0Var)) {
            return true;
        }
        InterfaceC42853f interfaceC42853fB = o12.H0().b();
        InterfaceC42854g interfaceC42854g = interfaceC42853fB instanceof InterfaceC42854g ? (InterfaceC42854g) interfaceC42853fB : null;
        List<g0> listR = interfaceC42854g != null ? interfaceC42854g.r() : null;
        Iterable iterableS0 = C42745f0.S0(o12.F0());
        if (!(iterableS0 instanceof Collection) || !((Collection) iterableS0).isEmpty()) {
            Iterator it = iterableS0.iterator();
            do {
                kotlin.collections.J0 j02 = (kotlin.collections.J0) it;
                if (j02.f406646b.hasNext()) {
                    H0 h02 = (H0) j02.next();
                    int i12 = h02.f406643a;
                    x0Var = (x0) h02.f406644b;
                    g0Var = listR != null ? (g0) C42745f0.K(i12, listR) : null;
                }
            } while (!(((g0Var == null || set == null || !set.contains(g0Var)) && !x0Var.c()) ? a(x0Var.getType(), q0Var, set) : false));
            return true;
        }
        return false;
    }

    public static final boolean b(@k O o12) {
        return G0.d(o12, C11697a.f410247l, null);
    }

    @k
    public static final z0 c(@k O o12, @k Variance variance, @Y61.l g0 g0Var) {
        if ((g0Var != null ? g0Var.o() : null) == variance) {
            variance = Variance.f410069d;
        }
        return new z0(o12, variance);
    }

    public static final void d(O o12, Y y12, LinkedHashSet linkedHashSet, Set set) {
        InterfaceC42853f interfaceC42853fB = o12.H0().b();
        if (interfaceC42853fB instanceof g0) {
            if (!L.f(o12.H0(), y12.H0())) {
                linkedHashSet.add(interfaceC42853fB);
                return;
            }
            Iterator<O> it = ((g0) interfaceC42853fB).getUpperBounds().iterator();
            while (it.hasNext()) {
                d(it.next(), y12, linkedHashSet, set);
            }
            return;
        }
        InterfaceC42853f interfaceC42853fB2 = o12.H0().b();
        InterfaceC42854g interfaceC42854g = interfaceC42853fB2 instanceof InterfaceC42854g ? (InterfaceC42854g) interfaceC42853fB2 : null;
        List<g0> listR = interfaceC42854g != null ? interfaceC42854g.r() : null;
        int i12 = 0;
        for (x0 x0Var : o12.F0()) {
            int i13 = i12 + 1;
            g0 g0Var = listR != null ? (g0) C42745f0.K(i12, listR) : null;
            if ((g0Var == null || set == null || !set.contains(g0Var)) && !x0Var.c() && !C42745f0.r(linkedHashSet, x0Var.getType().H0().b()) && !L.f(x0Var.getType().H0(), y12.H0())) {
                d(x0Var.getType(), y12, linkedHashSet, set);
            }
            i12 = i13;
        }
    }

    @k
    public static final kotlin.reflect.jvm.internal.impl.builtins.k e(@k O o12) {
        return o12.H0().m();
    }

    @k
    public static final O f(@k g0 g0Var) {
        Object obj;
        g0Var.getUpperBounds().isEmpty();
        Iterator<T> it = g0Var.getUpperBounds().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            InterfaceC42853f interfaceC42853fB = ((O) next).H0().b();
            InterfaceC42851d interfaceC42851d = interfaceC42853fB instanceof InterfaceC42851d ? (InterfaceC42851d) interfaceC42853fB : null;
            if (interfaceC42851d != null && interfaceC42851d.getKind() != ClassKind.f407414c && interfaceC42851d.getKind() != ClassKind.f407417f) {
                obj = next;
                break;
            }
        }
        O o12 = (O) obj;
        return o12 == null ? (O) C42745f0.E(g0Var.getUpperBounds()) : o12;
    }

    @j
    public static final boolean g(@k g0 g0Var, @Y61.l q0 q0Var, @Y61.l Set<? extends g0> set) {
        List<O> upperBounds = g0Var.getUpperBounds();
        if ((upperBounds instanceof Collection) && upperBounds.isEmpty()) {
            return false;
        }
        for (O o12 : upperBounds) {
            if (a(o12, g0Var.q().H0(), set) && (q0Var == null || L.f(o12.H0(), q0Var))) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean h(g0 g0Var, q0 q0Var, int i12) {
        if ((i12 & 2) != 0) {
            q0Var = null;
        }
        return g(g0Var, q0Var, null);
    }

    @k
    public static final O i(@k O o12, @k g gVar) {
        return (o12.getAnnotations().isEmpty() && gVar.isEmpty()) ? o12 : o12.K0().N0(o0.a(o12.G0(), gVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.reflect.jvm.internal.impl.types.J0] */
    @k
    public static final J0 j(@k O o12) {
        Y yD2;
        J0 j0K0 = o12.K0();
        if (j0K0 instanceof H) {
            H h12 = (H) j0K0;
            Y yD3 = h12.f410024c;
            if (!yD3.H0().getParameters().isEmpty() && yD3.H0().b() != null) {
                List<g0> parameters = yD3.H0().getParameters();
                ArrayList arrayList = new ArrayList(C42745f0.q(parameters, 10));
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C42974e0((g0) it.next()));
                }
                yD3 = C0.d(yD3, arrayList, null, 2);
            }
            Y yD4 = h12.f410025d;
            if (!yD4.H0().getParameters().isEmpty() && yD4.H0().b() != null) {
                List<g0> parameters2 = yD4.H0().getParameters();
                ArrayList arrayList2 = new ArrayList(C42745f0.q(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new C42974e0((g0) it2.next()));
                }
                yD4 = C0.d(yD4, arrayList2, null, 2);
            }
            yD2 = P.c(yD3, yD4);
        } else {
            if (!(j0K0 instanceof Y)) {
                throw new NoWhenBranchMatchedException();
            }
            Y y12 = (Y) j0K0;
            boolean zIsEmpty = y12.H0().getParameters().isEmpty();
            yD2 = y12;
            if (!zIsEmpty) {
                InterfaceC42853f interfaceC42853fB = y12.H0().b();
                yD2 = y12;
                if (interfaceC42853fB != null) {
                    List<g0> parameters3 = y12.H0().getParameters();
                    ArrayList arrayList3 = new ArrayList(C42745f0.q(parameters3, 10));
                    Iterator it3 = parameters3.iterator();
                    while (it3.hasNext()) {
                        arrayList3.add(new C42974e0((g0) it3.next()));
                    }
                    yD2 = C0.d(y12, arrayList3, null, 2);
                }
            }
        }
        return I0.b(yD2, I0.a(j0K0));
    }

    public static final boolean k(@k Y y12) {
        return G0.d(y12, c.f410248l, null);
    }
}
