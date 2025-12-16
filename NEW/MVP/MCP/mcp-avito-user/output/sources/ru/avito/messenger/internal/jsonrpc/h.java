package ru.avito.messenger.internal.jsonrpc;

import kotlin.Metadata;
import ru.avito.websocket.u;

/* compiled from: WebSocketJsonRpcClient.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lru/avito/websocket/u$c;", "disconnectedState", "Lkotlin/G0;", "accept", "(Lru/avito/websocket/u$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f431748b;

    public h(f fVar) {
        this.f431748b = fVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        this.f431748b.f431733e.e("Messenger", "WebSocket state is " + ((u.c) obj), null);
    }
}
