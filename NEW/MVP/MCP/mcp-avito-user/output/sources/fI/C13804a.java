package Fi;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinOnboardingShowEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFi/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_beduin-v2-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fi.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13804a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f5955b;

    public C13804a(@l String str, @l String str2) {
        HashMap map = new HashMap();
        if (str != null) {
            map.put("onboarding_bottom_id", str);
        }
        if (str2 != null) {
            map.put("encoded", str2);
        }
        G0 g02 = G0.f406611a;
        this.f5955b = new ParametrizedClickStreamEvent(10250, 0, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f5955b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f5955b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f5955b.f90248c;
    }
}
