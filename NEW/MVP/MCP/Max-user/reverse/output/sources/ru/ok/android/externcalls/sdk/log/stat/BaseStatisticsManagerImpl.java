package ru.ok.android.externcalls.sdk.log.stat;

import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.log.ItemToLogConverter;
import ru.ok.android.externcalls.sdk.log.LogItem;
import ru.ok.android.externcalls.sdk.log.stat.item.StatItem;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\f\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ok/android/externcalls/sdk/log/stat/BaseStatisticsManagerImpl;", "Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;", "S", "Lru/ok/android/externcalls/sdk/log/stat/StatisticsManager;", "Lru/ok/android/externcalls/sdk/log/ItemToLogConverter;", "itemToLogConverter", "<init>", "(Lru/ok/android/externcalls/sdk/log/ItemToLogConverter;)V", "", "timestamp", "getTime", "(J)J", "statItem", "Lqqg;", "sendStat", "(Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;)V", "Lru/ok/android/externcalls/sdk/log/LogItem;", "makeState", "(Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;)Lru/ok/android/externcalls/sdk/log/LogItem;", "Lru/ok/android/externcalls/sdk/log/LogItem$Builder;", "builder", "setStat", "(Lru/ok/android/externcalls/sdk/log/LogItem$Builder;Lru/ok/android/externcalls/sdk/log/stat/item/StatItem;)Lru/ok/android/externcalls/sdk/log/LogItem$Builder;", "", "", "custom", "setCustom", "(Lru/ok/android/externcalls/sdk/log/LogItem$Builder;Ljava/util/Map;)V", "Lru/ok/android/externcalls/sdk/log/ItemToLogConverter;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class BaseStatisticsManagerImpl<S extends StatItem> implements StatisticsManager<S> {
    private final ItemToLogConverter itemToLogConverter;

    public BaseStatisticsManagerImpl(ItemToLogConverter itemToLogConverter) {
        this.itemToLogConverter = itemToLogConverter;
    }

    public abstract long getTime(long timestamp);

    public LogItem makeState(S statItem) {
        return setStat(new LogItem.Builder(), statItem).build();
    }

    public void sendStat(S statItem) {
        this.itemToLogConverter.log(makeState(statItem));
    }

    public void setCustom(LogItem.Builder builder, Map<String, String> custom) {
        for (Map.Entry<String, String> entry : custom.entrySet()) {
            builder.setCustom(entry.getKey(), entry.getValue());
        }
    }

    public LogItem.Builder setStat(LogItem.Builder builder, S statItem) {
        setCustom(builder, statItem.getCustom());
        return builder.setCollector(statItem.getCollector()).setType(statItem.getType()).setOperation(statItem.getOperation()).setTime(getTime(statItem.getTimestamp()));
    }
}
