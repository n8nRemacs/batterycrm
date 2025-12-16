package com.avito.android.passport.profile_add.merge.profile_to_convert.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.ProfileCreateExtendedLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.passport.profile_add.merge.profile_to_convert.mvi.entity.ProfileToConvertInternalAction;
import e60.InterfaceC39957b;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ProfileToConvertEventProducer.kt */
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/h;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/passport/profile_add/merge/profile_to_convert/mvi/entity/ProfileToConvertInternalAction;", "Le60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements t<ProfileToConvertInternalAction, InterfaceC39957b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f213166b;

    @Inject
    public h(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f213166b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final InterfaceC39957b b(ProfileToConvertInternalAction profileToConvertInternalAction) {
        ProfileToConvertInternalAction profileToConvertInternalAction2 = profileToConvertInternalAction;
        boolean z12 = profileToConvertInternalAction2 instanceof ProfileToConvertInternalAction.Continue;
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f213166b;
        if (z12) {
            b.a.a(aVar, new ProfileCreateExtendedLink(new ProfileCreateExtendedLink.Flow.PassportMerge(((ProfileToConvertInternalAction.Continue) profileToConvertInternalAction2).f213151b), null, false), null, null, 6);
            return null;
        }
        if (profileToConvertInternalAction2 instanceof ProfileToConvertInternalAction.MergeFinished) {
            ProfileToConvertInternalAction.MergeFinished mergeFinished = (ProfileToConvertInternalAction.MergeFinished) profileToConvertInternalAction2;
            return new InterfaceC39957b.a(mergeFinished.f213156c, mergeFinished.f213155b);
        }
        if (profileToConvertInternalAction2 instanceof ProfileToConvertInternalAction.OpenDeepLink) {
            b.a.a(aVar, ((ProfileToConvertInternalAction.OpenDeepLink) profileToConvertInternalAction2).f213157b, null, null, 6);
            return null;
        }
        if (profileToConvertInternalAction2.equals(ProfileToConvertInternalAction.ContinueWithoutSelectionClicked.f213152b) ? true : profileToConvertInternalAction2 instanceof ProfileToConvertInternalAction.GotProfilesToConvert ? true : profileToConvertInternalAction2 instanceof ProfileToConvertInternalAction.ItemSelected) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
