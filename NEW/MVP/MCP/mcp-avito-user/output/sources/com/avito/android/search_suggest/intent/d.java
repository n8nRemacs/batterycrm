package com.avito.android.search_suggest.intent;

import Y61.k;
import Y61.l;
import android.app.Application;
import android.content.Intent;
import com.avito.android.L;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.search_suggest.SearchSuggestActivity;
import com.avito.android.search_suggest.SearchSuggestArguments;
import com.avito.android.search_suggest.SearchSuggestFragmentData;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SearchSuggestIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/intent/d;", "Lcom/avito/android/search_suggest/f;", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements com.avito.android.search_suggest.f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f264235a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final L f264236b;

    @Inject
    public d(@k Application application, @k L l12) {
        this.f264235a = application;
        this.f264236b = l12;
    }

    @Override // com.avito.android.search_suggest.f
    @k
    public final Intent a(@k String str, @k String str2, @k SearchParams searchParams, @k PresentationType presentationType, @k SerpSpaceType serpSpaceType, @l NavigationBarStyle navigationBarStyle, @l NavigationTabSetItem navigationTabSetItem) {
        if (navigationTabSetItem == null) {
            SearchSuggestActivity.f264104m.getClass();
            return new Intent(this.f264235a, (Class<?>) SearchSuggestActivity.class).putExtra("arguments", new SearchSuggestArguments(str, str2, searchParams, presentationType, serpSpaceType, navigationBarStyle));
        }
        return this.f264236b.d(new SearchSuggestFragmentData(new SearchSuggestArguments(str, str2, searchParams, presentationType, serpSpaceType, navigationBarStyle), navigationTabSetItem, null, 4, null));
    }
}
