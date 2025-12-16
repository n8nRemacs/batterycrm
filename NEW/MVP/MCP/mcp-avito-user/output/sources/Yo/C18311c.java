package Yo;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: BannerRecallClickStreamEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYo/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yo.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18311c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f19667b;

    public C18311c(@Y61.l String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5) {
        this.f19667b = C35755b0.c(P0.g(new Q("item_id", str), new Q("pagetype", str3), new Q("placement", str4), new Q("re_banner_name", str5), new Q("re_banner_other_params", str2), new Q("action_type", "target_click")));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF97978b() {
        return 8880;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f19667b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF97979c() {
        return 3;
    }
}
