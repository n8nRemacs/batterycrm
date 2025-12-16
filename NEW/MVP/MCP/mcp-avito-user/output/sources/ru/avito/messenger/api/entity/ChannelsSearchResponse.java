package ru.avito.messenger.api.entity;

import Y61.k;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ChannelsSearchResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/avito/messenger/api/entity/ChannelsSearchResponse;", "", "items", "", "Lru/avito/messenger/api/entity/ChannelSearchItem;", "hasMore", "", "(Ljava/util/List;Z)V", "getHasMore", "()Z", "getItems", "()Ljava/util/List;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ChannelsSearchResponse {

    @c("hasMore")
    private final boolean hasMore;

    @c("documents")
    @k
    private final List<ChannelSearchItem> items;

    public ChannelsSearchResponse(@k List<ChannelSearchItem> list, boolean z12) {
        this.items = list;
        this.hasMore = z12;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    @k
    public final List<ChannelSearchItem> getItems() {
        return this.items;
    }
}
