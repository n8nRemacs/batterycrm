package g80;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import yc.C50213a;

/* compiled from: ImageActionClickedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg80/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_photo-list-view-groups_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: g80.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C40546a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f396337b;

    public C40546a(@Y61.k String str, @Y61.k String str2, @Y61.k C50213a c50213a) {
        this.f396337b = new ParametrizedClickStreamEvent(11579, 2, P0.k(c50213a.a(), P0.g(new Q("imgid", str), new Q("target_page", str2))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f396337b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f396337b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f396337b.f90248c;
    }
}
