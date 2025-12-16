package iI0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AutoSelectCloseDialogActionClickedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LiI0/h;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iI0.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C41303h implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f398484b;

    public C41303h(@Y61.k String str) {
        this.f398484b = new ParametrizedClickStreamEvent(7425, 1, Collections.singletonMap(ContextActionHandler.Link.URL, str), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83096b() {
        return this.f398484b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f398484b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83097c() {
        return this.f398484b.f90248c;
    }
}
