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

/* compiled from: PriceListEditValueEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGd0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Gd0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13868b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f6620b;

    public C13868b(@k C50213a c50213a, @l String str, @l String str2, @l String str3, @l String str4, @l String str5) {
        this.f6620b = new ParametrizedClickStreamEvent(13539, 1, C35755b0.c(P0.l(com.avito.android.authorization.auto_recovery.phone_confirm.b.l("price_label", str4, com.avito.android.authorization.auto_recovery.phone_confirm.b.l("form_input_field_value", str, com.avito.android.authorization.auto_recovery.phone_confirm.b.l("mcid", str3, P0.l(c50213a.a(), new Q("cid", str2))))), new Q("services_name", str5))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f6620b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f6620b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f6620b.f90248c;
    }
}
