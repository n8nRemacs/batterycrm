package com.avito.android.vas_performance.screens.stickers.edit.mvi;

import ML0.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.vas_performance.screens.stickers.edit.mvi.entity.StickersEditInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: StickersEditOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/vas_performance/screens/stickers/edit/mvi/entity/StickersEditInternalAction;", "LML0/b;", "<init>", "()V", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements t<StickersEditInternalAction, ML0.b> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final ML0.b b(StickersEditInternalAction stickersEditInternalAction) {
        StickersEditInternalAction stickersEditInternalAction2 = stickersEditInternalAction;
        if (stickersEditInternalAction2 instanceof StickersEditInternalAction.HandleDeeplink) {
            return new b.c(((StickersEditInternalAction.HandleDeeplink) stickersEditInternalAction2).f320809b);
        }
        if (stickersEditInternalAction2 instanceof StickersEditInternalAction.Back) {
            return b.a.f10596a;
        }
        if (stickersEditInternalAction2 instanceof StickersEditInternalAction.FinishFlow) {
            return b.C0675b.f10597a;
        }
        if (stickersEditInternalAction2 instanceof StickersEditInternalAction.ShowAlertMessage) {
            return new b.d(((StickersEditInternalAction.ShowAlertMessage) stickersEditInternalAction2).f320811b);
        }
        return null;
    }
}
