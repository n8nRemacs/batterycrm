package androidx.compose.foundation.selection;

import androidx.compose.foundation.I0;
import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.ui.semantics.C;
import androidx.compose.ui.semantics.F;
import androidx.compose.ui.state.ToggleableState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Toggleable.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/selection/m;", "Landroidx/compose/foundation/I0;", "", "value", "Landroidx/compose/foundation/interaction/m;", "interactionSource", "Landroidx/compose/foundation/v1;", "indicationNodeFactory", "enabled", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function1;", "Lkotlin/G0;", "onValueChange", "<init>", "(ZLandroidx/compose/foundation/interaction/m;Landroidx/compose/foundation/v1;ZLandroidx/compose/ui/semantics/i;LY41/l;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class m extends I0 {

    /* renamed from: I, reason: collision with root package name */
    public boolean f30143I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super Boolean, G0> f30144J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f30145K;

    public m() {
        throw null;
    }

    public m(boolean z12, androidx.compose.foundation.interaction.m mVar, InterfaceC21084v1 interfaceC21084v1, boolean z13, androidx.compose.ui.semantics.i iVar, Y41.l lVar, C42822w c42822w) {
        super(mVar, interfaceC21084v1, z13, null, iVar, new k(lVar, z12), null);
        this.f30143I = z12;
        this.f30144J = lVar;
        this.f30145K = new l(this);
    }

    @Override // androidx.compose.foundation.AbstractC20407a
    public final void n2(@Y61.k F f12) {
        C.v(f12, this.f30143I ? ToggleableState.f41896b : ToggleableState.f41897c);
    }
}
