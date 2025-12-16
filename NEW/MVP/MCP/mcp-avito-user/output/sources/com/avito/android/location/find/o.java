package com.avito.android.location.find;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import kotlin.Metadata;

/* compiled from: FindLocationPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/find/o;", "", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface o {

    /* compiled from: FindLocationPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    void a(@Y61.k Context context);

    @Y61.k
    io.reactivex.rxjava3.core.z<Location> b(@Y61.k Activity activity, boolean z12, boolean z13);

    void c(@Y61.k Context context);
}
