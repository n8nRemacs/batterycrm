package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.user_viewed.screen.mvi.entity.UserViewedState;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: UserViewedReducer.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class s extends N implements Y41.l<UserViewedState, UserViewedState> {

    /* renamed from: l, reason: collision with root package name */
    public static final s f318459l = new s();

    public s() {
        super(1);
    }

    @Override // Y41.l
    public final UserViewedState invoke(UserViewedState userViewedState) {
        return UserViewedState.Loading.f318425b;
    }
}
