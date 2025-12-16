package com.avito.android.developments_agency_search.screen.location_group.di;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.developments_agency_search.screen.location_group.LocationGroupArguments;
import com.avito.android.developments_agency_search.screen.location_group.LocationGroupDialogFragment;
import com.avito.android.di.B;
import h31.d;
import kotlin.Metadata;

/* compiled from: LocationGroupDialogComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/di/b;", "", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: LocationGroupDialogComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/location_group/di/b$a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        b a(@h31.b @k LocationGroupArguments locationGroupArguments, @k c cVar, @h31.b @k C28478k c28478k, @h31.b @k Resources resources);
    }

    void a(@k LocationGroupDialogFragment locationGroupDialogFragment);
}
