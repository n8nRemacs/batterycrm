package com.avito.android.virtual_deal_room_invite.invite.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.GetInvitationApiV1Response;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.a;
import com.avito.android.virtual_deal_room_invite.invite.mvi.entity.InviteInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import nO0.C44303d;

/* compiled from: InviteReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "LnO0/d;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class l implements u<InviteInternalAction, C44303d> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.virtual_deal_room_invite.invite.mvi.builder.a f327096b;

    @Inject
    public l(@Y61.k com.avito.android.virtual_deal_room_invite.invite.mvi.builder.a aVar) {
        this.f327096b = aVar;
    }

    @Override // com.avito.android.arch.mvi.u
    public final C44303d a(InviteInternalAction inviteInternalAction, C44303d c44303d) {
        InviteInternalAction inviteInternalAction2 = inviteInternalAction;
        C44303d c44303dA = c44303d;
        if (!inviteInternalAction2.equals(InviteInternalAction.Close.f327069b)) {
            if (inviteInternalAction2 instanceof InviteInternalAction.Content) {
                InviteInternalAction.Content content = (InviteInternalAction.Content) inviteInternalAction2;
                boolean z12 = content.f327072d != null;
                GetInvitationApiV1Response getInvitationApiV1Response = content.f327070b;
                com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.a details = getInvitationApiV1Response.getDetails();
                a.b bVar = details instanceof a.b ? (a.b) details : null;
                c44303dA = C44303d.a(c44303dA, getInvitationApiV1Response, content.f327071c, z12, bVar != null ? Integer.valueOf((int) bVar.getSecondsUntilExpires()) : null, false, false, false, false, false, null, 768);
            } else if (inviteInternalAction2 instanceof InviteInternalAction.CountDownValidationTimer) {
                c44303dA = C44303d.a(c44303dA, null, null, false, Integer.valueOf(((InviteInternalAction.CountDownValidationTimer) inviteInternalAction2).f327073b), false, false, false, false, false, null, 1015);
            } else if (inviteInternalAction2 instanceof InviteInternalAction.Error) {
                c44303dA = C44303d.a(c44303dA, null, null, false, null, false, ((InviteInternalAction.Error) inviteInternalAction2).f327075c, true, false, false, null, 911);
            } else if (inviteInternalAction2 instanceof InviteInternalAction.NoInternet) {
                c44303dA = C44303d.a(c44303dA, null, null, false, null, false, false, true, true, false, null, 783);
            } else if (inviteInternalAction2 instanceof InviteInternalAction.FailureSubmit) {
                c44303dA = C44303d.a(c44303dA, null, null, false, null, false, false, false, false, false, null, 767);
            } else if (!(inviteInternalAction2 instanceof InviteInternalAction.OpenDeeplink) && !(inviteInternalAction2 instanceof InviteInternalAction.ShowDeclinePopup)) {
                if (inviteInternalAction2 instanceof InviteInternalAction.ShowPlaceholders) {
                    c44303dA = C44303d.a(c44303dA, null, null, false, null, true, false, false, false, false, null, 783);
                } else if (inviteInternalAction2.equals(InviteInternalAction.StartSubmit.f327081b)) {
                    c44303dA = C44303d.a(c44303dA, null, null, false, null, false, false, false, false, true, null, 767);
                } else {
                    if (!(inviteInternalAction2 instanceof InviteInternalAction.SuccessfulSubmit)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c44303dA = C44303d.a(c44303dA, null, null, false, null, false, false, false, false, false, null, 767);
                }
            }
        }
        return this.f327096b.a(c44303dA);
    }
}
