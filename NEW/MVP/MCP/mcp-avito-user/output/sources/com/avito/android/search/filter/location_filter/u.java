package com.avito.android.search.filter.location_filter;

import android.view.ViewGroup;
import com.avito.android.remote.error.ApiError;
import io.reactivex.rxjava3.core.z;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: LocationFiltersView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/location_filter/u;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface u {
    @Y61.k
    /* renamed from: H6 */
    ViewGroup getF263694a();

    void a();

    @Y61.k
    z<G0> b();

    void c();

    @Y61.k
    z<G0> d();

    void e(boolean z12);

    @Y61.k
    z<G0> f();

    void g(@Y61.k ApiError apiError);

    void h();

    void i();

    void onDataChanged();
}
