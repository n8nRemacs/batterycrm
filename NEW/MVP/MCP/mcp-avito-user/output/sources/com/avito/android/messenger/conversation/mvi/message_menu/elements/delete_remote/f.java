package com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote;

import com.avito.android.messenger.conversation.mvi.data.g0;
import com.avito.android.messenger.util.i;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import kotlin.Metadata;
import l41.o;
import ru.avito.messenger.MessengerUserHashInfo;
import ru.avito.messenger.api.entity.ChatMessage;

/* compiled from: DeleteRemoteMessageInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/avito/messenger/api/entity/ChatMessage;", "newMessage", "Lio/reactivex/rxjava3/core/g;", "apply", "(Lru/avito/messenger/api/entity/ChatMessage;)Lio/reactivex/rxjava3/core/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class f<T, R> implements o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f191690b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f191691c;

    public f(g gVar, MessengerUserHashInfo messengerUserHashInfo) {
        this.f191690b = gVar;
        this.f191691c = messengerUserHashInfo;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        g gVar = this.f191690b;
        LocalMessage localMessageF = gVar.f191693b.f(this.f191691c, (ChatMessage) obj);
        g0 g0Var = gVar.f191694c;
        return g0Var.f0(localMessageF).g(g0Var.h(localMessageF.getChannelId(), localMessageF.getLocalId(), i.c(localMessageF)));
    }
}
