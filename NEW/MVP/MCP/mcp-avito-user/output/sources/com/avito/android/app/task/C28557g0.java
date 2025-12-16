package com.avito.android.app.task;

import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32095t;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.Quote;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: LocalMessageSender.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/file_upload/t$b;", "result", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/file_upload/t$b;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.g0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28557g0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28587q0 f91599b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91600c;

    public C28557g0(C28587q0 c28587q0, LocalMessage localMessage) {
        this.f91599b = c28587q0;
        this.f91600c = localMessage;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC32095t.b bVar = (InterfaceC32095t.b) obj;
        boolean z12 = bVar instanceof InterfaceC32095t.b.C5649b;
        C28587q0 c28587q0 = this.f91599b;
        LocalMessage localMessage = this.f91600c;
        if (z12) {
            InterfaceC47842z interfaceC47842z = c28587q0.f91691a;
            String channelId = localMessage.getChannelId();
            InterfaceC32095t.b.C5649b c5649b = (InterfaceC32095t.b.C5649b) bVar;
            String localId = localMessage.getLocalId();
            Quote quote = localMessage.getQuote();
            String id2 = quote != null ? quote.getId() : null;
            Quote quote2 = localMessage.getQuote();
            return interfaceC47842z.sendVoiceMessage(channelId, c5649b.f191229a, c5649b.f191230b, localId, id2, quote2 != null ? quote2.getChunkIndex() : null);
        }
        if (!(bVar instanceof InterfaceC32095t.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        Throwable th2 = ((InterfaceC32095t.b.a) bVar).f191228a;
        if (th2 != null) {
            c28587q0.f91707q.c(new NonFatalErrorEvent("VoiceFileUploadResult Failed", th2, null, new NonFatalErrorEvent.a.b(C28587q0.class, "Voice upload flow finished with error", 0, 4, null), 4, null));
        }
        return io.reactivex.rxjava3.core.I.l(new NoRetryException("Voice message upload failed userId=" + localMessage.getUserId() + " localId=" + localMessage.getLocalId() + " channelId=" + localMessage.getChannelId(), th2));
    }
}
