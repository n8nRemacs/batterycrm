package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.remote.model.messenger.Channel;
import io.reactivex.rxjava3.core.AbstractC41768a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelRepo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/N;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface N {
    @Y61.k
    AbstractC41768a a(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    AbstractC41768a c(@Y61.k LinkedHashSet linkedHashSet);

    @Y61.k
    AbstractC41768a f(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    AbstractC41768a g(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    AbstractC41768a h(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k ArrayList arrayList, @Y61.k ArrayList arrayList2, @Y61.l Boolean bool);

    @Y61.k
    AbstractC41768a i(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    AbstractC41768a j(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Channel channel);

    @Y61.k
    AbstractC41768a o(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    AbstractC41768a p(@Y61.k String str, @Y61.k String str2, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    AbstractC41768a q(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    AbstractC41768a r(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k List<Channel> list);
}
