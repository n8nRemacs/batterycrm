package ru.ok.android.externcalls.analytics.events;

import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u001e\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "", "()V", "apiMethodName", "", "getApiMethodName", "()Ljava/lang/String;", CallAnalyticsApiRequest.KEY_COLLECTOR, "getCollector", CallAnalyticsApiRequest.KEY_ITEMS, "", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "getItems", "()Ljava/util/Map;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class CallAnalyticsEvent {
    private final String collector;

    public abstract String getApiMethodName();

    public String getCollector() {
        return this.collector;
    }

    public abstract Map<String, EventItemValue> getItems();
}
