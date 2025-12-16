package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: ItemAddOtherCategoryClickEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/e0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cd0.e0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13259e0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2435b;

    public C13259e0(@Y61.k C50213a c50213a) {
        this.f2435b = new ParametrizedClickStreamEvent(3541, 3, Collections.singletonMap("esid", c50213a.c().f406620c), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f2435b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2435b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f2435b.f90248c;
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.w(new StringBuilder("ItemAddOtherCategoryClickEvent(eventId = 3541, params="), this.f2435b.f90249d, ')');
    }
}
