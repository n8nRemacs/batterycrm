package c91;

import java.util.List;
import kotlin.Metadata;

/* compiled from: GetChannelsRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001BQ\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lc91/z;", "", "", "", "anyTags", "", "channelIds", "excludeTags", "itemIds", "", "unreadOnly", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;)V", "Ljava/util/List;", "getAnyTags", "()Ljava/util/List;", "getChannelIds", "getExcludeTags", "getItemIds", "Ljava/lang/Boolean;", "getUnreadOnly", "()Ljava/lang/Boolean;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c91.z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C26994z {

    @com.google.gson.annotations.c("anyTags")
    @Y61.l
    private final List<Long> anyTags;

    @com.google.gson.annotations.c("channelIds")
    @Y61.l
    private final List<String> channelIds;

    @com.google.gson.annotations.c("excludeTags")
    @Y61.l
    private final List<Long> excludeTags;

    @com.google.gson.annotations.c("itemIds")
    @Y61.l
    private final List<Long> itemIds;

    @com.google.gson.annotations.c("unreadOnly")
    @Y61.l
    private final Boolean unreadOnly;

    public C26994z(@Y61.l List<Long> list, @Y61.l List<String> list2, @Y61.l List<Long> list3, @Y61.l List<Long> list4, @Y61.l Boolean bool) {
        this.anyTags = list;
        this.channelIds = list2;
        this.excludeTags = list3;
        this.itemIds = list4;
        this.unreadOnly = bool;
    }
}
