package Gm0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ReplaceMainToggleClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGm0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Gm0.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13897a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f6723b;

    public C13897a(boolean z12) {
        this.f6723b = new ParametrizedClickStreamEvent(16983, 1, P0.g(new Q("from_page", "b360_profile"), new Q("bool_param", Boolean.valueOf(z12))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f6723b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f6723b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f6723b.f90248c;
    }
}
