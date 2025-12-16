package com.avito.android.realty_agency.checkerboard.mvi.use_case;

import Y61.k;
import com.avito.android.remote.model.SearchParam;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.StringSearchParam;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SearchParamsInteractor.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_realty-agency_checkerboard_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class a {
    @k
    public static final void a(@k SearchParams searchParams, long j12) {
        Map<String, SearchParam<?>> params = searchParams.getParams();
        LinkedHashMap linkedHashMap = params != null ? new LinkedHashMap(params) : new LinkedHashMap();
        linkedHashMap.put("1384", new StringSearchParam(String.valueOf(j12)));
        searchParams.setParams(linkedHashMap);
    }
}
