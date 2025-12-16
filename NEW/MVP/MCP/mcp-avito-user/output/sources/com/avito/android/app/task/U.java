package com.avito.android.app.task;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;

/* compiled from: LocalMessageSender.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/persistence/messenger/Q1;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/g;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class U<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28587q0 f91532b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91533c;

    public U(C28587q0 c28587q0, LocalMessage localMessage) {
        this.f91532b = c28587q0;
        this.f91533c = localMessage;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.avito.android.persistence.messenger.Q1 q12 = (com.avito.android.persistence.messenger.Q1) ((arrow.core.Y0) obj).c();
        com.avito.android.messenger.conversation.mvi.file_upload.T t12 = this.f91532b.f91701k;
        LocalMessage localMessage = this.f91533c;
        return t12.a(new AbstractC32094s0.a(localMessage.getLocalId(), localMessage.getChannelId(), com.avito.android.messenger.util.i.c(localMessage)), q12);
    }
}
