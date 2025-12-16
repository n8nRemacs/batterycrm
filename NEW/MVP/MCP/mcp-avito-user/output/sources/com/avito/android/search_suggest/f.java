package com.avito.android.search_suggest;

import android.content.Intent;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import kotlin.Metadata;

/* compiled from: SearchSuggestIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/f;", "", "_avito_search-suggest_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface f {
    @Y61.k
    Intent a(@Y61.k String str, @Y61.k String str2, @Y61.k SearchParams searchParams, @Y61.k PresentationType presentationType, @Y61.k SerpSpaceType serpSpaceType, @Y61.l NavigationBarStyle navigationBarStyle, @Y61.l NavigationTabSetItem navigationTabSetItem);
}
