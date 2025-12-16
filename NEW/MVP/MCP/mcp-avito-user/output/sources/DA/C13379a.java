package Da;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: AdvertDetailsServicesDiscountAndBuyerGiftClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDa/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-details-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Da.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C13379a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f3241b;

    public C13379a(long j12, long j13, @k String str) {
        this.f3241b = new ParametrizedClickStreamEvent(12634, 0, "карточка айтема / клик на информацию о скидке", P0.g(new Q("uid", Long.valueOf(j13)), new Q("string_param", str), new Q("item_id", Long.valueOf(j12))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f3241b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f3241b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f3241b.f90248c;
    }
}
