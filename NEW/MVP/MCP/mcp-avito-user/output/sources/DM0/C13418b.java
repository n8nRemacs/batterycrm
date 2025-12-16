package Dm0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ReplaceMainOnboardingShowEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDm0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_replace-main_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dm0.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13418b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f3436b = new ParametrizedClickStreamEvent(16982, 0, Collections.singletonMap("from_page", "b360_main"), null, 8, null);

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f3436b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f3436b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF11770c() {
        return this.f3436b.f90248c;
    }
}
