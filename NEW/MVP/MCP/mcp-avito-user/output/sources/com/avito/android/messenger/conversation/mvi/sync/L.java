package com.avito.android.messenger.conversation.mvi.sync;

import Oq.InterfaceC14725a;
import com.avito.android.messenger.MessageSyncException;
import com.avito.android.messenger.analytics.C31667x;
import kotlin.Metadata;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.ChatMessageUpdate;

/* compiled from: MessageSyncAgent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class L<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f194608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f194609c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X81.h f194610d;

    public L(P p12, MessengerUserHashInfo messengerUserHashInfo, X81.h hVar) {
        this.f194608b = p12;
        this.f194609c = messengerUserHashInfo;
        this.f194610d = hVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C31667x c31667x = this.f194608b.f194647o;
        MessageSyncException messageSyncException = new MessageSyncException("Event handling failed", (Throwable) obj);
        X81.h hVar = this.f194610d;
        InterfaceC14725a.C0808a.a(c31667x, messageSyncException, com.avito.android.messenger.util.i.a(this.f194609c, new kotlin.Q("eventType", hVar instanceof ChatMessage ? "message" : hVar instanceof ChatMessageUpdate ? "message_update" : hVar instanceof X81.q ? "message_read" : "ignored:".concat(hVar.getClass().getName()))), 2);
    }
}
