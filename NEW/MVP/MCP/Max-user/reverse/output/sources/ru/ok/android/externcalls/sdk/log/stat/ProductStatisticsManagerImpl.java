package ru.ok.android.externcalls.sdk.log.stat;

import defpackage.y8g;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.log.ItemToLogConverter;
import ru.ok.android.externcalls.sdk.log.stat.item.ProductStatItem;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/log/stat/ProductStatisticsManagerImpl;", "Lru/ok/android/externcalls/sdk/log/stat/BaseStatisticsManagerImpl;", "Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem;", "Ly8g;", "timeProvider", "Lru/ok/android/externcalls/sdk/log/ItemToLogConverter;", "logConverter", "<init>", "(Ly8g;Lru/ok/android/externcalls/sdk/log/ItemToLogConverter;)V", "", "timestamp", "getTime", "(J)J", "statItem", "Lqqg;", "log", "(Lru/ok/android/externcalls/sdk/log/stat/item/ProductStatItem;)V", "Ly8g;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProductStatisticsManagerImpl extends BaseStatisticsManagerImpl<ProductStatItem> {
    private final y8g timeProvider;

    public ProductStatisticsManagerImpl(y8g y8gVar, ItemToLogConverter itemToLogConverter) {
        super(itemToLogConverter);
        this.timeProvider = y8gVar;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.BaseStatisticsManagerImpl
    public long getTime(long timestamp) {
        return timestamp == -1 ? this.timeProvider.utcTimeMs() : timestamp;
    }

    @Override // ru.ok.android.externcalls.sdk.log.stat.StatisticsManager
    public void log(ProductStatItem statItem) {
        sendStat(statItem);
    }
}
