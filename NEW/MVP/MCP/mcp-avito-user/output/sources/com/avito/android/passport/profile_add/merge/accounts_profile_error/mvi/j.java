package com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.passport.network.model.PassportListAvatar;
import com.avito.android.passport.network.model.PassportUserDialogWithProfile;
import com.avito.android.passport.network.model.PassportUserDialogWithProfileListItem;
import com.avito.android.passport.profile_add.merge.accounts_profile_error.mvi.entity.AccountsProfileErrorInternalAction;
import com.avito.android.passport.profile_add.merge.accounts_profile_error.recycler.PassportProfileErrorItem;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: AccountsProfileErrorReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/mvi/entity/AccountsProfileErrorInternalAction;", "LY50/c;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class j implements u<AccountsProfileErrorInternalAction, Y50.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PassportUserDialogWithProfile f212443b;

    @Inject
    public j(@Y61.k PassportUserDialogWithProfile passportUserDialogWithProfile) {
        this.f212443b = passportUserDialogWithProfile;
    }

    @Override // com.avito.android.arch.mvi.u
    public final Y50.c a(AccountsProfileErrorInternalAction accountsProfileErrorInternalAction, Y50.c cVar) {
        AccountsProfileErrorInternalAction accountsProfileErrorInternalAction2 = accountsProfileErrorInternalAction;
        Y50.c cVar2 = cVar;
        if (!accountsProfileErrorInternalAction2.equals(AccountsProfileErrorInternalAction.Init.f212436b)) {
            if (accountsProfileErrorInternalAction2.equals(AccountsProfileErrorInternalAction.Close.f212435b) ? true : accountsProfileErrorInternalAction2.equals(AccountsProfileErrorInternalAction.Back.f212434b)) {
                return cVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        PassportUserDialogWithProfile passportUserDialogWithProfile = this.f212443b;
        String title = passportUserDialogWithProfile.getProfile().getTitle();
        String name = passportUserDialogWithProfile.getProfile().getName();
        PassportListAvatar avatar = passportUserDialogWithProfile.getProfile().getAvatar();
        AttributedText title2 = passportUserDialogWithProfile.getTitle();
        List<PassportUserDialogWithProfileListItem> listC = passportUserDialogWithProfile.c();
        ArrayList arrayList = new ArrayList(C42745f0.q(listC, 10));
        for (PassportUserDialogWithProfileListItem passportUserDialogWithProfileListItem : listC) {
            arrayList.add(new PassportProfileErrorItem(passportUserDialogWithProfileListItem.getTitle(), passportUserDialogWithProfileListItem.getIconId()));
        }
        return new Y50.c(title, name, avatar, title2, arrayList);
    }
}
