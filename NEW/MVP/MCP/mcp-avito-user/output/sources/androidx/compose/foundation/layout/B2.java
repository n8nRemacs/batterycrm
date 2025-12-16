package androidx.compose.foundation.layout;

import android.view.WindowInsetsAnimationController;
import androidx.compose.runtime.InterfaceC22118l0;
import kotlin.Metadata;

/* compiled from: Effects.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/compose/runtime/m0", "Landroidx/compose/runtime/l0;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class B2 implements InterfaceC22118l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I2 f28211a;

    public B2(I2 i22) {
        this.f28211a = i22;
    }

    @Override // androidx.compose.runtime.InterfaceC22118l0
    public final void dispose() {
        I2 i22 = this.f28211a;
        kotlinx.coroutines.r rVar = i22.f28327k;
        if (rVar != null) {
            rVar.C(J2.f28343l, null);
        }
        kotlinx.coroutines.N0 n02 = i22.f28326j;
        if (n02 != null) {
            ((kotlinx.coroutines.V0) n02).c(null);
        }
        WindowInsetsAnimationController windowInsetsAnimationController = i22.f28322f;
        if (windowInsetsAnimationController != null) {
            windowInsetsAnimationController.finish(!kotlin.jvm.internal.L.f(windowInsetsAnimationController.getCurrentInsets(), windowInsetsAnimationController.getHiddenStateInsets()));
        }
    }
}
