package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.R;
import com.avito.android.remote.error.ApiError;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction;
import fJ0.InterfaceC40302b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAdvertsListOneTimeProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/S;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListInternalAction;", "LfJ0/b;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class S implements com.avito.android.arch.mvi.t<UserAdvertsListInternalAction, InterfaceC40302b> {
    @Inject
    public S() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC40302b b(UserAdvertsListInternalAction userAdvertsListInternalAction) {
        InterfaceC40302b cVar;
        UserAdvertsListInternalAction userAdvertsListInternalAction2 = userAdvertsListInternalAction;
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.LoadingError) {
            return new InterfaceC40302b.a();
        }
        if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.LoadingResult) {
            UserAdvertsListInternalAction.LoadingResult loadingResult = (UserAdvertsListInternalAction.LoadingResult) userAdvertsListInternalAction2;
            String str = loadingResult.f315353d;
            cVar = new InterfaceC40302b.C11144b(loadingResult.f315355f);
        } else {
            if (userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.RefreshingStart) {
                return InterfaceC40302b.d.f395837a;
            }
            if (!(userAdvertsListInternalAction2 instanceof UserAdvertsListInternalAction.SingleSelectError)) {
                return null;
            }
            UserAdvertsListInternalAction.SingleSelectError singleSelectError = (UserAdvertsListInternalAction.SingleSelectError) userAdvertsListInternalAction2;
            ApiError apiError = singleSelectError.f315381d;
            cVar = new InterfaceC40302b.c(apiError instanceof ApiError.UnknownError ? com.avito.android.printable_text.b.c(R.string.user_adverts_available_actions_error, singleSelectError.f315380c) : com.avito.android.printable_text.b.f(com.avito.android.error.z.k(apiError)), apiError, singleSelectError.f315382e);
        }
        return cVar;
    }
}
