package ru.avito.messenger.internal.connection;

import Oq.InterfaceC14725a;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Collections;
import k91.AbstractC42548f;
import kotlin.Metadata;
import ru.avito.messenger.internal.connection.InterfaceC47751d;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcCallException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerSocketCallAwaitingConnectionTimeoutException;

/* compiled from: MessengerConnectionHolder.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/internal/connection/d$b;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/O;", "Lru/avito/websocket/y;", "apply", "(Lru/avito/messenger/internal/connection/d$b;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: ru.avito.messenger.internal.connection.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C47762o<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f431370b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C47754g f431371c;

    public C47762o(Throwable th2, C47754g c47754g) {
        this.f431370b = th2;
        this.f431371c = c47754g;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC47751d.b bVar = (InterfaceC47751d.b) obj;
        Throwable messengerJsonRpcCallException = null;
        InterfaceC47751d.b.c cVar = bVar instanceof InterfaceC47751d.b.c ? (InterfaceC47751d.b.c) bVar : null;
        AbstractC42548f abstractC42548f = cVar != null ? cVar.f431298b : null;
        if (abstractC42548f instanceof AbstractC42548f.e) {
            AbstractC42548f.e eVar = (AbstractC42548f.e) abstractC42548f;
            messengerJsonRpcCallException = new MessengerJsonRpcCallException(eVar.f406144b, null, eVar.f406145c, null, null, null, 56, null);
        } else if (abstractC42548f instanceof AbstractC42548f.d) {
            messengerJsonRpcCallException = ((AbstractC42548f.d) abstractC42548f).f406142b;
        } else if (abstractC42548f instanceof AbstractC42548f.C11606f) {
            AbstractC42548f.C11606f c11606f = (AbstractC42548f.C11606f) abstractC42548f;
            if (c11606f.f406146b != null || c11606f.f406148d != null) {
                Integer num = c11606f.f406146b;
                messengerJsonRpcCallException = new MessengerJsonRpcCallException(num != null ? num.intValue() : -1, null, c11606f.f406148d, null, null, null, 56, null);
            }
        }
        if (messengerJsonRpcCallException == null) {
            messengerJsonRpcCallException = this.f431370b;
        }
        MessengerSocketCallAwaitingConnectionTimeoutException messengerSocketCallAwaitingConnectionTimeoutException = new MessengerSocketCallAwaitingConnectionTimeoutException(messengerJsonRpcCallException);
        C47754g c47754g = this.f431371c;
        InterfaceC14725a.C0808a.a(c47754g.f431316k, messengerSocketCallAwaitingConnectionTimeoutException, Collections.singletonMap("connectionHolderState", bVar), 2);
        return c47754g.f431322q ? io.reactivex.rxjava3.core.I.l(new j91.d(messengerJsonRpcCallException, messengerSocketCallAwaitingConnectionTimeoutException)) : io.reactivex.rxjava3.core.I.l(messengerJsonRpcCallException);
    }
}
