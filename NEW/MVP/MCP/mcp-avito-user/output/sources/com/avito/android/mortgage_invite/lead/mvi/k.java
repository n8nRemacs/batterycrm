package com.avito.android.mortgage_invite.lead.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage_invite.lead.mvi.entity.ApplicationLeadInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ApplicationLeadReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_invite/lead/mvi/k;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage_invite/lead/mvi/entity/ApplicationLeadInternalAction;", "Ln20/c;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements u<ApplicationLeadInternalAction, n20.c> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final n20.c a(ApplicationLeadInternalAction applicationLeadInternalAction, n20.c cVar) {
        ApplicationLeadInternalAction applicationLeadInternalAction2 = applicationLeadInternalAction;
        n20.c cVar2 = cVar;
        return applicationLeadInternalAction2 instanceof ApplicationLeadInternalAction.SelectLead ? new n20.c(cVar2.f414863b, cVar2.f414864c, ((ApplicationLeadInternalAction.SelectLead) applicationLeadInternalAction2).f205909b) : cVar2;
    }
}
