package com.avito.android.serp.adapter.vertical_main.vertical_filter;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.inline_filters.InterfaceC30995b;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.Header;
import com.avito.android.remote.model.search.InlineFilterValue;
import com.avito.android.remote.model.search.InlineFilters;
import com.avito.android.remote.model.search.Result;
import com.avito.android.remote.model.vertical_main.Form;
import com.avito.android.remote.model.vertical_main.SearchFormResult;
import com.avito.android.serp.adapter.vertical_main.VerticalFormType;
import com.avito.android.serp.adapter.vertical_main.vertical_filter.C34873i;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: VerticalFilterFiltersInteractorImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/vertical_filter/i;", "Lcom/avito/android/inline_filters/b;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34873i implements InterfaceC30995b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<V0> f273536a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f273537b;

    /* compiled from: VerticalFilterFiltersInteractorImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/vertical_main/SearchFormResult;", "it", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/vertical_main/Form;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.i$a */
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f273538b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return io.reactivex.rxjava3.core.z.c0(((SearchFormResult) ((TypedResult.Success) typedResult).getResult()).getForm());
            }
            if (typedResult instanceof TypedResult.Error) {
                return io.reactivex.rxjava3.core.z.M(new Exception(((TypedResult.Error) typedResult).getError().getF244063c()));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: VerticalFilterFiltersInteractorImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/vertical_main/Form;", "form", "Lio/reactivex/rxjava3/core/E;", "Lcom/avito/android/remote/model/search/InlineFilters;", "apply", "(Lcom/avito/android/remote/model/vertical_main/Form;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.serp.adapter.vertical_main.vertical_filter.i$b */
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f273539b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            Form form = (Form) obj;
            if (form.getFilters().isEmpty()) {
                return io.reactivex.rxjava3.core.z.M(new Exception("empty filters"));
            }
            return io.reactivex.rxjava3.core.z.c0(new InlineFilters("ok", new Result(null, new Header(form.getAction().getTitle(), null, form.getSelectedFiltersCount(), null, null, null), null, null, form.getFilters(), null, null, form.getAction().getUri(), null, null, null, form.getSubmitParams(), form.getAdditionalAction(), null, null, 26177, null)));
        }
    }

    @Inject
    public C34873i(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar) {
        this.f273536a = eVar;
        this.f273537b = interfaceC35745a5;
    }

    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    public final io.reactivex.rxjava3.core.z a(@Y61.l SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l String str, @Y61.l Filter filter, @Y61.l Filter filter2, @Y61.l Map map, @Y61.k Filter filter3, @Y61.l ItemsSearchLink itemsSearchLink) {
        SearchParams searchParams2;
        SearchParams searchParams3;
        SearchParams searchParams4;
        Map linkedHashMap = map != null ? new LinkedHashMap(map) : new HashMap();
        linkedHashMap.put("geoReset", "true");
        InlineFilterValue value = filter != null ? filter.getValue() : null;
        if (value != null) {
            if (itemsSearchLink != null && (searchParams4 = itemsSearchLink.f133403b) != null) {
                searchParams = searchParams4;
            }
            if (searchParams != null) {
                InlineFilterValue.InlineFilterLocationValue inlineFilterLocationValue = value instanceof InlineFilterValue.InlineFilterLocationValue ? (InlineFilterValue.InlineFilterLocationValue) value : null;
                searchParams.setLocationId(inlineFilterLocationValue != null ? inlineFilterLocationValue.getLocationId() : null);
                searchParams.setSuggestLocationId(null);
                InlineFilterValue value2 = filter2 != null ? filter2.getValue() : null;
                InlineFilterValue.InlineFilterBooleanValue inlineFilterBooleanValue = value2 instanceof InlineFilterValue.InlineFilterBooleanValue ? (InlineFilterValue.InlineFilterBooleanValue) value2 : null;
                searchParams.setLocalPriority(inlineFilterBooleanValue != null ? Boolean.valueOf(inlineFilterBooleanValue.getValue()) : null);
                searchParams.setRadius(null);
                searchParams.setDistrictId(null);
                searchParams.setFootWalkingMetro(null);
            } else {
                searchParams3 = null;
            }
        } else {
            searchParams3 = (itemsSearchLink == null || (searchParams2 = itemsSearchLink.f133403b) == null) ? searchParams : searchParams2;
        }
        return d(C42784z0.f406748b, searchParams3, presentationType, linkedHashMap, null, str);
    }

    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    public final io.reactivex.rxjava3.core.z<InlineFilters> b(@Y61.k SearchParams searchParams, @Y61.k Map<String, String> map, @Y61.l PresentationType presentationType, @Y61.l Map<String, String> map2, @Y61.l List<String> list, @Y61.l String str) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        linkedHashMap.putAll(map);
        return new io.reactivex.rxjava3.internal.operators.observable.F(new l41.s() { // from class: com.avito.android.serp.adapter.vertical_main.vertical_filter.h
            @Override // l41.s
            public final Object get() {
                C34873i c34873i = this.f273534b;
                V0 v02 = c34873i.f273536a.get();
                VerticalFormType verticalFormType = VerticalFormType.f272519c;
                return v02.g("form", linkedHashMap).x0(c34873i.f273537b.a()).T(C34873i.a.f273538b, Integer.MAX_VALUE).T(C34873i.b.f273539b, Integer.MAX_VALUE);
            }
        });
    }

    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    public final io.reactivex.rxjava3.core.z c(@Y61.k Filter filter, @Y61.k InlineFilterValue inlineFilterValue, @Y61.l SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.l String str) {
        return d(Collections.singletonList(new Q(filter, inlineFilterValue)), searchParams, presentationType, (8 & 8) != 0 ? null : map, null, (8 & 32) != 0 ? null : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.inline_filters.InterfaceC30995b
    @Y61.k
    public final I0 d(@Y61.k List list, @Y61.l SearchParams searchParams, @Y61.l PresentationType presentationType, @Y61.l Map map, @Y61.l List list2, @Y61.l String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
        Q q12 = (Q) C42745f0.G(list);
        Filter filter = q12 != null ? (Filter) q12.f406619b : null;
        Q q13 = (Q) C42745f0.G(list);
        InlineFilterValue inlineFilterValue = q13 != null ? (InlineFilterValue) q13.f406620c : null;
        if (filter != null && inlineFilterValue != null) {
            Long attrId = filter.getAttrId();
            if (attrId != null) {
                linkedHashMap.put("changedParamId", String.valueOf(attrId.longValue()));
            }
            String changedParamType = filter.getChangedParamType();
            if (changedParamType != null) {
                linkedHashMap.put("changedParamType", changedParamType);
            }
            linkedHashMap.putAll(inlineFilterValue.changedParamsMap());
        }
        InterfaceC35745a5 interfaceC35745a5 = this.f273537b;
        return searchParams != null ? b(searchParams, linkedHashMap, presentationType, linkedHashMap2, list2, str).j0(interfaceC35745a5.e()) : io.reactivex.rxjava3.core.z.c0(new InlineFilters(null, null)).j0(interfaceC35745a5.e());
    }
}
