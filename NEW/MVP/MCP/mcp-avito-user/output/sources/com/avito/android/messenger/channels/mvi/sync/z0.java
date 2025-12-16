package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.messenger.channels.analytics.MessengerStatsdEventFactory;
import io.reactivex.rxjava3.core.AbstractC41768a;
import kotlin.Metadata;

/* compiled from: MessengerActionTimestampTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/z0;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface z0 {
    void b(@Y61.l Long l12, @Y61.k MessengerStatsdEventFactory.Companion.ChannelType channelType);

    @Y61.k
    AbstractC41768a c(@Y61.l Long l12, boolean z12);

    @Y61.k
    AbstractC41768a d(@Y61.l Long l12);

    void e(@Y61.l Long l12);

    @Y61.k
    AbstractC41768a f(@Y61.l Long l12);

    void g(@Y61.l Long l12);

    void h(@Y61.l Long l12, @Y61.l MessengerStatsdEventFactory.Companion.ChannelType channelType);

    void i(@Y61.l Long l12);
}
