package mr0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: CarouselWidgetShownEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmr0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mr0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44125b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f414781b;

    public C44125b(@k String str, @k String str2, @k String str3, @l String str4, @l String str5, @l Long l12, @l String str6, @l Integer num) {
        this.f414781b = new ParametrizedClickStreamEvent(9493, 4, C35755b0.c(P0.g(new Q("u", str), new Q("from_page", str2), new Q("cid", str5), new Q("target_page", str3), new Q("cross_category", str4), new Q("business_platform", 3), new Q("mcid", l12), new Q("cwid_str", str6), new Q("position", num))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f414781b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f414781b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f414781b.f90248c;
    }
}
