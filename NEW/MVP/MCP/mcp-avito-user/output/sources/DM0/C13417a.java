package Dm0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42756l;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ReplaceMainOnboardingClickEvent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDm0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dm0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13417a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f3435b;

    public C13417a(@k String str, @k String str2, @l Boolean bool) {
        this.f3435b = new ParametrizedClickStreamEvent(16983, 1, P0.p(C42756l.B(new Q[]{new Q("from_page", str), new Q("target_page", str2), bool != null ? new Q("bool_param", bool) : null})), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f3435b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f3435b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f3435b.f90248c;
    }

    public /* synthetic */ C13417a(String str, String str2, Boolean bool, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : bool);
    }
}
