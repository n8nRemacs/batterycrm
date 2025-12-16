package androidx.compose.foundation;

import android.view.KeyEvent;
import androidx.compose.foundation.gestures.C20445d2;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.C42822w;

/* compiled from: Clickable.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/foundation/I0;", "Landroidx/compose/foundation/a;", "Landroidx/compose/foundation/interaction/m;", "interactionSource", "Landroidx/compose/foundation/v1;", "indicationNodeFactory", "", "enabled", "", "onClickLabel", "Landroidx/compose/ui/semantics/i;", "role", "Lkotlin/Function0;", "Lkotlin/G0;", "onClick", "<init>", "(Landroidx/compose/foundation/interaction/m;Landroidx/compose/foundation/v1;ZLjava/lang/String;Landroidx/compose/ui/semantics/i;LY41/a;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class I0 extends AbstractC20407a {
    public I0() {
        throw null;
    }

    public I0(androidx.compose.foundation.interaction.m mVar, InterfaceC21084v1 interfaceC21084v1, boolean z12, String str, androidx.compose.ui.semantics.i iVar, Y41.a aVar, C42822w c42822w) {
        super(mVar, interfaceC21084v1, z12, str, iVar, aVar, null);
    }

    @Override // androidx.compose.foundation.AbstractC20407a
    @Y61.l
    public final Object o2(@Y61.k androidx.compose.ui.input.pointer.K k12, @Y61.k Continuation<? super kotlin.G0> continuation) {
        Object objE = C20445d2.e(k12, new G0(this, null), new H0(this), continuation);
        return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : kotlin.G0.f406611a;
    }

    @Override // androidx.compose.foundation.AbstractC20407a
    public final boolean s2(@Y61.k KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.compose.foundation.AbstractC20407a
    public final void t2(@Y61.k KeyEvent keyEvent) {
        this.f26920w.invoke();
    }
}
