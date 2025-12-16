package com.avito.android.user_address.list.mvi;

import XG0.c;
import com.avito.android.arch.mvi.t;
import com.avito.android.user_address.list.mvi.entity.UserAddressListMviInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UserAddressListOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_address/list/mvi/n;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/user_address/list/mvi/entity/UserAddressListMviInternalAction;", "LXG0/c;", "<init>", "()V", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements t<UserAddressListMviInternalAction, XG0.c> {
    @Inject
    public n() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final XG0.c b(UserAddressListMviInternalAction userAddressListMviInternalAction) {
        UserAddressListMviInternalAction userAddressListMviInternalAction2 = userAddressListMviInternalAction;
        if (userAddressListMviInternalAction2 instanceof UserAddressListMviInternalAction.StartChangeDefault) {
            return new c.h(((UserAddressListMviInternalAction.StartChangeDefault) userAddressListMviInternalAction2).f307413b);
        }
        if (userAddressListMviInternalAction2 instanceof UserAddressListMviInternalAction.ConfirmNewDefault) {
            return c.e.f18794a;
        }
        if (userAddressListMviInternalAction2 instanceof UserAddressListMviInternalAction.ChangeDefaultSuccess) {
            return c.C1325c.f18792a;
        }
        if (userAddressListMviInternalAction2 instanceof UserAddressListMviInternalAction.ChangeDefaultLoad) {
            return c.b.f18791a;
        }
        if (userAddressListMviInternalAction2 instanceof UserAddressListMviInternalAction.ChangeDefaultError) {
            return new c.a(((UserAddressListMviInternalAction.ChangeDefaultError) userAddressListMviInternalAction2).f307399b);
        }
        if (userAddressListMviInternalAction2 instanceof UserAddressListMviInternalAction.NavigateToSuggest) {
            return c.g.f18796a;
        }
        if (userAddressListMviInternalAction2 instanceof UserAddressListMviInternalAction.NavigateToEditAddress) {
            return new c.f(((UserAddressListMviInternalAction.NavigateToEditAddress) userAddressListMviInternalAction2).f307406b);
        }
        if (userAddressListMviInternalAction2 instanceof UserAddressListMviInternalAction.OpenFAQ) {
            return c.i.f18798a;
        }
        if (userAddressListMviInternalAction2 instanceof UserAddressListMviInternalAction.ShowActionToast) {
            return new c.j(((UserAddressListMviInternalAction.ShowActionToast) userAddressListMviInternalAction2).f307412b);
        }
        if (userAddressListMviInternalAction2 instanceof UserAddressListMviInternalAction.Close) {
            return new c.d(((UserAddressListMviInternalAction.Close) userAddressListMviInternalAction2).f307402b);
        }
        return null;
    }
}
