package ru.avito.websocket;

import arrow.core.X0;
import arrow.core.Y0;
import arrow.core.Z0;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.core.M;
import io.reactivex.rxjava3.internal.operators.completable.C41826q;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import io.reactivex.rxjava3.internal.operators.single.G;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import p91.InterfaceC46925b;
import ru.avito.websocket.r;
import ru.avito.websocket.u;

/* compiled from: RxWebSocketImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/websocket/r;", "Lru/avito/websocket/n;", "_common_rx-websocket_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class r implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final z f431913a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.l<String, G0> f431914b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final InterfaceC46925b f431915c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.p<String, Throwable, G0> f431916d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<Q<WebSocket, u>> f431917e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final B0 f431918f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<Y41.l<Q<? extends WebSocket, ? extends u>, Q<WebSocket, u>>> f431919g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<String> f431920h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final d f431921i;

    /* compiled from: RxWebSocketImpl.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u00032\u0018\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u00032O\u0010\b\u001aK\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u00000\u0005j\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003`\u0006¢\u0006\u0002\b\u0007H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lkotlin/Q;", "Lokhttp3/WebSocket;", "Lru/avito/websocket/u;", "Lru/avito/websocket/SocketWithState;", "socketWithState", "Lkotlin/Function1;", "Lru/avito/websocket/Mutator;", "Lkotlin/w;", "socketAction", "apply", "(Lkotlin/Q;LY41/l;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T1, T2, R> f431922b = new a<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            return (Q) ((Y41.l) obj2).invoke((Q) obj);
        }
    }

    /* compiled from: RxWebSocketImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lokhttp3/WebSocket;", "Lru/avito/websocket/u;", "Lru/avito/websocket/SocketWithState;", "<name for destructuring parameter 0>", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            u uVar = (u) ((Q) obj).f406620c;
            Y41.l<String, G0> lVar = r.this.f431914b;
            if (lVar != null) {
                lVar.invoke("Socket state after last action: " + uVar);
            }
        }
    }

    /* compiled from: RxWebSocketImpl.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lokhttp3/WebSocket;", "Lru/avito/websocket/u;", "Lru/avito/websocket/SocketWithState;", "socketWithState", "Lkotlin/G0;", "accept", "(Lkotlin/Q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            r.this.f431917e.accept((Q) obj);
        }
    }

    /* compiled from: RxWebSocketImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"ru/avito/websocket/r$d", "Lokhttp3/WebSocketListener;", "_common_rx-websocket_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends WebSocketListener {

        /* compiled from: RxWebSocketImpl.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000*\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Q;", "Lokhttp3/WebSocket;", "Lru/avito/websocket/u;", "invoke", "(Lkotlin/Q;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a extends N implements Y41.l<Q<? extends WebSocket, ? extends u>, Q<? extends WebSocket, ? extends u>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ WebSocket f431926l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ r f431927m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ int f431928n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f431929o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WebSocket webSocket, r rVar, int i12, String str) {
                super(1);
                this.f431926l = webSocket;
                this.f431927m = rVar;
                this.f431928n = i12;
                this.f431929o = str;
            }

            @Override // Y41.l
            public final Q<? extends WebSocket, ? extends u> invoke(Q<? extends WebSocket, ? extends u> q12) {
                Q<? extends WebSocket, ? extends u> q13 = q12;
                WebSocket webSocket = (WebSocket) q13.f406619b;
                r rVar = this.f431927m;
                WebSocket webSocket2 = this.f431926l;
                if (webSocket2 != webSocket) {
                    webSocket2.cancel();
                    Y41.l<String, G0> lVar = rVar.f431914b;
                    if (lVar == null) {
                        return q13;
                    }
                    lVar.invoke("onClose(): Canceled previously open websocket");
                    return q13;
                }
                Y41.l<String, G0> lVar2 = rVar.f431914b;
                if (lVar2 != null) {
                    lVar2.invoke("WS: on closed: " + this.f431928n + ", " + this.f431929o);
                }
                InterfaceC46925b interfaceC46925b = rVar.f431915c;
                if (interfaceC46925b != null) {
                    interfaceC46925b.t0();
                }
                return new Q<>(null, new u.c(this.f431928n, this.f431929o, null, 4, null));
            }
        }

        /* compiled from: RxWebSocketImpl.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000*\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Q;", "Lokhttp3/WebSocket;", "Lru/avito/websocket/u;", "invoke", "(Lkotlin/Q;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b extends N implements Y41.l<Q<? extends WebSocket, ? extends u>, Q<? extends WebSocket, ? extends u>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ WebSocket f431930l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ r f431931m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ int f431932n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ String f431933o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(WebSocket webSocket, r rVar, int i12, String str) {
                super(1);
                this.f431930l = webSocket;
                this.f431931m = rVar;
                this.f431932n = i12;
                this.f431933o = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Y41.l
            public final Q<? extends WebSocket, ? extends u> invoke(Q<? extends WebSocket, ? extends u> q12) {
                Q<? extends WebSocket, ? extends u> q13 = q12;
                WebSocket webSocket = (WebSocket) q13.f406619b;
                WebSocket webSocket2 = this.f431930l;
                r rVar = this.f431931m;
                if (webSocket2 != webSocket) {
                    webSocket2.cancel();
                    Y41.l<String, G0> lVar = rVar.f431914b;
                    if (lVar == null) {
                        return q13;
                    }
                    lVar.invoke("onClose(): Canceled previously open websocket");
                    return q13;
                }
                Y41.l<String, G0> lVar2 = rVar.f431914b;
                String str = this.f431933o;
                int i12 = this.f431932n;
                if (lVar2 != null) {
                    lVar2.invoke("WS: on closing: " + i12 + ", " + str);
                }
                rVar.f431919g.accept(new s(i12, str));
                return new Q<>(webSocket, (u) q13.f406620c);
            }
        }

        /* compiled from: RxWebSocketImpl.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000*\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Q;", "Lokhttp3/WebSocket;", "Lru/avito/websocket/u;", "invoke", "(Lkotlin/Q;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class c extends N implements Y41.l<Q<? extends WebSocket, ? extends u>, Q<? extends WebSocket, ? extends u>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ WebSocket f431934l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ r f431935m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Response f431936n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Throwable f431937o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(WebSocket webSocket, r rVar, Response response, Throwable th2) {
                super(1);
                this.f431934l = webSocket;
                this.f431935m = rVar;
                this.f431936n = response;
                this.f431937o = th2;
            }

            @Override // Y41.l
            public final Q<? extends WebSocket, ? extends u> invoke(Q<? extends WebSocket, ? extends u> q12) {
                ResponseBody responseBodyBody;
                Q<? extends WebSocket, ? extends u> q13 = q12;
                WebSocket webSocket = (WebSocket) q13.f406619b;
                r rVar = this.f431935m;
                WebSocket webSocket2 = this.f431934l;
                if (webSocket2 != webSocket) {
                    webSocket2.cancel();
                    Y41.l<String, G0> lVar = rVar.f431914b;
                    if (lVar == null) {
                        return q13;
                    }
                    lVar.invoke("onFailure(): Canceled previously open websocket");
                    return q13;
                }
                Y41.p<String, Throwable, G0> pVar = rVar.f431916d;
                Throwable th2 = this.f431937o;
                Response response = this.f431936n;
                if (pVar != null) {
                    StringBuilder sb2 = new StringBuilder("WS: on failure: response.body = ");
                    sb2.append((response == null || (responseBodyBody = response.body()) == null) ? null : responseBodyBody.string());
                    pVar.invoke(sb2.toString(), th2);
                }
                InterfaceC46925b interfaceC46925b = rVar.f431915c;
                if (interfaceC46925b != null) {
                    interfaceC46925b.onError(th2.toString());
                }
                return new Q<>(null, new u.c(response != null ? response.code() : -1, response != null ? response.message() : null, th2));
            }
        }

        /* compiled from: RxWebSocketImpl.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000*\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Q;", "Lokhttp3/WebSocket;", "Lru/avito/websocket/u;", "invoke", "(Lkotlin/Q;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: ru.avito.websocket.r$d$d, reason: collision with other inner class name */
        public static final class C12411d extends N implements Y41.l<Q<? extends WebSocket, ? extends u>, Q<? extends WebSocket, ? extends u>> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ WebSocket f431938l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ r f431939m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ Response f431940n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C12411d(WebSocket webSocket, r rVar, Response response) {
                super(1);
                this.f431938l = webSocket;
                this.f431939m = rVar;
                this.f431940n = response;
            }

            @Override // Y41.l
            public final Q<? extends WebSocket, ? extends u> invoke(Q<? extends WebSocket, ? extends u> q12) {
                Q<? extends WebSocket, ? extends u> q13 = q12;
                WebSocket webSocket = (WebSocket) q13.f406619b;
                r rVar = this.f431939m;
                WebSocket webSocket2 = this.f431938l;
                if (webSocket2 != webSocket) {
                    webSocket2.cancel();
                    Y41.l<String, G0> lVar = rVar.f431914b;
                    if (lVar == null) {
                        return q13;
                    }
                    lVar.invoke("onOpen(): Canceled previously open websocket");
                    return q13;
                }
                Y41.l<String, G0> lVar2 = rVar.f431914b;
                if (lVar2 != null) {
                    lVar2.invoke("WS: on open: " + this.f431940n.message());
                }
                InterfaceC46925b interfaceC46925b = rVar.f431915c;
                if (interfaceC46925b != null) {
                    interfaceC46925b.c(webSocket2.getOriginalRequest().url().getUrl());
                }
                return new Q<>(webSocket, new u.a());
            }
        }

        public d() {
        }

        @Override // okhttp3.WebSocketListener
        public final void onClosed(@Y61.k WebSocket webSocket, int i12, @Y61.k String str) {
            r rVar = r.this;
            rVar.f431919g.accept(new a(webSocket, rVar, i12, str));
        }

        @Override // okhttp3.WebSocketListener
        public final void onClosing(@Y61.k WebSocket webSocket, int i12, @Y61.k String str) {
            r rVar = r.this;
            rVar.f431919g.accept(new b(webSocket, rVar, i12, str));
        }

        @Override // okhttp3.WebSocketListener
        public final void onFailure(@Y61.k WebSocket webSocket, @Y61.k Throwable th2, @Y61.l Response response) {
            r rVar = r.this;
            rVar.f431919g.accept(new c(webSocket, rVar, response, th2));
        }

        @Override // okhttp3.WebSocketListener
        public final void onMessage(@Y61.k WebSocket webSocket, @Y61.k String str) {
            r rVar = r.this;
            if (webSocket != rVar.f431917e.d().f406619b) {
                webSocket.cancel();
                Y41.l<String, G0> lVar = rVar.f431914b;
                if (lVar != null) {
                    lVar.invoke("onMessage(): Canceled previously open websocket");
                    return;
                }
                return;
            }
            Y41.l<String, G0> lVar2 = rVar.f431914b;
            if (lVar2 != null) {
                lVar2.invoke("WS: <-- ".concat(str));
            }
            InterfaceC46925b interfaceC46925b = rVar.f431915c;
            if (interfaceC46925b != null) {
                interfaceC46925b.b(str);
            }
            rVar.f431920h.accept(str);
        }

        @Override // okhttp3.WebSocketListener
        public final void onOpen(@Y61.k WebSocket webSocket, @Y61.k Response response) {
            r rVar = r.this;
            rVar.f431919g.accept(new C12411d(webSocket, rVar, response));
        }
    }

    /* compiled from: RxWebSocketImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "message", "Larrow/core/Y0;", "apply", "(Ljava/lang/String;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A<T> f431941b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ r f431942c;

        /* JADX WARN: Multi-variable type inference failed */
        public e(A<? extends T> a12, r rVar) {
            this.f431941b = a12;
            this.f431942c = rVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            String str = (String) obj;
            try {
                return Z0.b(this.f431941b.a(str));
            } catch (Exception e12) {
                Y41.p<String, Throwable, G0> pVar = this.f431942c.f431916d;
                if (pVar != null) {
                    pVar.invoke("Failed to parse message: ".concat(str), e12);
                }
                Y0.f56266a.getClass();
                return X0.f56264b;
            }
        }
    }

    /* compiled from: RxWebSocketImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000*\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Q;", "Lokhttp3/WebSocket;", "Lru/avito/websocket/u;", "invoke", "(Lkotlin/Q;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Q<? extends WebSocket, ? extends u>, Q<? extends WebSocket, ? extends u>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f431943l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f431944m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AtomicReference<Throwable> f431945n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f431946o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, CountDownLatch countDownLatch, AtomicReference atomicReference, r rVar) {
            super(1);
            this.f431943l = rVar;
            this.f431944m = str;
            this.f431945n = atomicReference;
            this.f431946o = countDownLatch;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final Q<? extends WebSocket, ? extends u> invoke(Q<? extends WebSocket, ? extends u> q12) {
            Q<? extends WebSocket, ? extends u> q13 = q12;
            u uVar = (u) q13.f406620c;
            if (!(uVar instanceof u.b ? true : uVar instanceof u.a)) {
                if (!(uVar instanceof u.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                try {
                    r rVar = this.f431943l;
                    q13 = new Q<>((WebSocket) ((Q) rVar.f431913a.a(rVar.f431921i, this.f431944m).e()).f406619b, new u.b());
                } catch (Throwable th2) {
                    this.f431945n.set(th2);
                    Throwable cause = th2.getCause();
                    q13 = new Q<>(null, new u.c(0, null, cause == null ? th2 : cause, 3, null));
                }
            }
            this.f431946o.countDown();
            return q13;
        }
    }

    /* compiled from: RxWebSocketImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000*\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Q;", "Lokhttp3/WebSocket;", "Lru/avito/websocket/u;", "invoke", "(Lkotlin/Q;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<Q<? extends WebSocket, ? extends u>, Q<? extends WebSocket, ? extends u>> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f431947l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f431948m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AtomicBoolean f431949n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ CountDownLatch f431950o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, r rVar) {
            super(1);
            this.f431947l = rVar;
            this.f431948m = str;
            this.f431949n = atomicBoolean;
            this.f431950o = countDownLatch;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.l
        public final Q<? extends WebSocket, ? extends u> invoke(Q<? extends WebSocket, ? extends u> q12) {
            Q<? extends WebSocket, ? extends u> q13 = q12;
            u uVar = (u) q13.f406620c;
            boolean z12 = uVar instanceof u.b ? true : uVar instanceof u.a;
            AtomicBoolean atomicBoolean = this.f431949n;
            String str = this.f431948m;
            if (z12) {
                WebSocket webSocket = (WebSocket) q13.f406619b;
                if (webSocket != null) {
                    atomicBoolean.set(webSocket.send(str));
                }
            } else {
                boolean z13 = uVar instanceof u.c;
            }
            r rVar = this.f431947l;
            InterfaceC46925b interfaceC46925b = rVar.f431915c;
            if (interfaceC46925b != null) {
                atomicBoolean.get();
                interfaceC46925b.a(str);
            }
            boolean z14 = atomicBoolean.get();
            Y41.l<String, G0> lVar = rVar.f431914b;
            if (z14) {
                if (lVar != null) {
                    lVar.invoke("WS: --> ".concat(str));
                }
            } else if (lVar != null) {
                lVar.invoke("WS: send message: message wasn't enqueued: ".concat(str));
            }
            this.f431950o.countDown();
            return q13;
        }
    }

    /* compiled from: RxWebSocketImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Q;", "Lokhttp3/WebSocket;", "Lru/avito/websocket/u;", "Lru/avito/websocket/SocketWithState;", "it", "apply", "(Lkotlin/Q;)Lru/avito/websocket/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final h<T, R> f431951b = new h<>();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            return (u) ((Q) obj).f406620c;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(@Y61.k z zVar, @Y61.l Y41.l<? super String, G0> lVar, @Y61.l InterfaceC46925b interfaceC46925b, @Y61.l Y41.p<? super String, ? super Throwable, G0> pVar, @Y61.k H h12) {
        this.f431913a = zVar;
        this.f431914b = lVar;
        this.f431915c = interfaceC46925b;
        this.f431916d = pVar;
        com.jakewharton.rxrelay3.d dVarM0 = com.jakewharton.rxrelay3.b.N0(new Q(null, new u.c(0, null, null, 7, null))).M0();
        this.f431917e = dVarM0;
        this.f431918f = dVarM0.d0(h.f431951b);
        com.jakewharton.rxrelay3.d<Y41.l<Q<? extends WebSocket, ? extends u>, Q<WebSocket, u>>> dVarM = C31685o.m();
        this.f431919g = dVarM;
        this.f431920h = C31685o.m();
        this.f431921i = new d();
        dVarM.j0(h12).o0(new Q(null, new u.c(0, null, null, 7, null)), a.f431922b).x0(h12).K(new b()).t0(new c());
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final io.reactivex.rxjava3.core.z<u> M0() {
        return this.f431918f;
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final I<G0> a(@Y61.l final String str) {
        final AtomicReference atomicReference = new AtomicReference(null);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        return new C42006d(new M() { // from class: ru.avito.websocket.p
            @Override // io.reactivex.rxjava3.core.M
            public final void j(K k12) throws InterruptedException {
                G0 g02;
                r rVar = this;
                com.jakewharton.rxrelay3.d<Y41.l<Q<? extends WebSocket, ? extends u>, Q<WebSocket, u>>> dVar = rVar.f431919g;
                AtomicReference atomicReference2 = atomicReference;
                CountDownLatch countDownLatch2 = countDownLatch;
                dVar.accept(new r.f(str, countDownLatch2, atomicReference2, rVar));
                countDownLatch2.await();
                Throwable th2 = (Throwable) atomicReference2.get();
                if (th2 != null) {
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        th2 = cause;
                    }
                    k12.onError(th2);
                    g02 = G0.f406611a;
                } else {
                    g02 = null;
                }
                if (g02 == null) {
                    k12.onSuccess(G0.f406611a);
                }
            }
        });
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final <T> io.reactivex.rxjava3.core.z<T> b(@Y61.k A<? extends T> a12) {
        return com.avito.android.util.rx3.arrow.b.a(this.f431920h.d0(new e(a12, this)));
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final AbstractC41768a c(@Y61.k final String str) {
        return new C41826q(new InterfaceC43543a() { // from class: ru.avito.websocket.o
            @Override // l41.InterfaceC43543a
            public final void run() {
                this.f431903b.f431919g.accept(new s(1000, str));
            }
        });
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final y d() {
        y.f431963c.getClass();
        return y.f431964d;
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final I<Q<Boolean, String>> e(@Y61.k final String str) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        return new G(new Callable() { // from class: ru.avito.websocket.q
            @Override // java.util.concurrent.Callable
            public final Object call() throws InterruptedException {
                r rVar = this;
                com.jakewharton.rxrelay3.d<Y41.l<Q<? extends WebSocket, ? extends u>, Q<WebSocket, u>>> dVar = rVar.f431919g;
                String str2 = str;
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                CountDownLatch countDownLatch2 = countDownLatch;
                dVar.accept(new r.g(str2, countDownLatch2, atomicBoolean2, rVar));
                countDownLatch2.await();
                return new Q(Boolean.valueOf(atomicBoolean2.get()), null);
            }
        });
    }
}
