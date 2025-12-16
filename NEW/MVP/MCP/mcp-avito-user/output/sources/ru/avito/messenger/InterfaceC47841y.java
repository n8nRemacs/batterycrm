package ru.avito.messenger;

import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.ChannelsResponse;
import ru.avito.messenger.api.entity.FoldersCountersResponse;
import ru.avito.messenger.api.entity.GetChannelFilters;

/* compiled from: MessengerChannels.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/y;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC47841y {

    /* compiled from: MessengerChannels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.y$a */
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.core.I<FoldersCountersResponse> B(@Y61.k Map<String, ? extends Collection<String>> map, @Y61.l Boolean bool);

    @Y61.k
    io.reactivex.rxjava3.core.I<Channel> j(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l Y41.a<? extends io.reactivex.rxjava3.core.I<Channel>> aVar);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.Q<ChannelsResponse, Long>> o(@Y61.l MessengerUserHashInfo messengerUserHashInfo, @Y61.l Long l12, int i12, @Y61.k GetChannelFilters getChannelFilters, @Y61.l Y41.a<? extends io.reactivex.rxjava3.core.I<kotlin.Q<ChannelsResponse, Long>>> aVar);
}
