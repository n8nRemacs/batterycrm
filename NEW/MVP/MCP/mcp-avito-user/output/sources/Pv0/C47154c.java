package pv0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: RealtyRepairPricesStatisticClickedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpv0/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_services-realty-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pv0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47154c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f428844b;

    public C47154c(@l String str) {
        this.f428844b = new ParametrizedClickStreamEvent(12309, 0, P0.j(new Q("x", str == null ? "" : str), new Q("action_type", "price_statistics"), new Q("from_page", "calculation_details")), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f428844b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428844b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f428844b.f90248c;
    }
}
