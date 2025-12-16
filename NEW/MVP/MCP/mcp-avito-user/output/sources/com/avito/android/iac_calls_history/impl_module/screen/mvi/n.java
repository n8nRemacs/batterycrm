package com.avito.android.iac_calls_history.impl_module.screen.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTab;
import com.avito.android.iac_calls_history.impl_module.models.CallsHistoryTabType;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenInternalAction;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.LoadingCallsHistoryItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: CallsHistoryScreenReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenInternalAction;", "Lcom/avito/android/iac_calls_history/impl_module/screen/mvi/entity/CallsHistoryScreenState;", "<init>", "()V", "_avito_iac-calls-history_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class n implements u<CallsHistoryScreenInternalAction, CallsHistoryScreenState> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final CallsHistoryScreenState a(CallsHistoryScreenInternalAction callsHistoryScreenInternalAction, CallsHistoryScreenState callsHistoryScreenState) {
        CallsHistoryScreenInternalAction callsHistoryScreenInternalAction2 = callsHistoryScreenInternalAction;
        CallsHistoryScreenState callsHistoryScreenState2 = callsHistoryScreenState;
        if (callsHistoryScreenInternalAction2 instanceof CallsHistoryScreenInternalAction.ChangeItemsLoadingId) {
            return CallsHistoryScreenState.a(callsHistoryScreenState2, null, 0, ((CallsHistoryScreenInternalAction.ChangeItemsLoadingId) callsHistoryScreenInternalAction2).f164814b, null, 27);
        }
        if (callsHistoryScreenInternalAction2 instanceof CallsHistoryScreenInternalAction.ChangeSelectedTab) {
            return CallsHistoryScreenState.a(callsHistoryScreenState2, null, ((CallsHistoryScreenInternalAction.ChangeSelectedTab) callsHistoryScreenInternalAction2).f164815b, null, null, 29);
        }
        if (callsHistoryScreenInternalAction2 instanceof CallsHistoryScreenInternalAction.SetOnlyLoadingItem) {
            return CallsHistoryScreenState.a(callsHistoryScreenState2, null, 0, null, Collections.singletonList(LoadingCallsHistoryItem.f164848b), 23);
        }
        if (callsHistoryScreenInternalAction2 instanceof CallsHistoryScreenInternalAction.HandleLink) {
            return callsHistoryScreenState2;
        }
        if (callsHistoryScreenInternalAction2 instanceof CallsHistoryScreenInternalAction.OnItemsLoaded) {
            List<CallsHistoryScreenState.Item> list = callsHistoryScreenState2.f164827e;
            LoadingCallsHistoryItem loadingCallsHistoryItem = LoadingCallsHistoryItem.f164848b;
            CallsHistoryScreenInternalAction.OnItemsLoaded onItemsLoaded = (CallsHistoryScreenInternalAction.OnItemsLoaded) callsHistoryScreenInternalAction2;
            ArrayList arrayListH0 = C42745f0.h0((Iterable) onItemsLoaded.f164819c, C42745f0.c0(list, loadingCallsHistoryItem));
            return CallsHistoryScreenState.a(callsHistoryScreenState2, null, 0, null, onItemsLoaded.f164818b ? C42745f0.i0(loadingCallsHistoryItem, arrayListH0) : arrayListH0, 23);
        }
        if (callsHistoryScreenInternalAction2 instanceof CallsHistoryScreenInternalAction.OnItemsLoadingError) {
            return callsHistoryScreenState2;
        }
        if (!(callsHistoryScreenInternalAction2 instanceof CallsHistoryScreenInternalAction.ChangeUnreadMissedCallsCounter)) {
            throw new NoWhenBranchMatchedException();
        }
        List<CallsHistoryTab> list2 = callsHistoryScreenState2.f164824b;
        ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
        for (CallsHistoryTab callsHistoryTab : list2) {
            CallsHistoryTabType callsHistoryTabType = callsHistoryTab.f164753b;
            if (callsHistoryTabType == CallsHistoryTabType.f164756c) {
                callsHistoryTab = new CallsHistoryTab(callsHistoryTabType, ((CallsHistoryScreenInternalAction.ChangeUnreadMissedCallsCounter) callsHistoryScreenInternalAction2).f164816b);
            }
            arrayList.add(callsHistoryTab);
        }
        return CallsHistoryScreenState.a(callsHistoryScreenState2, arrayList, 0, null, null, 30);
    }
}
