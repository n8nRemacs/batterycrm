package com.avito.android.inline_filters;

import com.avito.android.inline_filters.C31056p;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.search.AddressFilterValue;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.search.Result;
import com.avito.android.remote.model.search.WidgetType;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;

/* compiled from: FiltersInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/p;", "Lcom/avito/android/inline_filters/b;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.p, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31056p implements InterfaceC30995b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<V0> f172328a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SearchParamsConverter f172329b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC31047g f172330c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final T f172331d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C31060u f172332e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f172333f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final SerpSpaceType f172334g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InlineFiltersSource f172335h;

    /* compiled from: FiltersInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.inline_filters.p$a */
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[InlineFiltersSource.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                InlineFiltersSource inlineFiltersSource = InlineFiltersSource.f170993b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                InlineFiltersSource inlineFiltersSource2 = InlineFiltersSource.f170993b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: FiltersInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/search/InlineFilters;", "it", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.inline_filters.p$b */
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f172336b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            InlineFilters inlineFilters = (InlineFilters) obj;
            Result result = inlineFilters.getResult();
            return InlineFilters.copy$default(inlineFilters, null, result != null ? result.copy((32751 & 1) != 0 ? result.onResult : null, (32751 & 2) != 0 ? result.header : null, (32751 & 4) != 0 ? result.topEntryPoint : null, (32751 & 8) != 0 ? result.bottomEntryPoint : null, (32751 & 16) != 0 ? result.filters : null, (32751 & 32) != 0 ? result.geoFilter : null, (32751 & 64) != 0 ? result.actionHorizontalBlock : null, (32751 & 128) != 0 ? result.uri : null, (32751 & 256) != 0 ? result.tabs : null, (32751 & 512) != 0 ? result.topWidget : null, (32751 & 1024) != 0 ? result.tabsConfig : null, (32751 & 2048) != 0 ? result.submitParams : null, (32751 & 4096) != 0 ? result.additionalAction : null, (32751 & 8192) != 0 ? result.filtersButtonOnboarding : null, (32751 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? result.mapEntryAction : null) : null, 1, null);
        }
    }

    @Inject
    public C31056p(@Y61.k h31.e<V0> eVar, @Y61.k SearchParamsConverter searchParamsConverter, @Y61.k InterfaceC31047g interfaceC31047g, @Y61.k T t12, @Y61.k C31060u c31060u, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.l SerpSpaceType serpSpaceType, @Y61.k InlineFiltersSource inlineFiltersSource) {
        this.f172328a = eVar;
        this.f172329b = searchParamsConverter;
        this.f172330c = interfaceC31047g;
        this.f172331d = t12;
        this.f172332e = c31060u;
        this.f172333f = interfaceC35745a5;
        this.f172334g = serpSpaceType;
        this.f172335h = inlineFiltersSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0130  */
    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.rxjava3.core.z a(@Y61.l com.avito.android.remote.model.SearchParams r12, @Y61.l com.avito.android.remote.model.PresentationType r13, @Y61.l java.lang.String r14, @Y61.l com.avito.android.remote.model.search.Filter r15, @Y61.l com.avito.android.remote.model.search.Filter r16, @Y61.l java.util.Map r17, @Y61.k com.avito.android.remote.model.search.Filter r18, @Y61.l com.avito.android.deep_linking.links.ItemsSearchLink r19) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.inline_filters.C31056p.a(com.avito.android.remote.model.SearchParams, com.avito.android.remote.model.PresentationType, java.lang.String, com.avito.android.remote.model.search.Filter, com.avito.android.remote.model.search.Filter, java.util.Map, com.avito.android.remote.model.search.Filter, com.avito.android.deep_linking.links.ItemsSearchLink):io.reactivex.rxjava3.core.z");
    }

    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    public final io.reactivex.rxjava3.core.z<InlineFilters> b(@Y61.k SearchParams searchParams, @Y61.k Map<String, String> map, @Y61.l PresentationType presentationType, @Y61.l Map<String, String> map2, @Y61.l List<String> list, @Y61.l final String str) {
        final Map mapConvertToMap$default = SearchParamsConverter.DefaultImpls.convertToMap$default(this.f172329b, searchParams, this.f172332e, false, presentationType, 4, null);
        final LinkedHashMap linkedHashMapA = this.f172330c.a(map);
        final Map<String, String> mapA = this.f172331d.a(list);
        return new io.reactivex.rxjava3.internal.operators.observable.F(new l41.s() { // from class: com.avito.android.inline_filters.o
            @Override // l41.s
            public final Object get() {
                C31056p c31056p = this.f172323b;
                int iOrdinal = c31056p.f172335h.ordinal();
                Map<String, String> map3 = mapConvertToMap$default;
                Map<String, String> map4 = linkedHashMapA;
                Map<String, String> map5 = mapA;
                String str2 = str;
                SerpSpaceType serpSpaceType = c31056p.f172334g;
                h31.e<V0> eVar = c31056p.f172328a;
                if (iOrdinal == 0) {
                    return eVar.get().c(map3, map4, map5, str2, serpSpaceType != null ? serpSpaceType.getSegmentQueryParam() : null);
                }
                if (iOrdinal == 1) {
                    return eVar.get().f(map3, map4, map5, str2, serpSpaceType != null ? serpSpaceType.getSegmentQueryParam() : null);
                }
                if (iOrdinal == 2) {
                    return eVar.get().f(map3, map4, map5, str2, serpSpaceType != null ? serpSpaceType.getSegmentQueryParam() : null).d0(C31056p.b.f172336b);
                }
                throw new NoWhenBranchMatchedException();
            }
        }).x0(this.f172333f.a());
    }

    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    public final io.reactivex.rxjava3.core.z c(@Y61.k Filter filter, @Y61.k InlineFilterValue inlineFilterValue, @Y61.l SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.l String str) {
        return d(Collections.singletonList(new kotlin.Q(filter, inlineFilterValue)), searchParams, presentationType, (8 & 8) != 0 ? null : null, null, (8 & 32) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.HashSet] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection] */
    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    public final I0 d(@Y61.k List list, @Y61.l SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.l List list2, @Y61.l String str) {
        List listV;
        kotlin.Q q12;
        Filter.Config config;
        Filter.Displaying displaying;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (true) {
            Filter.FilterMapping mapping = null;
            if (!it.hasNext()) {
                break;
            }
            kotlin.Q q13 = (kotlin.Q) it.next();
            Filter filter = (Filter) q13.f406619b;
            InlineFilterValue inlineFilterValue = (InlineFilterValue) q13.f406620c;
            Filter.Widget widget = filter.getWidget();
            if ((widget != null ? widget.getType() : null) == WidgetType.Addresses) {
                InlineFilterValue[] inlineFilterValueArr = {filter.getValue(), inlineFilterValue};
                ArrayList arrayList = new ArrayList();
                for (int i12 = 0; i12 < 2; i12++) {
                    InlineFilterValue inlineFilterValue2 = inlineFilterValueArr[i12];
                    if (inlineFilterValue2 instanceof InlineFilterValue.InlineFilterAddressesValue) {
                        arrayList.add(inlineFilterValue2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    List<AddressFilterValue> selectedItems = ((InlineFilterValue.InlineFilterAddressesValue) it2.next()).getSelectedItems();
                    if (selectedItems == null) {
                        selectedItems = C42784z0.f406748b;
                    }
                    C42745f0.h(selectedItems, arrayList2);
                }
                listV = new HashSet();
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    String paramId = ((AddressFilterValue) it3.next()).getParamId();
                    if (paramId != null) {
                        listV.add(paramId);
                    }
                }
            } else {
                listV = C42745f0.V(filter.getId());
            }
            Filter.Widget widget2 = filter.getWidget();
            if ((widget2 != null ? widget2.getType() : null) == WidgetType.Calendar) {
                Filter.Widget widget3 = filter.getWidget();
                String format = widget3 != null ? widget3.getFormat() : null;
                Filter.Widget widget4 = filter.getWidget();
                if (widget4 != null && (config = widget4.getConfig()) != null && (displaying = config.getDisplaying()) != null) {
                    mapping = displaying.getMapping();
                }
                q12 = new kotlin.Q(format, mapping);
            } else {
                q12 = new kotlin.Q(null, null);
            }
            String str2 = (String) q12.f406619b;
            Filter.FilterMapping filterMapping = (Filter.FilterMapping) q12.f406620c;
            if (!listV.isEmpty()) {
                Iterator it4 = ((Iterable) listV).iterator();
                while (it4.hasNext()) {
                    linkedHashMap.putAll(inlineFilterValue.queryMap((String) it4.next(), str2, filterMapping));
                }
            }
        }
        InterfaceC35745a5 interfaceC35745a5 = this.f172333f;
        return (searchParams == null || linkedHashMap.isEmpty()) ? io.reactivex.rxjava3.core.z.c0(new InlineFilters(null, null)).j0(interfaceC35745a5.e()) : b(searchParams, linkedHashMap, (8 & 4) != 0 ? null : presentationType, null, (8 & 16) != 0 ? null : list2, (8 & 32) != 0 ? null : str).j0(interfaceC35745a5.e());
    }
}
