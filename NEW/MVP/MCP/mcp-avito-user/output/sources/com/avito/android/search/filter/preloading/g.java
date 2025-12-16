package com.avito.android.search.filter.preloading;

import Y61.k;
import Y61.l;
import com.avito.android.remote.V0;
import com.avito.android.remote.model.Category;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.PresentationTypeKt;
import com.avito.android.remote.model.SearchParameters;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.remote.model.search.map.AreaKt;
import com.avito.android.search.filter.FiltersInteractor;
import com.avito.android.search.filter.FiltersMode;
import com.avito.android.search.filter.FiltersOverrideParams;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import com.avito.android.search.filter.di.f;
import com.avito.android.search.filter.di.o;
import com.avito.android.search.filter.r1;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: FiltersTreePreloadable.kt */
@s0
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002&\u0012\u0004\u0012\u00020\u0002\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00030\u0001¨\u0006\b"}, d2 = {"Lcom/avito/android/search/filter/preloading/g;", "Lcom/avito/android/preloading/d;", "Lcom/avito/android/search/filter/preloading/c;", "Lkotlin/Q;", "", "Lcom/avito/android/remote/model/Category;", "Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/SearchParameters;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g implements com.avito.android.preloading.d<c, Q<? extends List<? extends Category>, ? extends P2<? super SearchParameters>>> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.categories.a f263777a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SearchParamsConverter f263778b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final h31.e<V0> f263779c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PresentationType f263780d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final FiltersMode f263781e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.search.filter.analytics.c f263782f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f263783g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final r1 f263784h;

    @Inject
    public g(@k com.avito.android.categories.a aVar, @f.g @k SearchParamsConverter searchParamsConverter, @k h31.e<V0> eVar, @l @o.g PresentationType presentationType, @k FiltersMode filtersMode, @k com.avito.android.search.filter.analytics.c cVar, @k com.avito.android.remote.error.f fVar, @k r1 r1Var) {
        this.f263777a = aVar;
        this.f263778b = searchParamsConverter;
        this.f263779c = eVar;
        this.f263780d = presentationType;
        this.f263781e = filtersMode;
        this.f263782f = cVar;
        this.f263783g = fVar;
        this.f263784h = r1Var;
    }

    @Override // com.avito.android.preloading.d
    public final z<? extends Q<? extends List<? extends Category>, ? extends P2<? super SearchParameters>>> a(c cVar) {
        Map<String, String> mapConvertToMap$default;
        String str;
        String parameterValue;
        c cVar2 = cVar;
        z<List<Category>> zVarA = this.f263777a.a();
        ParametersTreeWithAdditional parametersTreeWithAdditional = cVar2.f263772g;
        if (parametersTreeWithAdditional != null) {
            mapConvertToMap$default = new LinkedHashMap<>(this.f263784h.a(parametersTreeWithAdditional));
            mapConvertToMap$default.remove("parameter_id_categories");
            mapConvertToMap$default.remove("parameter_id_subcategories");
        } else {
            SearchParams searchParams = cVar2.f263773h;
            if (searchParams == null) {
                searchParams = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
            }
            mapConvertToMap$default = SearchParamsConverter.DefaultImpls.convertToMap$default(this.f263778b, searchParams, null, false, null, 14, null);
        }
        SearchParams searchParams2 = cVar2.f263766a;
        if (searchParams2 == null) {
            Area area = cVar2.f263767b;
            if (area != null) {
                mapConvertToMap$default = P0.k(mapConvertToMap$default, AreaKt.toMap(area));
            }
        } else {
            mapConvertToMap$default = SearchParamsConverter.DefaultImpls.convertToMap$default(this.f263778b, searchParams2, null, false, null, 14, null);
        }
        Coordinates coordinates = cVar2.f263769d;
        if (coordinates != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(coordinates.getLatitude());
            sb2.append(',');
            sb2.append(coordinates.getLongitude());
            mapConvertToMap$default = com.avito.android.authorization.auto_recovery.phone_confirm.b.l(SearchParamsConverterKt.GEO_COORDS, sb2.toString(), mapConvertToMap$default);
        }
        String str2 = cVar2.f263770e;
        if (str2 != null) {
            mapConvertToMap$default = com.avito.android.authorization.auto_recovery.phone_confirm.b.l(SearchParamsConverterKt.DRAW_ID, str2, mapConvertToMap$default);
        }
        PresentationType presentationType = this.f263780d;
        if (presentationType != null && (parameterValue = PresentationTypeKt.toParameterValue(presentationType)) != null) {
            mapConvertToMap$default = com.avito.android.authorization.auto_recovery.phone_confirm.b.l(PresentationTypeKt.PRESENTATION_TYPE, parameterValue, mapConvertToMap$default);
        }
        FiltersMode filtersMode = this.f263781e;
        FiltersMode.ExtendedProfile extendedProfile = filtersMode instanceof FiltersMode.ExtendedProfile ? (FiltersMode.ExtendedProfile) filtersMode : null;
        if (extendedProfile != null && (str = extendedProfile.f261859b) != null && str.length() > 0) {
            mapConvertToMap$default = com.avito.android.authorization.auto_recovery.phone_confirm.b.l("formName", str, mapConvertToMap$default);
        }
        String str3 = cVar2.f263771f;
        if (str3 != null) {
            mapConvertToMap$default = com.avito.android.authorization.auto_recovery.phone_confirm.b.l("context", str3, mapConvertToMap$default);
        }
        this.f263782f.d(mapConvertToMap$default);
        FiltersOverrideParams filtersOverrideParams = cVar2.f263768c;
        if (filtersOverrideParams != null) {
            for (FiltersInteractor.ParameterValue parameterValue2 : filtersOverrideParams.f261860b) {
                String str4 = parameterValue2.f261857c;
                String str5 = parameterValue2.f261856b;
                mapConvertToMap$default = str4 != null ? com.avito.android.authorization.auto_recovery.phone_confirm.b.l(str5, str4, mapConvertToMap$default) : P0.i(mapConvertToMap$default, str5);
            }
        }
        return z.k(zVarA, z.q(z.c0(P2.c.f318721a), this.f263779c.get().m(mapConvertToMap$default).d0(e.f263775b).m0(new f(this))), d.f263774b);
    }
}
