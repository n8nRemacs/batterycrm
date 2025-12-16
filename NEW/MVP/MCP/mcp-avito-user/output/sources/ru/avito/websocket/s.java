package ru.avito.websocket;

import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.WebSocket;
import ru.avito.websocket.u;

/* compiled from: RxWebSocketImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000*\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Q;", "Lokhttp3/WebSocket;", "Lru/avito/websocket/u;", "invoke", "(Lkotlin/Q;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class s extends N implements Y41.l<Q<? extends WebSocket, ? extends u>, Q<? extends WebSocket, ? extends u>> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f431952l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f431953m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i12, String str) {
        super(1);
        this.f431952l = i12;
        this.f431953m = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.l
    public final Q<? extends WebSocket, ? extends u> invoke(Q<? extends WebSocket, ? extends u> q12) {
        Q<? extends WebSocket, ? extends u> q13 = q12;
        u uVar = (u) q13.f406620c;
        boolean z12 = uVar instanceof u.a;
        String str = this.f431953m;
        int i12 = this.f431952l;
        A a12 = q13.f406619b;
        if (z12) {
            WebSocket webSocket = (WebSocket) a12;
            if (webSocket != null) {
                webSocket.close(i12, str);
            }
        } else if (uVar instanceof u.b) {
            WebSocket webSocket2 = (WebSocket) a12;
            if (webSocket2 != null) {
                webSocket2.close(i12, str);
            }
        } else {
            boolean z13 = uVar instanceof u.c;
        }
        return new Q<>(null, new u.c(this.f431952l, this.f431953m, null, 4, null));
    }
}
