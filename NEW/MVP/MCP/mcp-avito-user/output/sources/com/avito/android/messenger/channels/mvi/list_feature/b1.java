package com.avito.android.messenger.channels.mvi.list_feature;

import com.avito.android.messenger.channels.adapter.ChannelsListItem;
import com.avito.android.remote.model.messenger.Channel;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelsListDataConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/list_feature/b1;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b1 {
    @Y61.k
    List<ChannelsListItem.b> b(@Y61.k List<kotlin.Q<Channel, com.avito.android.persistence.messenger.P0>> list, @Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Set<String> set, @Y61.k Map<String, ? extends List<HY.b>> map);

    @Y61.k
    List c(@Y61.k String str, @Y61.k List list);

    @Y61.k
    List<ChannelsListItem.b> d(@Y61.k List<kotlin.Q<Channel, com.avito.android.persistence.messenger.P0>> list, @Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Set<String> set, @Y61.k Map<String, ? extends List<HY.b>> map);
}
