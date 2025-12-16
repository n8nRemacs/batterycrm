package com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi.entity.AccountsProfileErrorInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AccountsProfileErrorBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/mvi/entity/AccountsProfileErrorInternalAction;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements com.avito.android.arch.mvi.b<AccountsProfileErrorInternalAction> {
    @Inject
    public c() {
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AccountsProfileErrorInternalAction> a() {
        return new C43210w(AccountsProfileErrorInternalAction.Init.f212436b);
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
