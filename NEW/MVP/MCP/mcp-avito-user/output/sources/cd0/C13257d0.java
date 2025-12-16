package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: ItemAddCloseEvent.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/d0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cd0.d0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13257d0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C50213a f2430b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f2431c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f2432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2433e;

    public C13257d0(@Y61.l String str, @Y61.l String str2, @Y61.k C50213a c50213a) {
        this.f2430b = c50213a;
        this.f2431c = str;
        this.f2432d = str2;
        this.f2433e = new ParametrizedClickStreamEvent(2608, 5, kotlin.collections.P0.k(c50213a.a(), C35755b0.c(kotlin.collections.P0.g(new kotlin.Q("item_add_screen", str), new kotlin.Q("select_target_audience", str2)))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f2433e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2433e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f2433e.f90248c;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemAddCloseEvent(eventId = 2608, sessionId=");
        sb2.append(this.f2430b.c());
        sb2.append(", screenId=");
        String str = this.f2431c;
        sb2.append(str != null ? new kotlin.Q("item_add_screen", str) : "");
        sb2.append(", selectTargetAudience=");
        String str2 = this.f2432d;
        sb2.append(str2 != null ? new kotlin.Q("select_target_audience", str2) : "");
        sb2.append(')');
        return sb2.toString();
    }
}
