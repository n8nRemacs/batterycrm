package com.avito.android.search.filter.location_filter.di;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.analytics.screens.GeoFiltersScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.search.filter.FiltersMode;
import com.avito.android.search.filter.di.o;
import com.avito.android.search.filter.location_filter.LocationFiltersDialogFragment;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import h31.d;
import io.reactivex.rxjava3.internal.operators.observable.C;
import kotlin.Metadata;
import oW.InterfaceC44697a;

/* compiled from: LocationFiltersComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/location_filter/di/j;", "", "a", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface j {

    /* compiled from: LocationFiltersComponent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/location_filter/di/j$a;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d.b
    public interface a {

        /* compiled from: LocationFiltersComponent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.search.filter.location_filter.di.j$a$a, reason: collision with other inner class name */
        public static final class C7872a {
        }

        @Y61.k
        j a(@Y61.k com.avito.android.search.filter.di.n nVar, @Y61.k InterfaceC39417a interfaceC39417a, @Y61.k InterfaceC44697a interfaceC44697a, @h31.b @Y61.l @o.h Bundle bundle, @o.b @h31.b @Y61.l Kundle kundle, @h31.b @Y61.k Resources resources, @h31.b @Y61.k ActivityC22955m activityC22955m, @h31.b @Y61.k LocationFiltersDialogFragment locationFiltersDialogFragment, @h31.b @Y61.k LocationFiltersDialogFragment locationFiltersDialogFragment2, @h31.b @Y61.k r rVar, @h31.b @Y61.l SearchParams searchParams, @h31.b @Y61.l Area area, @h31.b @Y61.k LocationFiltersDialogFragment locationFiltersDialogFragment3, @h31.b @Y61.k FiltersMode filtersMode, @h31.b @Y61.k GeoFiltersScreen geoFiltersScreen, @o.e @h31.b @Y61.k C c12, @o.j @h31.b @Y61.l String str);
    }

    void a(@Y61.k LocationFiltersDialogFragment locationFiltersDialogFragment);
}
