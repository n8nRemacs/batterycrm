package com.avito.android.extended_profile_tabs.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.deep_linking.PublicRatingDetailsLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.extended_profile_serp.deep_linking.ExtendedProfileSerpLink;
import com.avito.android.extended_profile_serp.deep_linking.ExtendedProfileSerpStartMode;
import com.avito.android.extended_profile_tabs.ExtendedProfileTabsArguments;
import com.avito.android.extended_profile_tabs.mvi.entity.ExtendedProfileTabsInternalAction;
import com.avito.android.extended_profile_tabs.mvi.entity.a;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExtendedProfileTabsReducer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/extended_profile_tabs/mvi/j;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/ExtendedProfileTabsInternalAction;", "Lcom/avito/android/extended_profile_tabs/mvi/entity/a;", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements u<ExtendedProfileTabsInternalAction, com.avito.android.extended_profile_tabs.mvi.entity.a> {
    @Inject
    public j() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final com.avito.android.extended_profile_tabs.mvi.entity.a a(ExtendedProfileTabsInternalAction extendedProfileTabsInternalAction, com.avito.android.extended_profile_tabs.mvi.entity.a aVar) {
        ExtendedProfileTabsInternalAction extendedProfileTabsInternalAction2 = extendedProfileTabsInternalAction;
        com.avito.android.extended_profile_tabs.mvi.entity.a aVar2 = aVar;
        if (extendedProfileTabsInternalAction2 instanceof ExtendedProfileTabsInternalAction.DataLoaded) {
            ExtendedProfileTabsInternalAction.DataLoaded dataLoaded = (ExtendedProfileTabsInternalAction.DataLoaded) extendedProfileTabsInternalAction2;
            return com.avito.android.extended_profile_tabs.mvi.entity.a.a(aVar2, dataLoaded.f153232c, false, null, dataLoaded.f153231b, null, 16);
        }
        if (extendedProfileTabsInternalAction2 instanceof ExtendedProfileTabsInternalAction.DataLoading) {
            return com.avito.android.extended_profile_tabs.mvi.entity.a.a(aVar2, a.b.C4474b.f153252a, true, null, null, null, 24);
        }
        if (extendedProfileTabsInternalAction2 instanceof ExtendedProfileTabsInternalAction.LoadingError) {
            return com.avito.android.extended_profile_tabs.mvi.entity.a.a(aVar2, a.b.C4474b.f153252a, false, ((ExtendedProfileTabsInternalAction.LoadingError) extendedProfileTabsInternalAction2).f153234b, null, null, 24);
        }
        boolean z12 = extendedProfileTabsInternalAction2 instanceof ExtendedProfileTabsInternalAction.SelectBrandTab;
        a.b bVar = aVar2.f153239b;
        if (z12) {
            return com.avito.android.extended_profile_tabs.mvi.entity.a.a(aVar2, null, false, null, null, new a.C4472a(((a.b.C4473a) bVar).f153246a, false), 15);
        }
        if (extendedProfileTabsInternalAction2 instanceof ExtendedProfileTabsInternalAction.SelectSearchTab) {
            return com.avito.android.extended_profile_tabs.mvi.entity.a.a(aVar2, null, false, null, null, new a.C4472a(((a.b.C4473a) bVar).f153247b, false), 15);
        }
        if (extendedProfileTabsInternalAction2 instanceof ExtendedProfileTabsInternalAction.SelectRatingTab) {
            return com.avito.android.extended_profile_tabs.mvi.entity.a.a(aVar2, null, false, null, null, new a.C4472a(((a.b.C4473a) bVar).f153248c, false), 15);
        }
        if (!(extendedProfileTabsInternalAction2 instanceof ExtendedProfileTabsInternalAction.HandleTabNavigationDeeplink)) {
            throw new NoWhenBranchMatchedException();
        }
        DeepLink deepLink = ((ExtendedProfileTabsInternalAction.HandleTabNavigationDeeplink) extendedProfileTabsInternalAction2).f153233b;
        if (!(deepLink instanceof ExtendedProfileSerpLink)) {
            if (!(deepLink instanceof PublicRatingDetailsLink)) {
                return aVar2;
            }
            PublicRatingDetailsLink publicRatingDetailsLink = (PublicRatingDetailsLink) deepLink;
            return com.avito.android.extended_profile_tabs.mvi.entity.a.a(aVar2, null, false, null, null, new a.C4472a(new ExtendedProfileTabsArguments.ExtendedProfileTab.Rating(publicRatingDetailsLink.f132851b, publicRatingDetailsLink.f132852c, publicRatingDetailsLink.f132853d, publicRatingDetailsLink.f132854e), false), 15);
        }
        ExtendedProfileSerpLink extendedProfileSerpLink = (ExtendedProfileSerpLink) deepLink;
        SearchParams searchParams = extendedProfileSerpLink.f152653d;
        if (searchParams == null) {
            searchParams = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, extendedProfileSerpLink.f152651b, null, SerpDisplayType.Grid, null, null, null, null, null, null, -83886081, 1, null);
        }
        String str = extendedProfileSerpLink.f152654e;
        ExtendedProfileSerpStartMode extendedProfileSerpStartMode = extendedProfileSerpLink.f152655f;
        return com.avito.android.extended_profile_tabs.mvi.entity.a.a(aVar2, null, false, null, null, new a.C4472a(new ExtendedProfileTabsArguments.ExtendedProfileTab.Search(extendedProfileSerpLink.f152651b, extendedProfileSerpLink.f152652c, searchParams, str, true, extendedProfileSerpStartMode), true), 15);
    }
}
