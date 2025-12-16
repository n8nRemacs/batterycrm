package androidx.compose.foundation.layout;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: WindowInsets.kt */
@InterfaceC20625u0
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/J1;", "Landroidx/compose/foundation/layout/x2;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J1 implements InterfaceC20639x2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f28342b;

    public J1() {
        this(null, 1, null);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int a(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        return ((InterfaceC20639x2) ((C22082i3) this.f28342b).getF42167b()).a(dVar, layoutDirection);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int b(@Y61.k androidx.compose.ui.unit.d dVar) {
        return ((InterfaceC20639x2) ((C22082i3) this.f28342b).getF42167b()).b(dVar);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int c(@Y61.k androidx.compose.ui.unit.d dVar) {
        return ((InterfaceC20639x2) ((C22082i3) this.f28342b).getF42167b()).c(dVar);
    }

    @Override // androidx.compose.foundation.layout.InterfaceC20639x2
    public final int d(@Y61.k androidx.compose.ui.unit.d dVar, @Y61.k LayoutDirection layoutDirection) {
        return ((InterfaceC20639x2) ((C22082i3) this.f28342b).getF42167b()).d(dVar, layoutDirection);
    }

    public J1(InterfaceC20639x2 interfaceC20639x2, int i12, C42822w c42822w) {
        this.f28342b = C22126m3.g((i12 & 1) != 0 ? new C20641y0() : interfaceC20639x2);
    }
}
