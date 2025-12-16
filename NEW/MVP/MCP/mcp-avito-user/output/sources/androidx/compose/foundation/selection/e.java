package androidx.compose.foundation.selection;

import androidx.compose.foundation.I0;
import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.ui.semantics.C;
import androidx.compose.ui.semantics.F;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Selectable.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/selection/e;", "Landroidx/compose/foundation/I0;", "", "selected", "Landroidx/compose/foundation/interaction/m;", "interactionSource", "Landroidx/compose/foundation/v1;", "indicationNodeFactory", "enabled", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function0;", "Lkotlin/G0;", "onClick", "<init>", "(ZLandroidx/compose/foundation/interaction/m;Landroidx/compose/foundation/v1;ZLandroidx/compose/ui/semantics/i;LY41/a;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class e extends I0 {

    /* renamed from: I, reason: collision with root package name */
    public boolean f30126I;

    public e() {
        throw null;
    }

    public e(boolean z12, androidx.compose.foundation.interaction.m mVar, InterfaceC21084v1 interfaceC21084v1, boolean z13, androidx.compose.ui.semantics.i iVar, Y41.a aVar, C42822w c42822w) {
        super(mVar, interfaceC21084v1, z13, null, iVar, aVar, null);
        this.f30126I = z12;
    }

    @Override // androidx.compose.foundation.AbstractC20407a
    public final void n2(@Y61.k F f12) {
        C.t(f12, this.f30126I);
    }
}
