package com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi;

import ce.InterfaceC27180a;
import com.avito.android.arch.mvi.t;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity.FactorUnavailableReasonInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FactorUnavailableReasonOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction;", "Lce/a;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class l implements t<FactorUnavailableReasonInternalAction, InterfaceC27180a> {
    @Inject
    public l() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC27180a b(FactorUnavailableReasonInternalAction factorUnavailableReasonInternalAction) {
        FactorUnavailableReasonInternalAction factorUnavailableReasonInternalAction2 = factorUnavailableReasonInternalAction;
        if (factorUnavailableReasonInternalAction2 instanceof FactorUnavailableReasonInternalAction.b) {
            FactorUnavailableReasonInternalAction.b bVar = (FactorUnavailableReasonInternalAction.b) factorUnavailableReasonInternalAction2;
            return new InterfaceC27180a.b(bVar.f93159b, bVar.f93160c, bVar.f93161d);
        }
        if (factorUnavailableReasonInternalAction2 instanceof FactorUnavailableReasonInternalAction.d) {
            return new InterfaceC27180a.C2051a(((FactorUnavailableReasonInternalAction.d) factorUnavailableReasonInternalAction2).f93163b);
        }
        return null;
    }
}
