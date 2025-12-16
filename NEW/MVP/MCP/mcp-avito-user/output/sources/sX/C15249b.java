package Sx;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CloseFeedbackScreenEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LSx/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sx.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C15249b implements com.avito.android.analytics.provider.clickstream.a, cc.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f15196b;

    public C15249b(int i12) {
        this.f15196b = new ParametrizedClickStreamEvent(9995, 0, Collections.singletonMap("early_access_popup_screen_id", Integer.valueOf(i12)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83096b() {
        return this.f15196b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f15196b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83097c() {
        return this.f15196b.f90248c;
    }
}
