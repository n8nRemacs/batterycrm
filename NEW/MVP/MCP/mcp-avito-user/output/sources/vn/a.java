package VN;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.builders.d;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsWebViewErrorEvent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVN/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f17102b;

    public a(int i12, @l String str, @k String str2, @l String str3, @l String str4, @k Map<String, ? extends Object> map) {
        d dVar = new d();
        dVar.put("err", Integer.valueOf(i12));
        dVar.put("ua", str2);
        if (str4 != null) {
            dVar.put("form_url", str4);
        }
        dVar.putAll(map);
        if (str3 != null) {
            dVar.put(ContextActionHandler.Link.URL, str3);
        }
        if (str != null) {
            dVar.put("errors_detailed", str);
        }
        G0 g02 = G0.f406611a;
        this.f17102b = new ParametrizedClickStreamEvent(7620, 1, dVar.b(), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f17102b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f17102b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f17102b.f90248c;
    }
}
