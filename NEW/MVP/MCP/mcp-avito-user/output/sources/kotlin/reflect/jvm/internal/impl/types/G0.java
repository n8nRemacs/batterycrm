package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C42745f0;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC42851d;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.utils.g;

/* compiled from: TypeUtils.java */
/* loaded from: classes8.dex */
public class G0 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.types.error.f f410019a = kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410161m, new String[0]);

    /* renamed from: b, reason: collision with root package name */
    public static final kotlin.reflect.jvm.internal.impl.types.error.f f410020b = kotlin.reflect.jvm.internal.impl.types.error.h.b(ErrorTypeKind.f410158j, new String[0]);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f410021c = new a("NO_EXPECTED_TYPE");

    /* renamed from: d, reason: collision with root package name */
    public static final a f410022d = new a("UNIT_EXPECTED_TYPE");

    /* compiled from: TypeUtils.java */
    public static class a extends AbstractC42999y {

        /* renamed from: c, reason: collision with root package name */
        public final String f410023c;

        public a(String str) {
            this.f410023c = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static /* synthetic */ void T0(int r9) {
            /*
                r0 = 4
                r1 = 1
                if (r9 == r1) goto L9
                if (r9 == r0) goto L9
                java.lang.String r2 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                goto Lb
            L9:
                java.lang.String r2 = "@NotNull method %s.%s must not return null"
            Lb:
                r3 = 3
                r4 = 2
                if (r9 == r1) goto L13
                if (r9 == r0) goto L13
                r5 = r3
                goto L14
            L13:
                r5 = r4
            L14:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType"
                r7 = 0
                if (r9 == r1) goto L30
                if (r9 == r4) goto L2b
                if (r9 == r3) goto L26
                if (r9 == r0) goto L30
                java.lang.String r8 = "newAttributes"
                r5[r7] = r8
                goto L32
            L26:
                java.lang.String r8 = "kotlinTypeRefiner"
                r5[r7] = r8
                goto L32
            L2b:
                java.lang.String r8 = "delegate"
                r5[r7] = r8
                goto L32
            L30:
                r5[r7] = r6
            L32:
                java.lang.String r7 = "refine"
                if (r9 == r1) goto L3e
                if (r9 == r0) goto L3b
                r5[r1] = r6
                goto L42
            L3b:
                r5[r1] = r7
                goto L42
            L3e:
                java.lang.String r6 = "toString"
                r5[r1] = r6
            L42:
                if (r9 == r1) goto L56
                if (r9 == r4) goto L52
                if (r9 == r3) goto L4f
                if (r9 == r0) goto L56
                java.lang.String r3 = "replaceAttributes"
                r5[r4] = r3
                goto L56
            L4f:
                r5[r4] = r7
                goto L56
            L52:
                java.lang.String r3 = "replaceDelegate"
                r5[r4] = r3
            L56:
                java.lang.String r2 = java.lang.String.format(r2, r5)
                if (r9 == r1) goto L64
                if (r9 == r0) goto L64
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                r9.<init>(r2)
                goto L69
            L64:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r9.<init>(r2)
            L69:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.G0.a.T0(int):void");
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y, kotlin.reflect.jvm.internal.impl.types.O
        @Y61.k
        /* renamed from: J0 */
        public final O M0(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
            if (iVar != null) {
                return this;
            }
            T0(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.Y, kotlin.reflect.jvm.internal.impl.types.J0
        @Y61.k
        public final /* bridge */ /* synthetic */ J0 L0(boolean z12) {
            L0(z12);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y, kotlin.reflect.jvm.internal.impl.types.J0
        @Y61.k
        /* renamed from: M0 */
        public final J0 J0(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
            if (iVar != null) {
                return this;
            }
            T0(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.Y, kotlin.reflect.jvm.internal.impl.types.J0
        @Y61.k
        public final /* bridge */ /* synthetic */ J0 N0(@Y61.k n0 n0Var) {
            N0(n0Var);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.Y
        @Y61.k
        /* renamed from: O0 */
        public final Y L0(boolean z12) {
            throw new IllegalStateException(this.f410023c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.Y
        @Y61.k
        /* renamed from: P0 */
        public final Y N0(@Y61.k n0 n0Var) {
            if (n0Var != null) {
                throw new IllegalStateException(this.f410023c);
            }
            T0(0);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
        @Y61.k
        public final Y Q0() {
            throw new IllegalStateException(this.f410023c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
        @Y61.k
        /* renamed from: R0 */
        public final Y J0(@Y61.k kotlin.reflect.jvm.internal.impl.types.checker.i iVar) {
            if (iVar != null) {
                return this;
            }
            T0(3);
            throw null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.AbstractC42999y
        @Y61.k
        public final AbstractC42999y S0(@Y61.k Y y12) {
            throw new IllegalStateException(this.f410023c);
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.Y
        @Y61.k
        public final String toString() {
            String str = this.f410023c;
            if (str != null) {
                return str;
            }
            T0(1);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r27) {
        /*
            Method dump skipped, instructions count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.G0.a(int):void");
    }

    public static boolean b(@Y61.k O o12) {
        if (o12 == null) {
            a(28);
            throw null;
        }
        if (o12.I0()) {
            return true;
        }
        return (o12.K0() instanceof H) && b(((H) o12.K0()).f410025d);
    }

    public static boolean c(@Y61.l O o12, @Y61.k Y41.l<J0, Boolean> lVar) {
        if (lVar != null) {
            return d(o12, lVar, null);
        }
        a(43);
        throw null;
    }

    public static boolean d(@Y61.l O o12, @Y61.k Y41.l<J0, Boolean> lVar, kotlin.reflect.jvm.internal.impl.utils.g<O> gVar) {
        if (lVar == null) {
            a(44);
            throw null;
        }
        if (o12 == null) {
            return false;
        }
        J0 j0K0 = o12.K0();
        if (n(o12)) {
            return lVar.invoke(j0K0).booleanValue();
        }
        if (gVar != null && gVar.contains(o12)) {
            return false;
        }
        if (lVar.invoke(j0K0).booleanValue()) {
            return true;
        }
        if (gVar == null) {
            kotlin.reflect.jvm.internal.impl.utils.g.f410367d.getClass();
            gVar = g.b.a();
        }
        gVar.add(o12);
        H h12 = j0K0 instanceof H ? (H) j0K0 : null;
        if (h12 != null && (d(h12.f410024c, lVar, gVar) || d(h12.f410025d, lVar, gVar))) {
            return true;
        }
        if ((j0K0 instanceof C42997w) && d(((C42997w) j0K0).f410265c, lVar, gVar)) {
            return true;
        }
        q0 q0VarH0 = o12.H0();
        if (q0VarH0 instanceof M) {
            Iterator<O> it = ((M) q0VarH0).f410032b.iterator();
            while (it.hasNext()) {
                if (d(it.next(), lVar, gVar)) {
                    return true;
                }
            }
            return false;
        }
        for (x0 x0Var : o12.F0()) {
            if (!x0Var.c() && d(x0Var.getType(), lVar, gVar)) {
                return true;
            }
        }
        return false;
    }

    @Y61.k
    public static List<x0> e(@Y61.k List<kotlin.reflect.jvm.internal.impl.descriptors.g0> list) {
        if (list == null) {
            a(16);
            throw null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.g0> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new z0(it.next().q()));
        }
        List<x0> listM0 = C42745f0.M0(arrayList);
        if (listM0 != null) {
            return listM0;
        }
        a(17);
        throw null;
    }

    public static boolean f(@Y61.k O o12) {
        if (o12 == null) {
            a(27);
            throw null;
        }
        if (o12.I0()) {
            return true;
        }
        if ((o12.K0() instanceof H) && f(((H) o12.K0()).f410025d)) {
            return true;
        }
        if (o12.K0() instanceof C42997w) {
            return false;
        }
        if (!g(o12)) {
            if (o12 instanceof AbstractC42973e) {
                throw null;
            }
            q0 q0VarH0 = o12.H0();
            if (q0VarH0 instanceof M) {
                Iterator<O> it = ((M) q0VarH0).f410032b.iterator();
                while (it.hasNext()) {
                    if (f(it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (o12 == null) {
            a(29);
            throw null;
        }
        if (o12.H0().b() instanceof InterfaceC42851d) {
            return false;
        }
        E0 e0D = E0.d(o12);
        Collection<O> collectionC = o12.H0().C();
        ArrayList arrayList = new ArrayList(collectionC.size());
        for (O o13 : collectionC) {
            if (o13 == null) {
                a(21);
                throw null;
            }
            O oJ2 = e0D.j(o13, Variance.f410069d);
            O oI2 = oJ2 != null ? i(oJ2, o12.I0()) : null;
            if (oI2 != null) {
                arrayList.add(oI2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (f((O) it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(@Y61.k O o12) {
        if (o12 != null) {
            return (o12.H0().b() instanceof kotlin.reflect.jvm.internal.impl.descriptors.g0 ? (kotlin.reflect.jvm.internal.impl.descriptors.g0) o12.H0().b() : null) != null || (o12.H0() instanceof kotlin.reflect.jvm.internal.impl.types.checker.r);
        }
        a(60);
        throw null;
    }

    @Y61.k
    public static J0 h(@Y61.k O o12, boolean z12) {
        if (o12 == null) {
            a(3);
            throw null;
        }
        J0 j0L0 = o12.K0().L0(z12);
        if (j0L0 != null) {
            return j0L0;
        }
        a(4);
        throw null;
    }

    @Y61.k
    public static O i(@Y61.k O o12, boolean z12) {
        if (o12 != null) {
            return z12 ? h(o12, true) : o12;
        }
        a(8);
        throw null;
    }

    @Y61.k
    public static Y j(@Y61.k Y y12, boolean z12) {
        if (y12 == null) {
            a(5);
            throw null;
        }
        if (!z12) {
            return y12;
        }
        Y yL02 = y12.L0(true);
        if (yL02 != null) {
            return yL02;
        }
        a(6);
        throw null;
    }

    @Y61.k
    public static C42974e0 k(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var) {
        if (g0Var != null) {
            return new C42974e0(g0Var);
        }
        a(45);
        throw null;
    }

    @Y61.k
    public static y0 l(@Y61.k kotlin.reflect.jvm.internal.impl.descriptors.g0 g0Var, F f12) {
        if (g0Var != null) {
            return f12.b() == TypeUsage.f410065b ? new z0(C42978g0.a(g0Var)) : new C42974e0(g0Var);
        }
        a(46);
        throw null;
    }

    @Y61.k
    public static Y m(@Y61.k q0 q0Var, @Y61.k kotlin.reflect.jvm.internal.impl.resolve.scopes.j jVar, @Y61.k Y41.l<kotlin.reflect.jvm.internal.impl.types.checker.i, Y> lVar) {
        if (q0Var == null) {
            a(12);
            throw null;
        }
        if (jVar == null) {
            a(13);
            throw null;
        }
        List<x0> listE = e(q0Var.getParameters());
        n0.f410236c.getClass();
        return P.g(n0.f410237d, q0Var, listE, false, jVar, lVar);
    }

    public static boolean n(@Y61.k O o12) {
        if (o12 != null) {
            return o12 == f410021c || o12 == f410022d;
        }
        a(0);
        throw null;
    }
}
