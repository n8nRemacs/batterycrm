package com.avito.android.remote.model.messenger;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import q50.InterfaceC47203a;

/* compiled from: Channel.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0012\u0010\r\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0001\u001a\u0012\u0010\u000f\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u0003*\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u0003*\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0005\"\u0016\u0010\u0007\u001a\u00020\u0003*\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u0018\u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0016\u0010\u000b\u001a\u00020\u0001*\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"MULTI_CHAT_TYPE", "", "isMultiChat", "", "Lcom/avito/android/remote/model/messenger/Channel;", "(Lcom/avito/android/remote/model/messenger/Channel;)Z", "isNotAnswered", "isReadOnly", "itemId", "getItemId", "(Lcom/avito/android/remote/model/messenger/Channel;)Ljava/lang/String;", "shortStr", "getShortStr", "hasItemContextAndUserIsBuyer", ChannelContext.Item.USER_ID, "hasItemContextAndUserIsSeller", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
@InterfaceC47203a
/* loaded from: classes17.dex */
public final class ChannelKt {

    @k
    public static final String MULTI_CHAT_TYPE = "m2m";

    @l
    public static final String getItemId(@k Channel channel) {
        ChannelContext context = channel.getContext();
        ChannelContext.Item item = context instanceof ChannelContext.Item ? (ChannelContext.Item) context : null;
        if (item != null) {
            return item.getId();
        }
        return null;
    }

    @k
    public static final String getShortStr(@k Channel channel) {
        String str;
        StringBuilder sb2 = new StringBuilder("Channel{id=");
        sb2.append(channel.getChannelId());
        sb2.append(", lastMessage=");
        LocalMessage lastMessage = channel.getLastMessage();
        if (lastMessage != null) {
            str = "LocalMessage(localId='" + lastMessage.getLocalId() + "', remoteId='" + lastMessage.getRemoteId() + "', channelId='" + lastMessage.getChannelId() + "', fromId='" + lastMessage.getFromId() + "')";
        } else {
            str = null;
        }
        return C22026a.c(sb2, str, '}');
    }

    public static final boolean hasItemContextAndUserIsBuyer(@k Channel channel, @k String str) {
        ChannelContext context = channel.getContext();
        if ((context instanceof ChannelContext.Item ? (ChannelContext.Item) context : null) != null) {
            return !str.equals(r1.getUserId());
        }
        return false;
    }

    public static final boolean hasItemContextAndUserIsSeller(@k Channel channel, @k String str) {
        ChannelContext context = channel.getContext();
        ChannelContext.Item item = context instanceof ChannelContext.Item ? (ChannelContext.Item) context : null;
        if (item != null) {
            return str.equals(item.getUserId());
        }
        return false;
    }

    public static final boolean isMultiChat(@k Channel channel) {
        return L.f(channel.getType(), MULTI_CHAT_TYPE);
    }

    public static final boolean isNotAnswered(@k Channel channel) {
        return !channel.isAnswered();
    }

    public static final boolean isReadOnly(@k Channel channel) {
        InputState inputState = channel.getInputState();
        if (inputState == null || !inputState.isDisabled()) {
            return channel.getInputState() == null && channel.getReadOnlyState() != null;
        }
        return true;
    }
}
