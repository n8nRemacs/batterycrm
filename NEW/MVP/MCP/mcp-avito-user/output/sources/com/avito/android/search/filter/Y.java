package com.avito.android.search.filter;

import com.avito.android.remote.model.DistrictsWithRegions;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.Metro;
import com.avito.android.remote.model.category_parameters.MetroParameter;
import com.avito.android.remote.model.metro_lines.MetroResponseBody;
import com.avito.android.remote.model.metro_lines.MetroStation;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: FiltersInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\n¢\u0006\u0002\b\u000b"}, d2 = {"<anonymous>", "Lcom/avito/android/search/filter/LocationInfo;", "topLocation", "Lcom/avito/android/remote/model/Location;", MetroParameter.TYPE, "Lcom/avito/android/remote/model/metro_lines/MetroResponseBody;", "districts", "Lcom/avito/android/remote/model/DistrictsWithRegions;", "directions", "", "Lcom/avito/android/remote/model/Direction;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class Y<T1, T2, T3, T4, R> implements l41.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f261914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f261915b;

    public Y(Location location, E e12) {
        this.f261914a = location;
        this.f261915b = e12;
    }

    @Override // l41.i
    public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        Location location = (Location) obj;
        MetroResponseBody metroResponseBody = (MetroResponseBody) obj2;
        DistrictsWithRegions districtsWithRegions = (DistrictsWithRegions) obj3;
        List list = (List) obj4;
        List<MetroStation> stations = metroResponseBody.getStations();
        ArrayList arrayList = new ArrayList(C42745f0.q(stations, 10));
        for (MetroStation metroStation : stations) {
            arrayList.add(new Metro(String.valueOf(metroStation.getId()), metroStation.getName(), null));
        }
        return new LocationInfo(this.f261914a, location, arrayList, metroResponseBody, districtsWithRegions, list, this.f261915b.f261772i != null);
    }
}
