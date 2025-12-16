package com.avito.android.mortgage_invite.client_search.mvi;

import W10.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage_invite.client_search.mvi.entity.ClientSearchInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ClientSearchOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_invite/client_search/mvi/k;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage_invite/client_search/mvi/entity/ClientSearchInternalAction;", "LW10/b;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements t<ClientSearchInternalAction, W10.b> {
    @Inject
    public k() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final W10.b b(ClientSearchInternalAction clientSearchInternalAction) {
        ClientSearchInternalAction clientSearchInternalAction2 = clientSearchInternalAction;
        if (clientSearchInternalAction2 instanceof ClientSearchInternalAction.Back) {
            return b.a.f17554a;
        }
        if (clientSearchInternalAction2 instanceof ClientSearchInternalAction.CreateNewClient) {
            return b.c.f17556a;
        }
        if (clientSearchInternalAction2 instanceof ClientSearchInternalAction.SelectClient) {
            return new b.C1222b(((ClientSearchInternalAction.SelectClient) clientSearchInternalAction2).f205435b);
        }
        return null;
    }
}
