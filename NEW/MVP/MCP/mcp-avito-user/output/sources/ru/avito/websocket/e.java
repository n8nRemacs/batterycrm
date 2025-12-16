package ru.avito.websocket;

import arrow.core.X0;
import arrow.core.Y0;
import arrow.core.Z0;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.core.M;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import io.reactivex.rxjava3.internal.operators.single.G;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.jvm.internal.s0;
import okhttp3.Request;
import okhttp3.WebSocket;
import p91.InterfaceC46925b;
import ru.avito.websocket.u;

/* compiled from: LegacyRxWebSocketImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/websocket/e;", "Lru/avito/websocket/a;", "_common_rx-websocket_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class e implements InterfaceC47843a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final z f431878a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final Y41.l<String, G0> f431879b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final InterfaceC46925b f431880c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Y41.p<String, Throwable, G0> f431881d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Object f431882e = new Object();

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.d<String> f431883f = C31685o.m();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.b<u> f431884g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.i<u> f431885h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public volatile WebSocket f431886i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public volatile String f431887j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f431888k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.core.z<u> f431889l;

    /* compiled from: LegacyRxWebSocketImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "", "message", "Larrow/core/Y0;", "apply", "(Ljava/lang/String;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ A<T> f431890b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f431891c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(A<? extends T> a12, e eVar) {
            this.f431890b = a12;
            this.f431891c = eVar;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            String str = (String) obj;
            try {
                return Z0.b(this.f431890b.a(str));
            } catch (Exception e12) {
                Y41.p<String, Throwable, G0> pVar = this.f431891c.f431881d;
                if (pVar != null) {
                    pVar.invoke("Failed to parse message: ".concat(str), e12);
                }
                Y0.f56266a.getClass();
                return X0.f56264b;
            }
        }
    }

    /* compiled from: LegacyRxWebSocketImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/avito/websocket/u;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/O;", "Lkotlin/G0;", "apply", "(Lru/avito/websocket/u;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f431893c;

        public b(String str) {
            this.f431893c = str;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            u uVar = (u) obj;
            if (uVar instanceof u.a) {
                return I.q(G0.f406611a);
            }
            boolean z12 = uVar instanceof u.b;
            final e eVar = e.this;
            if (z12) {
                return eVar.f431885h.N(f.f431894b).S().n(g.f431895b);
            }
            if (!(uVar instanceof u.c)) {
                throw new NoWhenBranchMatchedException();
            }
            Y41.l<String, G0> lVar = eVar.f431879b;
            if (lVar != null) {
                lVar.invoke("WS: reconnect");
            }
            final String str = this.f431893c;
            return new C42006d(new M() { // from class: ru.avito.websocket.b
                @Override // io.reactivex.rxjava3.core.M
                public final void j(K k12) {
                    e eVar2 = eVar;
                    String str2 = str;
                    synchronized (eVar2.f431882e) {
                        eVar2.f();
                        eVar2.f431885h.onNext(new u.b());
                        eVar2.f431888k = (io.reactivex.rxjava3.internal.observers.m) eVar2.f431878a.a(new d(eVar2, k12), str2).x(new h(eVar2), new i(eVar2, k12));
                        G0 g02 = G0.f406611a;
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(@Y61.k z zVar, @Y61.l Y41.l<? super String, G0> lVar, @Y61.l InterfaceC46925b interfaceC46925b, @Y61.l Y41.p<? super String, ? super Throwable, G0> pVar) {
        this.f431878a = zVar;
        this.f431879b = lVar;
        this.f431880c = interfaceC46925b;
        this.f431881d = pVar;
        io.reactivex.rxjava3.subjects.b<u> bVarO0 = io.reactivex.rxjava3.subjects.b.O0(new u.c(0, null, null, 7, null));
        this.f431884g = bVarO0;
        io.reactivex.rxjava3.subjects.i<u> iVarM0 = bVarO0.M0();
        this.f431885h = iVarM0;
        this.f431889l = iVarM0;
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final io.reactivex.rxjava3.core.z<u> M0() {
        return this.f431889l;
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final I<G0> a(@Y61.l String str) {
        return this.f431885h.S().n(new b(str));
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final <T> io.reactivex.rxjava3.core.z<T> b(@Y61.k A<? extends T> a12) {
        return com.avito.android.util.rx3.arrow.b.a(this.f431883f.d0(new a(a12, this)));
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final AbstractC41768a c(@Y61.k String str) {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new c(this, str, 0));
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final y d() {
        Request originalRequest;
        y yVar;
        WebSocket webSocket = this.f431886i;
        if (webSocket != null && (originalRequest = webSocket.getOriginalRequest()) != null && (yVar = (y) originalRequest.tag(y.class)) != null) {
            return yVar;
        }
        y.f431963c.getClass();
        return y.f431964d;
    }

    @Override // ru.avito.websocket.InterfaceC47843a
    @Y61.k
    public final I<Q<Boolean, String>> e(@Y61.k String str) {
        return new G(new c(this, str, 1));
    }

    public final void f() {
        Y41.l<String, G0> lVar = this.f431879b;
        if (lVar != null) {
            lVar.invoke("WS: cancel previous websocket");
        }
        synchronized (this.f431882e) {
            try {
                WebSocket webSocket = this.f431886i;
                if (webSocket != null) {
                    webSocket.cancel();
                }
                this.f431886i = null;
                io.reactivex.rxjava3.internal.observers.m mVar = this.f431888k;
                if (mVar != null) {
                    DisposableHelper.a(mVar);
                    G0 g02 = G0.f406611a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
