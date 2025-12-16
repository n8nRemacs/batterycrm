package com.avito.android.messenger.conversation.create;

import arrow.core.Y0;
import arrow.core.Z0;
import com.avito.android.messenger.channels.mvi.data.M;
import com.avito.android.messenger.conversation.ChannelActivityArguments;
import com.avito.android.messenger.conversation.create.c;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.Channel;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: CreateChannelInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/create/c$a;", "result", "apply", "(Lcom/avito/android/messenger/conversation/create/c$a;)Lcom/avito/android/messenger/conversation/create/c$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class h<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f189574b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessengerUserHashInfo f189575c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ChannelActivityArguments.Create f189576d;

    public h(l lVar, MessengerUserHashInfo messengerUserHashInfo, ChannelActivityArguments.Create create) {
        this.f189574b = lVar;
        this.f189575c = messengerUserHashInfo;
        this.f189576d = create;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        T next;
        c.a aVar = (c.a) obj;
        String str = ((ChannelActivityArguments.Create.ByOpponentUser) this.f189576d).f188891c;
        if (str != null && (aVar instanceof c.a.b)) {
            l lVar = this.f189574b;
            M m12 = lVar.f189581c;
            String str2 = ((c.a.b) aVar).f189525a;
            MessengerUserHashInfo messengerUserHashInfo = this.f189575c;
            Channel channel = (Channel) Z0.a((Y0) m12.b(str2, messengerUserHashInfo).d(), k.f189578l);
            String id2 = null;
            List<User> users = channel != null ? channel.getUsers() : null;
            if (users != null) {
                Iterator<T> it = users.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = (T) null;
                        break;
                    }
                    next = it.next();
                    if (!L.f(((User) next).getId(), messengerUserHashInfo.f430682d)) {
                        break;
                    }
                }
                User user = next;
                if (user != null) {
                    id2 = user.getId();
                }
            }
            if (id2 == null) {
                id2 = "";
            }
            lVar.f189583e.c(messengerUserHashInfo, str2, id2, str).i();
        }
        return aVar;
    }
}
