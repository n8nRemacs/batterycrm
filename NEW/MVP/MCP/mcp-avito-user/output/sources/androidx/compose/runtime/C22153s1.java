package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: Composer.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/s1;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K0
/* renamed from: androidx.compose.runtime.s1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22153s1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final L2 f38558a;

    public C22153s1(@Y61.k L2 l22) {
        this.f38558a = l22;
    }

    public static final void a(O2 o22, int i12) {
        while (o22.f38089v >= 0 && o22.f38088u <= i12) {
            o22.L();
            o22.i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Y61.k
    public final androidx.collection.R0 b(@Y61.k InterfaceC22078i interfaceC22078i, @Y61.k androidx.collection.Z0 z02) {
        L2 l22;
        int i12;
        Object[] objArr = z02.f25659a;
        int i13 = z02.f25660b;
        int i14 = 0;
        while (true) {
            l22 = this.f38558a;
            if (i14 >= i13) {
                break;
            }
            if (l22.g(((C22183t1) objArr[i14]).f38769e)) {
                i14++;
            } else {
                androidx.collection.N0 n02 = new androidx.collection.N0(0, 1, null);
                Object[] objArr2 = z02.f25659a;
                int i15 = z02.f25660b;
                for (int i16 = 0; i16 < i15; i16++) {
                    Object obj = objArr2[i16];
                    if (l22.g(((C22183t1) obj).f38769e)) {
                        n02.f(obj);
                    }
                }
                z02 = n02;
            }
        }
        C22148r1 c22148r1 = new C22148r1(this);
        if (z02.f25660b > 1) {
            Comparable comparable = (Comparable) c22148r1.invoke(z02.b(0));
            int i17 = z02.f25660b;
            int i18 = 1;
            while (true) {
                if (i18 >= i17) {
                    break;
                }
                Comparable comparable2 = (Comparable) c22148r1.invoke(z02.b(i18));
                if (comparable.compareTo(comparable2) > 0) {
                    androidx.collection.N0 n03 = new androidx.collection.N0(z02.f25660b, null);
                    Object[] objArr3 = z02.f25659a;
                    int i19 = z02.f25660b;
                    for (int i22 = 0; i22 < i19; i22++) {
                        n03.f(objArr3[i22]);
                    }
                    List listH = n03.h();
                    if (listH.size() > 1) {
                        C42745f0.z0(listH, new androidx.compose.runtime.collection.b(c22148r1));
                    }
                    z02 = n03;
                } else {
                    i18++;
                    comparable = comparable2;
                }
            }
        }
        if (z02.d()) {
            return androidx.collection.i1.f25728b;
        }
        androidx.collection.R0 r0B = androidx.collection.i1.b();
        O2 o2E = l22.e();
        try {
            Object[] objArr4 = z02.f25659a;
            int i23 = z02.f25660b;
            for (int i24 = 0; i24 < i23; i24++) {
                C22183t1 c22183t1 = (C22183t1) objArr4[i24];
                int iC2 = o2E.c(c22183t1.f38769e);
                int iE2 = o2E.E(iC2, o2E.f38069b);
                a(o2E, iE2);
                a(o2E, iE2);
                while (true) {
                    i12 = o2E.f38087t;
                    if (i12 == iE2 || i12 == o2E.f38088u) {
                        break;
                    }
                    if (iE2 < o2E.s(i12) + i12) {
                        o2E.Q();
                    } else {
                        o2E.K();
                    }
                }
                if (i12 != iE2) {
                    G.c("Unexpected slot table structure");
                }
                o2E.Q();
                o2E.a(iC2 - o2E.f38087t);
                r0B.m(c22183t1, G.f(c22183t1.f38767c, c22183t1, o2E, interfaceC22078i));
            }
            a(o2E, Integer.MAX_VALUE);
            kotlin.G0 g02 = kotlin.G0.f406611a;
            o2E.e(true);
            return r0B;
        } catch (Throwable th2) {
            o2E.e(false);
            throw th2;
        }
    }
}
