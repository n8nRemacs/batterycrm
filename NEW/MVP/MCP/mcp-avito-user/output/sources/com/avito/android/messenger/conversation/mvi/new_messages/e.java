package com.avito.android.messenger.conversation.mvi.new_messages;

import com.avito.android.messenger.conversation.mvi.new_messages.g;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: NewMessagesPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/remote/model/messenger/message/LocalMessage;", "unreadMessages", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class e<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f193774b;

    public e(g gVar) {
        this.f193774b = gVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        List list = (List) obj;
        Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            MessageBody body = ((LocalMessage) it.next()).getBody();
            size += body instanceof MessageBody.SystemMessageBody.Platform ? ((MessageBody.SystemMessageBody.Platform) body).getChunks().size() : 1;
        }
        g gVar = this.f193774b;
        gVar.le().s(new g.f(size, new d(gVar), gVar.f193782b0, list));
    }
}
