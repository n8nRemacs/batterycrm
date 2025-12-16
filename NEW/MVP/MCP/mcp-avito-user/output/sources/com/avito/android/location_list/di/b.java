package com.avito.android.location_list.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import com.avito.android.location_list.LocationListActivity;
import com.avito.android.location_list.LocationListFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: LocationListComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/location_list/di/b;", "", "a", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes14.dex */
public interface b {

    /* compiled from: LocationListComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_list/di/b$a;", "", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        a a(@Y61.k d dVar);

        @h31.b
        @Y61.k
        a b(@Y61.k LocationListActivity locationListActivity);

        @Y61.k
        b build();

        @h31.b
        @Y61.k
        a c(@Y61.k C28478k c28478k);

        @Y61.k
        a d(@Y61.k c cVar);

        @h31.b
        @Y61.k
        a e(@Y61.k LocationListFragment locationListFragment);

        @h31.b
        @Y61.k
        a f(@Y61.k LocationListFragment locationListFragment);
    }

    void a(@Y61.k LocationListFragment locationListFragment);
}
