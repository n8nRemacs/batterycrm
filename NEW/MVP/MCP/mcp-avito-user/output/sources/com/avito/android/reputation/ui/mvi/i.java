package com.avito.android.reputation.ui.mvi;

import Rm0.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.reputation.ui.mvi.entity.ReputationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ReputationOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/reputation/ui/mvi/i;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction;", "LRm0/b;", "<init>", "()V", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class i implements t<ReputationInternalAction, Rm0.b> {
    @Inject
    public i() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Rm0.b b(ReputationInternalAction reputationInternalAction) {
        ReputationInternalAction reputationInternalAction2 = reputationInternalAction;
        if (reputationInternalAction2 instanceof ReputationInternalAction.ScreenLoaded) {
            return new b.C0976b(((ReputationInternalAction.ScreenLoaded) reputationInternalAction2).f255064b);
        }
        if (reputationInternalAction2 instanceof ReputationInternalAction.HandleBeduinState) {
            return b.a.f14609a;
        }
        if (reputationInternalAction2 instanceof ReputationInternalAction.HandleBeduinEvent ? true : reputationInternalAction2 instanceof ReputationInternalAction.ScreenLoadedError ? true : reputationInternalAction2 instanceof ReputationInternalAction.ScreenLoading) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
