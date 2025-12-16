package com.avito.android.messenger.channels.mvi.sync;

import kotlin.Metadata;
import ru.avito.messenger.api.entity.Channel;

/* compiled from: ChannelsListInconsistencyTracker.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/avito/messenger/api/entity/Channel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class U extends kotlin.jvm.internal.N implements Y41.l<Channel, CharSequence> {

    /* renamed from: l, reason: collision with root package name */
    public static final U f188392l = new U();

    public U() {
        super(1);
    }

    @Override // Y41.l
    public final CharSequence invoke(Channel channel) {
        return channel.getChannelId();
    }
}
