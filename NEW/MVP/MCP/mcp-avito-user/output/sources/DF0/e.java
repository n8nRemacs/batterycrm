package DF0;

import DF0.c;
import Y61.k;
import com.avito.android.travel_time_calculator.data.TransportType;
import com.yandex.mapkit.directions.driving.DrivingSummarySession;
import com.yandex.mapkit.directions.driving.Summary;
import com.yandex.runtime.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: YandexTravelTimeCalculator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDF0/e;", "Lcom/yandex/mapkit/directions/driving/DrivingSummarySession$DrivingSummaryListener;", "_avito_travel-time-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e implements DrivingSummarySession.DrivingSummaryListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.a f3119a;

    public e(c.a aVar) {
        this.f3119a = aVar;
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSummarySession.DrivingSummaryListener
    public final void onDrivingSummaries(@k List<Summary> list) {
        Summary summary = (Summary) C42745f0.G(list);
        c.a aVar = this.f3119a;
        if (summary == null) {
            aVar.b(TransportType.f303309b, true);
        } else {
            aVar.a(TransportType.f303309b, (long) summary.getWeight().getTime().getValue());
        }
    }

    @Override // com.yandex.mapkit.directions.driving.DrivingSummarySession.DrivingSummaryListener
    public final void onDrivingSummariesError(@k Error error) {
        this.f3119a.b(TransportType.f303309b, false);
    }
}
