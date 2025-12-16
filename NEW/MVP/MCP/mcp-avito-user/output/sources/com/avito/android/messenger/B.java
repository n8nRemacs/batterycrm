package com.avito.android.messenger;

import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.InputState;
import com.avito.android.remote.model.messenger.ReadOnlyState;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChannelUser;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.Image;
import ru.avito.messenger.api.entity.body.item.BodyItem;

/* compiled from: MessengerEntityConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/B;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface B {
    @Y61.k
    MessageBody a(@Y61.k BodyItem bodyItem);

    @Y61.k
    User b(@Y61.k ChannelUser channelUser);

    @Y61.k
    Channel c(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k ru.avito.messenger.api.entity.Channel channel);

    @Y61.k
    ReadOnlyState d(@Y61.k ru.avito.messenger.api.entity.ReadOnlyState readOnlyState);

    @Y61.k
    MessageBody.ImageBody e(@Y61.k Image image);

    @Y61.k
    LocalMessage f(@Y61.l MessengerUserHashInfo messengerUserHashInfo, @Y61.k ChatMessage chatMessage);

    @Y61.k
    InputState g(@Y61.k ru.avito.messenger.api.entity.InputState inputState);
}
