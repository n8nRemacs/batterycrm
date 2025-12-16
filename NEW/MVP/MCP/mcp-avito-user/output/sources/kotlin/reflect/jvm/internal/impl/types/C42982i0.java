package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42853f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.j;
import kotlin.reflect.jvm.internal.impl.types.C42984j0;
import kotlin.reflect.jvm.internal.impl.types.InterfaceC42986k0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.n0;

/* compiled from: TypeAliasExpander.kt */
@kotlin.jvm.internal.s0
/* renamed from: kotlin.reflect.jvm.internal.impl.types.i0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42982i0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f410211b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42986k0.a f410212a;

    /* compiled from: TypeAliasExpander.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.i0$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        InterfaceC42986k0.a aVar = InterfaceC42986k0.a.f410224a;
    }

    public C42982i0(@Y61.k InterfaceC42986k0.a aVar) {
        this.f410212a = aVar;
    }

    public static n0 b(J0 j02, n0 n0Var) {
        if (Q.a(j02)) {
            return j02.G0();
        }
        n0 n0VarG0 = j02.G0();
        if (n0Var.isEmpty() && n0VarG0.isEmpty()) {
            return n0Var;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = n0.f410236c.f410340a.values().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().intValue();
            l0 l0Var = (l0) n0Var.f410277b.get(iIntValue);
            l0 l0Var2 = (l0) n0VarG0.f410277b.get(iIntValue);
            kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, l0Var == null ? l0Var2 != null ? l0Var2.a(l0Var) : null : l0Var.a(l0Var2));
        }
        return n0.a.c(arrayList);
    }

    public final void a(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVar2) {
        HashSet hashSet = new HashSet();
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it = gVar.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().d());
        }
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it2 = gVar2.iterator();
        while (it2.hasNext()) {
            if (hashSet.contains(it2.next().d())) {
                this.f410212a.getClass();
            }
        }
    }

    public final Y c(C42984j0 c42984j0, n0 n0Var, boolean z12, int i12, boolean z13) {
        Variance variance = Variance.f410069d;
        kotlin.reflect.jvm.internal.impl.descriptors.f0 f0Var = c42984j0.f410221b;
        x0 x0VarD = d(new z0(f0Var.B0(), variance), c42984j0, null, i12);
        Y yA2 = C0.a(x0VarD.getType());
        if (Q.a(yA2)) {
            return yA2;
        }
        x0VarD.a();
        a(yA2.getAnnotations(), r.a(n0Var));
        if (!Q.a(yA2)) {
            yA2 = C0.d(yA2, null, b(yA2, n0Var), 1);
        }
        Y yJ2 = G0.j(yA2, z12);
        if (!z13) {
            return yJ2;
        }
        q0 q0VarL = f0Var.l();
        return C42964c0.c(yJ2, P.f(c42984j0.f410222c, j.c.f409687b, n0Var, q0VarL, z12));
    }

    public final x0 d(x0 x0Var, C42984j0 c42984j0, kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var, int i12) {
        Variance varianceO;
        O c12;
        Variance variance;
        Variance variance2;
        z0 z0Var;
        f410211b.getClass();
        if (i12 > 100) {
            throw new AssertionError("Too deep recursion while expanding type alias " + c42984j0.f410221b.getName());
        }
        if (x0Var.c()) {
            return G0.k(g0Var);
        }
        O type = x0Var.getType();
        InterfaceC42853f interfaceC42853fB = type.H0().b();
        x0 x0Var2 = interfaceC42853fB instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0 ? c42984j0.f410223d.get(interfaceC42853fB) : null;
        InterfaceC42986k0.a aVar = this.f410212a;
        if (x0Var2 != null) {
            if (x0Var2.c()) {
                return G0.k(g0Var);
            }
            J0 j0K0 = x0Var2.getType().K0();
            Variance varianceA = x0Var2.a();
            Variance varianceA2 = x0Var.a();
            if (varianceA2 != varianceA && varianceA2 != (variance2 = Variance.f410069d)) {
                if (varianceA == variance2) {
                    varianceA = varianceA2;
                } else {
                    aVar.getClass();
                }
            }
            if (g0Var == null || (varianceO = g0Var.o()) == null) {
                varianceO = Variance.f410069d;
            }
            if (varianceO != varianceA && varianceO != (variance = Variance.f410069d)) {
                if (varianceA == variance) {
                    varianceA = variance;
                } else {
                    aVar.getClass();
                }
            }
            a(type.getAnnotations(), j0K0.getAnnotations());
            if (j0K0 instanceof C) {
                C c13 = (C) j0K0;
                c12 = new C(kotlin.reflect.jvm.internal.impl.types.typeUtil.a.e(c13.f410025d), b(c13, type.G0()));
            } else {
                Y yJ2 = G0.j(C0.a(j0K0), type.I0());
                n0 n0VarG0 = type.G0();
                if (!Q.a(yJ2)) {
                    yJ2 = C0.d(yJ2, null, b(yJ2, n0VarG0), 1);
                }
                c12 = yJ2;
            }
            return new z0(c12, varianceA);
        }
        J0 j0K02 = x0Var.getType().K0();
        if (j0K02 instanceof C) {
            return x0Var;
        }
        Y yA2 = C0.a(j0K02);
        if (Q.a(yA2) || !kotlin.reflect.jvm.internal.impl.types.typeUtil.a.k(yA2)) {
            return x0Var;
        }
        q0 q0VarH0 = yA2.H0();
        InterfaceC42853f interfaceC42853fB2 = q0VarH0.b();
        q0VarH0.getParameters().size();
        yA2.F0().size();
        if (interfaceC42853fB2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0) {
            return x0Var;
        }
        int i13 = 0;
        if (interfaceC42853fB2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.f0) {
            kotlin.reflect.jvm.internal.impl.descriptors.f0 f0Var = (kotlin.reflect.jvm.internal.impl.descriptors.f0) interfaceC42853fB2;
            if (c42984j0.a(f0Var)) {
                aVar.getClass();
                return new z0(kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410155g, f0Var.getName().f409252b), Variance.f410069d);
            }
            List<x0> listF0 = yA2.F0();
            ArrayList arrayList = new ArrayList(C42745f0.q(listF0, 10));
            for (Object obj : listF0) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                arrayList.add(d((x0) obj, c42984j0, q0VarH0.getParameters().get(i13), i12 + 1));
                i13 = i14;
            }
            C42984j0.f410219e.getClass();
            z0Var = new z0(C42964c0.c(c(C42984j0.a.a(c42984j0, f0Var, arrayList), yA2.G0(), yA2.I0(), i12 + 1, false), e(yA2, c42984j0, i12)), x0Var.a());
        } else {
            Y yE2 = e(yA2, c42984j0, i12);
            E0.d(yE2);
            for (Object obj2 : yE2.F0()) {
                int i15 = i13 + 1;
                if (i13 < 0) {
                    C42745f0.H0();
                    throw null;
                }
                x0 x0Var3 = (x0) obj2;
                if (!x0Var3.c() && !kotlin.reflect.jvm.internal.impl.types.typeUtil.a.b(x0Var3.getType())) {
                    yA2.F0().get(i13);
                    yA2.H0().getParameters().get(i13);
                }
                i13 = i15;
            }
            z0Var = new z0(yE2, x0Var.a());
        }
        return z0Var;
    }

    public final Y e(Y y12, C42984j0 c42984j0, int i12) {
        q0 q0VarH0 = y12.H0();
        List<x0> listF0 = y12.F0();
        ArrayList arrayList = new ArrayList(C42745f0.q(listF0, 10));
        int i13 = 0;
        for (Object obj : listF0) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            x0 x0Var = (x0) obj;
            x0 x0VarD = d(x0Var, c42984j0, q0VarH0.getParameters().get(i13), i12 + 1);
            if (!x0VarD.c()) {
                x0VarD = new z0(G0.i(x0VarD.getType(), x0Var.getType().I0()), x0VarD.a());
            }
            arrayList.add(x0VarD);
            i13 = i14;
        }
        return C0.d(y12, arrayList, null, 2);
    }
}
