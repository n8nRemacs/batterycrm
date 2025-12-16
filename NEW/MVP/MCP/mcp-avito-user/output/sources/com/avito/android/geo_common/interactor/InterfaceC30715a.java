package com.avito.android.geo_common.interactor;

import com.avito.android.remote.model.DistrictsWithRegions;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Metro;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LocationDirectionsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/geo_common/interactor/a;", "", "_avito_geo-common_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.geo_common.interactor.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30715a {
    @Y61.k
    io.reactivex.rxjava3.core.z<DistrictsWithRegions> a(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.z<Location> b(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.z<List<Metro>> h(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.C i(@Y61.k String str);
}
