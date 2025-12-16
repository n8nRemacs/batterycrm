package androidx.compose.foundation.layout;

import androidx.compose.runtime.F3;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.C22350b;
import androidx.compose.ui.layout.C22387u;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.platform.C22535v1;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: AlignmentLine.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation-layout_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20560e {
    public static final InterfaceC22367j0 a(InterfaceC22369k0 interfaceC22369k0, AbstractC22348a abstractC22348a, float f12, float f13, InterfaceC22363h0 interfaceC22363h0, long j12) {
        boolean z12 = abstractC22348a instanceof C22387u;
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(z12 ? C22712b.c(j12, 0, 0, 0, 0, 11) : C22712b.c(j12, 0, 0, 0, 0, 14));
        int iD02 = k0I.d0(abstractC22348a);
        if (iD02 == Integer.MIN_VALUE) {
            iD02 = 0;
        }
        int i12 = z12 ? k0I.f40346c : k0I.f40345b;
        int i13 = (z12 ? C22712b.i(j12) : C22712b.j(j12)) - i12;
        int iG2 = kotlin.ranges.s.g((!Float.isNaN(f12) ? interfaceC22369k0.y0(f12) : 0) - iD02, 0, i13);
        int iG3 = kotlin.ranges.s.g(((!Float.isNaN(f13) ? interfaceC22369k0.y0(f13) : 0) - i12) + iD02, 0, i13 - iG2);
        int iMax = z12 ? k0I.f40345b : Math.max(k0I.f40345b + iG2 + iG3, C22712b.l(j12));
        int iMax2 = z12 ? Math.max(k0I.f40346c + iG2 + iG3, C22712b.k(j12)) : k0I.f40346c;
        return interfaceC22369k0.L0(iMax, iMax2, kotlin.collections.P0.c(), new C20545b(abstractC22348a, f12, iG2, iMax, iG3, k0I, iMax2));
    }

    public static androidx.compose.ui.v b(v.a aVar, C22387u c22387u, float f12, float f13, int i12) {
        if ((i12 & 2) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f12 = androidx.compose.ui.unit.h.f42851e;
        }
        float f14 = f12;
        if ((i12 & 4) != 0) {
            androidx.compose.ui.unit.h.f42849c.getClass();
            f13 = androidx.compose.ui.unit.h.f42851e;
        }
        AlignmentLineOffsetDpElement alignmentLineOffsetDpElement = new AlignmentLineOffsetDpElement(c22387u, f14, f13, C22535v1.f41625a, null);
        aVar.getClass();
        return alignmentLineOffsetDpElement;
    }

    public static androidx.compose.ui.v c(v.a aVar, C22387u c22387u, long j12, long j13, int i12) {
        if ((i12 & 2) != 0) {
            androidx.compose.ui.unit.y.f42874b.getClass();
            j12 = androidx.compose.ui.unit.y.f42876d;
        }
        long j14 = j12;
        if ((i12 & 4) != 0) {
            androidx.compose.ui.unit.y.f42874b.getClass();
            j13 = androidx.compose.ui.unit.y.f42876d;
        }
        AlignmentLineOffsetTextUnitElement alignmentLineOffsetTextUnitElement = new AlignmentLineOffsetTextUnitElement(c22387u, j14, j13, C22535v1.f41625a, null);
        aVar.getClass();
        return alignmentLineOffsetTextUnitElement;
    }

    @F3
    @Y61.k
    public static final androidx.compose.ui.v d(@Y61.k v.a aVar, float f12, float f13) {
        androidx.compose.ui.v vVarB = !Float.isNaN(f12) ? b(androidx.compose.ui.v.f42878y1, C22350b.f40439a, f12, 0.0f, 4) : androidx.compose.ui.v.f42878y1;
        aVar.getClass();
        return vVarB.d0(!Float.isNaN(f13) ? b(androidx.compose.ui.v.f42878y1, C22350b.f40440b, 0.0f, f13, 2) : androidx.compose.ui.v.f42878y1);
    }
}
