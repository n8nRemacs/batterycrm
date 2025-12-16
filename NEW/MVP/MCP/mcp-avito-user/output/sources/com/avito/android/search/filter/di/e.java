package com.avito.android.search.filter.di;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.analytics.screens.FiltersScreen;
import com.avito.android.di.B;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.map.Area;
import com.avito.android.search.filter.FilterAnalyticsData;
import com.avito.android.search.filter.FiltersFragment;
import com.avito.android.search.filter.FiltersMode;
import com.avito.android.search.filter.di.o;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import h31.d;
import io.reactivex.rxjava3.internal.operators.observable.C;
import kotlin.Metadata;
import oW.InterfaceC44697a;

/* compiled from: FiltersComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/search/filter/di/e;", "", "a", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes3.dex */
public interface e {

    /* compiled from: FiltersComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/di/e$a;", "", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        a a(@Y61.k InterfaceC39417a interfaceC39417a);

        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @Y61.k
        e build();

        @h31.b
        @Y61.k
        a c(@Y61.k com.avito.android.analytics.screens.r rVar);

        @h31.b
        @Y61.k
        a d(@Y61.k ActivityC22955m activityC22955m);

        @h31.b
        @Y61.k
        a e(@Y61.k FiltersFragment filtersFragment);

        @Y61.k
        a f(@Y61.k InterfaceC44697a interfaceC44697a);

        @h31.b
        @Y61.k
        a g(@Y61.k FiltersFragment filtersFragment);

        @h31.b
        @Y61.k
        a h(@o.b @Y61.l Kundle kundle);

        @h31.b
        @Y61.k
        a i(@Y61.l Area area);

        @Y61.k
        a j(@Y61.k n nVar);

        @h31.b
        @Y61.k
        a k(@o.i @Y61.l String str);

        @h31.b
        @Y61.k
        a l(@o.f @Y61.l String str);

        @h31.b
        @Y61.k
        a m(@Y61.l FilterAnalyticsData filterAnalyticsData);

        @h31.b
        @Y61.k
        a n(@o.j @Y61.l String str);

        @h31.b
        @Y61.k
        a o(@Y61.l SearchParams searchParams);

        @h31.b
        @Y61.k
        a p(@Y61.l FiltersFragment filtersFragment);

        @h31.b
        @Y61.k
        a q(@Y61.l @o.h Bundle bundle);

        @h31.b
        @Y61.k
        a r(@Y61.l @o.g PresentationType presentationType);

        @h31.b
        @Y61.k
        a s(@Y61.k FiltersScreen filtersScreen);

        @h31.b
        @Y61.k
        a t(@o.c boolean z12);

        @h31.b
        @Y61.k
        a u(@o.e @Y61.k C c12);

        @h31.b
        @Y61.k
        a v(@o.d boolean z12);

        @h31.b
        @Y61.k
        a w(@Y61.k FiltersFragment filtersFragment);

        @h31.b
        @Y61.k
        a x(@Y61.k FiltersMode filtersMode);
    }

    void a(@Y61.k FiltersFragment filtersFragment);
}
