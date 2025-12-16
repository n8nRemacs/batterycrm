package ru.avito.messenger.api.entity;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ChannelSearchItem.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/avito/messenger/api/entity/ChannelSearchItem;", "", "Lru/avito/messenger/api/entity/Channel;", "channel", "Lru/avito/messenger/api/entity/ChatMessage;", "message", "<init>", "(Lru/avito/messenger/api/entity/Channel;Lru/avito/messenger/api/entity/ChatMessage;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lru/avito/messenger/api/entity/Channel;", "getChannel", "()Lru/avito/messenger/api/entity/Channel;", "Lru/avito/messenger/api/entity/ChatMessage;", "getMessage", "()Lru/avito/messenger/api/entity/ChatMessage;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ChannelSearchItem {

    @c("channel")
    @k
    private final Channel channel;

    @c("message")
    @l
    private final ChatMessage message;

    public ChannelSearchItem(@k Channel channel, @l ChatMessage chatMessage) {
        this.channel = channel;
        this.message = chatMessage;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelSearchItem)) {
            return false;
        }
        ChannelSearchItem channelSearchItem = (ChannelSearchItem) other;
        return L.f(this.channel, channelSearchItem.channel) && L.f(this.message, channelSearchItem.message);
    }

    @k
    public final Channel getChannel() {
        return this.channel;
    }

    @l
    public final ChatMessage getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = this.channel.hashCode() * 31;
        ChatMessage chatMessage = this.message;
        return iHashCode + (chatMessage == null ? 0 : chatMessage.hashCode());
    }

    @k
    public String toString() {
        return "ChannelSearchItem(channel=" + this.channel + ", message=" + this.message + ')';
    }
}
