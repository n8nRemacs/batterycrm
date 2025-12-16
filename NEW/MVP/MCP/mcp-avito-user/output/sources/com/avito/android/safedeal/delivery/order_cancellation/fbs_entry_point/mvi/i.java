package com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi;

import Gn0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.safedeal.delivery.order_cancellation.fbs_entry_point.mvi.entity.FbsEntryPointInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: FbsEntryPointOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/safedeal/delivery/order_cancellation/fbs_entry_point/mvi/entity/FbsEntryPointInternalAction;", "LGn0/b;", "<init>", "()V", "_avito_safedeal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements t<FbsEntryPointInternalAction, Gn0.b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Gn0.b b(FbsEntryPointInternalAction fbsEntryPointInternalAction) {
        Gn0.b cVar;
        FbsEntryPointInternalAction fbsEntryPointInternalAction2 = fbsEntryPointInternalAction;
        if (fbsEntryPointInternalAction2 instanceof FbsEntryPointInternalAction.CloseScreen) {
            return b.a.f6730a;
        }
        if (fbsEntryPointInternalAction2 instanceof FbsEntryPointInternalAction.HandleDeeplink) {
            cVar = new b.C0370b(((FbsEntryPointInternalAction.HandleDeeplink) fbsEntryPointInternalAction2).f256349b);
        } else {
            if (!(fbsEntryPointInternalAction2 instanceof FbsEntryPointInternalAction.ShowScreen)) {
                throw new NoWhenBranchMatchedException();
            }
            FbsEntryPointInternalAction.ShowScreen showScreen = (FbsEntryPointInternalAction.ShowScreen) fbsEntryPointInternalAction2;
            cVar = new b.c(showScreen.f256351c, showScreen.f256350b);
        }
        return cVar;
    }
}
