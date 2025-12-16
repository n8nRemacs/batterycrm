package com.avito.android.messenger.conversation.mvi.menu;

import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.Channel;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: ChannelMenuInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "channelContextState", "Lkotlin/Q;", "Lru/avito/messenger/MessengerUserHashInfo;", "Lcom/avito/android/remote/model/messenger/Channel;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Lkotlin/Q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.menu.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32110b<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C32110b<T, R> f191424b = new C32110b<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        InterfaceC31987a.C5631a c5631a = (InterfaceC31987a.C5631a) obj;
        com.avito.android.mvi.b<Channel> bVar = c5631a.f190237b;
        b.d dVar = bVar instanceof b.d ? (b.d) bVar : null;
        return new Q(c5631a.f190236a, dVar != null ? (Channel) dVar.f207035a : null);
    }
}
