package MM;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import com.avito.android.R;
import com.yandex.mapkit.MapKitFactory;
import com.yandex.mapkit.directions.DirectionsFactory;
import com.yandex.mapkit.directions.driving.DrivingRouter;
import com.yandex.mapkit.directions.driving.DrivingRouterType;
import com.yandex.mapkit.transport.TransportFactory;
import com.yandex.mapkit.transport.masstransit.MasstransitRouter;
import com.yandex.mapkit.transport.masstransit.PedestrianRouter;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CalculateTravelTimeUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMM/c;", "", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final KM.a f10645a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DrivingRouter f10646b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PedestrianRouter f10647c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final MasstransitRouter f10648d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Resources f10649e;

    @Inject
    public c(@k KM.a aVar, @k Context context) {
        this.f10645a = aVar;
        MapKitFactory.initialize(context);
        this.f10646b = DirectionsFactory.getInstance().createDrivingRouter(DrivingRouterType.ONLINE);
        this.f10647c = TransportFactory.getInstance().createPedestrianRouter();
        this.f10648d = TransportFactory.getInstance().createMasstransitRouter();
        this.f10649e = context.getResources();
    }

    public static final String a(c cVar, Long l12, String str) throws Resources.NotFoundException {
        cVar.getClass();
        if (l12 == null || str == null) {
            return null;
        }
        long hours = TimeUnit.SECONDS.toHours(l12.longValue());
        if (hours > 24) {
            int i12 = (int) (hours / 24);
            str = cVar.f10649e.getQuantityString(R.plurals.normalize_travel_time, i12, Integer.valueOf(i12));
        }
        return str;
    }
}
