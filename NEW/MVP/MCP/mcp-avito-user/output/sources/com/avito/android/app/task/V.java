package com.avito.android.app.task;

import com.avito.android.messenger.conversation.mvi.file_upload.AbstractC32094s0;
import com.avito.android.messenger.conversation.mvi.file_upload.InterfaceC32079k0;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;

/* compiled from: LocalMessageSender.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/persistence/messenger/Q1;", "<name for destructuring parameter 0>", "Lio/reactivex/rxjava3/core/g;", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class V<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28587q0 f91539b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91540c;

    public V(C28587q0 c28587q0, LocalMessage localMessage) {
        this.f91539b = c28587q0;
        this.f91540c = localMessage;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        com.avito.android.persistence.messenger.Q1 q12 = (com.avito.android.persistence.messenger.Q1) ((arrow.core.Y0) obj).c();
        InterfaceC32079k0 interfaceC32079k0 = this.f91539b.f91702l;
        LocalMessage localMessage = this.f91540c;
        return interfaceC32079k0.a(new AbstractC32094s0.a(localMessage.getLocalId(), localMessage.getChannelId(), com.avito.android.messenger.util.i.c(localMessage)), q12, false);
    }
}
