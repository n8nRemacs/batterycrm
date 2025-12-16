package com.avito.android.vas_performance.screens.visual_v2.mvi;

import RL0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_performance.screens.visual_v2.mvi.entity.VisualVasV2InternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: VisualVasV2OneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual_v2/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/vas_performance/screens/visual_v2/mvi/entity/VisualVasV2InternalAction;", "LRL0/b;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class k implements t<VisualVasV2InternalAction, RL0.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final RL0.b b(VisualVasV2InternalAction visualVasV2InternalAction) {
        VisualVasV2InternalAction visualVasV2InternalAction2 = visualVasV2InternalAction;
        if (visualVasV2InternalAction2 instanceof VisualVasV2InternalAction.OpenDeepLink) {
            DeepLink deepLink = ((VisualVasV2InternalAction.OpenDeepLink) visualVasV2InternalAction2).f321275b;
            if (deepLink != null) {
                return new b.C0956b(deepLink);
            }
            return null;
        }
        if (visualVasV2InternalAction2 instanceof VisualVasV2InternalAction.OnBackPressed) {
            return new b.a(((VisualVasV2InternalAction.OnBackPressed) visualVasV2InternalAction2).f321274b);
        }
        if (visualVasV2InternalAction2.equals(VisualVasV2InternalAction.FinishFlow.f321273b)) {
            return new b.a(true);
        }
        if (visualVasV2InternalAction2 instanceof VisualVasV2InternalAction.ShowErrorToast) {
            return new b.c(((VisualVasV2InternalAction.ShowErrorToast) visualVasV2InternalAction2).f321281b);
        }
        return null;
    }
}
