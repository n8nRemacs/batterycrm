package com.avito.android.messenger.channels.mvi.sync;

import com.avito.android.C30277e1;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: ChannelsUpdateMerger.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/sync/m0;", "Lcom/avito/android/messenger/channels/mvi/sync/l0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.channels.mvi.sync.m0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31848m0 implements InterfaceC31846l0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f188507a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f188508b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.B f188509c;

    public C31848m0(@Y61.k com.avito.android.server_time.h hVar, @Y61.k C30277e1 c30277e1, @Y61.k com.avito.android.messenger.B b12) {
        this.f188507a = hVar;
        this.f188508b = c30277e1;
        this.f188509c = b12;
    }

    public final boolean a(String str, Channel channel, ChatMessage chatMessage) {
        C30277e1 c30277e1 = this.f188508b;
        c30277e1.getClass();
        kotlin.reflect.n<Object> nVar = C30277e1.f144946d1[72];
        if (!((Boolean) c30277e1.f145038s0.a().invoke()).booleanValue()) {
            return kotlin.jvm.internal.L.f(chatMessage.getFromId(), str);
        }
        LocalMessage lastMessage = channel.getLastMessage();
        if (!kotlin.jvm.internal.L.f(chatMessage.getFromId(), str)) {
            if (!kotlin.jvm.internal.L.f(chatMessage.getId(), lastMessage != null ? lastMessage.getRemoteId() : null) && (lastMessage == null || chatMessage.getCreated() >= lastMessage.getCreated())) {
                return false;
            }
        }
        return channel.isRead();
    }
}
