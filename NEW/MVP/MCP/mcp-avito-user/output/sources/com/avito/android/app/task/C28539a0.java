package com.avito.android.app.task;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: LocalMessageSender.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "chatMessage", "Lru/avito/messenger/api/entity/ChatMessage;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.app.task.a0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28539a0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28587q0 f91567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91568c;

    public C28539a0(C28587q0 c28587q0, LocalMessage localMessage) {
        this.f91567b = c28587q0;
        this.f91568c = localMessage;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        return this.f91567b.f91698h.f(com.avito.android.messenger.util.i.c(this.f91568c), (ChatMessage) obj);
    }
}
