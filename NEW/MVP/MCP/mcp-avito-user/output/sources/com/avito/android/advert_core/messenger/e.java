package com.avito.android.advert_core.messenger;

import com.avito.android.remote.model.messenger.context.ChannelContext;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import kotlin.Metadata;
import l41.o;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.context.ChannelContext;

/* compiled from: AdvertMessengerInteractor.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/api/entity/Channel;", "channel", "Lio/reactivex/rxjava3/core/O;", "", "apply", "(Lru/avito/messenger/api/entity/Channel;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class e<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f83787b;

    public e(f fVar) {
        this.f83787b = fVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        Channel channel = (Channel) obj;
        String channelId = channel.getChannelId();
        ChannelContext context = channel.getContext();
        ChannelContext.Item item = context instanceof ChannelContext.Item ? (ChannelContext.Item) context : null;
        String userId = item != null ? item.getUserId() : null;
        return userId != null ? new C42007e(new c(this.f83787b, channelId, userId, 0)) : I.q(Boolean.FALSE);
    }
}
