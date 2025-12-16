package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.constraintlayout.widget.ConstraintLayout;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;

/* loaded from: classes2.dex */
public final class fs7 extends ConstraintLayout {
    public final /* synthetic */ InviteFriendsToMaxBottomSheet F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs7(InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet, Context context) {
        super(context);
        this.F0 = inviteFriendsToMaxBottomSheet;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        yy7[] yy7VarArr = InviteFriendsToMaxBottomSheet.L0;
        InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet = this.F0;
        ((ds7) inviteFriendsToMaxBottomSheet.I0.getValue()).t(inviteFriendsToMaxBottomSheet.P0(), true, inviteFriendsToMaxBottomSheet.H0);
    }
}
