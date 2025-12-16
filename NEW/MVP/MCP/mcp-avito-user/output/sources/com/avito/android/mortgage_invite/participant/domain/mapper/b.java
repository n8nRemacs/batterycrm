package com.avito.android.mortgage_invite.participant.domain.mapper;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantType;
import j20.C42181a;
import j20.C42182b;
import j20.C42183c;
import j20.f;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import o20.C44572a;

/* compiled from: ParticipantResponseMapper.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/domain/mapper/b;", "Lcom/avito/android/mortgage_invite/participant/domain/mapper/a;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    public static o20.d b(ParticipantFieldId participantFieldId, ParticipantType participantType, f fVar) {
        String title = fVar.getTitle();
        String placeholder = fVar.getPlaceholder();
        boolean zContains = d.f206096a.contains(participantFieldId);
        boolean zContains2 = d.f206097b.contains(participantFieldId);
        String value = fVar.getValue();
        if (value == null) {
            value = "";
        }
        if (participantType == ParticipantType.f206113d && value.length() != 0) {
            value = C43066x.U("7", value);
        }
        String str = value;
        Boolean isMasked = fVar.getIsMasked();
        return new o20.d(participantFieldId, participantType, title, placeholder, zContains, zContains2, str, null, isMasked != null ? isMasked.booleanValue() : false, false, 512, null);
    }

    @Override // com.avito.android.mortgage_invite.participant.domain.mapper.a
    @k
    public final o20.c a(@k C42181a c42181a) {
        String screenTitle = c42181a.getScreenTitle();
        String title = c42181a.getTitle();
        String action = c42181a.getAction();
        C42183c clientBlock = c42181a.getContent().getClientBlock();
        String title2 = clientBlock.getTitle();
        o20.d dVarB = b(ParticipantFieldId.f206099b, ParticipantType.f206111b, clientBlock.getClientSearch());
        ParticipantFieldId participantFieldId = ParticipantFieldId.f206100c;
        ParticipantType participantType = ParticipantType.f206112c;
        o20.d dVarB2 = b(participantFieldId, participantType, clientBlock.getPhone());
        String value = clientBlock.getEmail().getValue();
        o20.d dVarB3 = (value == null || value.length() == 0) ? null : b(ParticipantFieldId.f206101d, ParticipantType.f206114e, clientBlock.getEmail());
        o20.d dVarB4 = b(ParticipantFieldId.f206102e, participantType, clientBlock.getFirstName());
        o20.d dVarB5 = b(ParticipantFieldId.f206104g, participantType, clientBlock.getLastName());
        o20.d dVarB6 = b(ParticipantFieldId.f206103f, participantType, clientBlock.getMiddleName());
        ParticipantFieldId participantFieldId2 = ParticipantFieldId.f206105h;
        ParticipantType participantType2 = ParticipantType.f206113d;
        C44572a c44572a = new C44572a(title2, C42756l.B(new o20.d[]{dVarB, dVarB2, dVarB3, dVarB4, dVarB5, dVarB6, b(participantFieldId2, participantType2, clientBlock.getPhone()), b(ParticipantFieldId.f206106i, ParticipantType.f206114e, clientBlock.getEmail())}), false);
        C42182b agentBlock = c42181a.getContent().getAgentBlock();
        C44572a c44572a2 = new C44572a(agentBlock.getTitle(), C42745f0.U(b(ParticipantFieldId.f206107j, participantType, agentBlock.getFullName()), b(ParticipantFieldId.f206108k, participantType2, agentBlock.getPhone())), false);
        j20.d participantFormClosingConfirm = c42181a.getParticipantFormClosingConfirm();
        return new o20.c(screenTitle, title, action, false, c44572a, c44572a2, new o20.b(participantFormClosingConfirm.getTitle(), participantFormClosingConfirm.getDescription(), participantFormClosingConfirm.getDeclineActionTitle(), participantFormClosingConfirm.getConfirmActionTitle()));
    }
}
