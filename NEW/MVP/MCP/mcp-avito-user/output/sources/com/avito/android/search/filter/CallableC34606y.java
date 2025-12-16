package com.avito.android.search.filter;

import com.avito.android.remote.model.SearchParam;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.StringSearchParam;
import com.avito.android.remote.model.category_parameters.AdditionalAreaParameter;
import com.avito.android.remote.model.category_parameters.AdditionalCategoryParameter;
import com.avito.android.remote.model.category_parameters.LocationParameter;
import com.avito.android.remote.model.counter.ChangingParametersForButtons;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.remote.model.search.map.AreaKt;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.avito.android.search.filter.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class CallableC34606y implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f263813b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f263814c;

    public /* synthetic */ CallableC34606y(E e12, int i12) {
        this.f263813b = i12;
        this.f263814c = e12;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f263813b) {
            case 0:
                E e12 = (E) this.f263814c;
                SearchParams searchParamsF = e12.f();
                searchParamsF.setExpanded(e12.H());
                searchParamsF.setSellerId(e12.D());
                searchParamsF.setShopId(e12.E());
                if (e12.C() != null) {
                    Map<String, SearchParam<?>> params = searchParamsF.getParams();
                    if (params == null) {
                        params = kotlin.collections.P0.c();
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(params);
                    String strC = e12.C();
                    if (strC != null) {
                        linkedHashMap.put("166812", new StringSearchParam(strC));
                    }
                    searchParamsF.setParams(linkedHashMap);
                }
                Map mapConvertToMap$default = SearchParamsConverter.DefaultImpls.convertToMap$default(e12.f261775l, searchParamsF, null, false, e12.f261774k, 6, null);
                ParametersTreeWithAdditional parametersTreeWithAdditional = e12.f261753B;
                AdditionalCategoryParameter additionalCategoryParameterA = parametersTreeWithAdditional != null ? parametersTreeWithAdditional.a(SearchParams.Companion.Params.SEARCH_AREA_PARAM) : null;
                AdditionalAreaParameter additionalAreaParameter = additionalCategoryParameterA instanceof AdditionalAreaParameter ? (AdditionalAreaParameter) additionalCategoryParameterA : null;
                Area value = additionalAreaParameter != null ? additionalAreaParameter.getValue() : null;
                e12.f261772i = value;
                return value != null ? kotlin.collections.P0.k(mapConvertToMap$default, AreaKt.toMap(value)) : mapConvertToMap$default;
            case 1:
                ChangingParametersForButtons changingParametersForButtons = ((E) this.f263814c).f261755D;
                return org.funktionale.option.e.a(changingParametersForButtons != null ? changingParametersForButtons.getCounterButton() : null);
            default:
                LocationParameter locationParameter = (LocationParameter) ((ParametersTreeWithAdditionalImpl) this.f263814c).f261893e.getFirstParameterOfType(LocationParameter.class);
                return org.funktionale.option.e.a(locationParameter != null ? locationParameter.getValue() : null);
        }
    }

    public /* synthetic */ CallableC34606y(E e12, ParametersTreeWithAdditionalImpl parametersTreeWithAdditionalImpl) {
        this.f263813b = 2;
        this.f263814c = parametersTreeWithAdditionalImpl;
    }
}
