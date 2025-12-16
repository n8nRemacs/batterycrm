package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: Intrinsic.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/E1;", "Landroidx/compose/foundation/layout/D1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class E1 extends D1 {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public IntrinsicSize f28238p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f28239q;

    @Override // androidx.compose.foundation.layout.D1
    public final long k2(@Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        int iG2 = this.f28238p == IntrinsicSize.f28333b ? interfaceC22363h0.G(C22712b.i(j12)) : interfaceC22363h0.b0(C22712b.i(j12));
        if (iG2 < 0) {
            iG2 = 0;
        }
        C22712b.f42842b.getClass();
        return C22712b.a.e(iG2);
    }

    @Override // androidx.compose.foundation.layout.D1
    /* renamed from: l2, reason: from getter */
    public final boolean getF28239q() {
        return this.f28239q;
    }

    @Override // androidx.compose.foundation.layout.D1, androidx.compose.ui.node.K
    public final int m(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return this.f28238p == IntrinsicSize.f28333b ? interfaceC22391w.G(i12) : interfaceC22391w.b0(i12);
    }

    @Override // androidx.compose.foundation.layout.D1, androidx.compose.ui.node.K
    public final int z(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return this.f28238p == IntrinsicSize.f28333b ? interfaceC22391w.G(i12) : interfaceC22391w.b0(i12);
    }
}
