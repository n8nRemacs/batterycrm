package com.avito.android.virtual_deal_room_invite.invite.mvi;

import androidx.fragment.app.Fragment;
import com.avito.android.R;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.virtual_deal_room_invite.invite.mvi.entity.InviteInternalAction;
import java.io.Serializable;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import nO0.InterfaceC44302c;

/* compiled from: InviteOneTimeEventProducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "LnO0/c;", "<init>", "()V", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements t<InviteInternalAction, InterfaceC44302c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC44302c b(InviteInternalAction inviteInternalAction) {
        Fragment fragment;
        InterfaceC44302c dVar;
        InviteInternalAction inviteInternalAction2 = inviteInternalAction;
        if (inviteInternalAction2.equals(InviteInternalAction.Close.f327069b)) {
            return InterfaceC44302c.a.f415102a;
        }
        String str = null;
        if (inviteInternalAction2 instanceof InviteInternalAction.FailureSubmit) {
            String message = ((InviteInternalAction.FailureSubmit) inviteInternalAction2).f327077b.getMessage();
            if (message != null && !C43066x.K(message)) {
                str = message;
            }
            dVar = new InterfaceC44302c.e(str != null ? com.avito.android.printable_text.b.f(str) : com.avito.android.printable_text.b.c(R.string.virtual_deal_room_invite_unknown_error, new Serializable[0]));
        } else if (inviteInternalAction2 instanceof InviteInternalAction.OpenDeeplink) {
            dVar = new InterfaceC44302c.C11858c(((InviteInternalAction.OpenDeeplink) inviteInternalAction2).f327079b);
        } else {
            if (inviteInternalAction2 instanceof InviteInternalAction.SuccessfulSubmit) {
                DeepLink deepLink = ((InviteInternalAction.SuccessfulSubmit) inviteInternalAction2).f327082b;
                if (deepLink != null) {
                    dVar = new InterfaceC44302c.C11858c(deepLink);
                }
                return null;
            }
            if (!(inviteInternalAction2 instanceof InviteInternalAction.ShowDeclinePopup)) {
                if ((inviteInternalAction2 instanceof InviteInternalAction.Content) && (fragment = ((InviteInternalAction.Content) inviteInternalAction2).f327072d) != null) {
                    dVar = new InterfaceC44302c.d(fragment);
                }
                return null;
            }
            dVar = new InterfaceC44302c.b(((InviteInternalAction.ShowDeclinePopup) inviteInternalAction2).f327080b);
        }
        return dVar;
    }
}
