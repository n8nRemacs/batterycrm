package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", VoiceInfo.STATE, "", "", "apply", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.context.q, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32003q<T, R> implements l41.o {
    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC31987a.C5631a c5631a = (InterfaceC31987a.C5631a) obj;
        com.avito.android.mvi.b<Channel> bVar = c5631a.f190237b;
        b.d dVar = bVar instanceof b.d ? (b.d) bVar : null;
        Channel channel = dVar != null ? dVar.f207035a : (T) null;
        List<User> users = channel != null ? channel.getUsers() : null;
        if (users == null) {
            users = C42784z0.f406748b;
        }
        List<User> list = users;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((User) it.next()).getId());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!kotlin.jvm.internal.L.f((String) next, c5631a.f190236a.f430682d)) {
                arrayList2.add(next);
            }
        }
        return C42745f0.P0(arrayList2);
    }
}
