package ru.ok.android.externcalls.analytics.events;

import defpackage.imb;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u001d\b\u0016\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0002\u0010\bB\u001d\b\u0016\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u0002\u0010\u000bJ \u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0010J\"\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0011H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0012J\"\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0013H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0014J\"\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0015H\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u0016J!\u0010\u0017\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u001aJ\u0019\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 ¨\u0006!"}, d2 = {"Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "", "<init>", "()V", "", "", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", CallAnalyticsApiRequest.KEY_ITEMS, "(Ljava/util/Map;)V", "Limb;", "item", "(Limb;)V", "key", SdkMetricStatEvent.VALUE_KEY, "set", "(Ljava/lang/String;Lru/ok/android/externcalls/analytics/events/EventItemValue;)Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "(Ljava/lang/String;Ljava/lang/String;)Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "", "(Ljava/lang/String;Ljava/lang/Integer;)Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "", "(Ljava/lang/String;Ljava/lang/Long;)Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "", "(Ljava/lang/String;Ljava/lang/Float;)Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "addAll", "(Ljava/util/Map;)Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "map", "(Lru/ok/android/externcalls/analytics/events/EventItemsMap;)Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "getItems", "()Ljava/util/Map;", "toString", "()Ljava/lang/String;", "", "Ljava/util/Map;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EventItemsMap {
    private final Map<String, EventItemValue> items;

    public EventItemsMap() {
        this.items = new LinkedHashMap();
    }

    public final EventItemsMap addAll(Map<String, ? extends EventItemValue> items) {
        this.items.putAll(items);
        return this;
    }

    public final Map<String, EventItemValue> getItems() {
        return this.items;
    }

    public final EventItemsMap set(String key, EventItemValue value) {
        this.items.put(key, value);
        return this;
    }

    public String toString() {
        return "EventItemsMap(\"items\" = " + this.items + ")";
    }

    public final EventItemsMap addAll(EventItemsMap map) {
        addAll(map.getItems());
        return this;
    }

    public final EventItemsMap set(String key, String value) {
        if (value != null) {
            this.items.put(key, EventItemValue.StringValue.m90boximpl(EventItemValue.StringValue.m91constructorimpl(value)));
        }
        return this;
    }

    public EventItemsMap(Map<String, ? extends EventItemValue> map) {
        this();
        addAll(map);
    }

    public final EventItemsMap set(String key, Integer value) {
        if (value != null) {
            this.items.put(key, EventItemValue.IntValue.m69boximpl(EventItemValue.IntValue.m70constructorimpl(value.intValue())));
        }
        return this;
    }

    public final EventItemsMap set(String key, Long value) {
        if (value != null) {
            this.items.put(key, EventItemValue.LongValue.m76boximpl(EventItemValue.LongValue.m77constructorimpl(value.longValue())));
        }
        return this;
    }

    public EventItemsMap(imb imbVar) {
        this();
        set((String) imbVar.a, (EventItemValue) imbVar.b);
    }

    public final EventItemsMap set(String key, Float value) {
        if (value != null) {
            this.items.put(key, EventItemValue.FloatValue.m62boximpl(EventItemValue.FloatValue.m63constructorimpl(value.floatValue())));
        }
        return this;
    }
}
