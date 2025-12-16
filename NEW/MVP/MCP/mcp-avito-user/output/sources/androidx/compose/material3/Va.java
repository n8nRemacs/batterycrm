package androidx.compose.material3;

import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.h;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;

/* compiled from: NavigationBar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Va implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f35671a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C22096n f35672b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f35673c;

    public Va(Y41.a aVar, C22096n c22096n, boolean z12) {
        this.f35671a = aVar;
        this.f35672b = c22096n;
        this.f35673c = z12;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        InterfaceC22363h0 interfaceC22363h0;
        androidx.compose.ui.layout.K0 k0I;
        androidx.compose.ui.layout.K0 k0I2;
        Va va2 = this;
        float fFloatValue = va2.f35671a.invoke().floatValue();
        long jC2 = C22712b.c(j12, 0, 0, 0, 0, 10);
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            InterfaceC22363h0 interfaceC22363h02 = list.get(i12);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h02), "icon")) {
                androidx.compose.ui.layout.K0 k0I3 = interfaceC22363h02.I(jC2);
                int i13 = k0I3.f40345b;
                float f12 = 2;
                float f13 = Za.f35988d * f12;
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                int iY02 = interfaceC22369k0.y0(f13) + i13;
                int iB2 = kotlin.math.b.b(iY02 * fFloatValue);
                int iY03 = interfaceC22369k0.y0(Za.f35989e * f12) + k0I3.f40346c;
                int size2 = list.size();
                int i14 = 0;
                while (i14 < size2) {
                    InterfaceC22363h0 interfaceC22363h03 = list.get(i14);
                    int i15 = size2;
                    if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h03), "indicatorRipple")) {
                        C22712b.f42842b.getClass();
                        androidx.compose.ui.layout.K0 k0I4 = interfaceC22363h03.I(C22712b.a.c(iY02, iY03));
                        int size3 = list.size();
                        int i16 = 0;
                        while (true) {
                            if (i16 >= size3) {
                                interfaceC22363h0 = null;
                                break;
                            }
                            interfaceC22363h0 = list.get(i16);
                            int i17 = size3;
                            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h0), "indicator")) {
                                break;
                            }
                            i16++;
                            size3 = i17;
                        }
                        InterfaceC22363h0 interfaceC22363h04 = interfaceC22363h0;
                        if (interfaceC22363h04 != null) {
                            C22712b.f42842b.getClass();
                            k0I = interfaceC22363h04.I(C22712b.a.c(iB2, iY03));
                        } else {
                            k0I = null;
                        }
                        C22096n c22096n = va2.f35672b;
                        if (c22096n != null) {
                            int size4 = list.size();
                            for (int i18 = 0; i18 < size4; i18++) {
                                InterfaceC22363h0 interfaceC22363h05 = list.get(i18);
                                if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h05), "label")) {
                                    k0I2 = interfaceC22363h05.I(jC2);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        k0I2 = null;
                        if (c22096n == null) {
                            int iJ2 = C22712b.j(j12);
                            int iF2 = C22713c.f(interfaceC22369k0.y0(Za.f35985a), j12);
                            return interfaceC22369k0.L0(iJ2, iF2, kotlin.collections.P0.c(), new Xa((iJ2 - k0I3.f40345b) / 2, (iF2 - k0I3.f40346c) / 2, (iJ2 - k0I4.f40345b) / 2, (iF2 - k0I4.f40346c) / 2, iJ2, iF2, k0I, k0I3, k0I4));
                        }
                        float f14 = k0I3.f40346c;
                        float f15 = Za.f35989e;
                        float fM02 = interfaceC22369k0.M0(f15) + f14;
                        float f16 = Za.f35987c;
                        float fM03 = interfaceC22369k0.M0(f16) + fM02 + k0I2.f40346c;
                        float fA2 = kotlin.ranges.s.a((C22712b.k(j12) - fM03) / f12, interfaceC22369k0.M0(f15));
                        float f17 = (fA2 * f12) + fM03;
                        boolean z12 = va2.f35673c;
                        float f18 = ((z12 ? fA2 : (f17 - k0I3.f40346c) / f12) - fA2) * (1 - fFloatValue);
                        float fM04 = interfaceC22369k0.M0(f16) + interfaceC22369k0.M0(f15) + k0I3.f40346c + fA2;
                        int iJ3 = C22712b.j(j12);
                        return interfaceC22369k0.L0(iJ3, kotlin.math.b.b(f17), kotlin.collections.P0.c(), new Ya(k0I, z12, fFloatValue, k0I2, (iJ3 - k0I2.f40345b) / 2, fM04, f18, k0I3, (iJ3 - k0I3.f40345b) / 2, fA2, k0I4, (iJ3 - k0I4.f40345b) / 2, fA2 - interfaceC22369k0.M0(f15), iJ3, interfaceC22369k0));
                    }
                    i14++;
                    va2 = this;
                    size2 = i15;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i12++;
            va2 = this;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
