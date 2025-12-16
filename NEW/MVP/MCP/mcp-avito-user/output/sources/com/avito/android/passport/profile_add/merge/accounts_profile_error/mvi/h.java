package com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi;

import Y50.b;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi.entity.AccountsProfileErrorInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AccountsProfileErrorOneTimeEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/mvi/entity/AccountsProfileErrorInternalAction;", "LY50/b;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements t<AccountsProfileErrorInternalAction, Y50.b> {
    @Inject
    public h() {
    }

    @Override // com.avito.android.arch.mvi.t
    public final Y50.b b(AccountsProfileErrorInternalAction accountsProfileErrorInternalAction) {
        AccountsProfileErrorInternalAction accountsProfileErrorInternalAction2 = accountsProfileErrorInternalAction;
        if (accountsProfileErrorInternalAction2.equals(AccountsProfileErrorInternalAction.Close.f212435b)) {
            return b.C1364b.f19297a;
        }
        if (accountsProfileErrorInternalAction2.equals(AccountsProfileErrorInternalAction.Back.f212434b)) {
            return b.a.f19296a;
        }
        if (accountsProfileErrorInternalAction2.equals(AccountsProfileErrorInternalAction.Init.f212436b)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
