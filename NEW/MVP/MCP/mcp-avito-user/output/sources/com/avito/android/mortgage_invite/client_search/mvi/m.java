package com.avito.android.mortgage_invite.client_search.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import com.avito.android.mortgage_invite.client_search.mvi.entity.ClientSearchInternalAction;
import com.avito.android.mortgage_invite.client_search.mvi.entity.PagingState;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;

/* compiled from: ClientSearchReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "LW10/c;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements u<ClientSearchInternalAction, W10.c> {
    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final W10.c a(ClientSearchInternalAction clientSearchInternalAction, W10.c cVar) {
        ClientSearchInternalAction clientSearchInternalAction2 = clientSearchInternalAction;
        W10.c cVar2 = cVar;
        if (clientSearchInternalAction2 instanceof ClientSearchInternalAction.Init) {
            MortgageClientSearchArguments mortgageClientSearchArguments = ((ClientSearchInternalAction.Init) clientSearchInternalAction2).f205431b;
            return W10.c.a(cVar2, mortgageClientSearchArguments.f205405c, mortgageClientSearchArguments.f205406d, mortgageClientSearchArguments.f205404b, null, null, 24);
        }
        if (clientSearchInternalAction2 instanceof ClientSearchInternalAction.UpdateSearchQuery) {
            return W10.c.a(cVar2, null, null, ((ClientSearchInternalAction.UpdateSearchQuery) clientSearchInternalAction2).f205436b, C42784z0.f406748b, PagingState.f205437b, 3);
        }
        if (clientSearchInternalAction2 instanceof ClientSearchInternalAction.PageLoadingStarted) {
            return W10.c.a(cVar2, null, null, null, null, PagingState.f205437b, 15);
        }
        if (clientSearchInternalAction2 instanceof ClientSearchInternalAction.PageLoadingFailed) {
            return W10.c.a(cVar2, null, null, null, null, PagingState.f205438c, 15);
        }
        if (!(clientSearchInternalAction2 instanceof ClientSearchInternalAction.PageLoadingCompleted)) {
            return cVar2;
        }
        List<MortgageClient> list = ((ClientSearchInternalAction.PageLoadingCompleted) clientSearchInternalAction2).f205432b;
        return W10.c.a(cVar2, null, null, null, C42745f0.h0(list, cVar2.f17562e), list.size() == 20 ? PagingState.f205439d : PagingState.f205440e, 7);
    }
}
