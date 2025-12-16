package com.avito.android.profile.remove.screen.mvi;

import M90.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.profile.remove.screen.mvi.entity.ProfileRemoveItemsInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ProfileRemoveItemsOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/remove/screen/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction;", "LM90/b;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class h implements t<ProfileRemoveItemsInternalAction, M90.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final M90.b b(ProfileRemoveItemsInternalAction profileRemoveItemsInternalAction) {
        ProfileRemoveItemsInternalAction profileRemoveItemsInternalAction2 = profileRemoveItemsInternalAction;
        if (profileRemoveItemsInternalAction2 instanceof ProfileRemoveItemsInternalAction.FollowDeeplink) {
            return new b.a(((ProfileRemoveItemsInternalAction.FollowDeeplink) profileRemoveItemsInternalAction2).f224176b);
        }
        if (profileRemoveItemsInternalAction2 instanceof ProfileRemoveItemsInternalAction.OpenHowToReturnMoneyScreen) {
            return b.C0661b.f10424a;
        }
        if (profileRemoveItemsInternalAction2 instanceof ProfileRemoveItemsInternalAction.OpenScreen) {
            return new b.c(((ProfileRemoveItemsInternalAction.OpenScreen) profileRemoveItemsInternalAction2).f224179b);
        }
        if (profileRemoveItemsInternalAction2 instanceof ProfileRemoveItemsInternalAction.InitState) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
