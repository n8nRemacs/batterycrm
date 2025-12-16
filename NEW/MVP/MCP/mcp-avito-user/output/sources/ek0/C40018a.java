package eK0;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.user_viewed.domain.model.UserViewedAdvert;
import com.avito.android.user_viewed.domain.model.UserViewedData;
import com.avito.android.util.C35755b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: UserViewedItemsShowEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeK0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_user-viewed_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eK0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C40018a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f395113b;

    public C40018a(@k UserViewedData userViewedData) {
        List<UserViewedAdvert> list = userViewedData.f318385b;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Long lZ02 = C43066x.z0(((UserViewedAdvert) it.next()).f318368b);
            if (lZ02 != null) {
                arrayList.add(lZ02);
            }
        }
        this.f395113b = new ParametrizedClickStreamEvent(16242, 1, C35755b0.c(P0.g(new Q("iids", arrayList), new Q("x", userViewedData.f318386c))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f395113b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f395113b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f395113b.f90248c;
    }
}
