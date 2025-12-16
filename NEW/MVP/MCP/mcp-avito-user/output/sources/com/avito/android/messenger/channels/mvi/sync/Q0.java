package com.avito.android.messenger.channels.mvi.sync;

import Oq.InterfaceC14725a;
import com.avito.android.messenger.MessageSyncException;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: MessengerReadStatusSyncAgent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class Q0<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U0 f188386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X81.h f188387c;

    public Q0(U0 u02, X81.h hVar) {
        this.f188386b = u02;
        this.f188387c = hVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        C31667x c31667x = this.f188386b.f188404l;
        MessageSyncException messageSyncException = new MessageSyncException("Event handling failed", (Throwable) obj);
        kotlin.Q q12 = new kotlin.Q(ChannelContext.Item.USER_ID, ChannelContext.Item.USER_ID);
        X81.h hVar = this.f188387c;
        InterfaceC14725a.C0808a.a(c31667x, messageSyncException, kotlin.collections.P0.g(q12, new kotlin.Q("eventType", hVar instanceof X81.o ? "chat_read" : hVar instanceof X81.t ? "chat_unread" : "ignored:".concat(hVar.getClass().getName()))), 2);
    }
}
