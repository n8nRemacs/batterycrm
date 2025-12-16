package ru.ok.android.externcalls.sdk.log;

import defpackage.hcf;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.sdk.log.stat.item.ProductStatItem;
import ru.ok.android.onelog.OneLogItem;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/sdk/log/LogItem;", "", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface LogItem {

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010#\u001a\u00020 H\u0000¢\u0006\u0004\b!\u0010\"J\r\u0010$\u001a\u00020\u0001¢\u0006\u0004\b$\u0010%R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010)R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010*R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010+R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010)¨\u0006,"}, d2 = {"Lru/ok/android/externcalls/sdk/log/LogItem$Builder;", "Lru/ok/android/externcalls/sdk/log/LogItem;", "<init>", "()V", "", "key", SdkMetricStatEvent.VALUE_KEY, "setCustom", "(Ljava/lang/String;Ljava/lang/String;)Lru/ok/android/externcalls/sdk/log/LogItem$Builder;", CallAnalyticsApiRequest.KEY_COLLECTOR, "setCollector", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/log/LogItem$Builder;", "", "type", "setType", "(I)Lru/ok/android/externcalls/sdk/log/LogItem$Builder;", "count", "setCount", "", "time", "setTime", "(J)Lru/ok/android/externcalls/sdk/log/LogItem$Builder;", "uid", "setUid", "Lhcf;", "operation", "setOperation", "(Lhcf;)Lru/ok/android/externcalls/sdk/log/LogItem$Builder;", "Lru/ok/android/onelog/OneLogItem;", "toOneLogItem$calls_sdk_release", "()Lru/ok/android/onelog/OneLogItem;", "toOneLogItem", "Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem;", "toProductStatItem$calls_sdk_release", "()Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem;", "toProductStatItem", "build", "()Lru/ok/android/externcalls/sdk/log/LogItem;", "", "custom", "Ljava/util/Map;", "Ljava/lang/String;", "Ljava/lang/Integer;", "Ljava/lang/Long;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder implements LogItem {
        private String collector;
        private Integer count;
        private final Map<String, String> custom = new LinkedHashMap();
        private String operation;
        private Long time;
        private Integer type;
        private String uid;

        public final LogItem build() {
            return this;
        }

        public final Builder setCollector(String collector) {
            this.collector = collector;
            return this;
        }

        public final Builder setCount(int count) {
            this.count = Integer.valueOf(count);
            return this;
        }

        public final Builder setCustom(String key, String value) {
            if (key != null && value != null) {
                this.custom.put(key, value);
            }
            return this;
        }

        public final Builder setOperation(hcf operation) {
            this.operation = operation != null ? operation.a : null;
            return this;
        }

        public final Builder setTime(long time) {
            this.time = Long.valueOf(time);
            return this;
        }

        public final Builder setType(int type) {
            this.type = Integer.valueOf(type);
            return this;
        }

        public final Builder setUid(String uid) {
            this.uid = uid;
            return this;
        }

        public final OneLogItem toOneLogItem$calls_sdk_release() {
            OneLogItem.Builder builder = OneLogItem.builder();
            String str = this.collector;
            if (str != null) {
                builder.setCollector(str);
            }
            String str2 = this.operation;
            if (str2 != null) {
                builder.setOperation(str2);
            }
            String str3 = this.uid;
            if (str3 != null) {
                builder.setUid(str3);
            }
            Integer num = this.count;
            if (num != null) {
                builder.setCount(num.intValue());
            }
            Integer num2 = this.type;
            if (num2 != null) {
                builder.setType(num2.intValue());
            }
            Long l = this.time;
            if (l != null) {
                builder.setTime(l.longValue());
            }
            for (Map.Entry<String, String> entry : this.custom.entrySet()) {
                builder.setCustom(entry.getKey(), entry.getValue());
            }
            return builder.build();
        }

        public final ProductStatItem toProductStatItem$calls_sdk_release() {
            ProductStatItem.Builder builder = new ProductStatItem.Builder();
            String str = this.collector;
            if (str != null) {
                builder.setCollector(str);
            }
            String str2 = this.operation;
            if (str2 != null) {
                builder.setOperation(str2);
            }
            String str3 = this.uid;
            if (str3 != null) {
                builder.setUid(str3);
            }
            Integer num = this.count;
            if (num != null) {
                builder.setCount(num.intValue());
            }
            Integer num2 = this.type;
            if (num2 != null) {
                builder.setType(num2.intValue());
            }
            Long l = this.time;
            if (l != null) {
                builder.setTime(l.longValue());
            }
            builder.setCustom(this.custom);
            return builder.build();
        }

        public final Builder setOperation(String operation) {
            this.operation = operation;
            return this;
        }
    }
}
