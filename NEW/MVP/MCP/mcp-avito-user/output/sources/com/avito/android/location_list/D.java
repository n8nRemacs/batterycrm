package com.avito.android.location_list;

import android.app.Application;
import android.content.Intent;
import com.avito.android.remote.model.Location;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LocationListIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_list/D;", "Lcom/avito/android/location_list/C;", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class D implements C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f181863a;

    @Inject
    public D(@Y61.k Application application) {
        this.f181863a = application;
    }

    @Override // com.avito.android.location_list.C
    @Y61.k
    public final Intent a(@Y61.l Location location) {
        return new Intent(this.f181863a, (Class<?>) LocationListActivity.class).putExtra("location", location).putExtra("show_whole_locations", false).putExtra("has_search_area", false).putExtra("extra_category_id", (String) null).putExtra("track_location_events", false);
    }
}
