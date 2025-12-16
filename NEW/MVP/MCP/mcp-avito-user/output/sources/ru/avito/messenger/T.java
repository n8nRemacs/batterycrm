package ru.avito.messenger;

import com.avito.android.arch.mvi.utils.c;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.PlatformSupport;
import h91.n;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.Quote;
import ru.avito.messenger.api.entity.body.MessageBody;
import ru.avito.messenger.generated.api.send_text_message.DomainError;
import ru.avito.messenger.generated.api.send_text_message.Message;
import ru.avito.messenger.generated.api.send_text_message.QuoteNullable;
import ru.avito.messenger.internal.apico.MessengerApicoSendTextMessageException;
import ru.avito.messenger.internal.entity.jsonrpc.MessengerJsonRpcCallException;

/* compiled from: MessengerClientFacade.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lg91/I;", "response", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class T<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f430705b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f430706c;

    public T(D d12, MessengerUserHashInfo messengerUserHashInfo) {
        this.f430705b = d12;
        this.f430706c = messengerUserHashInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) throws h91.k {
        g91.I i12;
        ChatMessage chatMessage;
        Object messengerApicoSendTextMessageException;
        com.avito.android.arch.mvi.utils.c bVar;
        int i13;
        ChatMessage.PartialChannel partialChannel;
        Quote quote;
        Object obj2;
        TypedResult typedResult = (TypedResult) obj;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return io.reactivex.rxjava3.core.I.l(new MessengerApicoSendTextMessageException(((TypedResult.Error) typedResult).getError()));
            }
            throw new NoWhenBranchMatchedException();
        }
        h91.n nVar = this.f430705b.f430611i.get();
        g91.I i14 = (g91.I) ((TypedResult.Success) typedResult).getResult();
        String str = this.f430706c.f430682d;
        nVar.getClass();
        Message message = i14.getMessage();
        if (message != null) {
            String id2 = message.getId();
            String channelId = message.getChannelId();
            MessageBody messageBodyI = nVar.i(message.getBody(), message);
            String authorId = message.getAuthorId();
            long j12 = 100;
            long createdAt = message.getCreatedAt() / j12;
            boolean z12 = message.getReadAt() != null && message.getReadAt().longValue() > 0;
            Long readAt = message.getReadAt();
            i12 = i14;
            Long lValueOf = readAt != null ? Long.valueOf(readAt.longValue() / j12) : null;
            ChatMessage.PartialChannel partialChannel2 = new ChatMessage.PartialChannel(message.getUpdatedAt() / j12, null);
            g91.F preview = message.getPreview();
            ChatMessage.Preview preview2 = preview != null ? new ChatMessage.Preview(preview.getText()) : null;
            g91.E platformSupport = message.getPlatformSupport();
            PlatformSupport platformSupportD = platformSupport != null ? nVar.d(platformSupport) : null;
            QuoteNullable quote2 = message.getQuote();
            if (quote2 != null) {
                Iterator it = ((AbstractC42738c) Message.Type.f431149d).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        partialChannel = partialChannel2;
                        obj2 = null;
                        break;
                    }
                    Object next = it.next();
                    partialChannel = partialChannel2;
                    if (((Message.Type) next).f431150b == quote2.getType().f431171b) {
                        obj2 = next;
                        break;
                    }
                    partialChannel2 = partialChannel;
                }
                Message.Type type = (Message.Type) obj2;
                if (type == null) {
                    throw new h91.k("Unknown quote type: " + quote2.getType().f431171b);
                }
                quote = new Quote(quote2.getId(), nVar.i(quote2.getBody(), new Message(quote2.getAuthorId(), quote2.getBody(), "", null, quote2.getCreatedAt() / j12, null, quote2.getId(), null, false, null, null, null, null, null, type, 0L)), quote2.getCreatedAt() / j12, quote2.getAuthorId(), Integer.valueOf((int) quote2.getChunkIndex()));
            } else {
                partialChannel = partialChannel2;
                quote = null;
            }
            chatMessage = new ChatMessage(id2, str, channelId, messageBodyI, authorId, createdAt, z12, lValueOf, partialChannel, preview2, platformSupportD, quote, null);
        } else {
            i12 = i14;
            chatMessage = null;
        }
        if (chatMessage != null) {
            bVar = new c.C2712c(chatMessage);
        } else {
            DomainError error = i12.getError();
            if (error != null) {
                switch (n.a.f397073a[error.getCode().ordinal()]) {
                    case 1:
                        i13 = -32600;
                        break;
                    case 2:
                        i13 = -32043;
                        break;
                    case 3:
                        i13 = -32044;
                        break;
                    case 4:
                        i13 = -32060;
                        break;
                    case 5:
                        i13 = -32042;
                        break;
                    case 6:
                        i13 = -32045;
                        break;
                    case 7:
                        i13 = -32046;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                messengerApicoSendTextMessageException = new MessengerJsonRpcCallException(i13, error.getMessage(), null, null, null, null, 60, null);
            } else {
                messengerApicoSendTextMessageException = new MessengerApicoSendTextMessageException(new ApiError.UnknownError("Empty (null) message in response", null, null, 6, null));
            }
            bVar = new c.b(messengerApicoSendTextMessageException);
        }
        if (bVar instanceof c.C2712c) {
            return io.reactivex.rxjava3.core.I.q((ChatMessage) ((c.C2712c) bVar).f92028b);
        }
        if (bVar instanceof c.b) {
            return io.reactivex.rxjava3.core.I.l((Throwable) ((c.b) bVar).f92027b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
