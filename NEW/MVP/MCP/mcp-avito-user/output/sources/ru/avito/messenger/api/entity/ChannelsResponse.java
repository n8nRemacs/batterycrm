package ru.avito.messenger.api.entity;

import Y61.k;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ChannelsResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/avito/messenger/api/entity/ChannelsResponse;", "", "hasMore", "", "channels", "", "Lru/avito/messenger/api/entity/Channel;", "(ZLjava/util/List;)V", "getChannels", "()Ljava/util/List;", "getHasMore", "()Z", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ChannelsResponse {

    @c("channels")
    @k
    private final List<Channel> channels;

    @c("hasMore")
    private final boolean hasMore;

    public ChannelsResponse(boolean z12, @k List<Channel> list) {
        this.hasMore = z12;
        this.channels = list;
    }

    @k
    public final List<Channel> getChannels() {
        return this.channels;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }
}
