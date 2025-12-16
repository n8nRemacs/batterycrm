package ru.avito.messenger;

import java.util.List;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.ChannelUser;
import ru.avito.messenger.api.entity.ChannelsResponse;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.GetChannelFilters;

/* compiled from: MessengerClientFacade.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/A;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface A {

    /* compiled from: MessengerClientFacade.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.core.I<Channel> a(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4);

    @Y61.k
    io.reactivex.rxjava3.core.I b(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.Q<ChannelsResponse, Long>> c(@Y61.l MessengerUserHashInfo messengerUserHashInfo, @Y61.l Long l12, int i12, @Y61.k GetChannelFilters getChannelFilters);

    @Y61.k
    io.reactivex.rxjava3.core.I<List<ChannelUser>> d(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I e(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l Long l12, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> f(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l List<String> list, @Y61.l String str4, @Y61.l Integer num, @Y61.l String str5, @Y61.l Long l12);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> g(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k List<String> list);
}
