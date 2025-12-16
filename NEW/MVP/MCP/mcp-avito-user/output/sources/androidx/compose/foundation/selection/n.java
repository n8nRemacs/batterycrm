package androidx.compose.foundation.selection;

import androidx.compose.foundation.I0;
import androidx.compose.foundation.InterfaceC21084v1;
import androidx.compose.ui.semantics.C;
import androidx.compose.ui.semantics.F;
import androidx.compose.ui.state.ToggleableState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Toggleable.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/selection/n;", "Landroidx/compose/foundation/I0;", "Landroidx/compose/ui/state/ToggleableState;", VoiceInfo.STATE, "Landroidx/compose/foundation/interaction/m;", "interactionSource", "Landroidx/compose/foundation/v1;", "indicationNodeFactory", "", "enabled", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function0;", "Lkotlin/G0;", "onClick", "<init>", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/foundation/interaction/m;Landroidx/compose/foundation/v1;ZLandroidx/compose/ui/semantics/i;LY41/a;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class n extends I0 {

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public ToggleableState f30146I;

    public n() {
        throw null;
    }

    public n(ToggleableState toggleableState, androidx.compose.foundation.interaction.m mVar, InterfaceC21084v1 interfaceC21084v1, boolean z12, androidx.compose.ui.semantics.i iVar, Y41.a aVar, C42822w c42822w) {
        super(mVar, interfaceC21084v1, z12, null, iVar, aVar, null);
        this.f30146I = toggleableState;
    }

    @Override // androidx.compose.foundation.AbstractC20407a
    public final void n2(@Y61.k F f12) {
        C.v(f12, this.f30146I);
    }
}
