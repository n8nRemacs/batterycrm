package androidx.compose.material3;

import androidx.compose.material3.C21699l9;
import androidx.compose.ui.layout.C22350b;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22381q0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ListItem.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "measurables", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.g9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21585g9 implements InterfaceC22381q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutDirection f36411a;

    public C21585g9(LayoutDirection layoutDirection) {
        this.f36411a = layoutDirection;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22381q0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends List<? extends InterfaceC22363h0>> list, long j12) {
        androidx.compose.ui.layout.K0 k02;
        float f12;
        androidx.compose.ui.layout.K0 k0I;
        int iF2;
        float f13;
        List<? extends InterfaceC22363h0> list2 = list.get(0);
        List<? extends InterfaceC22363h0> list3 = list.get(1);
        List<? extends InterfaceC22363h0> list4 = list.get(2);
        List<? extends InterfaceC22363h0> list5 = list.get(3);
        List<? extends InterfaceC22363h0> list6 = list.get(4);
        long jC2 = C22712b.c(j12, 0, 0, 0, 0, 10);
        float f14 = C21676k9.f36726c;
        float f15 = C21676k9.f36727d;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        int i12 = -interfaceC22369k0.y0(f14 + f15);
        float f16 = C21676k9.f36724a;
        long jI2 = C22713c.i(i12, -interfaceC22369k0.y0(2 * f16), jC2);
        InterfaceC22363h0 interfaceC22363h0 = (InterfaceC22363h0) C42745f0.G(list5);
        androidx.compose.ui.layout.K0 k0I2 = interfaceC22363h0 != null ? interfaceC22363h0.I(jI2) : null;
        int iF3 = C21457aj.f(k0I2);
        InterfaceC22363h0 interfaceC22363h02 = (InterfaceC22363h0) C42745f0.G(list6);
        if (interfaceC22363h02 != null) {
            k02 = k0I2;
            f12 = f16;
            k0I = interfaceC22363h02.I(C22713c.j(-iF3, 0, jI2, 2));
        } else {
            k02 = k0I2;
            f12 = f16;
            k0I = null;
        }
        int iF4 = C21457aj.f(k0I) + iF3;
        InterfaceC22363h0 interfaceC22363h03 = (InterfaceC22363h0) C42745f0.G(list2);
        androidx.compose.ui.layout.K0 k0I3 = interfaceC22363h03 != null ? interfaceC22363h03.I(C22713c.j(-iF4, 0, jI2, 2)) : null;
        int iE2 = C21457aj.e(k0I3);
        InterfaceC22363h0 interfaceC22363h04 = (InterfaceC22363h0) C42745f0.G(list4);
        androidx.compose.ui.layout.K0 k0I4 = interfaceC22363h04 != null ? interfaceC22363h04.I(C22713c.i(-iF4, -iE2, jI2)) : null;
        int iE3 = C21457aj.e(k0I4) + iE2;
        boolean z12 = (k0I4 == null || k0I4.d0(C22350b.f40439a) == k0I4.d0(C22350b.f40440b)) ? false : true;
        InterfaceC22363h0 interfaceC22363h05 = (InterfaceC22363h0) C42745f0.G(list3);
        androidx.compose.ui.layout.K0 k0I5 = interfaceC22363h05 != null ? interfaceC22363h05.I(C22713c.i(-iF4, -iE3, jI2)) : null;
        C21699l9.a aVar2 = C21699l9.f36794c;
        boolean z13 = k0I5 != null;
        boolean z14 = k0I4 != null;
        aVar2.getClass();
        int i13 = ((z13 && z14) || z12) ? C21699l9.f36797f : (z13 || z14) ? C21699l9.f36796e : C21699l9.f36795d;
        boolean z15 = i13 == C21699l9.f36797f;
        androidx.compose.foundation.layout.V1 v1D = androidx.compose.foundation.layout.R1.d(f14, z15 ? C21676k9.f36725b : f12, f15, z15 ? C21676k9.f36725b : f12);
        if (C22712b.f(j12)) {
            iF2 = C22712b.j(j12);
        } else {
            LayoutDirection layoutDirection = this.f36411a;
            iF2 = C21457aj.f(k0I) + C21457aj.f(k02) + interfaceC22369k0.y0(v1D.a(layoutDirection) + v1D.c(layoutDirection)) + Math.max(C21457aj.f(k0I3), Math.max(C21457aj.f(k0I5), C21457aj.f(k0I4)));
        }
        int i14 = iF2;
        if (i13 == C21699l9.f36795d) {
            d0.E.f393165a.getClass();
            f13 = d0.E.f393166b;
        } else if (i13 == C21699l9.f36796e) {
            d0.E.f393165a.getClass();
            f13 = d0.E.f393171g;
        } else {
            d0.E.f393165a.getClass();
            f13 = d0.E.f393169e;
        }
        int iMax = Math.max(Math.max(C22712b.k(j12), interfaceC22369k0.y0(f13)), Math.max(C21457aj.e(k02), Math.max(C21457aj.e(k0I4) + C21457aj.e(k0I5) + C21457aj.e(k0I3), C21457aj.e(k0I))) + interfaceC22369k0.y0(v1D.f28523d + v1D.f28521b));
        int i15 = C22712b.i(j12);
        int i16 = iMax > i15 ? i15 : iMax;
        return interfaceC22369k0.L0(i14, i16, kotlin.collections.P0.c(), new C21653j9(interfaceC22369k0, v1D, this.f36411a, k02, k0I, z15, k0I3, k0I5, k0I4, i16, i14));
    }
}
