package androidx.compose.runtime;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22039c2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: Composer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "message", "", "d", "(Ljava/lang/String;)Ljava/lang/Void;", "Lkotlin/G0;", "c", "(Ljava/lang/String;)V", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final G1 f37968a = new G1("provider");

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final G1 f37969b = new G1("provider");

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final G1 f37970c = new G1("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final G1 f37971d = new G1("providers");

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final G1 f37972e = new G1("reference");

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final F f37973f = new F();

    public static final void a(ArrayList arrayList, int i12, int i13) {
        int iG2 = g(i12, arrayList);
        if (iG2 < 0) {
            iG2 = -(iG2 + 1);
        }
        while (iG2 < arrayList.size() && ((M0) arrayList.get(iG2)).f38046b < i13) {
            arrayList.remove(iG2);
        }
    }

    public static final void b(K2 k22, ArrayList arrayList, int i12) {
        if (k22.j(i12)) {
            arrayList.add(k22.l(i12));
            return;
        }
        int[] iArr = k22.f37998b;
        int i13 = iArr[(i12 * 5) + 3] + i12;
        for (int i14 = i12 + 1; i14 < i13; i14 += iArr[(i14 * 5) + 3]) {
            b(k22, arrayList, i14);
        }
    }

    public static final void c(@Y61.k String str) {
        throw new ComposeRuntimeError(AK.c.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    @Y61.k
    public static final Void d(@Y61.k String str) {
        throw new ComposeRuntimeError(AK.c.k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void e(@Y61.k O2 o22, @Y61.k androidx.compose.runtime.internal.L l12) {
        int iO2;
        int[] iArr = o22.f38069b;
        int i12 = o22.f38087t;
        int iF2 = o22.f(o22.q(o22.s(i12) + i12), iArr);
        for (int iF3 = o22.f(o22.q(o22.f38087t), o22.f38069b); iF3 < iF2; iF3++) {
            Object obj = o22.f38070c[o22.g(iF3)];
            int iC2 = -1;
            if (obj instanceof InterfaceC22198x) {
                l12.e((InterfaceC22198x) obj, o22.o() - iF3, -1, -1);
            } else if (obj instanceof C2) {
                C2 c22 = (C2) obj;
                if (!(c22.f37941a instanceof F2)) {
                    i(o22, iF3, obj);
                    int iO3 = o22.o() - iF3;
                    C22068g c22068g = c22.f37942b;
                    if (c22068g == null || !c22068g.a()) {
                        iO2 = -1;
                    } else {
                        iC2 = o22.c(c22068g);
                        iO2 = o22.o() - o22.O(iC2);
                    }
                    l12.e(c22, iO3, iC2, iO2);
                }
            } else if (obj instanceof C22039c2) {
                i(o22, iF3, obj);
                ((C22039c2) obj).c();
            }
        }
    }

    @Y61.k
    public static final C22153s1 f(@Y61.k InterfaceC22053d0 interfaceC22053d0, @Y61.k C22183t1 c22183t1, @Y61.k O2 o22, @Y61.l InterfaceC22078i<?> interfaceC22078i) {
        Object obj;
        L2 l22 = new L2();
        if (o22.f38072e != null) {
            l22.b();
        }
        if (o22.f38073f != null) {
            l22.f38022l = new androidx.collection.A0<>(0, 1, null);
        }
        int i12 = o22.f38087t;
        if (interfaceC22078i != null && o22.D(i12) > 0) {
            int iE2 = o22.f38089v;
            while (iE2 > 0 && !o22.w(iE2)) {
                iE2 = o22.E(iE2, o22.f38069b);
            }
            if (iE2 >= 0 && o22.w(iE2)) {
                Object objC = o22.C(iE2);
                int i13 = iE2 + 1;
                int iS2 = o22.s(iE2) + iE2;
                int iD2 = 0;
                while (i13 < iS2) {
                    int iS3 = o22.s(i13) + i13;
                    if (iS3 > i12) {
                        break;
                    }
                    iD2 += o22.w(i13) ? 1 : o22.D(i13);
                    i13 = iS3;
                }
                int iD3 = o22.w(i12) ? 1 : o22.D(i12);
                interfaceC22078i.e(objC);
                interfaceC22078i.f(iD2, iD3);
                interfaceC22078i.j();
            }
        }
        O2 o2E = l22.e();
        try {
            o2E.d();
            o2E.R(126665345, c22183t1.f38765a);
            O2.x(o2E);
            o2E.U(c22183t1.f38766b);
            List listB = o22.B(c22183t1.f38769e, o2E);
            o2E.K();
            o2E.i();
            o2E.j();
            o2E.e(true);
            C22153s1 c22153s1 = new C22153s1(l22);
            C22039c2.f38180h.getClass();
            List list = listB;
            if (!list.isEmpty()) {
                int size = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size) {
                        break;
                    }
                    C22068g c22068g = (C22068g) listB.get(i14);
                    if (l22.g(c22068g)) {
                        int iA2 = l22.a(c22068g);
                        int iD4 = N2.d(iA2, l22.f38012b);
                        int i15 = iA2 + 1;
                        if ((i15 < l22.f38013c ? l22.f38012b[(i15 * 5) + 4] : l22.f38014d.length) - iD4 > 0) {
                            obj = l22.f38014d[iD4];
                        } else {
                            A.f37866a.getClass();
                            obj = A.a.f37868b;
                        }
                        if (obj instanceof C22039c2) {
                            a aVar = new a(interfaceC22053d0, c22183t1);
                            o2E = l22.e();
                            try {
                                C22039c2.f38180h.getClass();
                                C22039c2.a.a(o2E, listB, aVar);
                                kotlin.G0 g02 = kotlin.G0.f406611a;
                                o2E.e(true);
                                break;
                            } finally {
                            }
                        }
                    }
                    i14++;
                }
            }
            return c22153s1;
        } finally {
        }
    }

    public static final int g(int i12, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i13 = 0;
        while (i13 <= size) {
            int i14 = (i13 + size) >>> 1;
            int iG2 = kotlin.jvm.internal.L.g(((M0) arrayList.get(i14)).f38046b, i12);
            if (iG2 < 0) {
                i13 = i14 + 1;
            } else {
                if (iG2 <= 0) {
                    return i14;
                }
                size = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    public static final void h(@Y61.k O2 o22, @Y61.k androidx.compose.runtime.internal.L l12) {
        int iO2;
        int[] iArr = o22.f38069b;
        int i12 = o22.f38087t;
        int iF2 = o22.f(o22.q(o22.s(i12) + i12), iArr);
        for (int iF3 = o22.f(o22.q(o22.f38087t), o22.f38069b); iF3 < iF2; iF3++) {
            Object obj = o22.f38070c[o22.g(iF3)];
            int iC2 = -1;
            if (obj instanceof InterfaceC22198x) {
                int iO3 = o22.o() - iF3;
                InterfaceC22198x interfaceC22198x = (InterfaceC22198x) obj;
                androidx.collection.S0<InterfaceC22198x> s0A = l12.f38433f;
                if (s0A == null) {
                    s0A = androidx.collection.k1.a();
                    l12.f38433f = s0A;
                }
                s0A.m(interfaceC22198x);
                l12.e(interfaceC22198x, iO3, -1, -1);
            }
            if (obj instanceof C2) {
                int iO4 = o22.o() - iF3;
                C2 c22 = (C2) obj;
                C22068g c22068g = c22.f37942b;
                if (c22068g == null || !c22068g.a()) {
                    iO2 = -1;
                } else {
                    iC2 = o22.c(c22068g);
                    iO2 = o22.o() - o22.O(iC2);
                }
                l12.e(c22, iO4, iC2, iO2);
            }
            if (obj instanceof C22039c2) {
                ((C22039c2) obj).c();
            }
        }
        o22.H();
    }

    public static final void i(O2 o22, int i12, Object obj) {
        int iG2 = o22.g(i12);
        Object[] objArr = o22.f38070c;
        Object obj2 = objArr[iG2];
        A.f37866a.getClass();
        objArr[iG2] = A.a.f37868b;
        if (obj == obj2) {
            return;
        }
        c("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    /* compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/runtime/G$a", "Landroidx/compose/runtime/g2;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC22071g2 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22053d0 f37974b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C22183t1 f37975c;

        public a(InterfaceC22053d0 interfaceC22053d0, C22183t1 c22183t1) {
            this.f37974b = interfaceC22053d0;
            this.f37975c = c22183t1;
        }

        @Override // androidx.compose.runtime.InterfaceC22071g2
        public final InvalidationResult f(C22039c2 c22039c2, Object obj) {
            InvalidationResult invalidationResultF;
            InterfaceC22053d0 interfaceC22053d0 = this.f37974b;
            InterfaceC22071g2 interfaceC22071g2 = interfaceC22053d0 instanceof InterfaceC22071g2 ? (InterfaceC22071g2) interfaceC22053d0 : null;
            if (interfaceC22071g2 == null || (invalidationResultF = interfaceC22071g2.f(c22039c2, obj)) == null) {
                invalidationResultF = InvalidationResult.f37981b;
            }
            if (invalidationResultF != InvalidationResult.f37981b) {
                return invalidationResultF;
            }
            C22183t1 c22183t1 = this.f37975c;
            c22183t1.f38770f = C42745f0.i0(new kotlin.Q(c22039c2, obj), (Collection) c22183t1.f38770f);
            return InvalidationResult.f37982c;
        }

        @Override // androidx.compose.runtime.InterfaceC22071g2
        public final void d() {
        }

        @Override // androidx.compose.runtime.InterfaceC22071g2
        public final void a(Object obj) {
        }
    }
}
