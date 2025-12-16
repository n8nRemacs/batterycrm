package ru.avito.messenger;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.ApiException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.Quote;
import ru.avito.messenger.api.entity.body.MessageBody;
import ru.avito.messenger.generated.api.get_user_visible_messages.Message;
import ru.avito.messenger.generated.api.get_user_visible_messages.QuoteNullable;

/* compiled from: MessengerClientFacade.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Ld91/i;", "response", "Lio/reactivex/rxjava3/core/O;", "", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lcom/avito/android/remote/model/TypedResult;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes9.dex */
final class N<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f430686b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f430687c;

    public N(D d12, MessengerUserHashInfo messengerUserHashInfo) {
        this.f430686b = d12;
        this.f430687c = messengerUserHashInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l41.o
    public final Object apply(Object obj) throws h91.k {
        ChatMessage.PartialChannel partialChannel;
        Quote quote;
        Object next;
        TypedResult typedResult = (TypedResult) obj;
        List list = null;
        if (!(typedResult instanceof TypedResult.Success)) {
            if (typedResult instanceof TypedResult.Error) {
                return io.reactivex.rxjava3.core.I.l(new ApiException(((TypedResult.Error) typedResult).getError(), null, 2, null));
            }
            throw new NoWhenBranchMatchedException();
        }
        h91.h hVar = this.f430686b.f430608f.get();
        d91.i iVar = (d91.i) ((TypedResult.Success) typedResult).getResult();
        String str = this.f430687c.f430682d;
        hVar.getClass();
        List<Message> listA = iVar.a();
        ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            Message message = (Message) it.next();
            String id2 = message.getId();
            String channelId = message.getChannelId();
            MessageBody messageBodyI = hVar.i(message.getBody(), message);
            String authorId = message.getAuthorId();
            long j12 = 100;
            long createdAt = message.getCreatedAt() / j12;
            boolean z12 = message.getReadAt() != null && message.getReadAt().longValue() > 0;
            Long readAt = message.getReadAt();
            Object objValueOf = readAt != null ? Long.valueOf(readAt.longValue() / j12) : list;
            Iterator<T> it2 = it;
            ChatMessage.PartialChannel partialChannel2 = new ChatMessage.PartialChannel(message.getUpdatedAt() / j12, list);
            d91.G preview = message.getPreview();
            Object preview2 = preview != null ? new ChatMessage.Preview(preview.getText()) : list;
            d91.F platformSupport = message.getPlatformSupport();
            Object objD = platformSupport != null ? hVar.d(platformSupport) : list;
            QuoteNullable quote2 = message.getQuote();
            if (quote2 != null) {
                Iterator it3 = ((AbstractC42738c) Message.Type.f431073d).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        partialChannel = partialChannel2;
                        next = null;
                        break;
                    }
                    next = it3.next();
                    partialChannel = partialChannel2;
                    if (((Message.Type) next).f431074b == quote2.getType().f431095b) {
                        break;
                    }
                    partialChannel2 = partialChannel;
                }
                Message.Type type = (Message.Type) next;
                if (type == null) {
                    throw new h91.k("Unknown quote type: " + quote2.getType().f431095b);
                }
                quote = new Quote(quote2.getId(), hVar.i(quote2.getBody(), new Message(quote2.getAuthorId(), quote2.getBody(), "", null, quote2.getCreatedAt() / j12, null, quote2.getId(), null, false, null, null, null, null, null, type, 0L)), quote2.getCreatedAt() / j12, quote2.getAuthorId(), Integer.valueOf((int) quote2.getChunkIndex()));
            } else {
                partialChannel = partialChannel2;
                quote = null;
            }
            h91.h hVar2 = hVar;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(new ChatMessage(id2, str, channelId, messageBodyI, authorId, createdAt, z12, objValueOf, partialChannel, preview2, objD, quote, null));
            it = it2;
            arrayList = arrayList2;
            hVar = hVar2;
            list = null;
        }
        return io.reactivex.rxjava3.core.I.q(arrayList);
    }
}
