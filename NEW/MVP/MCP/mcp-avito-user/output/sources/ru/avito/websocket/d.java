package ru.avito.websocket;

import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import kotlin.G0;
import kotlin.Metadata;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import p91.InterfaceC46925b;
import ru.avito.websocket.u;

/* compiled from: LegacyRxWebSocketImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/websocket/d;", "Lokhttp3/WebSocketListener;", "_common_rx-websocket_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d extends WebSocketListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f431876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ K<G0> f431877e;

    public d(e eVar, K<G0> k12) {
        this.f431876d = eVar;
        this.f431877e = k12;
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosed(@Y61.k WebSocket webSocket, int i12, @Y61.k String str) {
        if (this.f431876d.f431886i != webSocket) {
            webSocket.cancel();
            Y41.l<String, G0> lVar = this.f431876d.f431879b;
            if (lVar != null) {
                lVar.invoke("WS: on closed event ignored");
                return;
            }
            return;
        }
        Y41.l<String, G0> lVar2 = this.f431876d.f431879b;
        if (lVar2 != null) {
            lVar2.invoke("WS: on closed: " + i12 + ", " + str);
        }
        InterfaceC46925b interfaceC46925b = this.f431876d.f431880c;
        if (interfaceC46925b != null) {
            interfaceC46925b.t0();
        }
    }

    @Override // okhttp3.WebSocketListener
    public final void onClosing(@Y61.k WebSocket webSocket, int i12, @Y61.k String str) {
        if (this.f431876d.f431886i != null && this.f431876d.f431886i != webSocket) {
            webSocket.cancel();
            Y41.l<String, G0> lVar = this.f431876d.f431879b;
            if (lVar != null) {
                lVar.invoke("WS: on closing event ignored");
                return;
            }
            return;
        }
        Y41.l<String, G0> lVar2 = this.f431876d.f431879b;
        if (lVar2 != null) {
            lVar2.invoke("WS: on closing: " + i12 + ", " + str);
        }
        e eVar = this.f431876d;
        synchronized (eVar.f431882e) {
            try {
                WebSocket webSocket2 = eVar.f431886i;
                if (webSocket2 != null) {
                    webSocket2.cancel();
                }
                eVar.f431886i = null;
                eVar.f431885h.onNext(new u.c(i12, str, null, 4, null));
                io.reactivex.rxjava3.internal.observers.m mVar = eVar.f431888k;
                if (mVar != null) {
                    DisposableHelper.a(mVar);
                    G0 g02 = G0.f406611a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // okhttp3.WebSocketListener
    public final void onFailure(@Y61.k WebSocket webSocket, @Y61.k Throwable th2, @Y61.l Response response) {
        String string;
        ResponseBody responseBodyBody;
        if (this.f431876d.f431886i != null && this.f431876d.f431886i != webSocket) {
            webSocket.cancel();
            Y41.l<String, G0> lVar = this.f431876d.f431879b;
            if (lVar != null) {
                lVar.invoke("WS: on failure event ignored");
                return;
            }
            return;
        }
        Y41.p<String, Throwable, G0> pVar = this.f431876d.f431881d;
        if (pVar != null) {
            StringBuilder sb2 = new StringBuilder("WS: on failure: ");
            try {
                StringBuilder sb3 = new StringBuilder("response.body = ");
                sb3.append((response == null || (responseBodyBody = response.body()) == null) ? null : responseBodyBody.string());
                string = sb3.toString();
            } catch (Exception e12) {
                string = "couldn't extract response.body because of " + e12;
            }
            sb2.append(string);
            pVar.invoke(sb2.toString(), th2);
        }
        InterfaceC46925b interfaceC46925b = this.f431876d.f431880c;
        if (interfaceC46925b != null) {
            interfaceC46925b.onError(th2.toString());
        }
        e eVar = this.f431876d;
        Object obj = eVar.f431882e;
        K<G0> k12 = this.f431877e;
        synchronized (obj) {
            try {
                eVar.f431886i = null;
                if (!(eVar.f431884g.P0() instanceof u.c)) {
                    eVar.f431885h.onNext(new u.c(response != null ? response.code() : -1, response != null ? response.message() : null, th2));
                }
                if (!k12.i()) {
                    k12.onError(th2);
                }
                io.reactivex.rxjava3.internal.observers.m mVar = eVar.f431888k;
                if (mVar != null) {
                    DisposableHelper.a(mVar);
                    G0 g02 = G0.f406611a;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // okhttp3.WebSocketListener
    public final void onMessage(@Y61.k WebSocket webSocket, @Y61.k String str) {
        if (webSocket != this.f431876d.f431886i) {
            webSocket.cancel();
            Y41.l<String, G0> lVar = this.f431876d.f431879b;
            if (lVar != null) {
                lVar.invoke("WS: ignored <-- ".concat(str));
                return;
            }
            return;
        }
        Y41.l<String, G0> lVar2 = this.f431876d.f431879b;
        if (lVar2 != null) {
            lVar2.invoke("WS: <-- ".concat(str));
        }
        InterfaceC46925b interfaceC46925b = this.f431876d.f431880c;
        if (interfaceC46925b != null) {
            interfaceC46925b.b(str);
        }
        this.f431876d.f431883f.accept(str);
    }

    @Override // okhttp3.WebSocketListener
    public final void onOpen(@Y61.k WebSocket webSocket, @Y61.k Response response) {
        e eVar = this.f431876d;
        Y41.l<String, G0> lVar = eVar.f431879b;
        if (lVar != null) {
            lVar.invoke("WS: on open: " + response.message());
        }
        InterfaceC46925b interfaceC46925b = eVar.f431880c;
        if (interfaceC46925b != null) {
            interfaceC46925b.c(webSocket.getOriginalRequest().url().getUrl());
        }
        K<G0> k12 = this.f431877e;
        if (k12.i()) {
            eVar.f();
        } else {
            eVar.f431885h.onNext(new u.a());
            k12.onSuccess(G0.f406611a);
        }
    }
}
