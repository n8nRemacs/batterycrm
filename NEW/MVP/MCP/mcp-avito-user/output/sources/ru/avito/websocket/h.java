package ru.avito.websocket;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import okhttp3.WebSocket;

/* compiled from: LegacyRxWebSocketImpl.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lokhttp3/WebSocket;", "", "Lru/avito/websocket/RequestIdHeader;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class h<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f431896b;

    public h(e eVar) {
        this.f431896b = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = (Q) obj;
        WebSocket webSocket = (WebSocket) q12.f406619b;
        String str = (String) q12.f406620c;
        e eVar = this.f431896b;
        synchronized (eVar.f431882e) {
            eVar.f431886i = webSocket;
            eVar.f431887j = str;
            G0 g02 = G0.f406611a;
        }
    }
}
