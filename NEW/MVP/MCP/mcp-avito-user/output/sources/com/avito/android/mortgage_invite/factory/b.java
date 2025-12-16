package com.avito.android.mortgage_invite.factory;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.model.participant.ParticipantArguments;
import com.avito.android.mortgage_invite.participant.ParticipantFragment;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MortgageInviteFragmentFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/factory/b;", "Lcom/avito/android/mortgage_invite/factory/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.mortgage_invite.factory.a
    public final ParticipantFragment a(ParticipantArguments participantArguments) {
        ParticipantFragment.f206038v0.getClass();
        return ParticipantFragment.a.a(participantArguments);
    }
}
