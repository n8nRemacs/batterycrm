package com.avito.android.profile.remove.screen.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.profile.remove.screen.mvi.entity.ProfileRemoveItemsInternalAction;
import com.avito.android.remote.model.profile_removal.ProfileRemovalScreen;
import com.avito.android.util.V2;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ProfileRemoveItemsReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile/remove/screen/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/profile/remove/screen/mvi/entity/ProfileRemoveItemsInternalAction;", "LM90/c;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements u<ProfileRemoveItemsInternalAction, M90.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.remove.screen.e f224186b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile.remove.screen.items.a f224187c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f224188d;

    @Inject
    public j(@Y61.k com.avito.android.profile.remove.screen.e eVar, @Y61.k com.avito.android.profile.remove.screen.items.a aVar, @Y61.k String str) {
        this.f224186b = eVar;
        this.f224187c = aVar;
        this.f224188d = str;
    }

    @Override // com.avito.android.arch.mvi.u
    public final M90.c a(ProfileRemoveItemsInternalAction profileRemoveItemsInternalAction, M90.c cVar) {
        ProfileRemoveItemsInternalAction profileRemoveItemsInternalAction2 = profileRemoveItemsInternalAction;
        M90.c cVar2 = cVar;
        if (!(profileRemoveItemsInternalAction2 instanceof ProfileRemoveItemsInternalAction.InitState)) {
            if (profileRemoveItemsInternalAction2 instanceof ProfileRemoveItemsInternalAction.FollowDeeplink ? true : profileRemoveItemsInternalAction2 instanceof ProfileRemoveItemsInternalAction.OpenHowToReturnMoneyScreen ? true : profileRemoveItemsInternalAction2 instanceof ProfileRemoveItemsInternalAction.OpenScreen) {
                return cVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        com.avito.android.profile.remove.screen.items.a aVar = this.f224187c;
        try {
            ProfileRemovalScreen profileRemovalScreenJ3 = this.f224186b.j3(this.f224188d);
            return new M90.c(aVar.a(profileRemovalScreenJ3), aVar.b(profileRemovalScreenJ3));
        } catch (IllegalStateException unused) {
            V2.f318762a.d("ProfileRemoveItemsReducer", "Screen in not available");
            return cVar2;
        }
    }
}
