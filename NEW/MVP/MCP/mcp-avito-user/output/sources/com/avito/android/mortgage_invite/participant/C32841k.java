package com.avito.android.mortgage_invite.participant;

import com.avito.android.R;
import com.avito.android.mortgage_invite.client_search.MortgageClientSearchFragment;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import com.avito.android.mortgage_invite.participant.ParticipantFragment;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: ParticipantFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.mortgage_invite.participant.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final /* synthetic */ class C32841k extends kotlin.jvm.internal.H implements Y41.l<MortgageClientSearchArguments, G0> {
    @Override // Y41.l
    public final G0 invoke(MortgageClientSearchArguments mortgageClientSearchArguments) {
        ParticipantFragment participantFragment = (ParticipantFragment) this.receiver;
        ParticipantFragment.a aVar = ParticipantFragment.f206038v0;
        participantFragment.getClass();
        MortgageClientSearchFragment.f205343r0.getClass();
        MortgageClientSearchFragment mortgageClientSearchFragmentA = MortgageClientSearchFragment.a.a(mortgageClientSearchArguments);
        androidx.fragment.app.H hE2 = participantFragment.getParentFragmentManager().e();
        hE2.n(R.id.container, mortgageClientSearchFragmentA, null);
        hE2.c(null);
        hE2.e();
        return G0.f406611a;
    }
}
