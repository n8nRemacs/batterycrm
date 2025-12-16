package ru.avito.websocket;

import java.util.concurrent.Callable;
import kotlin.G0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import okhttp3.WebSocket;
import p91.InterfaceC46925b;
import ru.avito.websocket.u;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class c implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f431873b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f431874c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f431875d;

    public /* synthetic */ c(e eVar, String str, int i12) {
        this.f431873b = i12;
        this.f431874c = eVar;
        this.f431875d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean zSend;
        Boolean boolValueOf;
        String str;
        switch (this.f431873b) {
            case 0:
                e eVar = this.f431874c;
                String str2 = this.f431875d;
                Y41.l<String, G0> lVar = eVar.f431879b;
                if (lVar != null) {
                    lVar.invoke("WS: close: 1000, ".concat(str2));
                }
                synchronized (eVar.f431882e) {
                    try {
                        WebSocket webSocket = eVar.f431886i;
                        if (webSocket != null) {
                            webSocket.close(1000, str2);
                        }
                        eVar.f431885h.onNext(new u.c(1000, str2, null, 4, null));
                    } finally {
                    }
                }
                return G0.f406611a;
            default:
                e eVar2 = this.f431874c;
                String str3 = this.f431875d;
                synchronized (eVar2.f431882e) {
                    try {
                        u uVarP0 = eVar2.f431884g.P0();
                        zSend = false;
                        if (!(uVarP0 instanceof u.a)) {
                            if (uVarP0 instanceof u.b ? true : uVarP0 instanceof u.c) {
                                Y41.l<String, G0> lVar2 = eVar2.f431879b;
                                if (lVar2 != null) {
                                    lVar2.invoke("WS: sendMessage() was called when socket is disconnected");
                                }
                            } else if (uVarP0 != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (eVar2.f431886i == null) {
                            Y41.l<String, G0> lVar3 = eVar2.f431879b;
                            if (lVar3 != null) {
                                lVar3.invoke("WS: Inconsistent state: state was CONNECTED and webSocket was null");
                            }
                            eVar2.f431885h.onNext(new u.c(0, null, null, 7, null));
                        } else {
                            WebSocket webSocket2 = eVar2.f431886i;
                            if (webSocket2 != null) {
                                zSend = webSocket2.send(str3);
                            }
                        }
                        boolValueOf = Boolean.valueOf(zSend);
                        str = eVar2.f431887j;
                    } finally {
                    }
                }
                InterfaceC46925b interfaceC46925b = eVar2.f431880c;
                if (interfaceC46925b != null) {
                    interfaceC46925b.a(str3);
                }
                Y41.l<String, G0> lVar4 = eVar2.f431879b;
                if (lVar4 != null) {
                    lVar4.invoke(zSend ? "WS: --> ".concat(str3) : "WS: send message: message wasn't enqueued: ".concat(str3));
                }
                return new Q(boolValueOf, str);
        }
    }
}
