package N90;

import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ComfortableDealClickedEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LN90/j;", "Lcom/avito/android/analytics/provider/clickstream/a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Map<String, Object> f11252b = Collections.singletonMap("pp_source", "profile");

    @Override // com.avito.android.analytics.provider.clickstream.a
    public final int getEventId() {
        return 10421;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f11252b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    public final int getVersion() {
        return 1;
    }
}
