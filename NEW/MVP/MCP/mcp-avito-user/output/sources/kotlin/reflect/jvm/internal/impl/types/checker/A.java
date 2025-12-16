package kotlin.reflect.jvm.internal.impl.types.checker;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.o;
import kotlin.reflect.jvm.internal.impl.types.C42964c0;
import kotlin.reflect.jvm.internal.impl.types.C42997w;
import kotlin.reflect.jvm.internal.impl.types.J0;
import kotlin.reflect.jvm.internal.impl.types.K;
import kotlin.reflect.jvm.internal.impl.types.M;
import kotlin.reflect.jvm.internal.impl.types.O;
import kotlin.reflect.jvm.internal.impl.types.Y;
import kotlin.reflect.jvm.internal.impl.types.checker.p;
import kotlin.reflect.jvm.internal.impl.types.l0;
import kotlin.reflect.jvm.internal.impl.types.n0;

/* compiled from: IntersectionType.kt */
@s0
/* loaded from: classes8.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final A f410087a = new A();

    public static ArrayList a(AbstractCollection abstractCollection, Y41.p pVar) {
        ArrayList arrayList = new ArrayList(abstractCollection);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Y y12 = (Y) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Y y13 = (Y) it2.next();
                    if (y13 != y12 && ((Boolean) pVar.invoke(y13, y12)).booleanValue()) {
                        it.remove();
                        break;
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.reflect.jvm.internal.impl.types.n0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.reflect.jvm.internal.impl.types.n0, kotlin.reflect.jvm.internal.impl.util.a, kotlin.reflect.jvm.internal.impl.util.e] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Y61.k
    public final Y b(@Y61.k ArrayList arrayList) {
        Y yD2;
        arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Y y12 = (Y) it.next();
            if (y12.H0() instanceof M) {
                Collection<O> collectionC = y12.H0().C();
                ArrayList arrayList3 = new ArrayList(C42745f0.q(collectionC, 10));
                Iterator it2 = collectionC.iterator();
                while (it2.hasNext()) {
                    Y yB2 = K.b((O) it2.next());
                    if (y12.I0()) {
                        yB2 = yB2.L0(true);
                    }
                    arrayList3.add(yB2);
                }
                arrayList2.addAll(arrayList3);
            } else {
                arrayList2.add(y12);
            }
        }
        a aVarA = a.f410088b;
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            aVarA = aVarA.a((J0) it3.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Y yL02 = (Y) it4.next();
            if (aVarA == a.f410091e) {
                if (yL02 instanceof k) {
                    k kVar = (k) yL02;
                    yL02 = new k(kVar.f410101c, kVar.f410102d, kVar.f410103e, kVar.f410104f, kVar.f410105g, true);
                }
                Y yA2 = C42997w.a.a(C42997w.f410264e, yL02, false);
                yL02 = (yA2 == null && (yA2 = C42964c0.b(yL02)) == null) ? yL02.L0(false) : yA2;
            }
            linkedHashSet.add(yL02);
        }
        ArrayList arrayList4 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList4.add(((Y) it5.next()).G0());
        }
        Iterator it6 = arrayList4.iterator();
        if (!it6.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        ?? next = it6.next();
        while (it6.hasNext()) {
            n0 n0Var = (n0) it6.next();
            next = (n0) next;
            if (!next.isEmpty() || !n0Var.isEmpty()) {
                ArrayList arrayList5 = new ArrayList();
                Iterator<Integer> it7 = n0.f410236c.f410340a.values().iterator();
                while (it7.hasNext()) {
                    int iIntValue = it7.next().intValue();
                    l0 l0Var = (l0) next.f410277b.get(iIntValue);
                    l0 l0Var2 = (l0) n0Var.f410277b.get(iIntValue);
                    kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList5, l0Var == null ? l0Var2 != null ? l0Var2.c(l0Var) : null : l0Var.c(l0Var2));
                }
                next = n0.a.c(arrayList5);
            }
        }
        n0 n0Var2 = (n0) next;
        if (linkedHashSet.size() == 1) {
            yD2 = (Y) C42745f0.t0(linkedHashSet);
        } else {
            new B(linkedHashSet);
            ArrayList arrayListA = a(linkedHashSet, new C(2, this));
            arrayListA.isEmpty();
            kotlin.reflect.jvm.internal.impl.resolve.constants.o.f409593f.getClass();
            Y yA3 = o.a.a(arrayListA);
            if (yA3 != null) {
                yD2 = yA3;
            } else {
                p.f410117b.getClass();
                ArrayList arrayListA2 = a(arrayListA, new D(2, p.a.f410119b));
                arrayListA2.isEmpty();
                yD2 = arrayListA2.size() < 2 ? (Y) C42745f0.t0(arrayListA2) : new M(linkedHashSet).d();
            }
        }
        return yD2.N0(n0Var2);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IntersectionType.kt */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final c f410088b;

        /* renamed from: c, reason: collision with root package name */
        public static final C11696a f410089c;

        /* renamed from: d, reason: collision with root package name */
        public static final d f410090d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f410091e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ a[] f410092f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f410093g;

        /* compiled from: IntersectionType.kt */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.checker.A$a$a, reason: collision with other inner class name */
        public static final class C11696a extends a {
            public C11696a() {
                throw null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.A.a
            @Y61.k
            public final a a(@Y61.k J0 j02) {
                return a.b(j02);
            }
        }

        /* compiled from: IntersectionType.kt */
        public static final class c extends a {
            public c() {
                throw null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.A.a
            @Y61.k
            public final a a(@Y61.k J0 j02) {
                return a.b(j02);
            }
        }

        /* compiled from: IntersectionType.kt */
        public static final class d extends a {
            public d() {
                throw null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.A.a
            @Y61.k
            public final a a(@Y61.k J0 j02) {
                a aVarB = a.b(j02);
                return aVarB == a.f410089c ? this : aVarB;
            }
        }

        static {
            c cVar = new c("START", 0, null);
            f410088b = cVar;
            C11696a c11696a = new C11696a("ACCEPT_NULL", 1, null);
            f410089c = c11696a;
            d dVar = new d(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2, null);
            f410090d = dVar;
            b bVar = new b("NOT_NULL", 3, null);
            f410091e = bVar;
            a[] aVarArr = {cVar, c11696a, dVar, bVar};
            f410092f = aVarArr;
            f410093g = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public a(String str, int i12, C42822w c42822w) {
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (kotlin.reflect.jvm.internal.impl.types.C42963c.a(r3, r7, r4) != false) goto L9;
         */
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static kotlin.reflect.jvm.internal.impl.types.checker.A.a b(@Y61.k kotlin.reflect.jvm.internal.impl.types.J0 r7) {
            /*
                boolean r0 = r7.I0()
                if (r0 == 0) goto L9
                kotlin.reflect.jvm.internal.impl.types.checker.A$a$a r7 = kotlin.reflect.jvm.internal.impl.types.checker.A.a.f410089c
                goto L46
            L9:
                boolean r0 = r7 instanceof kotlin.reflect.jvm.internal.impl.types.C42997w
                kotlin.reflect.jvm.internal.impl.types.checker.A$a$b r1 = kotlin.reflect.jvm.internal.impl.types.checker.A.a.f410091e
                if (r0 == 0) goto L1a
                r0 = r7
                kotlin.reflect.jvm.internal.impl.types.w r0 = (kotlin.reflect.jvm.internal.impl.types.C42997w) r0
                kotlin.reflect.jvm.internal.impl.types.Y r0 = r0.f410265c
                boolean r0 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.C42980h0
                if (r0 == 0) goto L1a
            L18:
                r7 = r1
                goto L46
            L1a:
                boolean r0 = r7 instanceof kotlin.reflect.jvm.internal.impl.types.C42980h0
                kotlin.reflect.jvm.internal.impl.types.checker.A$a$d r2 = kotlin.reflect.jvm.internal.impl.types.checker.A.a.f410090d
                if (r0 == 0) goto L22
            L20:
                r7 = r2
                goto L46
            L22:
                kotlin.reflect.jvm.internal.impl.types.checker.s r0 = kotlin.reflect.jvm.internal.impl.types.checker.s.f410123a
                r0.getClass()
                kotlin.reflect.jvm.internal.impl.types.c r0 = kotlin.reflect.jvm.internal.impl.types.C42963c.f410086a
                kotlin.reflect.jvm.internal.impl.types.checker.u r3 = kotlin.reflect.jvm.internal.impl.types.checker.u.f410124a
                r3.getClass()
                r4 = 0
                r5 = 0
                r6 = 24
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState r3 = kotlin.reflect.jvm.internal.impl.types.checker.C42965a.a(r4, r3, r5, r5, r6)
                kotlin.reflect.jvm.internal.impl.types.Y r7 = kotlin.reflect.jvm.internal.impl.types.K.a(r7)
                kotlin.reflect.jvm.internal.impl.types.TypeCheckerState$b$b r4 = kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.b.C11695b.f410062a
                r0.getClass()
                boolean r7 = kotlin.reflect.jvm.internal.impl.types.C42963c.a(r3, r7, r4)
                if (r7 == 0) goto L20
                goto L18
            L46:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.checker.A.a.b(kotlin.reflect.jvm.internal.impl.types.J0):kotlin.reflect.jvm.internal.impl.types.checker.A$a");
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f410092f.clone();
        }

        @Y61.k
        public abstract a a(@Y61.k J0 j02);

        /* compiled from: IntersectionType.kt */
        public static final class b extends a {
            public b() {
                throw null;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.A.a
            public final a a(J0 j02) {
                return this;
            }
        }
    }
}
