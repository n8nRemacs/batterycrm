package androidx.compose.material3;

import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Scaffold.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/Z0;", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-0kLqBqw", "(Landroidx/compose/ui/layout/Z0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* renamed from: androidx.compose.material3.wd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21952wd extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.ui.layout.Z0, C22712b, InterfaceC22367j0> {
    public C21952wd() {
        throw null;
    }

    @Override // Y41.p
    public final InterfaceC22367j0 invoke(androidx.compose.ui.layout.Z0 z02, C22712b c22712b) {
        Object obj;
        Object obj2;
        Object obj3;
        B7 b72;
        Object obj4;
        Integer numValueOf;
        Object obj5;
        Object obj6;
        int iY02;
        int iY03;
        androidx.compose.ui.layout.Z0 z03 = z02;
        long j12 = c22712b.f42843a;
        int iJ2 = C22712b.j(j12);
        long jC2 = C22712b.c(j12, 0, 0, 0, 0, 10);
        List<InterfaceC22363h0> listH0 = z03.h0(EnumC21996yd.f37768b, null);
        ArrayList arrayList = new ArrayList(listH0.size());
        for (int iF2 = 0; iF2 < listH0.size(); iF2 = androidx.compose.foundation.H.f(listH0.get(iF2), jC2, arrayList, iF2, 1)) {
        }
        int i12 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int i13 = ((androidx.compose.ui.layout.K0) obj).f40346c;
            int size = arrayList.size() - 1;
            if (1 <= size) {
                int i14 = 1;
                while (true) {
                    Object obj7 = arrayList.get(i14);
                    int i15 = ((androidx.compose.ui.layout.K0) obj7).f40346c;
                    if (i13 < i15) {
                        obj = obj7;
                        i13 = i15;
                    }
                    if (i14 == size) {
                        break;
                    }
                    i14++;
                }
            }
        }
        List<InterfaceC22363h0> listH02 = z03.h0(EnumC21996yd.f37769c, null);
        ArrayList arrayList2 = new ArrayList(listH02.size());
        if (listH02.size() > 0) {
            listH02.get(0);
            z03.getF40449b();
            throw null;
        }
        if (arrayList2.isEmpty()) {
            obj2 = null;
        } else {
            obj2 = arrayList2.get(0);
            int i16 = ((androidx.compose.ui.layout.K0) obj2).f40346c;
            int size2 = arrayList2.size() - 1;
            if (1 <= size2) {
                int i17 = 1;
                while (true) {
                    Object obj8 = arrayList2.get(i17);
                    int i18 = ((androidx.compose.ui.layout.K0) obj8).f40346c;
                    if (i16 < i18) {
                        obj2 = obj8;
                        i16 = i18;
                    }
                    if (i17 == size2) {
                        break;
                    }
                    i17++;
                }
            }
        }
        androidx.compose.ui.layout.K0 k02 = (androidx.compose.ui.layout.K0) obj2;
        int i19 = k02 != null ? k02.f40346c : 0;
        if (arrayList2.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = arrayList2.get(0);
            int i22 = ((androidx.compose.ui.layout.K0) obj3).f40345b;
            int size3 = arrayList2.size() - 1;
            if (1 <= size3) {
                int i23 = 1;
                while (true) {
                    Object obj9 = arrayList2.get(i23);
                    int i24 = ((androidx.compose.ui.layout.K0) obj9).f40345b;
                    if (i22 < i24) {
                        obj3 = obj9;
                        i22 = i24;
                    }
                    if (i23 == size3) {
                        break;
                    }
                    i23++;
                }
            }
        }
        List<InterfaceC22363h0> listH03 = z03.h0(EnumC21996yd.f37770d, null);
        ArrayList arrayList3 = new ArrayList(listH03.size());
        if (listH03.size() > 0) {
            listH03.get(0);
            z03.getF40449b();
            throw null;
        }
        if (arrayList3.isEmpty()) {
            b72 = null;
        } else {
            if (arrayList3.isEmpty()) {
                obj5 = null;
            } else {
                obj5 = arrayList3.get(0);
                int i25 = ((androidx.compose.ui.layout.K0) obj5).f40345b;
                int size4 = arrayList3.size() - 1;
                if (1 <= size4) {
                    int i26 = 1;
                    while (true) {
                        Object obj10 = arrayList3.get(i26);
                        int i27 = ((androidx.compose.ui.layout.K0) obj10).f40345b;
                        if (i25 < i27) {
                            obj5 = obj10;
                            i25 = i27;
                        }
                        if (i26 == size4) {
                            break;
                        }
                        i26++;
                    }
                }
            }
            int i28 = ((androidx.compose.ui.layout.K0) obj5).f40345b;
            if (arrayList3.isEmpty()) {
                obj6 = null;
            } else {
                obj6 = arrayList3.get(0);
                int i29 = ((androidx.compose.ui.layout.K0) obj6).f40346c;
                int size5 = arrayList3.size() - 1;
                if (1 <= size5) {
                    int i32 = 1;
                    while (true) {
                        Object obj11 = arrayList3.get(i32);
                        int i33 = ((androidx.compose.ui.layout.K0) obj11).f40346c;
                        if (i29 < i33) {
                            obj6 = obj11;
                            i29 = i33;
                        }
                        if (i32 == size5) {
                            break;
                        }
                        i32++;
                    }
                }
            }
            int i34 = ((androidx.compose.ui.layout.K0) obj6).f40346c;
            C7.f34588b.getClass();
            if (!C7.a(0, 0)) {
                if (!(C7.a(0, C7.f34590d) ? true : C7.a(0, C7.f34591e))) {
                    iY02 = (iJ2 - i28) / 2;
                } else if (z03.getF40449b() == LayoutDirection.f42838b) {
                    iY03 = z03.y0(C21772od.f36989c);
                    iY02 = (iJ2 - iY03) - i28;
                } else {
                    iY02 = z03.y0(C21772od.f36989c);
                }
                b72 = new B7(iY02, i34);
            } else if (z03.getF40449b() == LayoutDirection.f42838b) {
                iY02 = z03.y0(C21772od.f36989c);
                b72 = new B7(iY02, i34);
            } else {
                iY03 = z03.y0(C21772od.f36989c);
                iY02 = (iJ2 - iY03) - i28;
                b72 = new B7(iY02, i34);
            }
        }
        List<InterfaceC22363h0> listH04 = z03.h0(EnumC21996yd.f37771e, new C22096n(1843374446, new C21930vd(b72, null), true));
        ArrayList arrayList4 = new ArrayList(listH04.size());
        int iF3 = 0;
        for (int size6 = listH04.size(); iF3 < size6; size6 = size6) {
            iF3 = androidx.compose.foundation.H.f(listH04.get(iF3), jC2, arrayList4, iF3, 1);
        }
        if (arrayList4.isEmpty()) {
            obj4 = null;
        } else {
            obj4 = arrayList4.get(0);
            int i35 = ((androidx.compose.ui.layout.K0) obj4).f40346c;
            int size7 = arrayList4.size() - 1;
            if (1 <= size7) {
                while (true) {
                    Object obj12 = arrayList4.get(i12);
                    int i36 = ((androidx.compose.ui.layout.K0) obj12).f40346c;
                    if (i35 < i36) {
                        obj4 = obj12;
                        i35 = i36;
                    }
                    if (i12 == size7) {
                        break;
                    }
                    i12++;
                }
            }
        }
        androidx.compose.ui.layout.K0 k03 = (androidx.compose.ui.layout.K0) obj4;
        Integer numValueOf2 = k03 != null ? Integer.valueOf(k03.f40346c) : null;
        if (b72 != null) {
            if (numValueOf2 != null) {
                C7.f34588b.getClass();
                numValueOf = C7.a(0, C7.f34591e) ? null : Integer.valueOf(z03.y0(C21772od.f36989c) + numValueOf2.intValue() + b72.f34550b);
            }
            z03.y0(C21772od.f36989c);
            throw null;
        }
        if (i19 == 0 || numValueOf != null) {
            throw null;
        }
        numValueOf2.getClass();
        throw null;
    }
}
