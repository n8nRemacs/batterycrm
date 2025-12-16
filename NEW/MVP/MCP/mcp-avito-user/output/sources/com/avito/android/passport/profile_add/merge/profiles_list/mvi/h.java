package com.avito.android.passport.profile_add.merge.profiles_list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.passport.profile_add.merge.profiles_list.mvi.entity.ProfilesListInternalAction;
import f60.b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ProfilesListEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "Lf60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements t<ProfilesListInternalAction, f60.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f213296b;

    @Inject
    public h(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f213296b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final f60.b b(ProfilesListInternalAction profilesListInternalAction) {
        ProfilesListInternalAction profilesListInternalAction2 = profilesListInternalAction;
        if (profilesListInternalAction2 instanceof ProfilesListInternalAction.MergeFinished) {
            return new b.a(((ProfilesListInternalAction.MergeFinished) profilesListInternalAction2).f213277b);
        }
        if (profilesListInternalAction2 instanceof ProfilesListInternalAction.MergeFinishError) {
            return new b.C11127b(((ProfilesListInternalAction.MergeFinishError) profilesListInternalAction2).f213275b);
        }
        if (profilesListInternalAction2 instanceof ProfilesListInternalAction.SelectProfileToConvert) {
            return new b.d(((ProfilesListInternalAction.SelectProfileToConvert) profilesListInternalAction2).f213287b);
        }
        if (profilesListInternalAction2 instanceof ProfilesListInternalAction.SelectBusinessVrfDuplication) {
            return new b.c(((ProfilesListInternalAction.SelectBusinessVrfDuplication) profilesListInternalAction2).f213286b);
        }
        if (profilesListInternalAction2 instanceof ProfilesListInternalAction.OpenDeepLink) {
            b.a.a(this.f213296b, ((ProfilesListInternalAction.OpenDeepLink) profilesListInternalAction2).f213279b, null, null, 6);
        } else {
            if (!(profilesListInternalAction2.equals(ProfilesListInternalAction.Collapse.f213273b) ? true : profilesListInternalAction2.equals(ProfilesListInternalAction.Expand.f213274b) ? true : profilesListInternalAction2 instanceof ProfilesListInternalAction.MergeFinishing ? true : profilesListInternalAction2 instanceof ProfilesListInternalAction.ProfilesLoaded ? true : profilesListInternalAction2 instanceof ProfilesListInternalAction.ProfilesLoading ? true : profilesListInternalAction2 instanceof ProfilesListInternalAction.ProfilesLoadingError)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }
}
