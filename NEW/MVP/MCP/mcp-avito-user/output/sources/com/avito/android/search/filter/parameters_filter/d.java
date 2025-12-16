package com.avito.android.search.filter.parameters_filter;

import Y61.k;
import Y61.l;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.search.filter.di.f;
import io.reactivex.rxjava3.internal.operators.single.O;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: FiltersSelectRepository.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/parameters_filter/d;", "LZp0/c;", "Lcom/avito/android/search/filter/parameters_filter/f;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d implements InterfaceC19588c<f> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final V0 f263758a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f263759b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final SearchParams f263760c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final SearchParamsConverter f263761d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f263762e;

    public d(@k V0 v02, @k String str, @l SearchParams searchParams, @f.g @k SearchParamsConverter searchParamsConverter, boolean z12) {
        this.f263758a = v02;
        this.f263759b = str;
        this.f263760c = searchParams;
        this.f263761d = searchParamsConverter;
        this.f263762e = z12;
    }

    @Override // Zp0.InterfaceC19588c
    public final O a(InterfaceC19587b interfaceC19587b) {
        f fVar = (f) interfaceC19587b;
        return c(fVar.f263763a, fVar.f263764b);
    }

    @Override // Zp0.InterfaceC19588c
    @k
    public final O b(@k String str) {
        return c(0, str);
    }

    public final O c(int i12, String str) {
        SearchParams searchParams = this.f263760c;
        if (searchParams == null) {
            searchParams = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(SearchParamsConverter.DefaultImpls.convertToMap$default(this.f263761d, searchParams, null, false, null, 14, null));
        linkedHashMap.remove("query");
        return this.f263758a.s(this.f263759b, str, 100, i12, 1, linkedHashMap).r(new c(this, i12, str));
    }
}
