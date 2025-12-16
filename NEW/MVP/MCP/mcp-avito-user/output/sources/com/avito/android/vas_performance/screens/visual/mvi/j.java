package com.avito.android.vas_performance.screens.visual.mvi;

import PL0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.vas_performance.screens.visual.mvi.entity.VisualVasInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: VisualVasOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/screens/visual/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/vas_performance/screens/visual/mvi/entity/VisualVasInternalAction;", "LPL0/b;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements t<VisualVasInternalAction, PL0.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final PL0.b b(VisualVasInternalAction visualVasInternalAction) {
        VisualVasInternalAction visualVasInternalAction2 = visualVasInternalAction;
        C42822w c42822w = null;
        if (visualVasInternalAction2 instanceof VisualVasInternalAction.OpenDeepLink) {
            DeepLink deepLink = ((VisualVasInternalAction.OpenDeepLink) visualVasInternalAction2).f321140b;
            if (deepLink != null) {
                return new b.C0842b(deepLink);
            }
            return null;
        }
        int i12 = 1;
        if (visualVasInternalAction2.equals(VisualVasInternalAction.OnBackPressed.f321139b)) {
            return new b.a(false, i12, c42822w);
        }
        if (visualVasInternalAction2.equals(VisualVasInternalAction.FinishFlow.f321137b)) {
            return new b.a(true);
        }
        if (visualVasInternalAction2 instanceof VisualVasInternalAction.ShowErrorToast) {
            return new b.d(((VisualVasInternalAction.ShowErrorToast) visualVasInternalAction2).f321142b);
        }
        if (visualVasInternalAction2 instanceof VisualVasInternalAction.PutVideoVasSelectionParam) {
            return new b.c(((VisualVasInternalAction.PutVideoVasSelectionParam) visualVasInternalAction2).f321141b);
        }
        return null;
    }
}
