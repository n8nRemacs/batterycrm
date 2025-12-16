package com.avito.android.profile.remove.mvi;

import K90.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ProfileRemoveOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/remove/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction;", "LK90/b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements t<ProfileRemoveInternalAction, K90.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final K90.b b(ProfileRemoveInternalAction profileRemoveInternalAction) {
        ProfileRemoveInternalAction profileRemoveInternalAction2 = profileRemoveInternalAction;
        if (profileRemoveInternalAction2 instanceof ProfileRemoveInternalAction.ShowSnackbar) {
            return new b.e(((ProfileRemoveInternalAction.ShowSnackbar) profileRemoveInternalAction2).f223964b);
        }
        if (profileRemoveInternalAction2 instanceof ProfileRemoveInternalAction.OpenItemsScreen) {
            return new b.C0557b(((ProfileRemoveInternalAction.OpenItemsScreen) profileRemoveInternalAction2).f223960b);
        }
        if (profileRemoveInternalAction2 instanceof ProfileRemoveInternalAction.OpenHowGetMoneyScreen) {
            ProfileRemoveInternalAction.OpenHowGetMoneyScreen openHowGetMoneyScreen = (ProfileRemoveInternalAction.OpenHowGetMoneyScreen) profileRemoveInternalAction2;
            return new b.a(openHowGetMoneyScreen.f223958b, openHowGetMoneyScreen.f223959c);
        }
        if (profileRemoveInternalAction2 instanceof ProfileRemoveInternalAction.ShowConfirmDialog) {
            return new b.c(((ProfileRemoveInternalAction.ShowConfirmDialog) profileRemoveInternalAction2).f223962b);
        }
        if (profileRemoveInternalAction2 instanceof ProfileRemoveInternalAction.ShowConfirmScreen) {
            return new b.d(((ProfileRemoveInternalAction.ShowConfirmScreen) profileRemoveInternalAction2).f223963b);
        }
        if (profileRemoveInternalAction2 instanceof ProfileRemoveInternalAction.DataLoading ? true : profileRemoveInternalAction2 instanceof ProfileRemoveInternalAction.Error) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
