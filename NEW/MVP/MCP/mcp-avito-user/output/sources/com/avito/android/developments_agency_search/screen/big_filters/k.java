package com.avito.android.developments_agency_search.screen.big_filters;

import com.avito.android.remote.model.SearchParam;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.StringSearchParam;
import com.avito.android.remote.model.search.InlineFilterValue;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BigFiltersUtil.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_developments-agency-search_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class k {
    public static final void a(@Y61.k SearchParams searchParams, @Y61.k InlineFilterValue.InlineFilterDeveloperDevelopmentValue inlineFilterDeveloperDevelopmentValue) {
        Map<String, SearchParam<?>> params = searchParams.getParams();
        LinkedHashMap linkedHashMap = params != null ? new LinkedHashMap(params) : new LinkedHashMap();
        if (inlineFilterDeveloperDevelopmentValue.getName() != null) {
            linkedHashMap.put("search-name", new StringSearchParam(inlineFilterDeveloperDevelopmentValue.getName()));
        } else {
            linkedHashMap.remove("search-name");
        }
        if (inlineFilterDeveloperDevelopmentValue.getDeveloperId() != null) {
            linkedHashMap.put("search-developer", new StringSearchParam(String.valueOf(inlineFilterDeveloperDevelopmentValue.getDeveloperId().longValue())));
        } else {
            linkedHashMap.remove("search-developer");
        }
        if (inlineFilterDeveloperDevelopmentValue.getDevelopmentId() != null) {
            linkedHashMap.put("search-development", new StringSearchParam(String.valueOf(inlineFilterDeveloperDevelopmentValue.getDevelopmentId().longValue())));
        } else {
            linkedHashMap.remove("search-development");
        }
        searchParams.setParams(linkedHashMap);
    }

    @Y61.k
    public static final String b(@Y61.k String str) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i12 = 0; i12 < length; i12++) {
            char cCharAt = str.charAt(i12);
            if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }
}
