package com.avito.android.iac_calls_history.impl_module.screen.mvi;

import ZJ.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CallsHistoryScreenEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "LZJ/a;", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements t<CallsHistoryScreenInternalAction, ZJ.a> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final ZJ.a b(CallsHistoryScreenInternalAction callsHistoryScreenInternalAction) {
        CallsHistoryScreenInternalAction callsHistoryScreenInternalAction2 = callsHistoryScreenInternalAction;
        if ((callsHistoryScreenInternalAction2 instanceof CallsHistoryScreenInternalAction.ChangeItemsLoadingId) || (callsHistoryScreenInternalAction2 instanceof CallsHistoryScreenInternalAction.ChangeSelectedTab) || (callsHistoryScreenInternalAction2 instanceof CallsHistoryScreenInternalAction.SetOnlyLoadingItem)) {
            return null;
        }
        if (callsHistoryScreenInternalAction2 instanceof CallsHistoryScreenInternalAction.HandleLink) {
            return new a.b(((CallsHistoryScreenInternalAction.HandleLink) callsHistoryScreenInternalAction2).f164817b);
        }
        if (callsHistoryScreenInternalAction2 instanceof CallsHistoryScreenInternalAction.OnItemsLoaded) {
            return null;
        }
        if (callsHistoryScreenInternalAction2 instanceof CallsHistoryScreenInternalAction.OnItemsLoadingError) {
            return a.c.f20089a;
        }
        if (callsHistoryScreenInternalAction2 instanceof CallsHistoryScreenInternalAction.ChangeUnreadMissedCallsCounter) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
