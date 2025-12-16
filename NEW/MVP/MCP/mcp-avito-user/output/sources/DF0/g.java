package DF0;

import DF0.c;
import Y61.k;
import android.content.Context;
import com.avito.android.travel_time_calculator.data.TransportType;
import com.squareup.anvil.annotations.ContributesBinding;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.RequestPoint;
import com.yandex.mapkit.RequestPointType;
import com.yandex.mapkit.directions.DirectionsFactory;
import com.yandex.mapkit.directions.driving.DrivingOptions;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.DrivingRouterType;
import com.yandex.mapkit.directions.driving.VehicleOptions;
import com.yandex.mapkit.directions.driving.VehicleType;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.transport.TransportFactory;
import com.yandex.mapkit.transport.masstransit.FilterVehicleTypes;
import com.yandex.mapkit.transport.masstransit.FitnessOptions;
import com.yandex.mapkit.transport.masstransit.MasstransitRouter;
import com.yandex.mapkit.transport.masstransit.PedestrianRouter;
import com.yandex.mapkit.transport.masstransit.RouteOptions;
import com.yandex.mapkit.transport.masstransit.TimeOptions;
import com.yandex.mapkit.transport.masstransit.TransitOptions;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: YandexTravelTimeCalculator.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDF0/g;", "LDF0/c;", "_avito_travel-time-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DrivingRouter f3122a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PedestrianRouter f3123b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final MasstransitRouter f3124c;

    @Inject
    public g(@k Context context) {
        MapKitFactory.initialize(context);
        this.f3122a = DirectionsFactory.getInstance().createDrivingRouter(DrivingRouterType.ONLINE);
        this.f3123b = TransportFactory.getInstance().createPedestrianRouter();
        this.f3124c = TransportFactory.getInstance().createMasstransitRouter();
    }

    @Override // DF0.c
    @k
    public final d a(@k b bVar, @k b bVar2, long j12, @k c.a aVar) {
        MapKitFactory.getInstance().onStart();
        kotlin.collections.builders.b bVarT = C42745f0.t();
        Point point = new Point(bVar.f3114a, bVar.f3115b);
        RequestPointType requestPointType = RequestPointType.WAYPOINT;
        bVarT.add(new RequestPoint(point, requestPointType, null, null));
        bVarT.add(new RequestPoint(new Point(bVar2.f3114a, bVar2.f3115b), requestPointType, null, null));
        kotlin.collections.builders.b bVarP = C42745f0.p(bVarT);
        DrivingOptions drivingOptions = new DrivingOptions();
        drivingOptions.setRoutesCount(1);
        drivingOptions.setDepartureTime(Long.valueOf(j12));
        VehicleOptions vehicleOptions = new VehicleOptions();
        vehicleOptions.setVehicleType(VehicleType.DEFAULT);
        return new d(this.f3122a.requestRoutesSummary(bVarP, drivingOptions, vehicleOptions, new e(aVar)), this.f3123b.requestRoutesSummary(bVarP, new TimeOptions(Long.valueOf(j12), null), new RouteOptions(new FitnessOptions(false)), new f(aVar, TransportType.f303310c)), this.f3124c.requestRoutesSummary(bVarP, new TransitOptions(FilterVehicleTypes.NONE.value, new TimeOptions(Long.valueOf(j12), null)), new RouteOptions(new FitnessOptions(false)), new f(aVar, TransportType.f303311d)));
    }

    @Override // DF0.c
    public final void onStop() {
        MapKitFactory.getInstance().onStop();
    }
}
