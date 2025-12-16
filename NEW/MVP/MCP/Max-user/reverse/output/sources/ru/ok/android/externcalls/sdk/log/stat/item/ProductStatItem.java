package ru.ok.android.externcalls.sdk.log.stat.item;

import defpackage.hd5;
import defpackage.id5;
import defpackage.tk4;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.sdk.log.stat.item.StatItem;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001#B{\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\f\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0014\u0010\t\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0016\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0014¨\u0006$"}, d2 = {"Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem;", "Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;", CallAnalyticsApiRequest.KEY_COLLECTOR, "", "type", "", "operation", "timestamp", "", "time", "custom", "", "count", "uid", "network", "groups", "", "data", "(Ljava/lang/String;ILjava/lang/String;JJLjava/util/Map;ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getCollector", "()Ljava/lang/String;", "getCount", "()I", "getCustom", "()Ljava/util/Map;", "getData", "()Ljava/util/List;", "getGroups", "getNetwork", "getOperation", "getTime", "()J", "getTimestamp", "getType", "getUid", "Builder", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductStatItem implements StatItem {
    private final String collector;
    private final int count;
    private final Map<String, String> custom;
    private final List<String> data;
    private final List<String> groups;
    private final String network;
    private final String operation;
    private final long time;
    private final long timestamp;
    private final int type;
    private final String uid;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0011J!\u0010\u0016\u001a\u00020\u00002\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u000bJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010!R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010#R\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0016\u0010\u0012\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010#R\u0016\u0010\u0018\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(¨\u0006+"}, d2 = {"Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem$Builder;", "Lru/ok/android/externcalls/sdk/log/stat/item/StatItem$Builder;", "<init>", "()V", "", CallAnalyticsApiRequest.KEY_COLLECTOR, "setCollector", "(Ljava/lang/String;)Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem$Builder;", "", "type", "setType", "(I)Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem$Builder;", "operation", "setOperation", "", "timestamp", "setTimestamp", "(J)Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem$Builder;", "time", "setTime", "", "custom", "setCustom", "(Ljava/util/Map;)Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem$Builder;", "count", "setCount", "uid", "Lqqg;", "setUid", "(Ljava/lang/String;)V", "Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem;", "build", "()Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem;", "Ljava/lang/String;", "I", "J", "Ljava/util/Map;", "network", "", "groups", "Ljava/util/List;", "data", "Companion", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Builder implements StatItem.Builder {
        public static final String DEFAULT_COLLECTOR = "app.vchat.events.product";
        public static final int DEFAULT_TYPE = 1;
        public static final String EMPTY_OPERATION = "";
        public static final long EMPTY_TIMESTAMP = -1;
        private List<String> data;
        private List<String> groups;
        private String network;
        private long time;
        private String uid;
        private String collector = DEFAULT_COLLECTOR;
        private int type = 1;
        private String operation = "";
        private long timestamp = -1;
        private Map<String, String> custom = id5.a;
        private int count = 1;

        public Builder() {
            hd5 hd5Var = hd5.a;
            this.groups = hd5Var;
            this.data = hd5Var;
        }

        public final Builder setCollector(String collector) {
            this.collector = collector;
            return this;
        }

        public final Builder setCount(int count) {
            this.count = count;
            return this;
        }

        public final Builder setCustom(Map<String, String> custom) {
            this.custom = custom;
            return this;
        }

        public final Builder setOperation(String operation) {
            this.operation = operation;
            return this;
        }

        public final Builder setTime(long time) {
            this.time = time;
            return this;
        }

        public final Builder setTimestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public final Builder setType(int type) {
            this.type = type;
            return this;
        }

        public final void setUid(String uid) {
            this.uid = uid;
        }

        @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem.Builder
        public ProductStatItem build() {
            String str = this.collector;
            int i = this.type;
            String str2 = this.operation;
            long jCurrentTimeMillis = this.timestamp;
            if (jCurrentTimeMillis == -1) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return new ProductStatItem(str, i, str2, jCurrentTimeMillis, this.time, this.custom, this.count, this.uid, this.network, this.groups, this.data, null);
        }
    }

    public /* synthetic */ ProductStatItem(String str, int i, String str2, long j, long j2, Map map, int i2, String str3, String str4, List list, List list2, tk4 tk4Var) {
        this(str, i, str2, j, j2, map, i2, str3, str4, list, list2);
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public String getCollector() {
        return this.collector;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public int getCount() {
        return this.count;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public Map<String, String> getCustom() {
        return this.custom;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public List<String> getData() {
        return this.data;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public List<String> getGroups() {
        return this.groups;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public String getNetwork() {
        return this.network;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public String getOperation() {
        return this.operation;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public long getTime() {
        return this.time;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public int getType() {
        return this.type;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.item.StatItem
    public String getUid() {
        return this.uid;
    }

    private ProductStatItem(String str, int i, String str2, long j, long j2, Map<String, String> map, int i2, String str3, String str4, List<String> list, List<String> list2) {
        this.collector = str;
        this.type = i;
        this.operation = str2;
        this.timestamp = j;
        this.time = j2;
        this.custom = map;
        this.count = i2;
        this.uid = str3;
        this.network = str4;
        this.groups = list;
        this.data = list2;
    }
}
