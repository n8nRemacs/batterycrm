package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.n;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import u51.InterfaceC48806h;

/* compiled from: TypeSubstitutor.java */
/* loaded from: classes8.dex */
public class E0 {

    /* renamed from: b, reason: collision with root package name */
    public static final E0 f410009b = e(A0.f410003a);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A0 f410010a;

    /* compiled from: TypeSubstitutor.java */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f410011a;

        static {
            int[] iArr = new int[c.values().length];
            f410011a = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f410011a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f410011a[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: TypeSubstitutor.java */
    public static final class b extends Exception {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TypeSubstitutor.java */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f410012b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f410013c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f410014d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ c[] f410015e;

        static {
            c cVar = new c("NO_CONFLICT", 0);
            f410012b = cVar;
            c cVar2 = new c("IN_IN_OUT_POSITION", 1);
            f410013c = cVar2;
            c cVar3 = new c("OUT_IN_IN_POSITION", 2);
            f410014d = cVar3;
            f410015e = new c[]{cVar, cVar2, cVar3};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f410015e.clone();
        }
    }

    public E0(@Y61.k A0 a02) {
        if (a02 != null) {
            this.f410010a = a02;
        } else {
            a(7);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.E0.a(int):void");
    }

    @Y61.k
    public static Variance b(@Y61.k Variance variance, @Y61.k Variance variance2) {
        if (variance == null) {
            a(38);
            throw null;
        }
        if (variance2 == null) {
            a(39);
            throw null;
        }
        Variance variance3 = Variance.f410069d;
        if (variance == variance3) {
            if (variance2 != null) {
                return variance2;
            }
            a(40);
            throw null;
        }
        if (variance2 == variance3) {
            if (variance != null) {
                return variance;
            }
            a(41);
            throw null;
        }
        if (variance == variance2) {
            if (variance2 != null) {
                return variance2;
            }
            a(42);
            throw null;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    public static c c(Variance variance, Variance variance2) {
        Variance variance3 = Variance.f410070e;
        return (variance == variance3 && variance2 == Variance.f410071f) ? c.f410014d : (variance == Variance.f410071f && variance2 == variance3) ? c.f410013c : c.f410012b;
    }

    @Y61.k
    public static E0 d(@Y61.k O o12) {
        if (o12 == null) {
            a(6);
            throw null;
        }
        return e(s0.f410245b.a(o12.H0(), o12.F0()));
    }

    @Y61.k
    public static E0 e(@Y61.k A0 a02) {
        if (a02 != null) {
            return new E0(a02);
        }
        a(0);
        throw null;
    }

    @Y61.k
    public static E0 f(@Y61.k A0 a02, @Y61.k A0 a03) {
        if (a02 == null) {
            a(3);
            throw null;
        }
        if (a03 == null) {
            a(4);
            throw null;
        }
        B.f410004d.getClass();
        if (a02.e()) {
            a02 = a03;
        } else if (!a03.e()) {
            a02 = new B(a02, a03, null);
        }
        return e(a02);
    }

    public static String i(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (kotlin.reflect.jvm.internal.impl.utils.d.a(th2)) {
                throw th2;
            }
            return "[Exception while computing toString(): " + th2 + "]";
        }
    }

    @Y61.k
    public final A0 g() {
        A0 a02 = this.f410010a;
        if (a02 != null) {
            return a02;
        }
        a(8);
        throw null;
    }

    @Y61.k
    public final O h(@Y61.k O o12, @Y61.k Variance variance) {
        if (o12 == null) {
            a(9);
            throw null;
        }
        if (this.f410010a.e()) {
            return o12;
        }
        try {
            O type = k(new z0(o12, variance), null, 0).getType();
            if (type != null) {
                return type;
            }
            a(12);
            throw null;
        } catch (b e12) {
            return kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410160l, e12.getMessage());
        }
    }

    @Y61.l
    public final O j(@Y61.k O o12, @Y61.k Variance variance) {
        if (o12 == null) {
            a(14);
            throw null;
        }
        if (variance == null) {
            a(15);
            throw null;
        }
        x0 z0Var = new z0(g().f(o12, variance), variance);
        A0 a02 = this.f410010a;
        if (!a02.e()) {
            try {
                z0Var = k(z0Var, null, 0);
            } catch (b unused) {
                z0Var = null;
            }
        }
        if (a02.a() || a02.b()) {
            z0Var = kotlin.reflect.jvm.internal.impl.types.typesApproximation.b.b(z0Var, a02.b());
        }
        if (z0Var == null) {
            return null;
        }
        return z0Var.getType();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final x0 k(@Y61.k x0 x0Var, @Y61.l kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var, int i12) throws b {
        char c12;
        E0 e02;
        O oJ2 = null;
        if (x0Var == null) {
            a(18);
            throw null;
        }
        A0 a02 = this.f410010a;
        if (i12 > 100) {
            throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + i(x0Var) + "; substitution: " + i(a02));
        }
        if (x0Var.c()) {
            return x0Var;
        }
        O type = x0Var.getType();
        if (type instanceof H0) {
            H0 h02 = (H0) type;
            J0 j0N0 = h02.n0();
            O oL2 = h02.L();
            x0 x0VarK = k(new z0(j0N0, x0Var.a()), g0Var, i12 + 1);
            return x0VarK.c() ? x0VarK : new z0(I0.b(x0VarK.getType().K0(), j(oL2, x0Var.a())), x0VarK.a());
        }
        if (!(type.K0() instanceof C) && !(type.K0() instanceof X)) {
            x0 x0VarD = a02.d(type);
            if (x0VarD == null) {
                x0VarD = null;
            } else if (type.getAnnotations().i3(n.a.f407400z)) {
                q0 q0VarH0 = x0VarD.getType().H0();
                if (q0VarH0 instanceof kotlin.reflect.jvm.internal.impl.types.checker.m) {
                    x0 x0Var2 = ((kotlin.reflect.jvm.internal.impl.types.checker.m) q0VarH0).f410108a;
                    Variance varianceA = x0Var2.a();
                    c cVarC = c(x0Var.a(), varianceA);
                    c cVar = c.f410014d;
                    if (cVarC == cVar) {
                        x0VarD = new z0(x0Var2.getType());
                    } else if (g0Var != null && c(g0Var.o(), varianceA) == cVar) {
                        x0VarD = new z0(x0Var2.getType());
                    }
                }
            }
            Variance varianceA2 = x0Var.a();
            if (x0VarD == null && (type.K0() instanceof H)) {
                InterfaceC48806h interfaceC48806hK0 = type.K0();
                InterfaceC42995u interfaceC42995u = interfaceC48806hK0 instanceof InterfaceC42995u ? (InterfaceC42995u) interfaceC48806hK0 : null;
                if (!(interfaceC42995u != null ? interfaceC42995u.U() : false)) {
                    H h12 = (H) type.K0();
                    Y y12 = h12.f410024c;
                    int i13 = i12 + 1;
                    x0 x0VarK2 = k(new z0(y12, varianceA2), g0Var, i13);
                    Y y13 = h12.f410025d;
                    x0 x0VarK3 = k(new z0(y13, varianceA2), g0Var, i13);
                    return (x0VarK2.getType() == y12 && x0VarK3.getType() == y13) ? x0Var : new z0(P.c(C0.a(x0VarK2.getType()), C0.a(x0VarK3.getType())), x0VarK2.a());
                }
            }
            if (!kotlin.reflect.jvm.internal.impl.builtins.k.D(type) && !Q.a(type)) {
                if (x0VarD != null) {
                    c cVarC2 = c(varianceA2, x0VarD.a());
                    if (!(type.H0() instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b)) {
                        int iOrdinal = cVarC2.ordinal();
                        if (iOrdinal == 1) {
                            return new z0(type.H0().m().n(), Variance.f410071f);
                        }
                        if (iOrdinal == 2) {
                            throw new b("Out-projection in in-position");
                        }
                    }
                    InterfaceC48806h interfaceC48806hK02 = type.K0();
                    InterfaceC42995u interfaceC42995u2 = interfaceC48806hK02 instanceof InterfaceC42995u ? (InterfaceC42995u) interfaceC48806hK02 : null;
                    if (interfaceC42995u2 == null || !interfaceC42995u2.U()) {
                        interfaceC42995u2 = null;
                    }
                    if (x0VarD.c()) {
                        return x0VarD;
                    }
                    O oN2 = interfaceC42995u2 != null ? interfaceC42995u2.N(x0VarD.getType()) : G0.i(x0VarD.getType(), type.I0());
                    if (!type.getAnnotations().isEmpty()) {
                        kotlin.reflect.jvm.internal.impl.descriptors.annotations.g gVarC = a02.c(type.getAnnotations());
                        if (gVarC == null) {
                            a(33);
                            throw null;
                        }
                        if (gVarC.i3(n.a.f407400z)) {
                            gVarC = new kotlin.reflect.jvm.internal.impl.descriptors.annotations.m(gVarC, new D0());
                        }
                        oN2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.a.i(oN2, new kotlin.reflect.jvm.internal.impl.descriptors.annotations.l(oN2.getAnnotations(), gVarC));
                    }
                    if (cVarC2 == c.f410012b) {
                        varianceA2 = b(varianceA2, x0VarD.a());
                    }
                    return new z0(oN2, varianceA2);
                }
                O type2 = x0Var.getType();
                Variance varianceA3 = x0Var.a();
                if (type2.H0().b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0) {
                    return x0Var;
                }
                J0 j0K0 = type2.K0();
                C42959a c42959a = j0K0 instanceof C42959a ? (C42959a) j0K0 : null;
                Y y14 = c42959a != null ? c42959a.f410082d : null;
                if (y14 != null) {
                    if ((a02 instanceof L) && a02.b()) {
                        L l12 = (L) a02;
                        e02 = new E0(new L(l12.f410028b, l12.f410029c, false));
                    } else {
                        e02 = this;
                    }
                    oJ2 = e02.j(y14, Variance.f410069d);
                }
                List<kotlin.reflect.jvm.internal.impl.descriptors.g0> parameters = type2.H0().getParameters();
                List<x0> listF0 = type2.F0();
                ArrayList arrayList = new ArrayList(parameters.size());
                boolean z12 = false;
                for (int i14 = 0; i14 < parameters.size(); i14++) {
                    kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var2 = parameters.get(i14);
                    x0 x0Var3 = listF0.get(i14);
                    x0 x0VarK4 = k(x0Var3, g0Var2, i12 + 1);
                    int iOrdinal2 = c(g0Var2.o(), x0VarK4.a()).ordinal();
                    if (iOrdinal2 != 0) {
                        if (iOrdinal2 != 1) {
                            c12 = 2;
                            if (iOrdinal2 == 2) {
                            }
                        } else {
                            c12 = 2;
                        }
                        x0VarK4 = G0.k(g0Var2);
                    } else {
                        c12 = 2;
                        Variance varianceO = g0Var2.o();
                        Variance variance = Variance.f410069d;
                        if (varianceO != variance && !x0VarK4.c()) {
                            x0VarK4 = new z0(x0VarK4.getType(), variance);
                        }
                    }
                    if (x0VarK4 != x0Var3) {
                        z12 = true;
                    }
                    arrayList.add(x0VarK4);
                }
                if (z12) {
                    listF0 = arrayList;
                }
                O oC2 = C0.c(type2, listF0, a02.c(type2.getAnnotations()), 4);
                if ((oC2 instanceof Y) && (oJ2 instanceof Y)) {
                    oC2 = C42964c0.c((Y) oC2, (Y) oJ2);
                }
                return new z0(oC2, varianceA3);
            }
        }
        return x0Var;
    }
}
