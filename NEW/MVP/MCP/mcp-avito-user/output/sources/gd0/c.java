package Gd0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import yc.C50213a;

/* compiled from: PriceListErrorEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGd0/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f6621b;

    public c(@k C50213a c50213a, @l String str, @l String str2, @l String str3, @l String str4, @l String str5) {
        this.f6621b = new ParametrizedClickStreamEvent(13540, 2, C35755b0.c(P0.l(com.avito.android.authorization.auto_recovery.phone_confirm.b.l("error_message", str4, com.avito.android.authorization.auto_recovery.phone_confirm.b.l("services_name", str3, com.avito.android.authorization.auto_recovery.phone_confirm.b.l("mcid", str2, P0.l(c50213a.a(), new Q("cid", str))))), new Q("validated_attribute_id", str5))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f6621b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f6621b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f6621b.f90248c;
    }
}
