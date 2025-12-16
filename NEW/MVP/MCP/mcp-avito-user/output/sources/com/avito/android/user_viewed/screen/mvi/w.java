package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.user_viewed.screen.mvi.entity.UserViewedInternalAction;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: UserViewedReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/w;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class w implements com.avito.android.arch.mvi.u<UserViewedInternalAction, UserViewedState> {
    @Inject
    public w() {
    }

    @Y61.k
    public static UserViewedState b(@Y61.k UserViewedState userViewedState, @Y61.l Y41.l lVar, @Y61.k Y41.l lVar2) {
        UserViewedState userViewedState2;
        UserViewedState.Content content = userViewedState instanceof UserViewedState.Content ? (UserViewedState.Content) userViewedState : null;
        return (content == null || (userViewedState2 = (UserViewedState) lVar2.invoke(content)) == null) ? lVar != null ? (UserViewedState) lVar.invoke(userViewedState) : userViewedState : userViewedState2;
    }

    @Override // com.avito.android.arch.mvi.u
    public final UserViewedState a(UserViewedInternalAction userViewedInternalAction, UserViewedState userViewedState) {
        UserViewedInternalAction userViewedInternalAction2 = userViewedInternalAction;
        UserViewedState userViewedState2 = userViewedState;
        return userViewedInternalAction2 instanceof UserViewedInternalAction.Content ? b(userViewedState2, new p(userViewedInternalAction2), new q(this, userViewedInternalAction2)) : userViewedInternalAction2 instanceof UserViewedInternalAction.UpdateFavoriteStatus ? b(userViewedState2, null, new r(this, userViewedInternalAction2)) : userViewedInternalAction2.equals(UserViewedInternalAction.Refreshing.f318416b) ? b(userViewedState2, s.f318459l, t.f318460l) : userViewedInternalAction2 instanceof UserViewedInternalAction.Loading ? UserViewedState.Loading.f318425b : userViewedInternalAction2 instanceof UserViewedInternalAction.Error ? UserViewedState.Error.f318424b : userViewedInternalAction2 instanceof UserViewedInternalAction.ScrolledBottom ? b(userViewedState2, null, u.f318461l) : userViewedInternalAction2.equals(UserViewedInternalAction.ListResetting.f318413b) ? b(userViewedState2, null, v.f318462l) : userViewedState2;
    }
}
