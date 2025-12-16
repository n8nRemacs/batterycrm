package com.avito.android.app.task;

import com.avito.android.jsonrpc.client.JsonRpcCallException;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import io.reactivex.rxjava3.core.AbstractC41768a;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import ru.avito.messenger.internal.apico.MessengerApicoSendTextMessageException;

/* compiled from: LocalMessageSender.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "error", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class X<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91553b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C28587q0 f91554c;

    public X(C28587q0 c28587q0, LocalMessage localMessage) {
        this.f91553b = localMessage;
        this.f91554c = c28587q0;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        int i12;
        int code;
        Throwable th2 = (Throwable) obj;
        if (th2 instanceof MessengerApicoSendTextMessageException) {
            MessengerApicoSendTextMessageException messengerApicoSendTextMessageException = (MessengerApicoSendTextMessageException) th2;
            ApiError apiError = messengerApicoSendTextMessageException.f318522b;
            return ((apiError instanceof ApiError.InternalError) || ((apiError instanceof ApiError.HttpError) && 500 <= (code = ((ApiError.HttpError) apiError).f253392b.getCode()) && code < 600)) ? io.reactivex.rxjava3.core.I.l(th2) : io.reactivex.rxjava3.core.I.l(new NoRetryException(messengerApicoSendTextMessageException.getMessage(), th2));
        }
        if ((th2 instanceof JsonRpcCallException) && (i12 = ((JsonRpcCallException) th2).f174716b) != -32603 && i12 != -32249 && i12 != -32054 && i12 != -32050) {
            String message = th2.getMessage();
            return io.reactivex.rxjava3.core.I.l(new NoRetryException(message != null ? message : "", th2));
        }
        if (!(th2 instanceof TimeoutException)) {
            return io.reactivex.rxjava3.core.I.l(th2);
        }
        LocalMessage localMessage = this.f91553b;
        MessageBody body = localMessage.getBody();
        boolean z12 = body instanceof MessageBody.File;
        C28587q0 c28587q0 = this.f91554c;
        if (z12) {
            AbstractC41768a abstractC41768aO = c28587q0.f91704n.Z(localMessage.getChannelId(), localMessage.getLocalId(), com.avito.android.messenger.util.i.c(localMessage)).o(new U(c28587q0, localMessage));
            String message2 = th2.getMessage();
            return abstractC41768aO.h(io.reactivex.rxjava3.core.I.l(new NoRetryException(message2 != null ? message2 : "", th2)));
        }
        if (body instanceof MessageBody.Voice) {
            AbstractC41768a abstractC41768aO2 = c28587q0.f91704n.Z(localMessage.getChannelId(), localMessage.getLocalId(), com.avito.android.messenger.util.i.c(localMessage)).o(new V(c28587q0, localMessage));
            String message3 = th2.getMessage();
            return abstractC41768aO2.h(io.reactivex.rxjava3.core.I.l(new NoRetryException(message3 != null ? message3 : "", th2)));
        }
        if (!(body instanceof MessageBody.Video)) {
            return io.reactivex.rxjava3.core.I.l(th2);
        }
        AbstractC41768a abstractC41768aO3 = c28587q0.f91704n.Z(localMessage.getChannelId(), localMessage.getLocalId(), com.avito.android.messenger.util.i.c(localMessage)).o(new W(c28587q0, localMessage));
        String message4 = th2.getMessage();
        return abstractC41768aO3.h(io.reactivex.rxjava3.core.I.l(new NoRetryException(message4 != null ? message4 : "", th2)));
    }
}
