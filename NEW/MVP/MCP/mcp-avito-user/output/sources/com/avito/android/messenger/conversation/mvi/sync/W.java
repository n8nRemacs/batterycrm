package com.avito.android.messenger.conversation.mvi.sync;

import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: MessageSyncAgent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "chatMsg", "Lru/avito/messenger/api/entity/ChatMessage;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class W<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f194718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194719c;

    public W(P p12, MessengerUserHashInfo messengerUserHashInfo) {
        this.f194718b = p12;
        this.f194719c = messengerUserHashInfo;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f194718b.f194638f.f(this.f194719c, (ChatMessage) obj);
    }
}
