package com.avito.android.comfortable_deal_invite.lead.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.comfortable_deal_invite.lead.mvi.entity.ComfortableDealInviteInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import zq.C50611c;

/* compiled from: ComfortableDealInviteReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/comfortable_deal_invite/lead/mvi/n;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/comfortable_deal_invite/lead/mvi/entity/ComfortableDealInviteInternalAction;", "Lzq/c;", "<init>", "()V", "_avito_comfortable-deal-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class n implements u<ComfortableDealInviteInternalAction, C50611c> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final C50611c a(ComfortableDealInviteInternalAction comfortableDealInviteInternalAction, C50611c c50611c) {
        ComfortableDealInviteInternalAction comfortableDealInviteInternalAction2 = comfortableDealInviteInternalAction;
        C50611c c50611c2 = c50611c;
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.SaveClientData) {
            return C50611c.a(c50611c2, ((ComfortableDealInviteInternalAction.SaveClientData) comfortableDealInviteInternalAction2).f123703b, false, null, null, null, false, null, false, null, false, null, false, null, false, null, false, false, false, false, 2097148);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.LinkInputValueChange) {
            return C50611c.a(c50611c2, null, false, ((ComfortableDealInviteInternalAction.LinkInputValueChange) comfortableDealInviteInternalAction2).f123696b, null, null, false, null, false, null, false, null, false, null, false, null, false, false, false, false, 2097103);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.CommissionInputValueChanged) {
            return C50611c.a(c50611c2, null, false, null, null, ((ComfortableDealInviteInternalAction.CommissionInputValueChanged) comfortableDealInviteInternalAction2).f123688b, false, null, false, null, false, null, false, null, false, null, false, false, false, false, 2096959);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.ContractSignedChecked) {
            return C50611c.a(c50611c2, null, false, null, null, null, false, Boolean.valueOf(((ComfortableDealInviteInternalAction.ContractSignedChecked) comfortableDealInviteInternalAction2).f123689b), false, null, false, null, false, null, false, null, false, false, false, false, 2096383);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.HasMinorOwnersChecked) {
            return C50611c.a(c50611c2, null, false, null, null, null, false, null, false, Boolean.valueOf(((ComfortableDealInviteInternalAction.HasMinorOwnersChecked) comfortableDealInviteInternalAction2).f123690b), false, null, false, null, false, null, false, false, false, false, 2094079);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.HasRestrictionsChecked) {
            return C50611c.a(c50611c2, null, false, null, null, null, false, null, false, null, false, Boolean.valueOf(((ComfortableDealInviteInternalAction.HasRestrictionsChecked) comfortableDealInviteInternalAction2).f123691b), false, null, false, null, false, false, false, false, 2084863);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.ResponsibleAgentValueChanged) {
            return C50611c.a(c50611c2, null, false, null, null, null, false, null, false, null, false, null, false, ((ComfortableDealInviteInternalAction.ResponsibleAgentValueChanged) comfortableDealInviteInternalAction2).f123702b, false, null, false, false, false, false, 2047999);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.CommentValueChanged) {
            return C50611c.a(c50611c2, null, false, null, null, null, false, null, false, null, false, null, false, null, false, ((ComfortableDealInviteInternalAction.CommentValueChanged) comfortableDealInviteInternalAction2).f123687b, false, false, false, false, 2031615);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.IsCallConfirmedChecked) {
            return C50611c.a(c50611c2, null, false, null, null, null, false, null, false, null, false, null, false, null, false, null, ((ComfortableDealInviteInternalAction.IsCallConfirmedChecked) comfortableDealInviteInternalAction2).f123692b, false, false, false, 1703935);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.IsTermsConfirmedChecked) {
            return C50611c.a(c50611c2, null, false, null, null, null, false, null, false, null, false, null, false, null, false, null, false, false, ((ComfortableDealInviteInternalAction.IsTermsConfirmedChecked) comfortableDealInviteInternalAction2).f123693b, false, 524287);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.LinkInputErrorValueChange) {
            return C50611c.a(c50611c2, null, false, null, ((ComfortableDealInviteInternalAction.LinkInputErrorValueChange) comfortableDealInviteInternalAction2).f123695b, null, false, null, false, null, false, null, false, null, false, null, false, false, false, false, 2097119);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.CommissionInputIsEmpty) {
            ((ComfortableDealInviteInternalAction.CommissionInputIsEmpty) comfortableDealInviteInternalAction2).getClass();
            return C50611c.a(c50611c2, null, false, null, null, null, true, null, false, null, false, null, false, null, false, null, false, false, false, false, 2097023);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.ContractSignedIsEmpty) {
            ((ComfortableDealInviteInternalAction.ContractSignedIsEmpty) comfortableDealInviteInternalAction2).getClass();
            return C50611c.a(c50611c2, null, false, null, null, null, false, null, true, null, false, null, false, null, false, null, false, false, false, false, 2096639);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.HasMinorOwnersIsEmpty) {
            ((ComfortableDealInviteInternalAction.HasMinorOwnersIsEmpty) comfortableDealInviteInternalAction2).getClass();
            return C50611c.a(c50611c2, null, false, null, null, null, false, null, false, null, true, null, false, null, false, null, false, false, false, false, 2095103);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.HasRestrictionsIsEmpty) {
            ((ComfortableDealInviteInternalAction.HasRestrictionsIsEmpty) comfortableDealInviteInternalAction2).getClass();
            return C50611c.a(c50611c2, null, false, null, null, null, false, null, false, null, false, null, true, null, false, null, false, false, false, false, 2088959);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.ResponsibleAgentIsEmpty) {
            ((ComfortableDealInviteInternalAction.ResponsibleAgentIsEmpty) comfortableDealInviteInternalAction2).getClass();
            return C50611c.a(c50611c2, null, false, null, null, null, false, null, false, null, false, null, false, null, true, null, false, false, false, false, 2064383);
        }
        if (comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.IsCallConfirmedEmpty) {
            ((ComfortableDealInviteInternalAction.IsCallConfirmedEmpty) comfortableDealInviteInternalAction2).getClass();
            return C50611c.a(c50611c2, null, false, null, null, null, false, null, false, null, false, null, false, null, false, null, false, true, false, false, 1835007);
        }
        if (!(comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.IsTermsConfirmedEmpty)) {
            return comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.StartLoading ? C50611c.a(c50611c2, null, true, null, null, null, false, null, false, null, false, null, false, null, false, null, false, false, false, false, 2097147) : comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.LeadCreated ? C50611c.a(c50611c2, null, false, null, null, null, false, null, false, null, false, null, false, null, false, null, false, false, false, false, 2097139) : comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.OnFailure ? C50611c.a(c50611c2, null, false, null, null, null, false, null, false, null, false, null, false, null, false, null, false, false, false, false, 2097147) : comfortableDealInviteInternalAction2 instanceof ComfortableDealInviteInternalAction.OnLinkInputFailure ? C50611c.a(c50611c2, null, false, null, com.avito.android.printable_text.b.f(((ComfortableDealInviteInternalAction.OnLinkInputFailure) comfortableDealInviteInternalAction2).f123699b), null, false, null, false, null, false, null, false, null, false, null, false, false, false, false, 2097115) : c50611c2;
        }
        ((ComfortableDealInviteInternalAction.IsTermsConfirmedEmpty) comfortableDealInviteInternalAction2).getClass();
        return C50611c.a(c50611c2, null, false, null, null, null, false, null, false, null, false, null, false, null, false, null, false, false, false, true, 1048575);
    }
}
