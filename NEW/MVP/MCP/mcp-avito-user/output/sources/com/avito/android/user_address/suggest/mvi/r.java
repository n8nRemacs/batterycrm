package com.avito.android.user_address.suggest.mvi;

import com.avito.android.user_address.suggest.mvi.UserAddressSuggestMviInternalAction;
import com.avito.android.user_address.suggest.mvi.UserAddressSuggestMviState;
import com.avito.android.util.NetworkException;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: UserAddressSuggestMviReducer.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/r;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviState;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r implements com.avito.android.arch.mvi.u<UserAddressSuggestMviInternalAction, UserAddressSuggestMviState> {
    @Inject
    public r() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final UserAddressSuggestMviState a(UserAddressSuggestMviInternalAction userAddressSuggestMviInternalAction, UserAddressSuggestMviState userAddressSuggestMviState) {
        UserAddressSuggestMviInternalAction userAddressSuggestMviInternalAction2 = userAddressSuggestMviInternalAction;
        UserAddressSuggestMviState userAddressSuggestMviState2 = userAddressSuggestMviState;
        if (!(userAddressSuggestMviInternalAction2 instanceof UserAddressSuggestMviInternalAction.LoadData)) {
            return userAddressSuggestMviInternalAction2 instanceof UserAddressSuggestMviInternalAction.Clear ? new UserAddressSuggestMviState.Content.Data("", C42784z0.f406748b) : userAddressSuggestMviInternalAction2 instanceof UserAddressSuggestMviInternalAction.SuggestLoading ? UserAddressSuggestMviState.ShimmerLoading.f308090d : userAddressSuggestMviInternalAction2 instanceof UserAddressSuggestMviInternalAction.Error ? ((UserAddressSuggestMviInternalAction.Error) userAddressSuggestMviInternalAction2).f308075b instanceof NetworkException ? UserAddressSuggestMviState.NetworkError.f308089d : UserAddressSuggestMviState.ApiError.f308085d : userAddressSuggestMviState2;
        }
        UserAddressSuggestMviInternalAction.LoadData loadData = (UserAddressSuggestMviInternalAction.LoadData) userAddressSuggestMviInternalAction2;
        ArrayList arrayList = loadData.f308078c;
        boolean zIsEmpty = arrayList.isEmpty();
        String str = loadData.f308077b;
        return zIsEmpty ? new UserAddressSuggestMviState.Content.NoResult(str) : new UserAddressSuggestMviState.Content.Data(str, arrayList);
    }
}
