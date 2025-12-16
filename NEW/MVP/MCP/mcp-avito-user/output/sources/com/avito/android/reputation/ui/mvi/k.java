package com.avito.android.reputation.ui.mvi;

import Rm0.c;
import com.avito.android.arch.mvi.u;
import com.avito.android.reputation.ui.mvi.entity.ReputationInternalAction;
import javax.inject.Inject;
import kotlin.AbstractC40048c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: ReputationReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/reputation/ui/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/reputation/ui/mvi/entity/ReputationInternalAction;", "LRm0/c;", "<init>", "()V", "_avito_reputation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements u<ReputationInternalAction, Rm0.c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final Rm0.c a(ReputationInternalAction reputationInternalAction, Rm0.c cVar) {
        ReputationInternalAction reputationInternalAction2 = reputationInternalAction;
        if (reputationInternalAction2 instanceof ReputationInternalAction.ScreenLoading) {
            return c.d.f14615b;
        }
        if (!(reputationInternalAction2 instanceof ReputationInternalAction.HandleBeduinState)) {
            if (reputationInternalAction2 instanceof ReputationInternalAction.ScreenLoadedError) {
                return c.b.f14613b;
            }
            if (reputationInternalAction2 instanceof ReputationInternalAction.ScreenLoaded ? true : reputationInternalAction2 instanceof ReputationInternalAction.HandleBeduinEvent) {
                return c.C0977c.f14614b;
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC40048c.C11084c c11084c = AbstractC40048c.C11084c.f395217b;
        AbstractC40048c abstractC40048c = ((ReputationInternalAction.HandleBeduinState) reputationInternalAction2).f255063b;
        if (L.f(abstractC40048c, c11084c) ? true : L.f(abstractC40048c, AbstractC40048c.d.f395218b)) {
            return c.C0977c.f14614b;
        }
        if (abstractC40048c instanceof AbstractC40048c.a) {
            return new c.a(abstractC40048c, ((AbstractC40048c.a) abstractC40048c).getF395211c());
        }
        if (abstractC40048c instanceof AbstractC40048c.b) {
            return c.b.f14613b;
        }
        throw new NoWhenBranchMatchedException();
    }
}
