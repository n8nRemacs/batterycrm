package xX;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.loyalty_program.analytics.LoyaltyProgramFromPage;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import org.webrtc.h;

/* compiled from: LoyaltyEntryOnMainShown.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LxX/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_loyalty-program_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f442526b;

    public b(@l Integer num) {
        LoyaltyProgramFromPage[] loyaltyProgramFromPageArr = LoyaltyProgramFromPage.f184155b;
        HashMap mapG = h.g("from_page", "main");
        if (num != null) {
            mapG.put("bonus_amount", Integer.valueOf(num.intValue()));
        }
        G0 g02 = G0.f406611a;
        this.f442526b = new ParametrizedClickStreamEvent(16249, 1, mapG, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f442526b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f442526b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f442526b.f90248c;
    }
}
