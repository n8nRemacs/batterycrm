package com.avito.android.passport.profile_add.merge.profiles_list.mvi;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.passport.network.model.MergeAccountsProfile;
import com.avito.android.passport.network.model.PassportListAvatar;
import com.avito.android.passport.profile_add.merge.profiles_list.mvi.entity.ProfilesListInternalAction;
import com.avito.android.passport.profile_add.merge.profiles_list.recycler.c;
import com.avito.android.passport.profile_add.merge.profiles_list.recycler.o;
import com.avito.android.passport.profile_list_item.ProfileListLegalItem;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageKt;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ProfilesListReducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/m;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/passport/profile_add/merge/profiles_list/mvi/entity/ProfilesListInternalAction;", "Lf60/c;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class m implements u<ProfilesListInternalAction, f60.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ProfileListLegalItem f213308b = new ProfileListLegalItem();

    @Inject
    public m() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final f60.c a(ProfilesListInternalAction profilesListInternalAction, f60.c cVar) {
        Uri uri;
        Image singleImage;
        ProfilesListInternalAction profilesListInternalAction2 = profilesListInternalAction;
        f60.c cVar2 = cVar;
        boolean z12 = profilesListInternalAction2 instanceof ProfilesListInternalAction.ProfilesLoaded;
        boolean z13 = cVar2.f395672d;
        ProfileListLegalItem profileListLegalItem = this.f213308b;
        if (z12) {
            ProfilesListInternalAction.ProfilesLoaded profilesLoaded = (ProfilesListInternalAction.ProfilesLoaded) profilesListInternalAction2;
            List<MergeAccountsProfile> list = profilesLoaded.f213280b;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            for (MergeAccountsProfile mergeAccountsProfile : list) {
                String str = mergeAccountsProfile.getName() + ", " + mergeAccountsProfile.getTitle();
                PassportListAvatar avatar = mergeAccountsProfile.getAvatar();
                arrayList.add(new o((avatar == null || (uri = avatar.getUri()) == null || (singleImage = ImageKt.toSingleImage(uri)) == null) ? null : com.avito.android.image_loader.b.b(singleImage), str));
            }
            return f60.c.a(cVar2, false, false, false, false, arrayList, z13 ? C42745f0.i0(profileListLegalItem, C42745f0.i0(c.C6394c.f213317b, arrayList)) : b(profilesLoaded.f213281c, arrayList), profilesLoaded.f213281c, profilesLoaded.f213282d, profilesLoaded.f213283e, 12);
        }
        boolean zEquals = profilesListInternalAction2.equals(ProfilesListInternalAction.Expand.f213274b);
        List list2 = cVar2.f395674f;
        if (zEquals) {
            return z13 ? cVar2 : f60.c.a(cVar2, false, false, true, false, null, C42745f0.i0(profileListLegalItem, C42745f0.i0(c.C6394c.f213317b, list2)), 0, null, null, 475);
        }
        if (profilesListInternalAction2.equals(ProfilesListInternalAction.Collapse.f213273b)) {
            return !z13 ? cVar2 : f60.c.a(cVar2, false, false, false, false, null, b(cVar2.f395676h, list2), 0, null, null, 475);
        }
        if (profilesListInternalAction2 instanceof ProfilesListInternalAction.ProfilesLoading) {
            C42784z0 c42784z0 = C42784z0.f406748b;
            return f60.c.a(cVar2, true, false, false, false, c42784z0, c42784z0, 0, c42784z0, null, 268);
        }
        if (profilesListInternalAction2 instanceof ProfilesListInternalAction.ProfilesLoadingError) {
            return f60.c.a(cVar2, false, true, false, false, null, null, 0, null, null, 508);
        }
        if (profilesListInternalAction2 instanceof ProfilesListInternalAction.MergeFinishing) {
            return f60.c.a(cVar2, false, false, false, true, null, null, 0, null, null, 503);
        }
        if (profilesListInternalAction2 instanceof ProfilesListInternalAction.MergeFinished ? true : profilesListInternalAction2 instanceof ProfilesListInternalAction.MergeFinishError) {
            return f60.c.a(cVar2, false, false, false, false, null, null, 0, null, null, 503);
        }
        if (profilesListInternalAction2 instanceof ProfilesListInternalAction.SelectProfileToConvert ? true : profilesListInternalAction2 instanceof ProfilesListInternalAction.SelectBusinessVrfDuplication ? true : profilesListInternalAction2 instanceof ProfilesListInternalAction.OpenDeepLink) {
            return cVar2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final ArrayList b(int i12, List list) {
        int size = list.size() - i12;
        if (size > 0) {
            list = C42745f0.i0(new c.a(size), C42745f0.E0(list, i12));
        }
        return C42745f0.i0(this.f213308b, list);
    }
}
