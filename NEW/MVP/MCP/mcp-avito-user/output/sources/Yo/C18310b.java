package Yo;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: BannerCloseClickStreamEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYo/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yo.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C18310b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f19666b;

    public C18310b(@Y61.k String str, @Y61.l String str2) {
        this.f19666b = C35755b0.c(P0.g(new Q("item_id", null), new Q("pagetype", "favorites"), new Q("placement", "middle"), new Q("re_banner_name", str2), new Q("re_banner_other_params", str), new Q("action_type", "banner_close")));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF97978b() {
        return 8880;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f19666b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF97979c() {
        return 3;
    }
}
