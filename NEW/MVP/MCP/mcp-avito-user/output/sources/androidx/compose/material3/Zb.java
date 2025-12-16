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

/* compiled from: NavigationRail.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Zb implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.a<Float> f35990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C22096n f35991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f35992c;

    public Zb(Y41.a aVar, C22096n c22096n, boolean z12) {
        this.f35990a = aVar;
        this.f35991b = c22096n;
        this.f35992c = z12;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        InterfaceC22363h0 interfaceC22363h0;
        androidx.compose.ui.layout.K0 k0I;
        androidx.compose.ui.layout.K0 k0I2;
        Zb zb2 = this;
        long j13 = j12;
        float fFloatValue = zb2.f35990a.invoke().floatValue();
        long jC2 = C22712b.c(j12, 0, 0, 0, 0, 10);
        int size = list.size();
        int i12 = 0;
        while (i12 < size) {
            InterfaceC22363h0 interfaceC22363h02 = list.get(i12);
            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h02), "icon")) {
                androidx.compose.ui.layout.K0 k0I3 = interfaceC22363h02.I(jC2);
                int i13 = k0I3.f40345b;
                float f12 = 2;
                float f13 = C21519dc.f36208d * f12;
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                int iY02 = interfaceC22369k0.y0(f13) + i13;
                int iB2 = kotlin.math.b.b(iY02 * fFloatValue);
                C22096n c22096n = zb2.f35991b;
                int iY03 = interfaceC22369k0.y0((c22096n == null ? C21519dc.f36210f : C21519dc.f36209e) * f12) + k0I3.f40346c;
                int size2 = list.size();
                float f14 = fFloatValue;
                int i14 = 0;
                while (i14 < size2) {
                    int i15 = size2;
                    InterfaceC22363h0 interfaceC22363h03 = list.get(i14);
                    int i16 = i14;
                    if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h03), "indicatorRipple")) {
                        C22712b.f42842b.getClass();
                        float f15 = f12;
                        androidx.compose.ui.layout.K0 k0I4 = interfaceC22363h03.I(C22712b.a.c(iY02, iY03));
                        int size3 = list.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size3) {
                                interfaceC22363h0 = null;
                                break;
                            }
                            interfaceC22363h0 = list.get(i17);
                            int i18 = size3;
                            if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h0), "indicator")) {
                                break;
                            }
                            i17++;
                            size3 = i18;
                        }
                        InterfaceC22363h0 interfaceC22363h04 = interfaceC22363h0;
                        if (interfaceC22363h04 != null) {
                            C22712b.f42842b.getClass();
                            k0I = interfaceC22363h04.I(C22712b.a.c(iB2, iY03));
                        } else {
                            k0I = null;
                        }
                        if (c22096n != null) {
                            int size4 = list.size();
                            for (int i19 = 0; i19 < size4; i19++) {
                                InterfaceC22363h0 interfaceC22363h05 = list.get(i19);
                                if (kotlin.jvm.internal.L.f(androidx.compose.ui.layout.C.a(interfaceC22363h05), "label")) {
                                    k0I2 = interfaceC22363h05.I(jC2);
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                        k0I2 = null;
                        if (c22096n == null) {
                            int iG2 = C22713c.g(Math.max(k0I3.f40345b, Math.max(k0I4.f40345b, k0I != null ? k0I.f40345b : 0)), j12);
                            int iF2 = C22713c.f(interfaceC22369k0.y0(C21519dc.f36206b), j12);
                            return interfaceC22369k0.L0(iG2, iF2, kotlin.collections.P0.c(), new C21473bc((iG2 - k0I3.f40345b) / 2, (iF2 - k0I3.f40346c) / 2, (iG2 - k0I4.f40345b) / 2, (iF2 - k0I4.f40346c) / 2, iG2, iF2, k0I, k0I3, k0I4));
                        }
                        float f16 = k0I3.f40346c;
                        float f17 = C21519dc.f36209e;
                        float fM02 = interfaceC22369k0.M0(f17) + f16;
                        float f18 = C21519dc.f36207c;
                        float fM03 = interfaceC22369k0.M0(f18) + fM02 + k0I2.f40346c;
                        float fA2 = kotlin.ranges.s.a((C22712b.k(j12) - fM03) / f15, interfaceC22369k0.M0(f17));
                        float f19 = (fA2 * f15) + fM03;
                        boolean z12 = this.f35992c;
                        float f22 = (1 - f14) * ((z12 ? fA2 : (f19 - k0I3.f40346c) / f15) - fA2);
                        float fM04 = interfaceC22369k0.M0(f17) + k0I3.f40346c + fA2 + interfaceC22369k0.M0(f18);
                        int iG3 = C22713c.g(Math.max(k0I3.f40345b, Math.max(k0I2.f40345b, k0I != null ? k0I.f40345b : 0)), j12);
                        return interfaceC22369k0.L0(iG3, kotlin.math.b.b(f19), kotlin.collections.P0.c(), new C21496cc(k0I, z12, f14, k0I2, (iG3 - k0I2.f40345b) / 2, fM04, f22, k0I3, (iG3 - k0I3.f40345b) / 2, fA2, k0I4, (iG3 - k0I4.f40345b) / 2, fA2 - interfaceC22369k0.M0(f17), iG3, interfaceC22369k0));
                    }
                    i14 = i16 + 1;
                    f12 = f12;
                    j13 = j13;
                    size2 = i15;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i12++;
            zb2 = this;
            fFloatValue = fFloatValue;
            j13 = j13;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
