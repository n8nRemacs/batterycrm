package com.avito.android.profile.remove.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.profile.remove.mvi.entity.ProfileRemoveInternalAction;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ProfileRemoveReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/remove/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/profile/remove/mvi/entity/ProfileRemoveInternalAction;", "LK90/c;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements u<ProfileRemoveInternalAction, K90.c> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final K90.c a(ProfileRemoveInternalAction profileRemoveInternalAction, K90.c cVar) {
        ProfileRemoveInternalAction profileRemoveInternalAction2 = profileRemoveInternalAction;
        K90.c cVar2 = cVar;
        if (profileRemoveInternalAction2 instanceof ProfileRemoveInternalAction.DataLoading) {
            return K90.c.a(cVar2, true, false);
        }
        if (profileRemoveInternalAction2 instanceof ProfileRemoveInternalAction.OpenItemsScreen) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(cVar2.f9296d);
            ProfileRemoveInternalAction.OpenItemsScreen openItemsScreen = (ProfileRemoveInternalAction.OpenItemsScreen) profileRemoveInternalAction2;
            linkedHashMap.put(openItemsScreen.f223960b, openItemsScreen.f223961c);
            G0 g02 = G0.f406611a;
            return new K90.c(false, false, linkedHashMap);
        }
        if (profileRemoveInternalAction2 instanceof ProfileRemoveInternalAction.Error) {
            return K90.c.a(cVar2, false, true);
        }
        if (profileRemoveInternalAction2 instanceof ProfileRemoveInternalAction.OpenHowGetMoneyScreen ? true : profileRemoveInternalAction2 instanceof ProfileRemoveInternalAction.ShowSnackbar ? true : profileRemoveInternalAction2 instanceof ProfileRemoveInternalAction.ShowConfirmDialog ? true : profileRemoveInternalAction2 instanceof ProfileRemoveInternalAction.ShowConfirmScreen) {
            return K90.c.a(cVar2, false, false);
        }
        throw new NoWhenBranchMatchedException();
    }
}
