package o8;

import com.avito.android.analytics.C28461l;
import com.avito.android.analytics.InterfaceC28457i;
import com.avito.android.analytics.InterfaceC28459j;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: NewBuyerRealtyEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo8/m;", "Lcom/avito/android/analytics/j;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f419435b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28459j f419436c;

    public m(@Y61.l Double d12, @Y61.l Map<String, String> map) {
        this.f419435b = map;
        Qc.g gVarA = com.avito.android.analytics_adjust.t.a(n.f419437a);
        gVarA.j(map);
        gVarA.i(d12);
        this.f419436c = C28461l.a(gVarA);
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @Y61.k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f419436c.getEvents();
    }
}
