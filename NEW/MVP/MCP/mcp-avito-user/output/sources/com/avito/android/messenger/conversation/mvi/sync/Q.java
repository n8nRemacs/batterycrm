package com.avito.android.messenger.conversation.mvi.sync;

import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: MessageSyncAgent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u0012\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00010\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Larrow/core/Y0;", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "option", "Lio/reactivex/rxjava3/core/E;", "kotlin.jvm.PlatformType", "apply", "(Larrow/core/Y0;)Lio/reactivex/rxjava3/core/E;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class Q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f194683b;

    public Q(LocalMessage localMessage) {
        this.f194683b = localMessage;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        LocalMessage localMessage = (LocalMessage) ((arrow.core.Y0) obj).c();
        LocalMessage localMessage2 = this.f194683b;
        if (localMessage == null) {
            return io.reactivex.rxjava3.core.z.c0(localMessage2);
        }
        V2.f318762a.c("MessageSyncAgent", "New message ignored: \n\tchannelId=" + localMessage2.getChannelId() + ", \n\tremoteId=" + localMessage2.getRemoteId() + ", \n\tlocalId=" + localMessage2.getLocalId() + " \nConflict with local message: remoteId=" + localMessage.getRemoteId(), null);
        return io.reactivex.rxjava3.internal.operators.observable.U.f403867b;
    }
}
