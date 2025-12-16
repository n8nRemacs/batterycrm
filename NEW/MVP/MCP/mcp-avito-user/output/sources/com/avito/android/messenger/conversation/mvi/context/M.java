package com.avito.android.messenger.conversation.mvi.context;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "message", "Lru/avito/messenger/api/entity/ChatMessage;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class M<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31988b f190184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f190185c;

    public M(C31988b c31988b, MessengerUserHashInfo messengerUserHashInfo) {
        this.f190184b = c31988b;
        this.f190185c = messengerUserHashInfo;
    }

    @Override // l41.r
    public final boolean test(Object obj) {
        ChatMessage chatMessage = (ChatMessage) obj;
        return kotlin.jvm.internal.L.f(chatMessage.getChannelId(), this.f190184b.f190241V) && !kotlin.jvm.internal.L.f(chatMessage.getFromId(), this.f190185c.f430682d);
    }
}
