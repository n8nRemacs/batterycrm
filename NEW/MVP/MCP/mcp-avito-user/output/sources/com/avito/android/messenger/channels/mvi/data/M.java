package com.avito.android.messenger.channels.mvi.data;

import arrow.core.Y0;
import com.avito.android.persistence.messenger.P0;
import com.avito.android.remote.model.messenger.Channel;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: ChannelRepo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/data/M;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface M {
    @Y61.k
    io.reactivex.rxjava3.core.z b(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    io.reactivex.rxjava3.core.z<List<kotlin.Q<Channel, P0>>> d(@Y61.k MessengerUserHashInfo messengerUserHashInfo, long j12, @Y61.k Collection<String> collection, @Y61.k Collection<String> collection2, @Y61.l Boolean bool);

    @Y61.k
    io.reactivex.rxjava3.core.z<List<kotlin.Q<Channel, P0>>> e(@Y61.k MessengerUserHashInfo messengerUserHashInfo, long j12, @Y61.k Collection<String> collection, @Y61.k Collection<String> collection2, @Y61.k Collection<String> collection3, @Y61.k Collection<String> collection4, @Y61.l Boolean bool);

    @Y61.k
    io.reactivex.rxjava3.core.I<Y0<Long>> k(@Y61.k MessengerUserHashInfo messengerUserHashInfo, int i12, @Y61.k Collection<String> collection, @Y61.k Collection<String> collection2, @Y61.l Boolean bool);

    @Y61.k
    io.reactivex.rxjava3.core.I l(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k SortedSet sortedSet, @Y61.k SortedSet sortedSet2, @Y61.l Boolean bool);

    @Y61.k
    io.reactivex.rxjava3.core.z<List<Channel>> m(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k Collection<String> collection);

    @Y61.k
    io.reactivex.rxjava3.core.z<List<String>> n(@Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    io.reactivex.rxjava3.core.z<List<String>> s(@Y61.k MessengerUserHashInfo messengerUserHashInfo);
}
