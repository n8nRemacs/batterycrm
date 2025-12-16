package com.avito.android.search.filter.preloading;

import Y61.k;
import Y61.l;
import com.avito.android.ab_tests.configs.PreloadingPromiseTestGroup;
import com.avito.android.preloading.j;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.search.filter.FiltersOverrideParams;
import com.avito.android.search.filter.ParametersTreeWithAdditional;
import com.avito.android.search.filter.di.o;
import com.avito.android.util.C;
import com.avito.android.util.Kundle;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FiltersPreloadingPromiseFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/preloading/a;", "", "<init>", "()V", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    @Inject
    public a() {
    }

    @k
    public static j a(@k g gVar, @k C c12, @k PreloadingPromiseTestGroup preloadingPromiseTestGroup, @o.b @l Kundle kundle, @o.j @l String str, @l Area area, @l SearchParams searchParams) {
        ParametersTreeWithAdditional parametersTreeWithAdditional = kundle != null ? (ParametersTreeWithAdditional) kundle.d("parameters_tree") : null;
        Coordinates coordinates = kundle != null ? (Coordinates) kundle.d(ServiceTransportationWidget.LocationField.COORDINATES) : null;
        FiltersOverrideParams filtersOverrideParams = kundle != null ? (FiltersOverrideParams) kundle.d("last_override_params") : null;
        boolean z12 = preloadingPromiseTestGroup.a() && (parametersTreeWithAdditional == null || parametersTreeWithAdditional.isEmpty());
        j.a aVar = j.f221853g;
        c cVar = new c(null, area, filtersOverrideParams, coordinates, null, str, parametersTreeWithAdditional, searchParams, 16, null);
        aVar.getClass();
        return z12 ? new com.avito.android.preloading.a(cVar, gVar, c12) : new com.avito.android.preloading.b(gVar, c12);
    }
}
