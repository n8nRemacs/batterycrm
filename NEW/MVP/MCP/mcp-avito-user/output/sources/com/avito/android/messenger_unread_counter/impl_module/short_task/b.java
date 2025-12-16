package com.avito.android.messenger_unread_counter.impl_module.short_task;

import com.avito.android.util.V2;
import kotlin.Metadata;
import l41.o;
import pZ.C47037b;
import ru.avito.messenger.api.entity.ChannelsCounters;

/* compiled from: UpdateUnreadMessagesCounterShortTask.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/api/entity/ChannelsCounters;", "channelsCounters", "LpZ/b;", "apply", "(Lru/avito/messenger/api/entity/ChannelsCounters;)LpZ/b;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class b<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public static final b<T, R> f197737b = new b<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        ChannelsCounters channelsCounters = (ChannelsCounters) obj;
        V2.f318762a.i("UpdateUnreadMessagesCountWorker", "received counter = " + channelsCounters.getUnreadChannels(), null);
        return new C47037b(channelsCounters.getUnreadChannels());
    }
}
