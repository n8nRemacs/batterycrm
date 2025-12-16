package com.avito.android.app.task;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;

/* compiled from: LocalMessageSender.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "exception", "Lio/reactivex/rxjava3/core/O;", "Lru/avito/messenger/api/entity/ChatMessage;", "apply", "(Ljava/lang/Throwable;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.c0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28545c0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91577b;

    public C28545c0(LocalMessage localMessage) {
        this.f91577b = localMessage;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        StringBuilder sb2 = new StringBuilder("Video message upload failed userId=");
        LocalMessage localMessage = this.f91577b;
        sb2.append(localMessage.getUserId());
        sb2.append(" localId=");
        sb2.append(localMessage.getLocalId());
        sb2.append(" channelId=");
        sb2.append(localMessage.getChannelId());
        return io.reactivex.rxjava3.core.I.l(new NoRetryException(sb2.toString(), (Throwable) obj));
    }
}
