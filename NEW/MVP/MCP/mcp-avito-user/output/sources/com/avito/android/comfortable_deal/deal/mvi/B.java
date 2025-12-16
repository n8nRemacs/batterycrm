package com.avito.android.comfortable_deal.deal.mvi;

import Ep.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.comfortable_deal.api.model.TeamMemberPhone;
import com.avito.android.comfortable_deal.comment.model.CommentArguments;
import com.avito.android.comfortable_deal.deal.mvi.entity.DealInternalAction;
import com.avito.android.comfortable_deal.end_deal.model.EndDealArguments;
import com.avito.android.comfortable_deal.phone_call.model.PhoneCallArguments;
import com.avito.android.comfortable_deal.save_dialog.model.SaveArguments;
import com.avito.android.comfortable_deal.select_agent.model.SelectAgentArguments;
import com.avito.android.comfortable_deal.stages_transition.model.StagesTransitionArguments;
import cq.C39396a;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: DealOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/mvi/B;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/comfortable_deal/deal/mvi/entity/DealInternalAction;", "LEp/b;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B implements com.avito.android.arch.mvi.t<DealInternalAction, Ep.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f121569b;

    @Inject
    public B(@Y61.k String str) {
        this.f121569b = str;
    }

    @Override // com.avito.android.arch.mvi.t
    public final Ep.b b(DealInternalAction dealInternalAction) {
        Ep.b lVar;
        Ep.b qVar;
        DealInternalAction dealInternalAction2 = dealInternalAction;
        if (dealInternalAction2 instanceof DealInternalAction.OpenTransitionDialog) {
            DealInternalAction.OpenTransitionDialog openTransitionDialog = (DealInternalAction.OpenTransitionDialog) dealInternalAction2;
            return new b.k(new StagesTransitionArguments("REQUEST_TRANSITION", openTransitionDialog.f121624b, openTransitionDialog.f121625c, openTransitionDialog.f121626d));
        }
        if (dealInternalAction2 instanceof DealInternalAction.OpenSoldTransitionDialog) {
            DealInternalAction.OpenSoldTransitionDialog openSoldTransitionDialog = (DealInternalAction.OpenSoldTransitionDialog) dealInternalAction2;
            return new b.j(new EndDealArguments(Long.parseLong(openSoldTransitionDialog.f121618b), "REQUEST_SOLD_TRANSITION", openSoldTransitionDialog.f121619c, openSoldTransitionDialog.f121620d, openSoldTransitionDialog.f121621e, openSoldTransitionDialog.f121623g, this.f121569b));
        }
        if (dealInternalAction2 instanceof DealInternalAction.ShowSaveEndDealDataDialog) {
            lVar = new b.f(new SaveArguments("REQUEST_SAVE_TRANSITION_DATA", R.string.stages_end_deal_save_dialog_label, Integer.valueOf(R.string.stages_end_deal_save_dialog_description), R.string.stages_end_deal_save_dialog_return_button, R.string.stages_end_deal_save_dialog_cancel_button, false, true));
        } else if (dealInternalAction2 instanceof DealInternalAction.ShowSaveTransitionDataDialog) {
            lVar = new b.f(new SaveArguments("REQUEST_SAVE_TRANSITION_DATA", R.string.stages_transition_save_dialog_label, null, R.string.stages_transition_save_dialog_return_button, R.string.stages_transition_save_dialog_cancel_button, false, false));
        } else if (dealInternalAction2 instanceof DealInternalAction.OpenSellerItem) {
            lVar = new b.i(((DealInternalAction.OpenSellerItem) dealInternalAction2).f121617b);
        } else if (dealInternalAction2 instanceof DealInternalAction.OpenAgentItem) {
            lVar = new b.C0259b(((DealInternalAction.OpenAgentItem) dealInternalAction2).f121612b);
        } else {
            if (dealInternalAction2 instanceof DealInternalAction.PhoneCall) {
                DealInternalAction.PhoneCall phoneCall = (DealInternalAction.PhoneCall) dealInternalAction2;
                TeamMemberPhone teamMemberPhone = phoneCall.f121629d;
                String number = teamMemberPhone.getNumber();
                boolean z12 = number == null || number.length() == 0;
                String str = phoneCall.f121628c;
                String str2 = phoneCall.f121627b;
                return new b.c(!z12 ? new PhoneCallArguments.Phone(str, str2, teamMemberPhone.getNumber(), teamMemberPhone.getIsVirtual()) : new PhoneCallArguments.NoPhone(str, str2));
            }
            if (dealInternalAction2 instanceof DealInternalAction.SelectAgent) {
                DealInternalAction.SelectAgent selectAgent = (DealInternalAction.SelectAgent) dealInternalAction2;
                return new b.g(new SelectAgentArguments("REQUEST_SELECT_AGENT", selectAgent.f121640b, selectAgent.f121641c));
            }
            if (dealInternalAction2 instanceof DealInternalAction.OpenAddCommentDialog) {
                DealInternalAction.OpenAddCommentDialog openAddCommentDialog = (DealInternalAction.OpenAddCommentDialog) dealInternalAction2;
                return new b.d(new CommentArguments("REQUEST_ADD_COMMENT", openAddCommentDialog.f121611c, openAddCommentDialog.f121610b));
            }
            if (dealInternalAction2 instanceof DealInternalAction.ShowSaveCommentDialog) {
                lVar = new b.f(new SaveArguments("REQUEST_SAVE_COMMENT", R.string.comment_save_dialog_label, Integer.valueOf(R.string.comment_save_dialog_description), R.string.comment_save_dialog_yes_button, R.string.comment_save_dialog_no_button, true, true));
            } else if (dealInternalAction2 instanceof DealInternalAction.SpeedChangeDialog) {
                lVar = new b.h(((DealInternalAction.SpeedChangeDialog) dealInternalAction2).f121645b);
            } else {
                if (dealInternalAction2 instanceof DealInternalAction.Close) {
                    return b.a.f4299a;
                }
                if (dealInternalAction2 instanceof DealInternalAction.PlaybackError) {
                    return new b.n(com.avito.android.printable_text.b.c(R.string.client_room_play_error, new Serializable[0]), null, 2, null);
                }
                if (dealInternalAction2 instanceof DealInternalAction.RecallRequestSubmitResult) {
                    DealInternalAction.RecallRequestSubmitResult recallRequestSubmitResult = (DealInternalAction.RecallRequestSubmitResult) dealInternalAction2;
                    C39396a c39396a = recallRequestSubmitResult.f121631b;
                    boolean z13 = c39396a.f392957c;
                    String str3 = c39396a.f392955a;
                    String str4 = c39396a.f392956b;
                    boolean z14 = recallRequestSubmitResult.f121633d;
                    String str5 = recallRequestSubmitResult.f121632c;
                    if (z13) {
                        String str6 = C43066x.K(str4) ? null : str4;
                        qVar = new b.p(str6 != null ? com.avito.android.printable_text.b.f(str6) : com.avito.android.printable_text.b.c(R.string.comfortable_deal_common_error, new Serializable[0]), str3, str5, z14);
                    } else {
                        qVar = new b.q(com.avito.android.printable_text.b.f(str4), str3, str5, z14);
                    }
                    return qVar;
                }
                if (dealInternalAction2 instanceof DealInternalAction.OpenRecallRequestDialogClicked) {
                    DealInternalAction.OpenRecallRequestDialogClicked openRecallRequestDialogClicked = (DealInternalAction.OpenRecallRequestDialogClicked) dealInternalAction2;
                    lVar = new b.e(openRecallRequestDialogClicked.f121615b, openRecallRequestDialogClicked.f121616c);
                } else {
                    if (dealInternalAction2 instanceof DealInternalAction.WrongPhoneError) {
                        return new b.n(com.avito.android.printable_text.b.c(R.string.client_room_phone_error, new Serializable[0]), null, 2, null);
                    }
                    if (!(dealInternalAction2 instanceof DealInternalAction.OpenDeepLink)) {
                        if (dealInternalAction2 instanceof DealInternalAction.ReloadVdrList) {
                            return b.m.f4313a;
                        }
                        return null;
                    }
                    DealInternalAction.OpenDeepLink openDeepLink = (DealInternalAction.OpenDeepLink) dealInternalAction2;
                    lVar = new b.l(openDeepLink.f121613b, openDeepLink.f121614c);
                }
            }
        }
        return lVar;
    }
}
