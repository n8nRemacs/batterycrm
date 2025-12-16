package Zr;

import androidx.compose.runtime.internal.P;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ClickStreamPopupViewEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZr/l;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_cpx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class l implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f20526b;

    public l(@Y61.k String str, boolean z12, long j12, @Y61.l String str2, int i12, int i13) {
        this.f20526b = new e(11950, 0, str, z12, i12, i13, C35755b0.c(P0.g(new Q("budget", Long.valueOf(j12)), new Q("period_type", str2))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f20526b.getF328428b();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f20526b.getParams();
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f20526b.getF328429c();
    }
}
