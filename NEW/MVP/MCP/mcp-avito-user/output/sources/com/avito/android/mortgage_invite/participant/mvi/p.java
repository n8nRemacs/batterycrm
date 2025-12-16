package com.avito.android.mortgage_invite.participant.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.mortgage_invite.participant.mvi.entity.ParticipantInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import p20.InterfaceC46878c;

/* compiled from: ParticipantOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/mvi/p;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/mortgage_invite/participant/mvi/entity/ParticipantInternalAction;", "Lp20/c;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class p implements t<ParticipantInternalAction, InterfaceC46878c> {
    @Inject
    public p() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC46878c b(ParticipantInternalAction participantInternalAction) {
        ParticipantInternalAction participantInternalAction2 = participantInternalAction;
        if (participantInternalAction2 instanceof ParticipantInternalAction.Back) {
            return new InterfaceC46878c.b(((ParticipantInternalAction.Back) participantInternalAction2).f206191b);
        }
        if (participantInternalAction2 instanceof ParticipantInternalAction.Close) {
            return InterfaceC46878c.C12253c.f428140a;
        }
        if (participantInternalAction2 instanceof ParticipantInternalAction.CreateApplicationLoadingFailed) {
            return new InterfaceC46878c.e(com.avito.android.printable_text.b.c(R.string.contact_info_create_application_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.contact_info_create_application_error_action, new Serializable[0]));
        }
        if (participantInternalAction2 instanceof ParticipantInternalAction.CreateApplicationLoadingCompleted) {
            ParticipantInternalAction.CreateApplicationLoadingCompleted createApplicationLoadingCompleted = (ParticipantInternalAction.CreateApplicationLoadingCompleted) participantInternalAction2;
            String str = createApplicationLoadingCompleted.f206196b;
            return str == null ? new InterfaceC46878c.e(com.avito.android.printable_text.b.c(R.string.contact_info_create_application_error, new Serializable[0]), com.avito.android.printable_text.b.c(R.string.contact_info_create_application_error_action, new Serializable[0])) : new InterfaceC46878c.a(createApplicationLoadingCompleted.f206197c, str);
        }
        if (participantInternalAction2 instanceof ParticipantInternalAction.OpenClientSearch) {
            return new InterfaceC46878c.d(((ParticipantInternalAction.OpenClientSearch) participantInternalAction2).f206206b);
        }
        return null;
    }
}
