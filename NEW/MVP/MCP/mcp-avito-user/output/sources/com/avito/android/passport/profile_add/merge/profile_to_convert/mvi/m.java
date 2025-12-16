package com.avito.android.passport.profile_add.merge.profile_to_convert.mvi;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.arch.mvi.u;
import com.avito.android.passport.network.model.MergeAccountsProfile;
import com.avito.android.passport.network.model.PassportListAvatar;
import com.avito.android.passport.profile_add.merge.profile_to_convert.mvi.entity.ProfileToConvertInternalAction;
import com.avito.android.passport.profile_add.merge.profile_to_convert.recycler.ErrorTextListItem;
import com.avito.android.passport.profile_list_item.PassportListProfileItem;
import com.avito.android.remote.model.ImageKt;
import e60.C39958c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ProfileToConvertReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction;", "Le60/c;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements u<ProfileToConvertInternalAction, C39958c> {
    @Inject
    public m() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.arch.mvi.u
    public final C39958c a(ProfileToConvertInternalAction profileToConvertInternalAction, C39958c c39958c) {
        Uri uri;
        ProfileToConvertInternalAction profileToConvertInternalAction2 = profileToConvertInternalAction;
        C39958c c39958c2 = c39958c;
        if ((profileToConvertInternalAction2 instanceof ProfileToConvertInternalAction.Continue) || (profileToConvertInternalAction2 instanceof ProfileToConvertInternalAction.MergeFinished)) {
            return c39958c2;
        }
        boolean zEquals = profileToConvertInternalAction2.equals(ProfileToConvertInternalAction.ContinueWithoutSelectionClicked.f213152b);
        List listI0 = c39958c2.f394963c;
        String str = c39958c2.f394962b;
        String str2 = null;
        Object[] objArr = 0;
        if (zEquals) {
            ErrorTextListItem errorTextListItem = new ErrorTextListItem(com.avito.android.printable_text.b.c(R.string.passport_accounts_merge_profile_to_convert_no_selection_error, new Serializable[0]), str2, 2, objArr == true ? 1 : 0);
            if (!listI0.contains(errorTextListItem)) {
                listI0 = C42745f0.i0(errorTextListItem, listI0);
            }
            return new C39958c(str, listI0);
        }
        if (!(profileToConvertInternalAction2 instanceof ProfileToConvertInternalAction.ItemSelected)) {
            if (!(profileToConvertInternalAction2 instanceof ProfileToConvertInternalAction.GotProfilesToConvert)) {
                if (profileToConvertInternalAction2 instanceof ProfileToConvertInternalAction.OpenDeepLink) {
                    return c39958c2;
                }
                throw new NoWhenBranchMatchedException();
            }
            List<MergeAccountsProfile> list = ((ProfileToConvertInternalAction.GotProfilesToConvert) profileToConvertInternalAction2).f213153b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (MergeAccountsProfile mergeAccountsProfile : list) {
                String name = mergeAccountsProfile.getName();
                String title = mergeAccountsProfile.getTitle();
                PassportListAvatar avatar = mergeAccountsProfile.getAvatar();
                arrayList.add(new PassportListProfileItem(name, title, "", (avatar == null || (uri = avatar.getUri()) == null) ? null : ImageKt.toSingleImage(uri), mergeAccountsProfile.getUserId(), false, null, null, null, 448, null));
            }
            return new C39958c(str, arrayList);
        }
        ProfileToConvertInternalAction.ItemSelected itemSelected = (ProfileToConvertInternalAction.ItemSelected) profileToConvertInternalAction2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listI0) {
            if (obj instanceof PassportListProfileItem) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(C42745f0.q(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str3 = itemSelected.f213154b;
            if (!zHasNext) {
                return new C39958c(str3, arrayList3);
            }
            PassportListProfileItem passportListProfileItem = (PassportListProfileItem) it.next();
            arrayList3.add(new PassportListProfileItem(passportListProfileItem.f213627b, passportListProfileItem.f213628c, passportListProfileItem.f213629d, passportListProfileItem.f213630e, passportListProfileItem.f213631f, L.f(passportListProfileItem.f213631f, str3), passportListProfileItem.f213633h, passportListProfileItem.f213634i, passportListProfileItem.f213635j));
        }
    }
}
