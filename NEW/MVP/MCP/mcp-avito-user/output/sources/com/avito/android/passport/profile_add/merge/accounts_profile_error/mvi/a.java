package com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi;

import Y50.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.a;
import com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi.entity.AccountsProfileErrorInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AccountsProfileErrorActor.kt */
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LY50/a;", "Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/mvi/entity/AccountsProfileErrorInternalAction;", "LY50/c;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements com.avito.android.arch.mvi.a<Y50.a, AccountsProfileErrorInternalAction, Y50.c> {
    @Inject
    public a() {
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AccountsProfileErrorInternalAction> b(Y50.a aVar, Y50.c cVar) {
        Y50.a aVar2 = aVar;
        if (aVar2.equals(a.C1363a.f19294a)) {
            return new C43210w(AccountsProfileErrorInternalAction.Back.f212434b);
        }
        if (aVar2.equals(a.b.f19295a)) {
            return new C43210w(AccountsProfileErrorInternalAction.Close.f212435b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
