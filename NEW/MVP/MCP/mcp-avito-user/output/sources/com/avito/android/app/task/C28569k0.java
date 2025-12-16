package com.avito.android.app.task;

import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32098u0;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.Quote;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: LocalMessageSender.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/u0$a;", "result", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/file_upload/u0$a;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.k0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28569k0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28587q0 f91639b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91640c;

    public C28569k0(C28587q0 c28587q0, LocalMessage localMessage) {
        this.f91639b = c28587q0;
        this.f91640c = localMessage;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC32098u0.a aVar = (InterfaceC32098u0.a) obj;
        boolean z12 = aVar instanceof InterfaceC32098u0.a.b;
        LocalMessage localMessage = this.f91640c;
        if (z12) {
            InterfaceC47842z interfaceC47842z = this.f91639b.f91691a;
            String channelId = localMessage.getChannelId();
            InterfaceC32098u0.a.b bVar = (InterfaceC32098u0.a.b) aVar;
            String localId = localMessage.getLocalId();
            Quote quote = localMessage.getQuote();
            String id2 = quote != null ? quote.getId() : null;
            Quote quote2 = localMessage.getQuote();
            return interfaceC47842z.sendVideoMessage(channelId, bVar.f191243a, bVar.f191244b, localId, id2, quote2 != null ? quote2.getChunkIndex() : null);
        }
        if (!(aVar instanceof InterfaceC32098u0.a.C5650a)) {
            throw new NoWhenBranchMatchedException();
        }
        return io.reactivex.rxjava3.core.I.l(new NoRetryException("Video message upload failed userId=" + localMessage.getUserId() + " localId=" + localMessage.getLocalId() + " channelId=" + localMessage.getChannelId(), ((InterfaceC32098u0.a.C5650a) aVar).f191242a));
    }
}
