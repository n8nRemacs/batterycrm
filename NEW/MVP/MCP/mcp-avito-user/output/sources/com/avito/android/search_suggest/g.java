package com.avito.android.search_suggest;

import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SearchSuggestInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search_suggest/g;", "", "_avito_search-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface g {

    /* compiled from: SearchSuggestInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    Object a(@Y61.k String str, @Y61.k Map map, boolean z12);

    @Y61.l
    Object b(@Y61.k String str);

    @Y61.l
    Object c(@Y61.k String str, @Y61.k SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l String str2, @Y61.l Boolean bool);
}
