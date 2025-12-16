package com.avito.android.location.find;

import android.app.Activity;
import android.location.Location;
import kotlin.Metadata;

/* compiled from: LocationProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/find/z;", "", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface z {

    /* compiled from: LocationProvider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    boolean b();

    void d(@Y61.k Activity activity);

    @Y61.k
    io.reactivex.rxjava3.core.z<Location> e(boolean z12);
}
