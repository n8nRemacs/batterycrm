package com.avito.android.saved_searches.deeplinks;

import Ju.AbstractC14250d;
import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.libs.saved_searches.deeplinks.SavedSearchArgs;
import com.avito.android.libs.saved_searches.deeplinks.SavedSearchLink;
import com.avito.android.libs.saved_searches.domain.SavedSearchParams;
import com.avito.android.remote.model.search.map.Area;
import ev.AbstractC40162b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SavedSearchDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/saved_searches/deeplinks/b;", "Lev/b;", "Lcom/avito/android/libs/saved_searches/deeplinks/SavedSearchLink;", "_avito_saved-searches_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b extends AbstractC40162b<SavedSearchLink> {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final a.d f258268d;

    @Inject
    public b(@Y61.k a.d dVar) {
        this.f258268d = dVar;
    }

    @Override // ev.AbstractC40162b
    public final InterfaceC14249c.b c(Bundle bundle, DeepLink deepLink, String str) {
        SavedSearchArgs savedSearchArgs;
        SavedSearchLink savedSearchLink = (SavedSearchLink) deepLink;
        if (bundle == null || (savedSearchArgs = (SavedSearchArgs) bundle.getParcelable("saved_search_args")) == null) {
            return AbstractC14250d.b.f9170c;
        }
        String str2 = savedSearchLink.f181439d;
        if (str2 == null) {
            str2 = savedSearchArgs.f181431c;
        }
        String str3 = str2;
        String str4 = savedSearchLink.f181440e;
        if (str4 == null) {
            str4 = savedSearchArgs.f181432d;
        }
        Area area = savedSearchArgs.f181433e;
        String str5 = savedSearchArgs.f181434f;
        this.f258268d.D0("SavedSearchDialogFragment", new a(new SavedSearchParams(savedSearchLink.f181437b, savedSearchLink.f181438c, new SavedSearchArgs(savedSearchArgs.f181435g, savedSearchArgs.f181430b, area, str3, str4, str5, savedSearchArgs.f181436h))));
        return AbstractC14250d.c.f9171c;
    }
}
