package ru.ok.android.externcalls.sdk.log.stat.item;

import defpackage.em6;
import defpackage.tk4;
import defpackage.u08;
import defpackage.ue3;
import defpackage.wy1;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0006H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/log/stat/item/ProductAnalyticsEvent;", "Lru/ok/android/externcalls/analytics/events/CallAnalyticsEvent;", "item", "Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem;", "(Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem;)V", "apiMethodName", "", "getApiMethodName", "()Ljava/lang/String;", CallAnalyticsApiRequest.KEY_COLLECTOR, "getCollector", CallAnalyticsApiRequest.KEY_ITEMS, "", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "getItems", "()Ljava/util/Map;", "toString", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductAnalyticsEvent extends CallAnalyticsEvent {
    private static final String API_METHOD_NAME = "log.externalLog";

    @Deprecated
    public static final String COUNT = "count";

    @Deprecated
    public static final String CUSTOM = "custom";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String DATA = "data";

    @Deprecated
    public static final String GROUPS = "groups";

    @Deprecated
    public static final String NETWORK = "network";

    @Deprecated
    public static final String OPERATION = "operation";

    @Deprecated
    public static final String TIME = "time";

    @Deprecated
    public static final String TIMESTAMP = "timestamp";

    @Deprecated
    public static final String TYPE = "type";

    @Deprecated
    public static final String UID = "uid";
    private final String collector;
    private final ProductStatItem item;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/log/stat/item/ProductAnalyticsEvent$Companion;", "", "()V", "API_METHOD_NAME", "", AdwHomeBadger.COUNT, "CUSTOM", "DATA", "GROUPS", "NETWORK", "OPERATION", "TIME", "TIMESTAMP", "TYPE", "UID", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(tk4 tk4Var) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "", "", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.sdk.log.stat.item.ProductAnalyticsEvent$toString$1, reason: invalid class name */
    public static final class AnonymousClass1 extends u08 implements em6 {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.em6
        public final CharSequence invoke(Map.Entry<String, ? extends EventItemValue> entry) {
            String key = entry.getKey();
            return ((Object) key) + "=" + entry.getValue();
        }
    }

    public ProductAnalyticsEvent(ProductStatItem productStatItem) {
        this.item = productStatItem;
        this.collector = productStatItem.getCollector();
    }

    @Override // ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent
    public String getApiMethodName() {
        return API_METHOD_NAME;
    }

    @Override // ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent
    public String getCollector() {
        return this.collector;
    }

    @Override // ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent
    public Map<String, EventItemValue> getItems() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("timestamp", EventItemValueKt.toEventItemValue(this.item.getTimestamp()));
        linkedHashMap.put("type", EventItemValueKt.toEventItemValue(this.item.getType()));
        linkedHashMap.put("operation", EventItemValueKt.toEventItemValue(this.item.getOperation()));
        linkedHashMap.put("time", EventItemValueKt.toEventItemValue(this.item.getTime()));
        String uid = this.item.getUid();
        if (uid != null) {
        }
        String network = this.item.getNetwork();
        if (network != null) {
        }
        linkedHashMap.put("count", EventItemValueKt.toEventItemValue(this.item.getCount()));
        if (!this.item.getGroups().isEmpty()) {
            linkedHashMap.put("groups", EventItemValueKt.toEventItemValue(this.item.getGroups()));
        }
        if (!this.item.getData().isEmpty()) {
            linkedHashMap.put("data", EventItemValueKt.toEventItemValue(this.item.getData()));
        }
        if (!this.item.getCustom().isEmpty()) {
            linkedHashMap.put("custom", EventItemValueKt.toEventItemValue(this.item.getCustom()));
        }
        return linkedHashMap;
    }

    public String toString() throws IOException {
        String apiMethodName = getApiMethodName();
        String collector = getCollector();
        String strN = ue3.N(getItems().entrySet(), ", ", null, null, AnonymousClass1.INSTANCE, 30);
        StringBuilder sbL = wy1.l("ProductAnalyticsEvent apiMethod=", apiMethodName, ", collector=", collector, " ");
        sbL.append(strN);
        return sbL.toString();
    }
}
