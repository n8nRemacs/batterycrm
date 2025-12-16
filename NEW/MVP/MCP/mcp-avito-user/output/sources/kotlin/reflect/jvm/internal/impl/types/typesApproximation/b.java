package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import Y41.l;
import Y61.k;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.types.E0;
import kotlin.reflect.jvm.internal.impl.types.G0;
import kotlin.reflect.jvm.internal.impl.types.H;
import kotlin.reflect.jvm.internal.impl.types.I0;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.K;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.P;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42970f;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.x0;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* compiled from: CapturedTypeApproximation.kt */
@s0
/* loaded from: classes8.dex */
public final class b {

    /* compiled from: CapturedTypeApproximation.kt */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Variance variance = Variance.f410069d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Variance variance2 = Variance.f410069d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: CapturedTypeApproximation.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.types.typesApproximation.b$b, reason: collision with other inner class name */
    public static final class C11698b extends N implements l<J0, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public static final C11698b f410251l = new C11698b();

        public C11698b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(J0 j02) {
            return Boolean.valueOf(j02.H0() instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b);
        }
    }

    @k
    public static final kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<O> a(@k O o12) {
        e eVar;
        if (o12.K0() instanceof H) {
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<O> aVarA = a(K.a(o12));
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<O> aVarA2 = a(K.b(o12));
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(I0.b(P.c(K.a(aVarA.f410249a), K.b(aVarA2.f410249a)), I0.a(o12)), I0.b(P.c(K.a(aVarA.f410250b), K.b(aVarA2.f410250b)), I0.a(o12)));
        }
        q0 q0VarH0 = o12.H0();
        boolean z12 = true;
        if (o12.H0() instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b) {
            x0 x0VarH = ((kotlin.reflect.jvm.internal.impl.resolve.calls.inference.b) q0VarH0).h();
            O oI2 = G0.i(x0VarH.getType(), o12.I0());
            int iOrdinal = x0VarH.a().ordinal();
            if (iOrdinal == 1) {
                return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(oI2, o12.H0().m().n());
            }
            if (iOrdinal == 2) {
                return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(G0.i(o12.H0().m().m(), o12.I0()), oI2);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + x0VarH);
        }
        if (o12.F0().isEmpty() || o12.F0().size() != q0VarH0.getParameters().size()) {
            return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(o12, o12);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = C42745f0.T0(o12.F0(), q0VarH0.getParameters()).iterator();
        while (it.hasNext()) {
            Q q12 = (Q) it.next();
            x0 x0Var = (x0) q12.f406619b;
            g0 g0Var = (g0) q12.f406620c;
            Variance varianceO = g0Var.o();
            if (varianceO == null) {
                E0.a(35);
                throw null;
            }
            if (x0Var == null) {
                E0.a(36);
                throw null;
            }
            E0 e02 = E0.f410009b;
            int iOrdinal2 = (x0Var.c() ? Variance.f410071f : E0.b(varianceO, x0Var.a())).ordinal();
            if (iOrdinal2 == 0) {
                eVar = new e(g0Var, x0Var.getType(), x0Var.getType());
            } else if (iOrdinal2 == 1) {
                eVar = new e(g0Var, x0Var.getType(), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(g0Var).n());
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                eVar = new e(g0Var, kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.c.e(g0Var).m(), x0Var.getType());
            }
            if (x0Var.c()) {
                arrayList.add(eVar);
                arrayList2.add(eVar);
            } else {
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<O> aVarA3 = a(eVar.f410253b);
                O o13 = aVarA3.f410249a;
                O o14 = aVarA3.f410250b;
                kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<O> aVarA4 = a(eVar.f410254c);
                O o15 = aVarA4.f410249a;
                O o16 = aVarA4.f410250b;
                g0 g0Var2 = eVar.f410252a;
                e eVar2 = new e(g0Var2, o14, o15);
                e eVar3 = new e(g0Var2, o13, o16);
                arrayList.add(eVar2);
                arrayList2.add(eVar3);
            }
        }
        if (arrayList.isEmpty()) {
            z12 = false;
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                e eVar4 = (e) it2.next();
                eVar4.getClass();
                if (!InterfaceC42970f.f410097a.d(eVar4.f410253b, eVar4.f410254c)) {
                    break;
                }
            }
            z12 = false;
        }
        return new kotlin.reflect.jvm.internal.impl.types.typesApproximation.a<>(z12 ? o12.H0().m().m() : c(o12, arrayList), c(o12, arrayList2));
    }

    @Y61.l
    public static final x0 b(@Y61.l x0 x0Var, boolean z12) {
        if (x0Var == null) {
            return null;
        }
        if (x0Var.c()) {
            return x0Var;
        }
        O type = x0Var.getType();
        if (!G0.c(type, C11698b.f410251l)) {
            return x0Var;
        }
        Variance varianceA = x0Var.a();
        if (varianceA == Variance.f410071f) {
            return new z0(a(type).f410250b, varianceA);
        }
        if (z12) {
            return new z0(a(type).f410249a, varianceA);
        }
        E0 e0E = E0.e(new c());
        if (e0E.f410010a.e()) {
            return x0Var;
        }
        try {
            return e0E.k(x0Var, null, 0);
        } catch (E0.b unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.types.O c(kotlin.reflect.jvm.internal.impl.types.O r7, java.util.ArrayList r8) {
        /*
            java.util.List r0 = r7.F0()
            r0.size()
            r8.size()
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.C42745f0.q(r8, r1)
            r0.<init>(r1)
            java.util.Iterator r8 = r8.iterator()
        L19:
            boolean r1 = r8.hasNext()
            r2 = 0
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r8.next()
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.e r1 = (kotlin.reflect.jvm.internal.impl.types.typesApproximation.e) r1
            r1.getClass()
            kotlin.reflect.jvm.internal.impl.types.checker.q r3 = kotlin.reflect.jvm.internal.impl.types.checker.InterfaceC42970f.f410097a
            kotlin.reflect.jvm.internal.impl.types.O r4 = r1.f410253b
            kotlin.reflect.jvm.internal.impl.types.O r5 = r1.f410254c
            r3.d(r4, r5)
            boolean r3 = kotlin.jvm.internal.L.f(r4, r5)
            if (r3 != 0) goto L91
            kotlin.reflect.jvm.internal.impl.descriptors.g0 r1 = r1.f410252a
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = r1.o()
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.f410070e
            if (r3 != r6) goto L43
            goto L91
        L43:
            boolean r3 = kotlin.reflect.jvm.internal.impl.builtins.k.D(r4)
            if (r3 == 0) goto L5f
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = r1.o()
            if (r3 == r6) goto L5f
            kotlin.reflect.jvm.internal.impl.types.z0 r2 = new kotlin.reflect.jvm.internal.impl.types.z0
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.f410071f
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r1.o()
            if (r3 != r1) goto L5b
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.f410069d
        L5b:
            r2.<init>(r5, r3)
            goto L96
        L5f:
            if (r5 == 0) goto L8b
            boolean r2 = kotlin.reflect.jvm.internal.impl.builtins.k.w(r5)
            if (r2 == 0) goto L7b
            boolean r2 = r5.I0()
            if (r2 == 0) goto L7b
            kotlin.reflect.jvm.internal.impl.types.z0 r2 = new kotlin.reflect.jvm.internal.impl.types.z0
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r1.o()
            if (r6 != r1) goto L77
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.f410069d
        L77:
            r2.<init>(r4, r6)
            goto L96
        L7b:
            kotlin.reflect.jvm.internal.impl.types.z0 r2 = new kotlin.reflect.jvm.internal.impl.types.z0
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.f410071f
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r1.o()
            if (r3 != r1) goto L87
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = kotlin.reflect.jvm.internal.impl.types.Variance.f410069d
        L87:
            r2.<init>(r5, r3)
            goto L96
        L8b:
            r7 = 141(0x8d, float:1.98E-43)
            kotlin.reflect.jvm.internal.impl.builtins.k.a(r7)
            throw r2
        L91:
            kotlin.reflect.jvm.internal.impl.types.z0 r2 = new kotlin.reflect.jvm.internal.impl.types.z0
            r2.<init>(r4)
        L96:
            r0.add(r2)
            goto L19
        L9b:
            r8 = 6
            kotlin.reflect.jvm.internal.impl.types.O r7 = kotlin.reflect.jvm.internal.impl.types.C0.c(r7, r0, r2, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.typesApproximation.b.c(kotlin.reflect.jvm.internal.impl.types.O, java.util.ArrayList):kotlin.reflect.jvm.internal.impl.types.O");
    }
}
