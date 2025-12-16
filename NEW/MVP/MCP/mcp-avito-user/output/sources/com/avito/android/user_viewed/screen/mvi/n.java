package com.avito.android.user_viewed.screen.mvi;

import com.avito.android.user_viewed.screen.mvi.entity.UserViewedInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import lK0.InterfaceC43651b;

/* compiled from: UserViewedOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_viewed/screen/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/user_viewed/screen/mvi/entity/UserViewedInternalAction;", "LlK0/b;", "<init>", "()V", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n implements com.avito.android.arch.mvi.t<UserViewedInternalAction, InterfaceC43651b> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC43651b b(UserViewedInternalAction userViewedInternalAction) {
        UserViewedInternalAction userViewedInternalAction2 = userViewedInternalAction;
        if (!(userViewedInternalAction2 instanceof UserViewedInternalAction.OpenDeeplink)) {
            return null;
        }
        UserViewedInternalAction.OpenDeeplink openDeeplink = (UserViewedInternalAction.OpenDeeplink) userViewedInternalAction2;
        return new InterfaceC43651b.a(openDeeplink.f318414b, openDeeplink.f318415c);
    }
}
