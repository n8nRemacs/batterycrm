package com.avito.android.inline_filters.repository_suggest;

import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import java.util.LinkedHashMap;
import l41.s;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class c implements s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f172352b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f172353c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172354d;

    public /* synthetic */ c(int i12, e eVar, String str) {
        this.f172352b = eVar;
        this.f172353c = str;
        this.f172354d = i12;
    }

    @Override // l41.s
    public final Object get() {
        e eVar = this.f172352b;
        V0 v02 = eVar.f172358a.get();
        SearchParams searchParams = eVar.f172360c;
        if (searchParams == null) {
            searchParams = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(SearchParamsConverter.DefaultImpls.convertToMap$default(eVar.f172361d, searchParams, null, false, null, 14, null));
        linkedHashMap.remove("query");
        return v02.q(eVar.f172359b, this.f172353c, 100, this.f172354d, linkedHashMap);
    }
}
