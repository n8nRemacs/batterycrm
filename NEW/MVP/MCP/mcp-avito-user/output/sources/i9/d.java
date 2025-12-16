package i9;

import com.avito.android.analytics.C28461l;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import com.avito.android.analytics_adjust.t;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: AdvertViewedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li9/d;", "Lcom/avito/android/analytics/j;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f398372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28459j f398373c;

    public d(@Y61.l Map map) {
        this.f398372b = map;
        Qc.g gVarA = t.a(e.f398374a);
        gVarA.j(map);
        this.f398373c = C28461l.a(gVarA);
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @Y61.k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f398373c.getEvents();
    }
}
