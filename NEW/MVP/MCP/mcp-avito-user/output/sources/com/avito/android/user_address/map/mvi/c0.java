package com.avito.android.user_address.map.mvi;

import com.avito.android.user_address.map.mvi.UserAddressMapMviInternalAction;
import com.avito.android.user_address.map.mvi.Z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAddressMapOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_address/map/mvi/c0;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/user_address/map/mvi/UserAddressMapMviInternalAction;", "Lcom/avito/android/user_address/map/mvi/Z;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c0 implements com.avito.android.arch.mvi.t<UserAddressMapMviInternalAction, Z> {
    @Inject
    public c0() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Z b(UserAddressMapMviInternalAction userAddressMapMviInternalAction) {
        UserAddressMapMviInternalAction userAddressMapMviInternalAction2 = userAddressMapMviInternalAction;
        if (userAddressMapMviInternalAction2 instanceof UserAddressMapMviInternalAction.NavigateToSuggestScreen) {
            UserAddressMapMviInternalAction.NavigateToSuggestScreen navigateToSuggestScreen = (UserAddressMapMviInternalAction.NavigateToSuggestScreen) userAddressMapMviInternalAction2;
            return new Z.b(navigateToSuggestScreen.f307745b, navigateToSuggestScreen.f307746c);
        }
        if (userAddressMapMviInternalAction2 instanceof UserAddressMapMviInternalAction.ShowToastBar) {
            UserAddressMapMviInternalAction.ShowToastBar showToastBar = (UserAddressMapMviInternalAction.ShowToastBar) userAddressMapMviInternalAction2;
            return new Z.i(showToastBar.f307783d, showToastBar.f307781b, showToastBar.f307782c);
        }
        if (userAddressMapMviInternalAction2 instanceof UserAddressMapMviInternalAction.ShowDeleteAddresDialog) {
            return Z.h.f307839a;
        }
        if (userAddressMapMviInternalAction2 instanceof UserAddressMapMviInternalAction.OpenConfidenceDataPolicy) {
            return Z.c.f307820a;
        }
        if (userAddressMapMviInternalAction2 instanceof UserAddressMapMviInternalAction.ProceedSuccessSave) {
            UserAddressMapMviInternalAction.ProceedSuccessSave proceedSuccessSave = (UserAddressMapMviInternalAction.ProceedSuccessSave) userAddressMapMviInternalAction2;
            return new Z.f(proceedSuccessSave.f307752b, proceedSuccessSave.f307753c, proceedSuccessSave.f307754d, proceedSuccessSave.f307755e, proceedSuccessSave.f307756f, proceedSuccessSave.f307757g, proceedSuccessSave.f307758h);
        }
        if (userAddressMapMviInternalAction2 instanceof UserAddressMapMviInternalAction.ProceedUpdateAddressSuccessMap) {
            UserAddressMapMviInternalAction.ProceedUpdateAddressSuccessMap proceedUpdateAddressSuccessMap = (UserAddressMapMviInternalAction.ProceedUpdateAddressSuccessMap) userAddressMapMviInternalAction2;
            return new Z.g(proceedUpdateAddressSuccessMap.f307759b, proceedUpdateAddressSuccessMap.f307760c, proceedUpdateAddressSuccessMap.f307761d, proceedUpdateAddressSuccessMap.f307762e, proceedUpdateAddressSuccessMap.f307763f, proceedUpdateAddressSuccessMap.f307764g, proceedUpdateAddressSuccessMap.f307765h);
        }
        if (userAddressMapMviInternalAction2 instanceof UserAddressMapMviInternalAction.ProceedDeleteAddressSuccessMap) {
            UserAddressMapMviInternalAction.ProceedDeleteAddressSuccessMap proceedDeleteAddressSuccessMap = (UserAddressMapMviInternalAction.ProceedDeleteAddressSuccessMap) userAddressMapMviInternalAction2;
            return new Z.e(proceedDeleteAddressSuccessMap.f307748b, proceedDeleteAddressSuccessMap.f307749c, proceedDeleteAddressSuccessMap.f307750d);
        }
        if (userAddressMapMviInternalAction2 instanceof UserAddressMapMviInternalAction.ProceedSellerAddAddressSuccess) {
            return new Z.d(((UserAddressMapMviInternalAction.ProceedSellerAddAddressSuccess) userAddressMapMviInternalAction2).f307751b);
        }
        return null;
    }
}
