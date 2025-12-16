package androidx.compose.foundation.text;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: TextFieldSize.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/k0;", "Landroidx/compose/ui/layout/h0;", "measurable", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/k0;Landroidx/compose/ui/layout/h0;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class M2 extends kotlin.jvm.internal.N implements Y41.q<InterfaceC22369k0, InterfaceC22363h0, C22712b, InterfaceC22367j0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ K2 f30484l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2(K2 k22) {
        super(3);
        this.f30484l = k22;
    }

    @Override // Y41.q
    public final InterfaceC22367j0 invoke(InterfaceC22369k0 interfaceC22369k0, InterfaceC22363h0 interfaceC22363h0, C22712b c22712b) {
        long j12 = c22712b.f42843a;
        long j13 = this.f30484l.f30400f;
        androidx.compose.ui.layout.K0 k0I = interfaceC22363h0.I(C22712b.c(j12, kotlin.ranges.s.g((int) (j13 >> 32), C22712b.l(j12), C22712b.j(j12)), 0, kotlin.ranges.s.g((int) (j13 & 4294967295L), C22712b.k(j12), C22712b.i(j12)), 0, 10));
        return interfaceC22369k0.L0(k0I.f40345b, k0I.f40346c, kotlin.collections.P0.c(), new L2(k0I));
    }
}
