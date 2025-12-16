package MM;

import Y41.p;
import Y61.k;
import com.avito.android.important_addresses.domain.TransportType;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.transport.masstransit.Summary;
import com.yandex.mapkit.transport.masstransit.SummarySession;
import com.yandex.mapkit.transport.masstransit.Weight;
import com.yandex.runtime.Error;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: CalculateTravelTimeUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMM/b;", "Lcom/yandex/mapkit/transport/masstransit/SummarySession$SummaryListener;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements SummarySession.SummaryListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f10641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p<TransportType, String, G0> f10642b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TransportType f10643c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f10644d;

    /* JADX WARN: Multi-variable type inference failed */
    public b(c cVar, p<? super TransportType, ? super String, G0> pVar, TransportType transportType, String str) {
        this.f10641a = cVar;
        this.f10642b = pVar;
        this.f10643c = transportType;
        this.f10644d = str;
    }

    @Override // com.yandex.mapkit.transport.masstransit.SummarySession.SummaryListener
    public final void onMasstransitSummaries(@k List<Summary> list) {
        Weight weight;
        LocalizedValue time;
        Weight weight2;
        LocalizedValue time2;
        Summary summary = (Summary) C42745f0.G(list);
        Double dValueOf = (summary == null || (weight2 = summary.getWeight()) == null || (time2 = weight2.getTime()) == null) ? null : Double.valueOf(time2.getValue());
        Summary summary2 = (Summary) C42745f0.G(list);
        this.f10642b.invoke(this.f10643c, c.a(this.f10641a, dValueOf != null ? Long.valueOf((long) dValueOf.doubleValue()) : null, (summary2 == null || (weight = summary2.getWeight()) == null || (time = weight.getTime()) == null) ? null : time.getText()));
    }

    @Override // com.yandex.mapkit.transport.masstransit.SummarySession.SummaryListener
    public final void onMasstransitSummariesError(@k Error error) {
        this.f10641a.f10645a.b(this.f10644d, CrashHianalyticsData.TIME);
        this.f10642b.invoke(this.f10643c, null);
    }
}
