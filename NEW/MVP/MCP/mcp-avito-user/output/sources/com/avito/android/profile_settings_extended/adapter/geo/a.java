package com.avito.android.profile_settings_extended.adapter.geo;

import com.avito.android.edit_address.entity.AddressDaysArray;
import com.avito.android.edit_address.entity.TimeInterval;
import com.avito.android.remote.model.extended.GeoWidget;
import kotlin.Metadata;

/* compiled from: ExtendedSettingsGeoConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/geo/a;", "", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface a {
    @Y61.k
    String a(@Y61.l TimeInterval timeInterval);

    @Y61.k
    String b(@Y61.k AddressDaysArray addressDaysArray);

    @Y61.k
    com.avito.android.profile_settings_extended.entity.i c(@Y61.k GeoWidget geoWidget, boolean z12);
}
