package com.avito.android.analytics.provider.clickstream;

import Y61.k;
import com.avito.android.analytics.B;
import com.avito.android.analytics.InterfaceC28457i;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ClickStreamEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/provider/clickstream/a;", "Lcom/avito/android/analytics/i;", "Lcom/avito/android/analytics/B;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a extends InterfaceC28457i, B {

    /* compiled from: ClickStreamEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.provider.clickstream.a$a, reason: collision with other inner class name */
    public static final class C2675a {
    }

    /* renamed from: getEventId */
    int getF90267d();

    @k
    Map<String, Object> getParams();

    /* renamed from: getVersion */
    int getF90268e();
}
