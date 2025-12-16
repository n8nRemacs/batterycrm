package ru.avito.messenger.internal.jsonrpc;

import Oq.InterfaceC14725a;
import Y41.l;
import Y61.k;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41984r1;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import l41.o;
import m91.InterfaceC43936c;
import ru.avito.messenger.H0;
import ru.avito.messenger.api.entity.MessengerResponse;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcCallException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcSerializationException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerSocketResponseTimeoutException;
import ru.avito.websocket.A;
import ru.avito.websocket.InterfaceC47843a;
import ru.avito.websocket.u;

/* compiled from: WebSocketJsonRpcClient.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/internal/jsonrpc/f;", "Lcom/avito/android/jsonrpc/client/b;", "Lcom/google/gson/i;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class f implements com.avito.android.jsonrpc.client.b<com.google.gson.i> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC47843a f431729a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A<MessengerResponse> f431730b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Gson f431731c;

    /* renamed from: d, reason: collision with root package name */
    public final long f431732d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC43936c f431733e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f431734f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC14725a f431735g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final H0 f431736h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f431737i;

    /* compiled from: WebSocketJsonRpcClient.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\f\u0012\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00060\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "R", "response", "Lkotlin/Q;", "", "", "Lru/avito/websocket/RequestIdHeader;", "<anonymous parameter 1>", "apply", "(Ljava/lang/Object;Lkotlin/Q;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T1, T2, R> implements l41.c {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T1, T2, R> f431738b = new a<>();

        @Override // l41.c
        public final Object apply(Object obj, Object obj2) {
            return obj;
        }
    }

    /* compiled from: WebSocketJsonRpcClient.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "R", "", "error", "Lio/reactivex/rxjava3/core/O;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f431739b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.jsonrpc.client.e f431740c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicReference<String> f431741d;

        public b(com.avito.android.jsonrpc.client.e eVar, AtomicReference atomicReference, f fVar) {
            this.f431739b = fVar;
            this.f431740c = eVar;
            this.f431741d = atomicReference;
        }

        @Override // l41.o
        public final Object apply(Object obj) {
            Throwable th2 = (Throwable) obj;
            if (th2 instanceof j91.d) {
                return I.l(th2);
            }
            if (!(th2 instanceof TimeoutException)) {
                return I.l(new j91.d(th2, null));
            }
            MessengerSocketResponseTimeoutException messengerSocketResponseTimeoutException = new MessengerSocketResponseTimeoutException(th2);
            InterfaceC14725a interfaceC14725a = this.f431739b.f431735g;
            LinkedHashMap linkedHashMapJ = P0.j(new Q("request", this.f431740c));
            String str = this.f431741d.get();
            if (str != null) {
                linkedHashMapJ.put("rpcId", str);
            }
            G0 g02 = G0.f406611a;
            InterfaceC14725a.C0808a.a(interfaceC14725a, messengerSocketResponseTimeoutException, linkedHashMapJ, 2);
            return I.l(new j91.d(th2, messengerSocketResponseTimeoutException));
        }
    }

    /* compiled from: WebSocketJsonRpcClient.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "R", "", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f431742b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.jsonrpc.client.e f431743c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AtomicReference<String> f431744d;

        public c(com.avito.android.jsonrpc.client.e eVar, AtomicReference atomicReference, f fVar) {
            this.f431742b = fVar;
            this.f431743c = eVar;
            this.f431744d = atomicReference;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            if (th2 instanceof TimeoutException) {
                InterfaceC14725a interfaceC14725a = this.f431742b.f431735g;
                MessengerSocketResponseTimeoutException messengerSocketResponseTimeoutException = new MessengerSocketResponseTimeoutException(th2);
                LinkedHashMap linkedHashMapJ = P0.j(new Q("request", this.f431743c));
                String str = this.f431744d.get();
                if (str != null) {
                    linkedHashMapJ.put("rpcId", str);
                }
                G0 g02 = G0.f406611a;
                InterfaceC14725a.C0808a.a(interfaceC14725a, messengerSocketResponseTimeoutException, linkedHashMapJ, 2);
            }
        }
    }

    /* compiled from: WebSocketJsonRpcClient.kt */
    @s0
    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\n\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00050\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "R", "Lkotlin/Q;", "", "", "Lru/avito/websocket/RequestIdHeader;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lkotlin/Q;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AtomicReference<String> f431745b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.jsonrpc.client.e f431746c;

        public d(com.avito.android.jsonrpc.client.e eVar, AtomicReference atomicReference, f fVar) {
            this.f431745b = atomicReference;
            this.f431746c = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.o
        public final Object apply(Object obj) {
            String str;
            Q q12 = (Q) obj;
            Boolean bool = (Boolean) q12.f406619b;
            boolean zBooleanValue = bool.booleanValue();
            String str2 = (String) q12.f406620c;
            com.avito.android.jsonrpc.client.e eVar = this.f431746c;
            long j12 = eVar.f174730a;
            if (str2 != null) {
                str = str2 + '#' + j12;
            } else {
                str = null;
            }
            AtomicReference<String> atomicReference = this.f431745b;
            atomicReference.set(str);
            return zBooleanValue ? I.q(new Q(bool, str2)) : I.l(new MessengerJsonRpcCallException(-32300, "Message wasn't enqueued", null, String.valueOf(j12), atomicReference.get(), eVar.f174731b, 4, null));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k InterfaceC47843a interfaceC47843a, @k A<? extends MessengerResponse> a12, @k Gson gson, long j12, @k InterfaceC43936c interfaceC43936c, @k InterfaceC35745a5 interfaceC35745a5, @k InterfaceC14725a interfaceC14725a, @k H0 h02, boolean z12) {
        this.f431729a = interfaceC47843a;
        this.f431730b = a12;
        this.f431731c = gson;
        this.f431732d = j12;
        this.f431733e = interfaceC43936c;
        this.f431734f = interfaceC35745a5;
        this.f431735g = interfaceC14725a;
        this.f431736h = h02;
        this.f431737i = z12;
    }

    @Override // com.avito.android.jsonrpc.client.b
    @k
    public final <R> I<R> a(@k com.avito.android.jsonrpc.client.e eVar, @k l<? super com.google.gson.i, ? extends R> lVar) {
        String strL;
        long j12 = eVar.f174730a;
        String str = eVar.f174731b;
        j91.b bVar = new j91.b(j12, str, eVar.f174732c);
        Gson gson = this.f431731c;
        boolean z12 = this.f431737i;
        if (z12) {
            try {
                strL = gson.l(bVar);
            } catch (Throwable th2) {
                StringBuilder sb2 = new StringBuilder("Error (");
                String strK = AK.c.k("method=", str, ", ");
                if (strK == null) {
                    strK = "";
                }
                sb2.append(strK);
                sb2.append(") ");
                sb2.append(th2.getClass().getName());
                sb2.append(':');
                sb2.append(th2.getMessage());
                return I.l(new j91.d(th2, new MessengerJsonRpcSerializationException(sb2.toString(), th2)));
            }
        } else {
            strL = gson.l(bVar);
        }
        this.f431733e.a("Messenger", "JsonRpc request = " + eVar, null);
        AtomicReference atomicReference = new AtomicReference(null);
        InterfaceC47843a interfaceC47843a = this.f431729a;
        C42026y c42026yN = interfaceC47843a.e(strL).n(new d(eVar, atomicReference, this));
        z zVarN = new C41984r1(interfaceC47843a.b(this.f431730b).k0(j91.c.class).K(new g(this)).A0(interfaceC47843a.M0().q0(1L).k0(u.c.class).K(new h(this))), z.M(new MessengerJsonRpcCallException(-32300, "WS closed or failed", null, String.valueOf(bVar.getId()), null, null, 52, null))).N(new i(bVar));
        long j13 = this.f431732d;
        if (j13 > 0) {
            zVarN = zVarN.E0(j13, TimeUnit.MILLISECONDS, null, this.f431734f.c());
        }
        I iG2 = I.G(zVarN.S().n(new j(bVar, this, lVar)), c42026yN, a.f431738b);
        return z12 ? iG2.t(new b(eVar, atomicReference, this)) : iG2.i(new c(eVar, atomicReference, this));
    }
}
