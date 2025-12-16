package w70;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.phone_reverification_info.events.PhoneReverificationButtonName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: PhoneReverificationButtonClickedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lw70/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_phone-reverification-info_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w70.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C49460a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f441297b;

    public C49460a(boolean z12, @k PhoneReverificationButtonName phoneReverificationButtonName) {
        this.f441297b = new ParametrizedClickStreamEvent(5114, 0, P0.g(new Q("is_rebinding_available", Boolean.valueOf(z12)), new Q("button_name", phoneReverificationButtonName.f216105b)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f441297b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f441297b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f441297b.f90248c;
    }
}
