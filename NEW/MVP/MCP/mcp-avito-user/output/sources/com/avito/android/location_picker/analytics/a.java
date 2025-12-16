package com.avito.android.location_picker.analytics;

import Y61.k;
import com.avito.android.location_picker.entities.LocationPickerState;
import kotlin.Metadata;

/* compiled from: LocationPickerAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/analytics/a;", "", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface a {
    void a(@k LocationPickerState locationPickerState);

    void b(@k LocationPickerState locationPickerState, @k ScreenCloseFromBlock screenCloseFromBlock);
}
