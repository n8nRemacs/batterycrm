package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.remote.model.messenger.Channel;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ChannelsUpdateHandler.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/messenger/Channel;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.sync.h0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class CallableC31838h0<V> implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31834f0 f188488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Channel f188489c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Channel f188490d;

    public CallableC31838h0(C31834f0 c31834f0, Channel channel, Channel channel2) {
        this.f188488b = c31834f0;
        this.f188489c = channel;
        this.f188490d = channel2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C31848m0 c31848m0 = this.f188488b.f188476e;
        Channel channel = this.f188490d;
        long updated = channel.getUpdated();
        Channel channel2 = this.f188489c;
        return updated >= channel2.getUpdated() ? channel : channel.copy((523775 & 1) != 0 ? channel.channelId : null, (523775 & 2) != 0 ? channel.type : null, (523775 & 4) != 0 ? channel.lastMessage : null, (523775 & 8) != 0 ? channel.users : null, (523775 & 16) != 0 ? channel.created : 0L, (523775 & 32) != 0 ? channel.updated : channel2.getUpdated(), (523775 & 64) != 0 ? channel.context : null, (523775 & 128) != 0 ? channel.readOnlyState : channel2.getReadOnlyState(), (523775 & 256) != 0 ? channel.isDeleted : false, (523775 & 512) != 0 ? channel.isRead : false, (523775 & 1024) != 0 ? channel.isSpam : false, (523775 & 2048) != 0 ? channel.isAnswered : false, (523775 & 4096) != 0 ? channel.tags : null, (523775 & 8192) != 0 ? channel.contextActions : channel2.getContextActions(), (523775 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? channel.flow : null, (523775 & 32768) != 0 ? channel.suspectMessageId : null, (523775 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? channel.displayInfo : null, (523775 & 131072) != 0 ? channel.inputState : channel2.getInputState(), (523775 & 262144) != 0 ? channel.pinOrder : null);
    }
}
