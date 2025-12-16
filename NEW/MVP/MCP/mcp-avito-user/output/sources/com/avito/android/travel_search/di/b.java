package com.avito.android.travel_search.di;

import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.di.B;
import com.avito.android.di.module.InterfaceC30073i7;
import com.avito.android.di.module.X2;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.travel_search.TravelSearchOpenParams;
import com.avito.android.travel_search.analytics.TravelSearchScreen;
import com.avito.android.travel_search.ui.TravelSearchFragment;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;
import oW.InterfaceC44697a;

/* compiled from: TravelSearchComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/travel_search/di/b;", "", "a", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: TravelSearchComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_search/di/b$a;", "", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@h31.b @Y61.k ActivityC22955m activityC22955m, @h31.b @Y61.k TravelSearchScreen travelSearchScreen, @h31.b @Y61.k com.avito.android.analytics.screens.r rVar, @h31.b @Y61.l SearchParams searchParams, @h31.b @Y61.k Resources resources, @h31.b @Y61.k TravelSearchOpenParams travelSearchOpenParams, @h31.b @Y61.k Y41.l lVar, @h31.b @Y61.l @X2 Kundle kundle, @h31.b @Y61.l @InterfaceC30073i7 Kundle kundle2, @h31.b @Y61.l @com.avito.android.inline_filters.di.s Kundle kundle3, @h31.b @Y61.k RecyclerView.t tVar, @Y61.k c cVar, @Y61.k InterfaceC44697a interfaceC44697a, @Y61.k InterfaceC39417a interfaceC39417a);
    }

    void a(@Y61.k TravelSearchFragment travelSearchFragment);
}
