package com.avito.android.messenger.channels.mvi.sync;

import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.Channel;

/* compiled from: ChannelSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/api/entity/Channel;", "channel", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Lru/avito/messenger/api/entity/Channel;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.channels.mvi.sync.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31855q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31829d f188526b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f188527c;

    public C31855q(C31829d c31829d, MessengerUserHashInfo messengerUserHashInfo) {
        this.f188526b = c31829d;
        this.f188527c = messengerUserHashInfo;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Channel channel = (Channel) obj;
        return this.f188526b.f188448t.b(this.f188527c, channel).h(io.reactivex.rxjava3.core.I.q(channel.getChannelId()));
    }
}
