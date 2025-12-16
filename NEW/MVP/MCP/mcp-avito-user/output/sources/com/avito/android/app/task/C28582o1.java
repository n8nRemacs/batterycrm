package com.avito.android.app.task;

import Oq.InterfaceC14725a;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.MessageSendingException;
import com.avito.android.messenger.analytics.C31667x;
import com.avito.android.messenger.conversation.mvi.data.InterfaceC32024m;
import com.avito.android.remote.model.messenger.MessengerTimestamp;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.internal.operators.completable.C41828t;
import java.util.concurrent.TimeoutException;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import n41.InterfaceC44186c;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: PendingMessageHandler.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/app/task/o1;", "Lcom/avito/android/app/task/P0;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.app.task.o1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28582o1 implements P0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f91668a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger.w0 f91669b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC32024m f91670c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final T f91671d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f91672e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28601v0 f91673f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C31667x f91674g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f91675h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f91676i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.H f91677j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final C30277e1 f91678k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f91679l = C42727D.c(new C28555f1(this));

    public C28582o1(@Y61.k InterfaceC47842z interfaceC47842z, @Y61.k com.avito.android.messenger.w0 w0Var, @Y61.k InterfaceC32024m interfaceC32024m, @Y61.k T t12, @Y61.k com.avito.android.server_time.h hVar, @Y61.k InterfaceC28601v0 interfaceC28601v0, @Y61.k C31667x c31667x, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.analytics.H h12, @Y61.k C30277e1 c30277e1) {
        this.f91668a = interfaceC47842z;
        this.f91669b = w0Var;
        this.f91670c = interfaceC32024m;
        this.f91671d = t12;
        this.f91672e = hVar;
        this.f91673f = interfaceC28601v0;
        this.f91674g = c31667x;
        this.f91675h = interfaceC35745a5;
        this.f91676i = interfaceC28373a;
        this.f91677j = h12;
        this.f91678k = c30277e1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.app.task.P0
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.I a(@Y61.k io.reactivex.rxjava3.core.H h12) {
        io.reactivex.rxjava3.internal.operators.mixed.v vVar = new io.reactivex.rxjava3.internal.operators.mixed.v(this.f91669b.g().j0(h12).D(io.reactivex.rxjava3.internal.functions.a.f401991a), new C28558g1(this, h12));
        return new C41828t((vVar instanceof InterfaceC44186c ? ((InterfaceC44186c) vVar).f() : new io.reactivex.rxjava3.internal.operators.completable.Q(vVar)).o(3L)).l(new C28561h1(this)).r();
    }

    public final io.reactivex.rxjava3.internal.operators.mixed.v b(io.reactivex.rxjava3.core.z zVar, MessengerUserHashInfo messengerUserHashInfo, io.reactivex.rxjava3.core.H h12) {
        return new io.reactivex.rxjava3.internal.operators.mixed.v(zVar.x0(h12).j0(h12).D(W0.f91546b), new C28543b1(this, h12, messengerUserHashInfo));
    }

    public final void c(InterfaceC28598u0 interfaceC28598u0, LocalMessage localMessage, int i12, Throwable th2) {
        boolean z12 = th2 == null ? true : th2 instanceof TimeoutException;
        MessageSendingException messageSendingException = new MessageSendingException("Failed to send message", th2);
        MessageBody body = localMessage.getBody();
        InterfaceC14725a.C0808a.a(this.f91674g, messageSendingException, kotlin.collections.P0.g(new kotlin.Q("messageType", body instanceof MessageBody.Text.Regular ? "text" : body instanceof MessageBody.Text.Reaction ? "text-reaction" : body instanceof MessageBody.Link ? "link" : body instanceof MessageBody.Item ? "item" : body instanceof MessageBody.LocalImage ? "image" : body instanceof MessageBody.Location ? "location" : body instanceof MessageBody.Call ? "call" : localMessage.getBody().getClass().getName()), new kotlin.Q("attemptsMade", Integer.valueOf(i12)), new kotlin.Q("createdMs", Long.valueOf(MessengerTimestamp.INSTANCE.toMillis(localMessage.getCreated()))), new kotlin.Q("isExpired", Boolean.valueOf(z12))), 2);
        if (z12) {
            V2.f318762a.c("PendingMessageHandler", "Message expired: " + localMessage.getLocalId(), th2);
        } else {
            V2.f318762a.c("PendingMessageHandler", "Message sending failed: " + localMessage.getLocalId(), th2);
        }
        interfaceC28598u0.b(i12, false);
        this.f91676i.c(new com.avito.android.messenger.analytics.e0(localMessage.getChannelId(), localMessage.getLocalId()));
    }
}
