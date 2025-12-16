package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.unit.C22712b;
import kotlin.Metadata;

/* compiled from: Intrinsic.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/y1;", "Landroidx/compose/foundation/layout/D1;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.y1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20642y1 extends D1 {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public IntrinsicSize f28802p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f28803q;

    @Override // androidx.compose.foundation.layout.D1, androidx.compose.ui.node.K
    public final int A(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return this.f28802p == IntrinsicSize.f28333b ? interfaceC22391w.X(i12) : interfaceC22391w.R(i12);
    }

    @Override // androidx.compose.foundation.layout.D1
    public final long k2(@Y61.k InterfaceC22363h0 interfaceC22363h0, long j12) {
        int iX2 = this.f28802p == IntrinsicSize.f28333b ? interfaceC22363h0.X(C22712b.j(j12)) : interfaceC22363h0.R(C22712b.j(j12));
        if (iX2 < 0) {
            iX2 = 0;
        }
        C22712b.f42842b.getClass();
        return C22712b.a.d(iX2);
    }

    @Override // androidx.compose.foundation.layout.D1
    /* renamed from: l2, reason: from getter */
    public final boolean getF28803q() {
        return this.f28803q;
    }

    @Override // androidx.compose.foundation.layout.D1, androidx.compose.ui.node.K
    public final int x(@Y61.k androidx.compose.ui.node.X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return this.f28802p == IntrinsicSize.f28333b ? interfaceC22391w.X(i12) : interfaceC22391w.R(i12);
    }
}
