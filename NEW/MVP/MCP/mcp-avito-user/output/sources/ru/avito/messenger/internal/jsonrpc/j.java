package ru.avito.messenger.internal.jsonrpc;

import Oq.InterfaceC14725a;
import Y41.l;
import io.reactivex.rxjava3.core.I;
import j91.C42223a;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import l41.o;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcCallException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcParsingException;

/* compiled from: WebSocketJsonRpcClient.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lj91/c;", "response", "Lio/reactivex/rxjava3/core/O;", "apply", "(Lj91/c;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class j<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j91.b f431750b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f431751c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l<com.google.gson.i, T> f431752d;

    /* JADX WARN: Multi-variable type inference failed */
    public j(j91.b bVar, f fVar, l<? super com.google.gson.i, ? extends T> lVar) {
        this.f431750b = bVar;
        this.f431751c = fVar;
        this.f431752d = lVar;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        j91.c cVar = (j91.c) obj;
        C42223a error = cVar.getError();
        j91.b bVar = this.f431750b;
        f fVar = this.f431751c;
        if (error != null) {
            MessengerJsonRpcCallException messengerJsonRpcCallException = new MessengerJsonRpcCallException(cVar.getError().getCode(), cVar.getError().getMessage(), null, cVar.getRequestId(), cVar.getRpcId(), bVar.getMethod(), 4, null);
            InterfaceC14725a.C0808a.a(fVar.f431735g, messengerJsonRpcCallException, P0.g(new Q("request", bVar), new Q("response", cVar)), 2);
            if (cVar.getError().getCode() == -32077) {
                fVar.f431736h.a();
            }
            return fVar.f431737i ? I.l(new j91.d(messengerJsonRpcCallException, null)) : I.l(messengerJsonRpcCallException);
        }
        try {
            return I.q(this.f431752d.invoke(cVar.getResult()));
        } catch (Throwable th2) {
            MessengerJsonRpcParsingException messengerJsonRpcParsingException = new MessengerJsonRpcParsingException(null, th2, cVar.getRequestId(), cVar.getRpcId(), bVar.getMethod(), 1, null);
            InterfaceC14725a.C0808a.a(fVar.f431735g, messengerJsonRpcParsingException, P0.g(new Q("request", bVar), new Q("response", cVar)), 2);
            return fVar.f431737i ? I.l(new j91.d(th2, messengerJsonRpcParsingException)) : I.l(th2);
        }
    }
}
