package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.user_viewed.screen.mvi.entity.UserViewedInternalAction;
import com.avito.android.user_viewed.screen.mvi.entity.UserViewedState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserViewedReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class p extends N implements Y41.l<UserViewedState, UserViewedState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ UserViewedInternalAction f318454l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(UserViewedInternalAction userViewedInternalAction) {
        super(1);
        this.f318454l = userViewedInternalAction;
    }

    @Override // Y41.l
    public final UserViewedState invoke(UserViewedState userViewedState) {
        return new UserViewedState.Content(((UserViewedInternalAction.Content) this.f318454l).f318411b, false, false, false);
    }
}
