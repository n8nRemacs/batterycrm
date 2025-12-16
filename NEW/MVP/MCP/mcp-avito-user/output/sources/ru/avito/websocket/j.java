package ru.avito.websocket;

import kotlin.Metadata;
import kotlin.Q;
import okhttp3.Request;
import okhttp3.WebSocketListener;

/* compiled from: OkHttpWebSocketFactory.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00030\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lokhttp3/Request;", "", "Lru/avito/websocket/RequestIdHeader;", "<name for destructuring parameter 0>", "Lokhttp3/WebSocket;", "apply", "(Lkotlin/Q;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class j<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f431899b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WebSocketListener f431900c;

    public j(k kVar, WebSocketListener webSocketListener) {
        this.f431899b = kVar;
        this.f431900c = webSocketListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) {
        Q q12 = (Q) obj;
        Request request = (Request) q12.f406619b;
        return new Q(this.f431899b.f431901a.get().newWebSocket(request, this.f431900c), (String) q12.f406620c);
    }
}
