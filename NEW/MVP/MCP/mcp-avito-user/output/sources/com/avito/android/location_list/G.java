package com.avito.android.location_list;

import android.os.Bundle;
import com.avito.android.remote.model.Location;
import com.avito.android.util.P2;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LocationListInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_list/G;", "", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface G {
    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.F a(@Y61.k Location location);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.F b(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.F c(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    io.reactivex.rxjava3.core.z<P2<List<Location>>> d(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.F e();

    @Y61.l
    List<Location> f(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.F g();

    @Y61.k
    Bundle getState();
}
