package com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi;

import ce.C27181b;
import com.avito.android.arch.mvi.a;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity.FactorUnavailableReasonAction;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity.FactorUnavailableReasonInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FactorUnavailableReasonActor.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonAction;", "Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonInternalAction;", "Lce/b;", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a implements com.avito.android.arch.mvi.a<FactorUnavailableReasonAction, FactorUnavailableReasonInternalAction, C27181b> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<FactorUnavailableReasonInternalAction> b(FactorUnavailableReasonAction factorUnavailableReasonAction, C27181b c27181b) {
        FactorUnavailableReasonAction factorUnavailableReasonAction2 = factorUnavailableReasonAction;
        if (factorUnavailableReasonAction2.equals(FactorUnavailableReasonAction.a.f93151b)) {
            return new C43210w(FactorUnavailableReasonInternalAction.a.f93158b);
        }
        if (factorUnavailableReasonAction2 == FactorUnavailableReasonAction.Select.f93147b) {
            return new C43210w(FactorUnavailableReasonInternalAction.Select.f93154b);
        }
        if (factorUnavailableReasonAction2 == FactorUnavailableReasonAction.Select.f93148c) {
            return new C43210w(FactorUnavailableReasonInternalAction.Select.f93155c);
        }
        if (factorUnavailableReasonAction2.equals(FactorUnavailableReasonAction.b.f93152b)) {
            return new C43210w(FactorUnavailableReasonInternalAction.c.f93162b);
        }
        if (factorUnavailableReasonAction2.equals(FactorUnavailableReasonAction.c.f93153b)) {
            return new C43210w(FactorUnavailableReasonInternalAction.e.f93164b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
