package WM0;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: StatusListButtonClick.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LWM0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f17890b;

    public a(@k Map<String, String> map) {
        String str = map.get(MessageBody.SystemMessageBody.Platform.FLOW);
        Q q12 = new Q("s", str == null ? "" : str);
        String str2 = map.get("levels");
        Q q13 = new Q("verification_levels", str2 == null ? "" : str2);
        String str3 = map.get("actionType");
        this.f17890b = new ParametrizedClickStreamEvent(10503, 1, "vrf_status_list_button_click", P0.g(q12, q13, new Q("action_type", str3 != null ? str3 : "")));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f17890b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f17890b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f17890b.f90248c;
    }
}
