package com.avito.android.mortgage_invite.participant.interactor;

import Y61.k;
import Y61.l;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction;
import kotlin.Metadata;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ParticipantsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/interactor/d;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d {
    @k
    InterfaceC43160i<ParticipantInternalAction> a(@k o20.c cVar, @l MortgageClient mortgageClient);

    @k
    InterfaceC43160i<ParticipantInternalAction> load();
}
