package com.avito.android.map.analytics;

import Y61.k;
import Y61.l;
import com.avito.android.map_core.analytics.event.PinDescription;
import com.avito.android.map_core.analytics.event.SourceAction;
import com.avito.android.remote.model.SearchParams;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: MapAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/analytics/a;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {

    /* compiled from: MapAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map.analytics.a$a, reason: collision with other inner class name */
    public static final class C5429a {
    }

    void a();

    void b(@l LatLngBounds latLngBounds);

    void c(@k SearchParams searchParams, @l String str);

    void d(@k SearchParams searchParams);

    void e(@k ArrayList arrayList, @k SearchParams searchParams);

    void f();

    void g(@l LatLngBounds latLngBounds, int i12, @l String str, @l Float f12, @k PinDescription.Type type, @k PinDescription.State state, @k PinDescription.Highlight highlight, @l String str2);

    void h(@l String str);

    void i(@k SearchParams searchParams, long j12, @l LatLngBounds latLngBounds, @l Float f12, boolean z12, @l SourceAction sourceAction);

    void j();

    void k(@l LatLngBounds latLngBounds, @l Float f12);

    void l(@k SearchParams searchParams, @l String str);

    void m(@l LatLngBounds latLngBounds, @l Float f12);
}
