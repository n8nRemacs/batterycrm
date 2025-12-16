package com.avito.android.realty_agency.inline_filters;

import com.avito.android.inline_filters.C31060u;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.inline_filters.InterfaceC31047g;
import com.avito.android.inline_filters.T;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.search.Result;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.util.InterfaceC35745a5;
import fi0.InterfaceC40426a;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import l41.o;
import okhttp3.internal.http2.Http2;

/* compiled from: RealtyAgencyFiltersInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/f;", "Lcom/avito/android/inline_filters/b;", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements InterfaceC30995b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40426a f251610a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f251611b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31047g f251612c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final T f251613d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C31060u f251614e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f251615f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f251616g;

    /* compiled from: RealtyAgencyFiltersInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/search/InlineFilters;", "it", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a<T, R> implements o {
        public a() {
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            InlineFilters inlineFilters = (InlineFilters) obj;
            f.this.getClass();
            if (inlineFilters.getResult() == null && inlineFilters.getResult().getFilters() == null) {
                return inlineFilters;
            }
            List<Filter> filters = inlineFilters.getResult().getFilters();
            ArrayList arrayList = new ArrayList();
            for (T t12 : filters) {
                if (!L.f(((Filter) t12).getId(), "filtersEntryPoint")) {
                    arrayList.add(t12);
                }
            }
            Result result = inlineFilters.getResult();
            return InlineFilters.copy$default(inlineFilters, null, result.copy((32751 & 1) != 0 ? result.onResult : null, (32751 & 2) != 0 ? result.header : null, (32751 & 4) != 0 ? result.topEntryPoint : null, (32751 & 8) != 0 ? result.bottomEntryPoint : null, (32751 & 16) != 0 ? result.filters : arrayList, (32751 & 32) != 0 ? result.geoFilter : null, (32751 & 64) != 0 ? result.actionHorizontalBlock : null, (32751 & 128) != 0 ? result.uri : null, (32751 & 256) != 0 ? result.tabs : null, (32751 & 512) != 0 ? result.topWidget : null, (32751 & 1024) != 0 ? result.tabsConfig : null, (32751 & 2048) != 0 ? result.submitParams : null, (32751 & 4096) != 0 ? result.additionalAction : null, (32751 & 8192) != 0 ? result.filtersButtonOnboarding : null, (32751 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? result.mapEntryAction : null), 1, null);
        }
    }

    @Inject
    public f(@Y61.k InterfaceC40426a interfaceC40426a, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k InterfaceC31047g interfaceC31047g, @Y61.k T t12, @Y61.k C31060u c31060u, @Y61.k InterfaceC35745a5 interfaceC35745a5, boolean z12) {
        this.f251610a = interfaceC40426a;
        this.f251611b = searchParamsConverter;
        this.f251612c = interfaceC31047g;
        this.f251613d = t12;
        this.f251614e = c31060u;
        this.f251615f = interfaceC35745a5;
        this.f251616g = z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.rxjava3.core.z a(@Y61.l com.avito.android.remote.model.SearchParams r12, @Y61.l com.avito.android.remote.model.PresentationType r13, @Y61.l java.lang.String r14, @Y61.l com.avito.android.remote.model.search.Filter r15, @Y61.l com.avito.android.remote.model.search.Filter r16, @Y61.l java.util.Map r17, @Y61.k com.avito.android.remote.model.search.Filter r18, @Y61.l com.avito.android.deep_linking.links.ItemsSearchLink r19) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.realty_agency.inline_filters.f.a(com.avito.android.remote.model.SearchParams, com.avito.android.remote.model.PresentationType, java.lang.String, com.avito.android.remote.model.search.Filter, com.avito.android.remote.model.search.Filter, java.util.Map, com.avito.android.remote.model.search.Filter, com.avito.android.deep_linking.links.ItemsSearchLink):io.reactivex.rxjava3.core.z");
    }

    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    public final z<InlineFilters> b(@Y61.k SearchParams searchParams, @Y61.k Map<String, String> map, @Y61.l PresentationType presentationType, @Y61.l Map<String, String> map2, @Y61.l List<String> list, @Y61.l String str) {
        return this.f251610a.a(SearchParamsConverter.DefaultImpls.convertToMap$default(this.f251611b, searchParams, this.f251614e, false, presentationType, 4, null), this.f251612c.a(map), this.f251613d.a(list), str, this.f251616g).d0(new a()).x0(this.f251615f.a());
    }

    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    public final z c(@Y61.k Filter filter, @Y61.k InlineFilterValue inlineFilterValue, @Y61.l SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.l String str) {
        return d(Collections.singletonList(new Q(filter, inlineFilterValue)), searchParams, presentationType, (8 & 8) != 0 ? null : null, null, (8 & 32) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    public final I0 d(@Y61.k List list, @Y61.l SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.l List list2, @Y61.l String str) {
        Q q12;
        Filter.Config config;
        Filter.Displaying displaying;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (true) {
            Filter.FilterMapping mapping = null;
            if (!it.hasNext()) {
                break;
            }
            Q q13 = (Q) it.next();
            Filter filter = (Filter) q13.f406619b;
            InlineFilterValue inlineFilterValue = (InlineFilterValue) q13.f406620c;
            String id2 = filter.getId();
            if (id2 == null) {
                id2 = "";
            }
            Filter.Widget widget = filter.getWidget();
            if ((widget != null ? widget.getType() : null) == WidgetType.Calendar) {
                Filter.Widget widget2 = filter.getWidget();
                String format = widget2 != null ? widget2.getFormat() : null;
                Filter.Widget widget3 = filter.getWidget();
                if (widget3 != null && (config = widget3.getConfig()) != null && (displaying = config.getDisplaying()) != null) {
                    mapping = displaying.getMapping();
                }
                q12 = new Q(format, mapping);
            } else {
                q12 = new Q(null, null);
            }
            String str2 = (String) q12.f406619b;
            Filter.FilterMapping filterMapping = (Filter.FilterMapping) q12.f406620c;
            if (id2.length() > 0) {
                linkedHashMap.putAll(inlineFilterValue.queryMap(id2, str2, filterMapping));
            }
        }
        InterfaceC35745a5 interfaceC35745a5 = this.f251615f;
        return (searchParams == null || linkedHashMap.isEmpty()) ? z.c0(new InlineFilters(null, null)).j0(interfaceC35745a5.e()) : b(searchParams, linkedHashMap, (8 & 4) != 0 ? null : presentationType, null, (8 & 16) != 0 ? null : list2, (8 & 32) != 0 ? null : str).j0(interfaceC35745a5.e());
    }
}
