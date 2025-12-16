package Sx;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: AcceptFeedbackClickEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LSx/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Sx.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C15248a implements com.avito.android.analytics.provider.clickstream.a, cc.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f15195b;

    public C15248a(int i12, @k String str) {
        this.f15195b = new ParametrizedClickStreamEvent(9996, 0, P0.g(new Q("early_access_popup_screen_id", Integer.valueOf(i12)), new Q("early_access_popup_txt", str)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF97978b() {
        return this.f15195b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f15195b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF97979c() {
        return this.f15195b.f90248c;
    }
}
