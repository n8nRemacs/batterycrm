package DF0;

import DF0.c;
import Y61.k;
import com.avito.android.travel_time_calculator.data.TransportType;
import com.yandex.mapkit.transport.masstransit.Summary;
import com.yandex.mapkit.transport.masstransit.SummarySession;
import com.yandex.runtime.Error;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: YandexTravelTimeCalculator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDF0/f;", "Lcom/yandex/mapkit/transport/masstransit/SummarySession$SummaryListener;", "_avito_travel-time-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements SummarySession.SummaryListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c.a f3120a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TransportType f3121b;

    public f(c.a aVar, TransportType transportType) {
        this.f3120a = aVar;
        this.f3121b = transportType;
    }

    @Override // com.yandex.mapkit.transport.masstransit.SummarySession.SummaryListener
    public final void onMasstransitSummaries(@k List<Summary> list) {
        Summary summary = (Summary) C42745f0.G(list);
        TransportType transportType = this.f3121b;
        c.a aVar = this.f3120a;
        if (summary == null) {
            aVar.b(transportType, true);
        } else {
            aVar.a(transportType, (long) summary.getWeight().getTime().getValue());
        }
    }

    @Override // com.yandex.mapkit.transport.masstransit.SummarySession.SummaryListener
    public final void onMasstransitSummariesError(@k Error error) {
        this.f3120a.b(this.f3121b, false);
    }
}
