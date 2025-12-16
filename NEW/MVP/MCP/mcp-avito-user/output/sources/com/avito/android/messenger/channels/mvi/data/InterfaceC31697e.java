package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.persistence.messenger.C33091m0;
import com.avito.android.persistence.messenger.O1;
import com.avito.android.persistence.messenger.c3;
import com.avito.android.remote.model.messenger.Channel;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelEntityConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/e;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.data.e, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC31697e {
    @Y61.k
    Channel a(@Y61.k com.avito.android.persistence.messenger.Y y12, @Y61.k List<c3> list, @Y61.k Collection<C33091m0> collection, @Y61.l O1 o12);

    @Y61.k
    C31696d b(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Channel channel);

    @Y61.k
    O c(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Collection<Channel> collection);
}
