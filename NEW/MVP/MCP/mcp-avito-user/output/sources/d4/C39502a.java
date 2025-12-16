package d4;

import Y61.k;
import androidx.compose.runtime.internal.P;
import cc.e;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: AdditionalSellerButtonItemShownEvent.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Ld4/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d4.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C39502a implements com.avito.android.analytics.provider.clickstream.a, e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f393657b;

    public C39502a(int i12, int i13, @k String str, @k String str2) {
        this.f393657b = new ParametrizedClickStreamEvent(8189, 9, P0.g(new Q("iid", str2), new Q("uid", str), new Q("catalog_id", Integer.valueOf(i13)), new Q("card_model_id", Integer.valueOf(i12))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f393657b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f393657b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f393657b.f90248c;
    }
}
