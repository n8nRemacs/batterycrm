package c91;

import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.generated.api.get_channels.Channel;

/* compiled from: GetChannelsResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lc91/A;", "", "", "Lru/avito/messenger/generated/api/get_channels/Channel;", "channels", "", "hasMore", "<init>", "(Ljava/util/List;Z)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Z", "b", "()Z", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c91.A, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C26962A {

    @com.google.gson.annotations.c("channels")
    @Y61.k
    private final List<Channel> channels;

    @com.google.gson.annotations.c("hasMore")
    private final boolean hasMore;

    public C26962A(@Y61.k List<Channel> list, boolean z12) {
        this.channels = list;
        this.hasMore = z12;
    }

    @Y61.k
    public final List<Channel> a() {
        return this.channels;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getHasMore() {
        return this.hasMore;
    }
}
